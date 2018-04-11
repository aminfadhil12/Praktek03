
package praktek03;

public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu s = new Sepatu();
        s.setMerk("Nike");
        s.setWarna("Merah");
        s.setHarga(50000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnaknya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
    }
}
