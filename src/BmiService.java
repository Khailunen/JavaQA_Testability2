public class BmiService {
    public int calculate (double bodyWeightKg, double heightMetre) {
        double bmi = bodyWeightKg / heightMetre / heightMetre;
        return (int) bmi;
    }
}
