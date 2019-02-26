package efg;

public class fileTwo {
    public static void main(String[] args) {
        majina("nelly","ndunge");
        majina("judy","mbeke");
        hesabu(34,758);
        hesabu(3456, 456);
        nambari(78, 56);
        nambari(78.9, 56.8);
        volume(79,23);
        volume(67.9,12.5);
    }
    public  static  String majina(String X, String Y){
        System.out.println(X+" "+Y);
        return null;
    }
    public  static  Integer hesabu(int x, int y){
        int jibu = x+y;
        System.out.println(jibu);
        return  jibu;
    }
    public  static  Double  nambari(double x, double y){
        double jibu =(x*y)/3.0;
        System.out.println("Your answer is " +jibu);
        return  jibu;
    }
    public  static  Double volume(double radius, double height){
        double answer =Math.PI * Math.pow(radius,2) *height;
        System.out.println("volume = "+answer);
        return answer;
    }
}
