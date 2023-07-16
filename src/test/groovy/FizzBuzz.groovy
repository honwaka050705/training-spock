import org.example.FizzBuzz
import spock.lang.Specification

class FizzBuzzTest extends Specification {
    def "case1"() {
        setup:
        //_FizzBuzz f = new _FizzBuzz()
        def f = new FizzBuzz()

        expect:
        f.calc(x) == ret

        where:
        x | ret
        3 | "Fizz"
        5 | "Buzz"
        15 | "Fizz Buzz"
        4 | "4"
    }
}
