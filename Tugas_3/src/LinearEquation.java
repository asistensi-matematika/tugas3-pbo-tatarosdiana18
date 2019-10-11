
public class LinearEquation {
    private double a, b, c, d, e, f, g, h, i;
    
    public LinearEquation(){
        a=0.0;
        b=0.0;
        c=0.0;
        d=0.0;
        e=0.0;
        f=0.0;
        g=0.0;
        h=0.0;
        i=0.0;
    }
    public LinearEquation(double a, double b, double c, double d,double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public LinearEquation(double a, double b, double c, double d,double e, double f, double g, double h, double i){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
        this.g=g;
        this.h=h;
        this.i=i;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    public double getG(){
        return g;
    }
    public void setG(double g){
        this.g = g;
    }
    public double getH(){
        return h;
    }
    public void setH(double h){
        this.h=h;
    }
    public double getI(){
        return i;
    }
    public void setI(){
        this.i=i;
    }
    
   public boolean cekSolusi(){
       if((a*d-b*c)==0)
        return false;
   else
        return true;
   }
   public double getX(){ 
       return ((e*d-b*f)/(a*d-b*c));
   }
   public double getY(){
       return ((a*f-e*c)/a*d-b*c);
   }
   public double getX1(){ 
       return ((g*d)-(b*h))/((a*d)-(b*c));
   }
   public double getY1(){
       return((a*h)-(g*c))/((a*d)-(b*c));
   }
   public double getX2(){
       return ((g*f)-(b*i))/((a*f)-(b*e));
   }
   public double getY2(){
       return ((a*i)-(g*e))/((a*f)-(b*e));
   }
   public double getX3(){
       return ((h*f)-(d*i))/((c*f)-(d*e));
   }
   public double getY3(){
       return ((c*i)-(h*e))/((c*f)-(d*e));
   }
   }
   
   
  

