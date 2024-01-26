package enheritance;

public class Main {
    public static void main(String[] args) {
        //membuat objek bangun datar
        Bangun_Datar bangundatar = new Bangun_Datar();
        
        //membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        //membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        //membuat objek persegi panjang dan mengisis nilai properti
        PersegiPanjang perpan = new PersegiPanjang();
        perpan.panjang = 8;
        perpan.lebar = 4;
        
        //membuat objek segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        //memanggil method luas dan keliling
       bangundatar.luas();
       bangundatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       lingkaran.luas();
       lingkaran.keliling();
       
       perpan.luas();
       perpan.keliling();
       
       segitiga.luas();
       segitiga.keliling();
    }
}
