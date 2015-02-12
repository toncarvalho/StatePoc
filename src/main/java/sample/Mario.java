package sample;

/**
 * Created by ton on 9/23/14.
 */
public class Mario {
    protected MarioStates estado;

    public Mario() {
        estado = new MarioPequeno();
    }

    public void pegarCogumelo() {
        estado = estado.pegarCogumelo();
    }

    public void pegarFlor() {
        estado = estado.pegarFlor();
    }

    public void pegarPena() {
        estado = estado.pegarPena();
    }

    public void levarDano() {
        estado = estado.levarDano();
    }
}
