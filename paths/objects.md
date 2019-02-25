Pengenalan Class dan Object
-----

Pada bagian ini, akan dijelaskan definisi serta contoh dari Class dan Object dalam Java. 

Class dan Object tidak bisa dilepaskan dari Java. Keduanya merupakan konsep dari OOP (Object-Oriented Programming). Sulit dibayangkan ya? Oke. Contohnya begini: Dalam dunia nyata, bentuk fisik manusia sendiri itu ibarat object. Sedangkan Manusia adalah `class`. Masih sulit dibayangkan? Oke. Begini, makhluk Tuhan itu ada banyak. Ada tumbuhan, hewan, dan manusia. Ketika ciptaan ini adalah `class`. Ketika Tuhan menciptakan salah satu makhluknya, maka jadilah object. Entah itu object Tumbuhan, Hewan, atau Manusia. Sudah paham? Saya anggap sudah paham.

Setiap `class`, didalamnya memiliki sifat dan karakteristik. Sebagai contoh: Tumbuhan memiliki ranting, daun, warna daun, tinggi pohon, jumlah ranting, dan sebagainya. Hewan punya tangan, kaki, mata, telinga, warna kulit, usia, dan sebagainya. Manusia juga demikian. Karakteristik ini dalam Java dikenal sebagai atribut.

Kita terjun kembali ke Java. Semua file yang berekstensi `.java` adalah berisi `class`. Contohnya saya ingin membuat class Manusia. Maka, yang harus dilakukan dalam Java adalah membuat file dengan nama Manusia.java. Isinya adalah:

```Java
public class Manusia{

}
```

`class` Manusia paling sederhana sudah jadi. Namun, tidak cukup demikian karena manusia juga memiliki atribut (`nama`, `usia`). Maka, kita modif file Manusia.java sehingga menjadi:

```Java
public class Manusia{
    String nama = "Bejo";
    int usia = 17;
}
```
Ta daa, kita sudah punya `class` Manusia dengan atribut `nama` dan `usia`. Trus, diapain? 

Contoh kasus: Kita ingin menampilkan 2 Manusia dengan `System.out.println()`. Our favorite command, yeah.

Kita modif `class` Manusia.

```Java
public class Manusia{
    private String nama = "";
    private int usia = 17;

    public void setNama(String pNama){
        this.nama = pNama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setUsia(int pUsia){
        this.usia = pUsia;
    }

    public int getUsia(){
        return this.usia;
    }

    // Kode sakti
    @Override
    public String toString(){
        return "Nama : "+this.nama + ", usia: " + this.usia;
    }
}
```

Kemudian, buat file baru dengan nama Testing.java yang isinya:
```Java
public class Testing{
    public static void main(String []args){
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Oddy");
        manusia1.setUsia(19);

        Manusia manusia2 = new Manusia();
        manusia2.setNama("Bejo");
        manusia2.setUsia(33);

        System.out.println(manusia1);
        System.out.println(manusia2);
    }
}
```

Jika sudah, jalankan file Testing di Netbeans dengan klik menu Run, Run File atau dengan Shortcut SHIFT + F6. Maka, akan muncul hasil :

```Java
run:
Nama : Oddy, usia: 19
Nama : Bejo, usia: 33
BUILD SUCCESSFUL (total time: 0 seconds)
```
Contoh Program ini bisa diambil di folder Projects/Objek

That's all for this Introduction to Class and Object

[Menu utama](/README.md)
