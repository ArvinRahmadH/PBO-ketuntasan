import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        String nama, ketuntasan;

        System.out.print("masukkan nama ");
        nama = input.nextLine();
        System.out.println("masukkan nilai ");
        a = input.nextInt();



        ketuntasan = a >= 74?"tuntas":"tidak tuntas";
        System.out.println("nilaimu = "+a);
        System.out.println(nama+ " dinyatakan = "+ketuntasan);






    }

}