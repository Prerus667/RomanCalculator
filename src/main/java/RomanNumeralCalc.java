import java.util.Scanner;

public class RomanNumeralCalc {
    // This class is responsible for performing the calculations based on the operator

    String calculate(int num1, int num2, char operator) {
        //Performs the mathematical operation based on the operator passed
        String romanVal = "";
        //Can be refactored to implement the polymorphism concept that avoids bottlenecks in future
        switch (operator) {
            case '+':

                int result = num1 + num2;
                RomanConvertor rc = new RomanConvertor();
                String finalRomanVal = rc.toRoman(result);
                romanVal = finalRomanVal;
                break;

            case '*':

                int result3 = num1 * num2;
                RomanConvertor rc3= new RomanConvertor();
                String finalRomanVal3 = rc3.toRoman(result3);
                romanVal = finalRomanVal3;
                break;


            case '-':
                if(num1 == num2) {
                    return "Numeral is not valid";
                }
                    int result1=0;
                    if(num1>num2) {
                         result1 = num1 - num2;
                    }
                    else
                    {
                        result1 = num2 - num1;
                    }
                    RomanConvertor rc1 = new RomanConvertor();
                    String finalRomanVal1 = rc1.toRoman(result1);
                    romanVal = finalRomanVal1;
                    break;


                }


                return romanVal;
        }
    }
