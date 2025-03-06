package skincare;

import skincare.SkinType;  // Import kelas SkinType dari package skincare

public class Main {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi objek
        SkinType angelSkin1 = new SkinType();
        SkinType skinDidi = new SkinType();  // Mengganti angelSkin2 dengan skinDidi
        
        // Set nilai atribut untuk angelSkin1 (untuk Angel)
        angelSkin1.kulitAngel = "Kering";  // Atribut untuk Angel
        angelSkin1.undertoneAngel = "Warm";
        angelSkin1.sensitivitasAngel = "Normal";
        
        // Set nilai atribut untuk skinDidi (untuk Didi)
        skinDidi.kulitAngel = "Berminyak";  // Atribut untuk Didi
        skinDidi.undertoneAngel = "Neutral";
        skinDidi.sensitivitasAngel = "Sensitif";
        
        // Tampilkan informasi
        System.out.println("Skin Type Pertama (Angel):");
        angelSkin1.tampilkanInfo("Angel");  // Pass "Angel" for the first skin type
        
        System.out.println();
        
        System.out.println("Skin Type Kedua (Didi):");
        skinDidi.tampilkanInfo("Didi");  // Pass "Didi" for the second skin type
    }
}
