/*<dependencies>
    <!-- Apache POI для работы с Excel -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.3</version>
    </dependency>
</dependencies>
//Задание 35: Чтение из Excel

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task35 {
    public static void main(String[] args) {
        String filePath = "data.xlsx"; // Имя Excel-файла в текущей папке

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) { // XSSFWorkbook для .xlsx

            Sheet sheet = workbook.getSheetAt(0); // Читаем первый лист
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        case BOOLEAN -> System.out.print(cell.getBooleanCellValue() + "\t");
                        default -> System.out.print("?\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

*/