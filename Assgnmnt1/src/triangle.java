/**
 * Created by Lenovo on 2/9/2017.
 */






public class triangle{
    public static void easiest(){
        System.out.println("*");
    }
    public static void line(int n){
        while(n-->0)
            System.out.print("*");
        System.out.print("\n");
    }
    public static void vline(int n){
        while(n-->0)
            System.out.println("*");
    }

    public static void rtriag(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }


    public static void main(String[] args){
        System.out.println("Pattern : ");
        easiest();
        System.out.println("Pattern : ");
        line(8);
        System.out.println("Pattern : ");
        vline(3);
        System.out.println("Pattern : ");
        rtriag(3);
    }
}