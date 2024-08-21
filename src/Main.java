public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeightKg = 66;
        double heightMetre = 1.6;
        int bmi = service.calculate(bodyWeightKg, heightMetre);
        System.out.println(bmi);
    }
}