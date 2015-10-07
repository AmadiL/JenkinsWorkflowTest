package test;

import org.junit.Test;

public class SomeTest extends Base {

    @Test public void print_test() {
        System.out.println("PRINT TEST");
        run();
    }

    @Test public void sum_test() {
        int a, b, sum;
        a = 2;
        b = 3;
        sum = a + b;
        System.out.println("TEST: a + b = " + sum);
        run();
    }

    @Test public void test3() {
        run();
    }

    @Test public void test4() {
        run();
    }

    @Test public void test5() {
        run();
    }

    @Test public void test6() {
        run();
    }

}
