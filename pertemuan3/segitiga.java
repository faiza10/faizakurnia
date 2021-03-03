import java.util.Scanner;
public class segitiga {
    public int alas;
public int tinggi;
public segitiga(int a, int t)
{
    alas = a;
    tinggi = t;
}
void hitungLuas(){
  System.out.println("Masukkan alas = "+alas);
  System.out.println("Masukkan tinggi = "+tinggi);   
}
void hitungKeliling(){
    System.out.println("Masukkan alas = "+alas);
    System.out.println("Masukkan tinggi = "+tinggi);
}
    public static void main(String[] args) {
        segitiga [] sgArray = new segitiga[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            sgArray [i] = new segitiga(i, i);
            System.out.println("segitiga ke-"+ i);
            System.out.print("Masukkan alas: ");
            sgArray[i].alas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            sgArray[i].tinggi = sc.nextInt();
        }
        
        for (int i = 0; i < 4; i++)
        {
            System.out.println("segitiga ke-" + i);
            System.out.println("alas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
    }
    
    }
}