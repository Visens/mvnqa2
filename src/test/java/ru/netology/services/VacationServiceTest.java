package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

    @Test
    void test_1 () {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(60_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_2 () {
        VacationService service = new VacationService();

        int expected = 5;
        int actual = service.calculate(60_000, 12_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_3 () {
        VacationService service = new VacationService();

        int expected = 4;
        int actual = service.calculate(30_000, 5_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_4 () {
        VacationService service = new VacationService();

        int expected = 6;
        int actual = service.calculate(120_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}
