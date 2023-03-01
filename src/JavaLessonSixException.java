import java.util.*;
public class JavaLessonSixException {
    static Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("how old are you?");
        int age = checkValidAge();

        if (age !=0){
            System.out.println("You are " + age + " years old");
        }
    }

    public static int checkValidAge (){
        try{
            return UserInput.nextInt();
        } catch (InputMismatchException e){
            UserInput.next();
            System.out.print("That isn't a whole number");
            return 0;
        }
    }
}
