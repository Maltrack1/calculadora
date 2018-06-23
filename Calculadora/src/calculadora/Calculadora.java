package calculadora;

public class Calculadora {
    private double x,y;
    
    public Calculadora(){
        x = 0;
        y = 0;
    }
    public Calculadora(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    } 
    
    public double getY(){
        return y;
    }
    
    public double sumar(){
        double sum = 0;
        sum = getX() + getY();
        return sum;
    }   
    
    public double restar(){
        double res = 0;
        res = getX() - getY();
        return res;
    }
    
    public double multiplicar(){
        double multi = 0;
        multi = getX() * getY();      
        return multi;
    }
    
    public double dividir(){
        double div = 0;
        div = getX() / getY();            
        return div;
    }
}
