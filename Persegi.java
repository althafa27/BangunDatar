package enheritance;

public class Persegi extends Bangun_Datar {
    double sisi;
    
    //override
    double luas(){
        double luas = sisi*sisi;
        System.out.println("Luas Persegi : " + luas);
        return luas;
    }
    
    double keliling(){
        double keliling = 4*sisi;
        System.out.println("Keliling Persegi : "+ keliling);
        return keliling;
    }

}
