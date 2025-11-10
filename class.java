class Segitiga {
    private double alas;
    private double tinggi;
    private double sA;
    private double sB;
    private double sC;

    public Segitiga() {}

    public Segitiga(double alas, double tinggi, double sA, double sB, double sC){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sA=sA;
        this.sB=sB;
        this.sC=sC;
    }

    public double getAlas(){return alas;}
    public void setAlas(double alas){
        this.alas=alas;
    }
    public double getTinggi(){return tinggi;}
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    public double getSisiA(){return sA;}
    public void setSisiA(double sA){
        this.sA=sA;
    }
    public double getSisiB(){return sB;}
    public void setSisiB(double sB){
        this.sB=sB;
    }
    public double getSisiC(){return sC;}
    public void setSisiC(double sC){
        this.sC=sC;
    }
    public double getLuas(){
        return 0.5*alas*tinggi;
    }
    public double getKeliling(){
        return sA+sB+sC;
    }
}

class Persegi {
    private double s;

    public Persegi() {}

    public Persegi(double s){
        this.s=s;
    }

    public double getSisi(){return s;}
    public void setSisi(double s){
        this.s=s;
    }
    public double getLuas(){
        return s*s;
    }
    public double getKeliling(){
        return 4*s;
    }
}

class Lingkaran {
    private double r;

    public Lingkaran() {}

    public Lingkaran(double r){
        this.r=r;
    }

    public double getJariJari(){return r;}
    public void setJariJari(double r){
        this.r=r;
    }
    public double getLuas(){
        return Math.PI*r*r;
    }
    public double getKeliling(){
        return Math.PI*2*r;
    }
}


