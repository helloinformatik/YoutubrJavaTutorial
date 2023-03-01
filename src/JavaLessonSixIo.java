import java.io.*;
public class JavaLessonSixIo {
    public static void main (String[] args){
        getAFile("./somestuff.txt");
    }
    public static void getAFile(String fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Sorry can't find that file");
        }

    }
}
