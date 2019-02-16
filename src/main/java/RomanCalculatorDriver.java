import java.util.Scanner;

public class RomanCalculatorDriver {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman numeral 1 ");
        String s1 = sc.nextLine();
        RomanConvertor romanConv=new RomanConvertor();
        int num1=romanConv.rtoi(s1);
        System.out.println("Enter the roman numeral 2 ");
        String s2 = sc.nextLine();
        int num2=romanConv.rtoi(s2);
        System.out.println("Enter the operation to be performed");
        String op = sc.nextLine();
        char op1=op.charAt(0);
        RomanNumeralCalc rc=new RomanNumeralCalc();
        System.out.println(rc.calculate(num1,num2,op1));



    }
}