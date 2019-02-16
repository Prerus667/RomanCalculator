import spock.lang.Specification
import spock.lang.Unroll

// adding more test cases will enhance the robustness
//validation for cases to check whether the roman numerals such as DM =500 where D is already 500 makes sense or is allowed
//for making the output much more crisp like the user should just enter MD+MC
class RomanNumeralCalcSpec extends Specification {

    // Defines the test cases for the calculations for the mathematical operations between 2 roman numerals
   @Unroll
    def "Calculating roman numeral mathematical operations"()
   {
       given:'Two roman numeral and the operation to be performed matches #expected'
       RomanNumeralCalc calc=new RomanNumeralCalc()
       when:'the operation and the values are valid and calls the calculate method'
       def romanVal=calc.calculate(num1,num2, operation as char)
       then:'the calculated matches the expected value'
       expected==romanVal
       where:
       num1|num2|operation|expected
       20|900|'-'|"DCCCLXXX"
       2|800|'*'|"MDC"








   }

}