package Inheritance;


public class Main {
    public static void main(String[] args) {

        Persegi prs = new Persegi(5);
        System.out.println("PERSEGI");
        System.out.println("Luas: " + prs.luas());
        System.out.println("Keliling: " + prs.keliling());

        Lingkaran lgk = new Lingkaran(7);
        System.out.println("LINGKARAN");
        System.out.println("Luas: " + lgk.luas());
        System.out.println("Keliling: " + lgk.keliling());

        PersegiPanjang pp = new PersegiPanjang(8, 4);
        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        Segitiga sgt = new Segitiga(6, 8);
        System.out.println("SEGITIGA");
        System.out.println("Luas: " + sgt.luas());
        System.out.println("Keliling: " + sgt.keliling());
    }
}

// parent class
class BangunDatar {

    public float luas() {
        return 0;
    }

    public float keliling() {
        return 0;
    }
}

// child class
class Persegi extends BangunDatar {

    float s;

    public Persegi(float s) {
        this.s = s;
    }

    // Override
    public float luas() {
        return s * s;
    }

    // Override
    public float keliling() {
        return 4 * s;
    }
}

// child class
class Lingkaran extends BangunDatar {

    float jari;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    // Override
    public float luas() {
        return 3.14f * jari * jari;
    }

    // Override
    public float keliling() {
        return 2 * 3.14f * jari;
    }
}

// child class
class PersegiPanjang extends BangunDatar {

    float p;
    float l;

    public PersegiPanjang(float p, float l) {
        this.p = p;
        this.l = l;
    }

    // Override
    public float luas() {
        return p * l;
    }

    // Override
    public float keliling() {
        return 2 * (p + l);
    }
}

// child class
class Segitiga extends BangunDatar {

    float a;
    float t;

    public Segitiga(float a, float t) {
        this.a = a;
        this.t = t;
    }

    // Override
    public float luas() {
        return (a * t) / 2;
    }

    // Override
    public float keliling() {
        float miring = (float) Math.sqrt(
            a * a + t * t
        );
        return a + t + miring;
    }
}
