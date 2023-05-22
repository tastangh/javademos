import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();


    }

    public static void createFile() {

        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Başarıyla oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void getFileInfo() {

        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adı             : " + file.getName());
            System.out.println("Dosya yolu            : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilirliği : " + file.canWrite());
            System.out.println("Dosya boyutu (byte)   : " + file.length());

        }
    }

    public static void readFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt", true));
            writer.newLine();
            writer.write("ayşe");
            writer.newLine();
            writer.write("fatma");
            writer.newLine();
            writer.write("hayriye");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}