/*

Шаг 1: Добавление библиотеки Apache POI
Для работы с Excel (.xlsx, .xls) используем Apache POI.
Если используете Maven, добавьте в pom.xml:

xml
Копировать
Редактировать
<dependencies>
    <!-- Apache POI для работы с Excel -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.3</version>
    </dependency>
</dependencies>
Если скачиваете jar-файлы вручную, загрузите их с Apache POI.

Шаг 2: Создадим классы Car и Upgrade
java
Копировать
Редактировать
import java.util.List;

public class Car {
    private int id;
    private List<Upgrade> upgrades;

    public Car(int id, List<Upgrade> upgrades) {
        this.id = id;
        this.upgrades = upgrades;
    }

    public int getId() {
        return id;
    }

    public List<Upgrade> getUpgrades() {
        return upgrades;
    }

    @Override
    public String toString() {
        return "Car{id=" + id + ", upgrades=" + upgrades + "}";
    }
}
java
Копировать
Редактировать
public class Upgrade {
    private int id;
    private String name;

    public Upgrade(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name; // Выводим имя апгрейда
    }
}
Шаг 3: Читаем данные из Excel
java
Копировать
Редактировать
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Task37 {
    public static void main(String[] args) {
        String carFile = "Car.xlsx";
        String upgradeFile = "Upgrade.xlsx";

        try {
            // Читаем апгрейды
            Map<Integer, Upgrade> upgradesMap = readUpgrades(upgradeFile);

            // Читаем автомобили и связываем их с апгрейдами
            List<Car> cars = readCars(carFile, upgradesMap);

            // Вывод результата
            cars.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Читаем таблицу Upgrade.xlsx и создаем Map<id, Upgrade>
    private static Map<Integer, Upgrade> readUpgrades(String filePath) throws IOException {
        Map<Integer, Upgrade> upgrades = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Пропускаем заголовок
                int id = (int) row.getCell(0).getNumericCellValue();
                String name = row.getCell(1).getStringCellValue();
                upgrades.put(id, new Upgrade(id, name));
            }
        }

        return upgrades;
    }

    // Читаем таблицу Car.xlsx и создаем список машин с нужными апгрейдами
    private static List<Car> readCars(String filePath, Map<Integer, Upgrade> upgradesMap) throws IOException {
        List<Car> cars = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Пропускаем заголовок

                int carId = (int) row.getCell(0).getNumericCellValue();
                String upgradesStr = row.getCell(1).getStringCellValue();

                List<Upgrade> carUpgrades = new ArrayList<>();
                for (String upgradeIdStr : upgradesStr.split(",")) {
                    int upgradeId = Integer.parseInt(upgradeIdStr.trim());
                    if (upgradesMap.containsKey(upgradeId)) {
                        carUpgrades.add(upgradesMap.get(upgradeId));
                    }
                }

                cars.add(new Car(carId, carUpgrades));
            }
        }

        return cars;
    }
}
Шаг 4: Создаем файлы Car.xlsx и Upgrade.xlsx
📌 Car.xlsx

ID	Upgrades
1	101,102,103
2	102,104
3	101,104,105
📌 Upgrade.xlsx

ID	Name
101	Spoiler
102	Turbo
103	Neon Lights
104	Nitro
105	Sunroof
Выходные данные (консоль)
bash
Копировать
Редактировать
Car{id=1, upgrades=[Spoiler, Turbo, Neon Lights]}
Car{id=2, upgrades=[Turbo, Nitro]}
Car{id=3, upgrades=[Spoiler, Nitro, Sunroof]}
Объяснение кода:
Читаем Upgrade.xlsx:

Создаем Map <id, Upgrade>, чтобы быстро находить апгрейды.
Пропускаем заголовок, читаем id и name, заполняем Map.
Читаем Car.xlsx:

Разделяем список upgrades (id1,id2,id3).
Для каждого id находим Upgrade в Map и добавляем в List<Upgrade>.
Создаем объект Car и добавляем его в List<Car>.
Выводим список машин с их апгрейдами.


 */