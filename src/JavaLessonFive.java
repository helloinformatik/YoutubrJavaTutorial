import java.util.Scanner;
public class JavaLessonFive {
    static double myPI =3.14159; //class variable

    public static void main(String[] args){
        int d = 5;
        tryToChange(d);
        System.out.println("main d = " + d);

    }
    public static void tryToChange(int d){
        d = d+1;
        System.out.println("TryToChange d = " + d);
    }

}
