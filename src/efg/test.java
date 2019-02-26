package efg;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
BMI(23,45);
areaa(45,67,34);
        Scanner chukua;
        Double p,r,t;
        chukua=new Scanner(System.in);
        System.out.println("Enter the princple");
        p=chukua.nextDouble();
        System.out.println("Enter the rate");
        r =chukua.nextDouble();
        System.out.println("Enter time");
        t =chukua.nextDouble();
        loan(p,r,t);

    }
    public  static  Double BMI(double x,double y){
       double jibu = (x+y)/2.0;
        System.out.println(" BMI is"+jibu);
        return jibu;

    }
    public static  Integer areaa(int height,int width, int radius){
        int answer =(height+width+radius)/3;
        System.out.println("area of a traingle is"+answer);
        return answer;
    }
    public  static  Double loan(double p, double r, double t){
        double i =(p*r*t)/100.0;
        System.out.println("interest is"+i);
        System.out.println("Total payable amount is"+(i+p));
        return  i;
    }

}

