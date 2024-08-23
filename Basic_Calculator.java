//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Basic_Calculator {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This is a demo Commit");
        System.out.printf("*****************************************\n");
        System.out.printf("\t\t\tBasic Calculator!");
        System.out.printf("\n*****************************************\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("\nSelect any of the below Options :\n");
            System.out.println("1)Addition\n2)Subtratcion");
            System.out.println("3)Multiplication\n4)Division\n5)Exit:\n");
            Scanner sc=new Scanner(System.in);
            int op=sc.nextInt();
            if(op==5)break;
            else{
                System.out.println("Please enter the First Number : ");
                int a =sc.nextInt();
                System.out.println("Please enter the Second Number : ");
                int b=sc.nextInt();
                if(op==1){
                    System.out.println("The Result of Addition is : "+(a+b));
                }
                if(op==2){
                    System.out.println("The Result of Subtraction is : "+(a-b));
                }
                if(op==3){
                    System.out.println("The Result of Multiplication is : "+(a*b));
                }
                if(op==4) {
                    System.out.println("The Result of Division is : " + (a / b));
                }
            }
        }
    }
}