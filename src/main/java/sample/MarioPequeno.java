package sample;

/**
 * Created by ton on 9/23/14.
 */
public class MarioPequeno implements MarioStates {

    @Override
    public MarioStates pegarCogumelo() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }

    @Override
    public MarioStates pegarFlor() {
        System.out.println("Mario grande com fogo");
        return new MarioFogo();
    }

    @Override
    public MarioStates pegarPena() {
        System.out.println("Mario grande com capa");
        return new MarioCapa();
    }

    @Override
    public MarioStates levarDano() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }
}
