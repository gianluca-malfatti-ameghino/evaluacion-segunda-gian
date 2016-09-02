import org.w3c.dom.css.Rect;

import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura {
    public int altura;
    public int base;

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public double area() {
        return this.base*this.altura;
    }


    public double perimetro() {
        return (this.base*2+this.altura*2);
    }

    public double sumarAreasDeFiguras(List<Figura> rectangulos) {
        double sum = 0;
        for (Figura r : rectangulos){
            sum = sum + r.area();

        }
        return sum;
    }
}
