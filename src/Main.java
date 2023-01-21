public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(85.5,1.70);
        System.out.println("Индекс массы тела = " + index);
    }
}