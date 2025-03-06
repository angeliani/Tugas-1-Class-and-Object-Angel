package skincare;

import skincare.SkinType;  

public class Main {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi objek
        SkinType angelSkin1 = new SkinType();
        SkinType skinDidi = new SkinType();  
        
        // Set nilai atribut 
        angelSkin1.kulitAngel = "Kering";  // Atribut untuk Angel
        angelSkin1.undertoneAngel = "Warm";
        angelSkin1.sensitivitasAngel = "Normal";
        
        skinDidi.kulitAngel = "Berminyak";  // Atribut untuk Didi
        skinDidi.undertoneAngel = "Neutral";
        skinDidi.sensitivitasAngel = "Sensitif";
        
        // Tampilkan informasi
        System.out.println("Skin Type Pertama (Angel):");
        angelSkin1.tampilkanInfo("Angel"); 
        
        System.out.println();
        
        System.out.println("Skin Type Kedua (Didi):");
        skinDidi.tampilkanInfo("Didi");  
    }
}
