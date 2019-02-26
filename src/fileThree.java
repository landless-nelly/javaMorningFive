public class fileThree {
    public static void main(String[] args) {
        average(34,67,56);
        average(58.9,23.4,45.7);

    }
    public  static Integer average(int x, int y, int z){
        int jibu = (x+y+z)/3;
        System.out.println("integer answer is" +jibu);
        return  jibu;
    }
    public  static Double average (double x, double y, double z){
        double jibu =(x+y+z)/3.0;
        System.out.println("double answer is"+jibu);
        return  jibu;
    }
}
