import ru.netology.services.VacationService;

public class Main {
    public static void main (String[] args) {
        VacationService service = new VacationService();
        int count = service.calculate(120_000, 20_000);
        System.out.println("Фрилансер отдыхал " + count + " месяцев в году");
    }
}
