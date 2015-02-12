package sample;

/**
 * Created by ton on 9/23/14.
 */
public class MarioMorto implements MarioStates {
    @Override
    public MarioStates pegarCogumelo() {
        System.out.println("Mário Morto, game over");
        return new MarioMorto();
    }

    @Override
    public MarioStates pegarFlor() {
        System.out.println("Mário Morto, game over");
        return new MarioMorto();
    }

    @Override
    public MarioStates pegarPena() {
        System.out.println("Mário Morto, game over");
        return new MarioMorto();
    }

    @Override
    public MarioStates levarDano() {
        System.out.println("Mário Morto, game over");
        return new MarioMorto();
    }
}
