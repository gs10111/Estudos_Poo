package ProblemaCirculo;

public class Circulo {
    private final double diametro;
    private final double raio;
    private final double pi=3.14;


    public Circulo(double diametro){
        this.diametro= diametro;
        this.raio= diametro/2;
    }

    public double calcularArea(){
        double area= pi*(raio*2);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=diametro*pi;
        return perimetro;
    }

}
