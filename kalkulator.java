
/**
 * Write a description of class kalkulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class kalkulator
{
        public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 2 angka!\nAngka 1 : ");
        float angka1 = input.nextFloat();
        System.out.println("Angka 2 : ");
        float angka2 = input.nextFloat();
        float jumlah = angka1 + angka2;
        float pengurangan = angka1 - angka2;
        float perkalian = angka1 * angka2;
        float pembagian = angka1 / angka2;

        System.out.println("\nHasil penjumlahan "+angka1+" + " +angka2+ " = "+jumlah);
        System.out.println("\nHasil pengurangan "+angka1 + "-" +angka2+ " = "+pengurangan);
        System.out.println("\nHasil perkalian "+angka1+" * "+angka2+" = "+perkalian);
        System.out.println("\nHasil pembagian "+angka1+" / "+angka2+" = "+pembagian);
        
        
    }
}
