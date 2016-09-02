/**
 * Created by alumno on 02/09/16.
 */
public class Circulo implements Figura {
    public double radio;

    public Circulo (double radio){
        this.radio=radio;
    }


    public double area() {
        return Math.PI*(Math.pow(this.radio, 2));
    }

    public double perimetro(){

        return (Math.PI*this.radio);
    }
}
