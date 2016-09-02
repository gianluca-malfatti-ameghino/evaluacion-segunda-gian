import org.w3c.dom.css.Rect;

import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado implements Figura {
    public int lado;

    public Cuadrado(int i) {
        this.lado = i;
    }

    public double area() {
        return (this.lado * this.lado);
    }


    public double perimetro() {
        return (this.lado*4);
    }


    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sum = 0;
        for (Cuadrado r : cuadrados){
            sum=sum + r.area();
        }
        return sum;
    }


    public double sumarAreasDeFiguras(List<Figura> rectangulos) {
        double sum = 0;
        for (Figura r : rectangulos){
            sum = sum + r.area();

        }
        return sum;
    }

}
