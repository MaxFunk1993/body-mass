public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height  = 1.75; //метров
        int mass = 75; //килограмм
        int index = service.calculate(mass,height );
        System.out.println(index + "bmi");
    }
}