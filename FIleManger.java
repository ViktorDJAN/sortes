package seminars_exception.sem_3;


import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

//Задача 2: Файловый менеджер (ООП, исключения)
//Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций
//с файлами: чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение,
//если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).
public class FIleManger {
    public static class ReadException extends Exception {
        public ReadException(String error) {
            super(error);
        }
    }
    public static class WriteException extends Exception{
        public WriteException(String error){
            super(error);
        }
    }
    public static class CopyException extends Exception{
        public CopyException(String error){
            super(error);
        }
    }

    public static void readWork(File scnr) throws ReadException {
        if (!scnr.exists()) {
            throw new ReadException("Reading is impossible");
        }
    }

    public static void writeWork(File file) throws WriteException{
        if(!file.exists()){
            throw new WriteException("Writing is impossible");
        }
    }
    public static void copyWork(File file) throws WriteException{
        if(!file.exists()){
            throw new WriteException("Coping is impossible");
        }
    }

    public static void main(String[] args) throws ReadException, IOException{

            File file1 = new File("seminarToday.txt");
            if (!file1.exists()) file1.createNewFile();
            PrintWriter pw = new PrintWriter(file1);
            pw.println("12");
            pw.close();
            Scanner scanner = new Scanner(file1);
        try {
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
                readWork(file1);
        } catch (ReadException e) {
            System.out.println(e);
        }
    }
}