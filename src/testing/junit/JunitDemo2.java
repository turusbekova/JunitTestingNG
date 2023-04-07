package testing.junit;

import org.junit.jupiter.api.*;

public class JunitDemo2 {

    public void add(){
        System.out.println("Add method");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All Annotation");
    }

    @Test
    @DisplayName("This test will check Home page")
    public void test1() {
        System.out.println("This is test1");
        add();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @Test
    public void test4() {
        System.out.println("This is test2");
    }

    @Test
    public void test2() {
        System.out.println("This is test3");
    }

    @BeforeEach //Аннотированный метод будет запускаться перед каждым тестовым методом в тестовом классе.
    public void beforeEach() {
        System.out.println("Before Each annotation");
    }

    @Test
    public void test3() {
        System.out.println("This is test4");
    }

    @BeforeAll
    // Аннотированный метод будет запущен перед всеми тестовыми методами в тестовом классе. Этот метод должен быть статическим.
    public static void beforeAll() {
        System.out.println("Before ALl annotation");
    }


}
