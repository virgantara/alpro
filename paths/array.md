I. What is <del>Love</del> Array?
-----

Di bagian [ini](/paths/part2.md), kita sudah belajar tentang tipe data. Selanjutnya, di sini akan dibahas tentang kumpulan data. 

Definisi dari Array adalah kumpulan satu jenis tipe data. Di Java, array sifatnya statis. Artinya, ukuran dari array sudah ditentukan terlebih dahulu. Agar mudah membayangkan apa itu array, anggap saja sebagai koleksi dari tipe data yang sama.

Sebagai gambaran lain, daripada mendeklarasikan varibel yang sejenis dengan cara berikut:
```Java
int bilangan1 = 4;
int bilangan2 = 7;
int bilangan3 = 11;
```

lebih baik diubah menjadi tipe data array of integer. Jadinya:
```Java
int [] bilangan = new int[3];
```
Baris di atas adalah bentuk deklarasi dan inisiasi variabel array dengan nama bilangan. Tanda `[]` pada `int [] bilangan` artinya adalah array. Sedangkan `new int[3]` adalah alokasi memory dari array tersebut. Angka 3 menunjukkan ukuran dari array.
Selanjutnya, kita perlu mengisi nilai dari array tersebut dengan cara:
```Java
bilangan[0] = 4;
bilangan[1] = 7;
bilangan[2] = 11;
```
Angka 0,1, dan 2 adalah index dari array. Index dari array adalah penunjuk ke alamat array. Jika dianalogikan, array itu ibarat loker/lemari. Nomor loker ibarat index (angka 0,1,2). Sedangkan isi loker adalah nilai (angka 4,7,dan 11).

Ada cara lain untuk mendefinisikan array, misalnya:
```Java
int []bilangan = {4,7,11};
```
Contoh tipe data String:
```Java
String [] daftarNama = new String[5];
daftarNama[0] = "Budi";
daftarNama[1] = "Susi";
daftarNama[2] = "Anto";
```

Jika ingin menampilkan isi array tersebut, bisa menggunakan beberapa cara perulangan
1. Cara 1
```Java
for(int i = 0; i < daftarNama.length;i++){
    System.out.println("Data ke : "+ i + daftarNama[i]);
}
```
Hasilnya adalah:
```Java
run:
Data ke 0 : Budi
Data ke 1 : Susi
Data ke 2 : Anto
BUILD SUCCESSFUL (total time: 0 seconds)
```
2. Cara 2
```Java
for(String nama : daftarNama){
    System.out.println("Nama : "+nama);
}
```
Hasilnya:
```Java
run:
Nama : Budi
Nama : Susi
Nama : Anto
BUILD SUCCESSFUL (total time: 0 seconds)
```

II. Operasi Perhitungan dengan Array
---
Tipe data array, kita bisa melakukan operasi apapun. Salah satunya yang sederhana adalah operasi perhitungan. Sebagai contoh, operasi power atau pangkat. Perhatikan kode berikut:
```Java
int [] bilangan = {1,2,3,4,5};

for(int bil : bilangan){
    double hasilPangkat = Math.pow(bil, 2);
    System.out.println("Kuadrat dari " + bil + " adalah " + String.valueOf(hasilPangkat));
}
```
