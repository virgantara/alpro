Saatnya Menggambar
-----

Kurang seru kalau belajar pemrograman tidak ada sesuatu yang indah untuk dinikmati. Di sini, kita akan menggambar beberapa bentuk, seperti lingkaran dan kotak.

Java sudah dilengkapi tools untuk menggambar. Ada dua tools yang kita perlukan, yaitu `java.awt.Canvas` dan `java.awt.Graphics`. Bayangkan, sekarang posisi Anda sebagai seorang pelukis. Apa aja sih yang diperlukan pelukis untuk melukis? Minimal harus ada Kanvas dan Kuas. Iya kan? Es teh dan soto nanti saja kalau sudah lapar. Nah, `java.awt.Canvas` ini ibarat Kanvas bagi pelukis. Di sini Anda akan menggambar. Sedangkan 'kuas'-nya adalah `java.awt.Graphics`. Kedua tools ini sudah memadai untuk menggambar.

Trus, kanvas ini ditaruh mana? Jika Anda pernah belajar GUI (Graphical User Interface) di Java, tentunya sudah tahu tentang JFrame. Itu lho, frame window yang ada tombol minimize, maximize, dan restore. JFrame ini nama lengkapnya adalah `javax.swing.JFrame`. Nah, kanvas, nanti nempel di JFrame. 

Oke, kembali ke laptop. Jika kata-kata mutiara di atas akan diterjemahkan ke Java, maka yang Anda lakukan saat ini adalah membuat sebuah file dengan nama `Gambarku.java`. Isinya adalah:
```Java

import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Gambarku extends Canvas{
    public static void main(String [] args){
        JFrame frame = new JFrame("Gambarku");
        Gambarku canvas = new Gambarku();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        g.fillOval(100,100,200,200)
    }
}
```
Jika sudah, jalankan file Testing di Netbeans dengan klik menu Run, Run File atau dengan Shortcut SHIFT + F6. 

Itu tadi dasar-dasar menggambar di Java

[Menu utama](/README.md)
