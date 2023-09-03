import java.util.Scanner;
public class Calculator_PROJECT {

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Double a,b;
        System.out.println("enter the A:");
        a= sc.nextDouble();
        System.out.println("enter B:");
        b= sc.nextDouble();
        System.out.println("enter operator between +,*,-,/ ");
       char  operator= sc.next().charAt(0);
        double add = a+b;
        double multiplication = a*b;
        double substraction =a-b;
        double DIVISION =  a/b;
        switch ( operator)
        {
            case '+' :{
                System.out.println(add);
                break;
            }
            case '*' :{
                System.out.println(multiplication);
                break;
            }
            case '-':{
                System.out.println(substraction);
                break;
            }
            case '/' :{
                System.out.println(DIVISION);
                break;
            }
            default:
            {
                System.out.println("please selact the proper operator");
                return;
            }
        }
    }
}







   



