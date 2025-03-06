package skincare;

public class SkinType {
    // Field
    public String kulitAngel;
    public String undertoneAngel;
    public String sensitivitasAngel;
    
    // Method 
    public void tampilkanInfo(String nama) {
        System.out.println("Skin Type Specification " + nama + ":");
        System.out.println("Jenis: " + kulitAngel);
        System.out.println("Undertone: " + undertoneAngel);
        System.out.println("Sensitivitas: " + sensitivitasAngel);
    }
}
