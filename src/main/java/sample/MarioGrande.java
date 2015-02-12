package sample;

/**
 * Created by ton on 9/23/14.
 */
public class MarioGrande implements MarioStates {
    @Override
    public MarioStates pegarCogumelo() {
        //Se Mario grande -> 1000 pontos
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioStates pegarFlor() {
        //Se Mario grande -> Mario fogo
        System.out.println("Mario Com fogo");
        return this;
    }

    @Override
    public MarioStates pegarPena() {
        //Se Mario grande -> Mario capa
        System.out.println("Mario Com Capa");
        return new MarioCapa();
    }

    @Override
    public MarioStates levarDano() {
        //Se Mario grande -> Mario pequeno
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }
}
