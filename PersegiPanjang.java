package enheritance;

public class PersegiPanjang extends Bangun_Datar{
    double panjang;
    double lebar;
    
    //override
    double luas(){
        double luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }
    
    double keliling(){
        double keliling = 2*(panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
        return keliling;
    }

}
