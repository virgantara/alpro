Java adalah bahasa dengan jenis tipe data strongly-typed. Tidak seperti bahasa pemrograman PHP, tipe data-nya benar-benar terdefinisi dengan jelas <sup>[[1]](#1)</sup>. Di Java juga dikenal istilah tipe data Primitif dan tipe data Object. 

Contoh tipe data primitif:
1. `byte` : ukurannya 8-bit dengan nilai antara -128 hingga 127
2. `short` : ukurannya 16-bit dengan nilai antara -32.768 hingga 32.767
3. `int` : ukurannya 32-bit dengan nilai antara -2<sup>31</sup> hingga 2<sup>31</sup>-1
4. `long` : ukurannya 64-bit dengan nilai antara -2<sup>63</sup> hingga 2<sup>63</sup>-1
5. `float` : tipe data desimal dengan ukuran 32-bit IEEE 754
6. `double` : tipe data desimal dengan ukuran 64-bit IEEE 754
7. `char` : tipe data dengan ukuran 16-bit Unicode dengan nilai antara `'\u0000'` hingga `\uffff`
8. `boolean`: tipe data yang hanya punya nilai `true` dan `false`

Lalu, ke mana perginya tipe data `string` ??

Tenang, dia tidak ke mana-mana. Hanya 'sembunyi' dalam tipe data lain, yaitu tipe data object.

Tipe data `String` di Java tidak seperti tipe data `string` di bahasa C/C++. `String` di sini 'dibungkus' dalam bentuk Object, yaitu `java.lang.String`. Secara default, setiap `class` Java yang dibuat, secara otomatis `import` package `java.lang.*`. Jadi, semua package yang ada di `java.lang` akan dipakai <sup>[[2]](#2)</sup>. Salah satu contohnya ya si tipe data `String` tadi.

Contoh deklarasi variabel di Java:
```Java
int bilangan = 10;

String nama = "Bejo";

char inisial = 'B';

boolean isOkay = false;

double skor = 95.7;
```

Okay, pembahasan tipe data sampai di sini dulu.

[Menu utama](/README.md)

#### [1]: https://en.wikipedia.org/wiki/Strong_and_weak_typing  
#### [2]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html