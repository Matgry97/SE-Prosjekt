import org.junit.jupiter.api.Test;
        import org.junit.jupiter.params.ParameterizedTest;
        import org.junit.jupiter.params.provider.ValueSource;
        import org.junit.platform.commons.util.StringUtils;


public class dummyTestClass {

    @ParameterizedTest(name = "Year {0} is a leap year.")
    @ValueSource(ints = { 2016, 2020, 2048 })
    void if_it_is_one_of_the_following_years(int year) {
    }


}
