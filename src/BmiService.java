public class BmiService {
    public int calculate(int mass, double height) {
        double bmi = mass / (height * height);
        return (int) bmi;
    }
}