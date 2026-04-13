import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {
    String name1 = "홍길동";
    String name2 = "홍길동";
    String name3 = "홍길은";

    // 모든 변수가 null이 아닌지 확인
    @Test
    public void test1() {
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
    }

    // name1과 name2가 같은지 확인
    @Test
    public void test2() {
        assertThat(name1).isEqualTo(name2);
    }

    // name1과 name3이 다른지 확인
    @Test
    public void test3() {
        assertThat(name1).isNotEqualTo(name3);
    }

    int number1 = 15;
    int number2 = 0;
    int number3 = -5;

    @Test
    public void test4() {
        assertThat(number1).isPositive();
    }

    @Test
    public void test5() {
        assertThat(number2).isZero();
    }

    @Test
    public void test6() {
        assertThat(number3).isNegative();
    }

    @Test
    public void test7() {
        assertThat(number1).isGreaterThan(number2);
    }

    @Test
    public void test8() {
        assertThat(number3).isLessThan(number2);
    }
}
