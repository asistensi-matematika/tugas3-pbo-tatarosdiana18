import java.util.Scanner;
public class test {

    public static void main(String[] args) {
    
        System.out.println("1. Persamaan 2x2 \n2. 3 Persamaan 2x2");
        Scanner baca = new Scanner(System.in); 
        System.out.print("Pilih Soal: ");
        int pilih=baca.nextInt(); 
        switch (pilih){ 
        case 1:
        {
        System.out.print("Input: ");
         double a= baca.nextDouble();
         double b=baca.nextDouble();
         double c=baca.nextDouble();
         double d=baca.nextDouble();
         double e=baca.nextDouble();
         double f=baca.nextDouble();
         System.out.println("Sistem Persamaanya: \n"+a+"x + "+b+"y = "+e+"\n"+c+"x + "+d+"y = "+f);
         PersamaanLinier2x2 hasil = new PersamaanLinier2x2(a,b,c,d,e,f);
         double x = hasil.getX();
         double y = hasil.getY();
         boolean Solusi;
         if (hasil.cekSolusi()== false)
             System.out.println("Sistem tidak memiliki penyelesaian");
         else
             System.out.println("Hasilnya: \nx = "+x+" , y = "+y);
            break;
        }
        case 2 :
        {
            System.out.print("Input: ");
         double a= baca.nextDouble();
         double b=baca.nextDouble();
         double c=baca.nextDouble();
         double d=baca.nextDouble();
         double e=baca.nextDouble();
         double f=baca.nextDouble(); 
         double g=baca.nextDouble();
         double h=baca.nextDouble();
         double i=baca.nextDouble();
         System.out.println("Sistem Persamaanya: \n"+a+"x + "+b+"y = "+e+"\n"+c+"x + "+d+"y = "+f+"\n"+g+"x + "+h+"y = "+i);
         PersamaanLinier2x2 hasil = new PersamaanLinier2x2(a,b,c,d,e,f,g,h,i);
         double x1 = hasil.getX1();
         double y1 = hasil.getY1();
         double x2 = hasil.getX2();
         double y2 = hasil.getY2();
         double x3 = hasil.getX3();
         double y3 = hasil.getY3();
         boolean Solusi;
         if (hasil.cekSolusi()== false)
             System.out.println("Sistem tidak memiliki penyelesaian");
         else
             System.out.println("Hasilnya: \nx1 = "+x1+" , y1 = "+y1+"\nx2 = "+x2+" , y2 = "+y2+"\nx3 = "+x3+" , y3 = "+y3);
            break;
            
         
     
         
        }
    }
    }
}
