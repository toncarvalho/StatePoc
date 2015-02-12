package sample;

/**
 * Created by ton on 9/23/14.
 */
public class MarioFogo implements MarioStates {
    @Override
    public MarioStates pegarCogumelo() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioStates pegarFlor() {
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }

    @Override
    public MarioStates pegarPena() {
        System.out.println("Mario com fogo");
//        Se Mario fogo -> Mario fogo
        return new MarioFogo();
    }

    @Override
    public MarioStates levarDano() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }
}
