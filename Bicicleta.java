//La programación orientada a objetos consiste en que todos los entes involucrados o utilizados en el contexto de un programa
//Pueden considerarse objetos, como objetos, tienen propiedades, metodos y un molde universal con el que pueden crearse (ese molde es la clase)
//En este ejemplo vamos a tomar un objeto del mundo real, de forma breve y lo vamos a hacer en el mundo de la programación
//Ese objeto es la bicicleta, que dependerá de la clase Bicicleta (que es nuestro molde), para poder existir


//Empezamos definiendo nuestra clase Bicicleta
public class Bicicleta {
    //Como todas las clases, debe de tener un metodo main, pero este metodo main estará vacio
    public static void main(String[] args) {

    }
    //También va a tener propiedades, estas propiedades corresponden a las caracteristicas de nuestro objeto
    //Por ejemplo, las bicicletas tienen marcas, colores, velocidades, tamaños, etc. En este caso solo definiremos las primeras 3
    private String marca;
    private String color;
    private double velocidad;

    //Nuestra clase Bicicleta, debe de tener un metodo que nos permita construir una bicicleta 
    //Entonces, vamos a crear un metodo publico, con el nombre de nuestra clase, que es Bicicleta
    public Bicicleta() {
        //Esta va a tener unos valores por defecto en sus propiedades
        //Así cuando creemos una bici, no nos va a retornar undefined o algo por el estilo
        //Algo importante de mencionar es que cuando vamos a acceder a las propiedades de nuestro objeto dentro de la clase
        //Debemos de acceder a ellas mediante this.propiedad, this es el objeto en si mismo
        this.marca = "ACME";
        this.color = "Rojo";
        this.velocidad = 0;
    }

    //También existe la posibilidad de que querramos crear una Bicicleta añadiendo las propiedades desde un inicio
    //Entonces podemos hacer un overload o sobrecarga del metodo Bicicleta, creando otro metodo, que recibe parametros
    //Esta diferencia entre el que recibe y no recibe nos permite tener metodos con el mismo nombre
    public Bicicleta(String marca, String color, double velocidadInicial) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidadInicial;
    }
    
    //Ahora viene lo que llamamos getters y setters, porque, resulta que podemos crear una Bicicleta, pero si luego queremos cambiar sus propiedades
    //Debemos entonces crear una nueva Bicicleta ? no, no es lo ideal, lo ideal es poder modificar a nuestro antojo la Bicicleta
    //Entonces, podemos hacer un metodo que nos retorna un valor y un metodo que recibe un valor por cada una de las propiedades de nuestro objeto
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return this.velocidad;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    //Una vez tenemos los getters y setters de cada uno de nuestras props podemos crear metodos que interactuen con esas props
    //Entonces, por ejemplo, en una Bicicleta se debe poder pedalear, esto causa una aceleracion, por lo que vamos a crear un metodo
    //Que nos permita aumentar nuestra velocidad acelerando
    public void pedalear(double aceleracion) {
        //Podemos mandar comentarios también en el proceso
        System.out.println("Actualmente tenemos "+this.velocidad+" m/s de velocidad, vamos a acelerar un cachito.");
        this.velocidad = this.velocidad + aceleracion;
        System.out.println("Ahora tenemos "+this.velocidad+" m/s de velocidad, y vamos cual rayo McQueen.");
    }
    //Lo mismo pasa con frenar
    public void frenar() {
        System.out.println("Actualmente tenemos "+this.velocidad+" m/s de velocidad, vamos a frenar un cachito, la velocidad da vertigo.");
        if (this.velocidad > 0) {
            this.velocidad--;
        }
        System.out.println("Actualmente tenemos "+this.velocidad+" m/s de velocidad, vamos con calma.");
    }

    public void frenar(double aceleracionNegativa) {
        System.out.println("Actualmente tenemos "+this.velocidad+" m/s de velocidad, vamos a frenar un cachito, la velocidad da vertigo.");
        if (this.velocidad > aceleracionNegativa) {
            this.velocidad = this.velocidad - aceleracionNegativa;
        }
        System.out.println("Actualmente tenemos "+this.velocidad+" m/s de velocidad, vamos con calma.");
    }
}
