import java.util.Scanner;
public class JavaLessonFourWhileLoopExecute {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        String contYorN = "Y";
        int h = 1;
        while(contYorN.trim().equalsIgnoreCase("y")){
            System.out.println(h);
            System.out.print("Continue y or n?");
            contYorN = userInput.nextLine();
            h++;
        }
    }
}
