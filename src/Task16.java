import java.io.*;
//Задание 16: Копирование файла
public class Task16 {
    public static void copyFile(String sourcePath, String destPath) {
        try (InputStream in = new FileInputStream(sourcePath);
             OutputStream out = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copyFile("source.txt", "destination.txt");
    }
}
