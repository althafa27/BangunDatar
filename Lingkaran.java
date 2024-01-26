package enheritance;

public class Lingkaran extends Bangun_Datar{
    //jari jari lingkaran
    double r;
    
    //override
    double luas(){
        double luas = Math.PI*r*r;
        System.out.println("Luas Lingkaran : "+ luas);
        return luas;
    }
    
    double keliling(){
        double keliling = 2* Math.PI*r;
        System.out.println("Keliling lingkaran : " + keliling);
        return keliling;
    }
}
