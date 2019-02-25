Belajar bahasa pemrograman apapun, rasanya tidak afdhol jika tidak dimulai dengan menampilkan kata Hello World. Nah, pada bagian ini, kita akan menampilkan kata tersebut pada tampilan console atau terminal.

Contoh kode memunculkan Hello World di console:
```java
public class NamaClass{
    public static void main(String []args){
        System.out.println("Hello World");
    }
}
```

Saya jelaskan sedikit kode atau syntax tersebut. 

Syntax di atas adalah bentuk sederhana dari struktur class di Java. Secara umum, class di Java terdiri atas nama `class` dan fungsi (kita sebut sebagai method). `public class NamaClass` adalah `class` dengan nama `NamaClass`. Setiap deklarasi `class` diawali dengan open curly bracket `{` dan diakhiri dengan closed curly bracket `}`.

Kemudian, syntax berikut: 
```java
    public static void main(String []args){
        //...
    }
```
adalah method utama (main method) dimana kode yang tersebut adalah yang pertama kali dieksekusi oleh intepreter. Anda mungkin bertanya, apa sih intepreter itu? Trus, apa bedanya dengan compiler? Ini akan dibahas di bagian berikutnya. Main method tersebut sama fungsinya dengan di bahasa pemrograman C atau C++, yaitu:

```C++
int main(){
    
}
```

Nah, pembahasan Hello World cukup sampai di sini. 

[Menu utama](/README.md)