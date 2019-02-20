import spock.lang.Specification
import spock.lang.Unroll

// adding more test cases will enhance the robustness
//validation for cases to check whether the roman numerals such as DM =500 where D is already 500 makes sense or is allowed
//for making the output much more crisp like the user should just enter MD+MC
class RomanNumeralCalcSpec extends Specification {

    // Defines the test cases for the calculations for the mathematical operations between 2 roman numerals
<<<<<<< HEAD
    /*  @Unroll
    def "Calculating roman numeral mathematical operations"()
   {
       given:'Two roman numeral and the #operation to be performed matches #expected'
=======
   @Unroll
    def "Calculating roman numeral mathematical operations"()
   {
       given:'Two roman numeral and the operation to be performed matches #expected'
>>>>>>> 7e9baea5b9d780098290a04c036ffe3116a3bd2a
       RomanNumeralCalc calc=new RomanNumeralCalc()
       when:'the operation and the values are valid and calls the calculate method'
       def romanVal=calc.calculate(num1,num2, operation as char)
       then:'the calculated matches the expected value'
       expected==romanVal
       where:
       num1|num2|operation|expected
       20|900|'-'|"DCCCLXXX"
       2|800|'*'|"MDC"
<<<<<<< HEAD
       16|8|"+"|"XXIV"
       100|1000|"+"|"MC"
*/
/*@Unroll
def  "Rejecting invalid inputs from the user"()
     {
    given: 'the invalid input entered the user is prompted about it as #output'
    RomanNumeralCalc calc1=new RomanNumeralCalc()
    when:'the user is asked to enter the value'
    def romanVal1= calc1.calculate (number1, number2, operation as char)
    then:'the user enters the value and prompted whether the value is correct or not'
     output==romanVal1
    where:
    number1|number2|operation||output
    "XXXXX"|"XC"||"Numeral is not valid"*/


    @Unroll
    def "Rejecting invalid inputs"() {
        given: 'the user enters the value and gets the #output'
        RomanConvertor rc = new RomanConvertor()
        when: 'roman numeral provided by the user is invalid'
        String message=rc.validate(numeral1)
        then: 'check if the value provided by the user is valid'

       output ==message
        where:
        numeral1 |output
        "XXXX" |"Non valid numerals"
        "II"|""
        "DD"|"Non valid numerals"
        "MD"|""
        ""|


    }
=======








   }

>>>>>>> 7e9baea5b9d780098290a04c036ffe3116a3bd2a
}