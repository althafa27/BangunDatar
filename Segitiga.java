package enheritance;

public class Segitiga extends Bangun_Datar{
    double alas;
    double tinggi;
    
    //override
    double luas(){
        double luas = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : "+ luas);
        return luas;
    }
    
    double keliling(){
        double keliling = 3*alas;
        System.out.println("Keliling Segitiga : "+ keliling);
        return keliling;
    }

}
