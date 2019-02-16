import spock.lang.Specification
import spock.lang.Unroll


class RomanCalculatorSpec extends Specification {

    @Unroll
    def "To check if the values returned by the roman to interger : #romanNumeral returns intergar matches the correct value #expected"()

    {
        given: 'Pass the romanNumeral'
        RomanConvertor rc = new RomanConvertor()
        when: 'An roman  value is passedto rtoi()'
        def integer = rc.rtoi(romanNumeral)
        then: 'An integer value is returned which is the expected value'
        expected==integer
        where:
        romanNumeral | expected
        "xxx"        | 30
        "xc"         |90
        "dd"         |1000 // needs to be changed accordingly for the functionality of not accepting the value of dd as it equals m
        "m"          |1000
        "mc"         |1100
        "iiii"       |4 // to change the functionality to reject if the following values are passed
    }
}
