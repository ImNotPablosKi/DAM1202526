package HERENCIA;

public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        super.sonido = "Woof";
        super.hacerSonido();

    }
}
