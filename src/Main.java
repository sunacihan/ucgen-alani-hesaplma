import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz:");
        int kenar1=input.nextInt();
        System.out.print("Üçgenin 2. kenarını giriniz:");
        int kenar2=input.nextInt();
        Syste.out.print("Üçgenin 3. kenarını giriniz:");
        int kenar3=input.nextInt();
        int u=(kenar1+kenar2+kenar3)/2;
        double aln=Math.sqrt(u*(u-kenar1)*(u-kenar2) * (u - kenar3));
        System.out.println(aln);


    }
}