package sample;

/**
 * A troca de estados de um objeto é um problema bastante comum. Tome como exemplo o personagem de um jogo, como o Mario. Durante o jogo
 * acontecem várias trocas de estado com o Mario, por exemplo, ao pegar uma flor de fogo o mario pode crescer, se estiver pequeno, e ficar
 * com a habilidade de soltar bolas de fogo. http://brizeno.wordpress.com/category/padroes-de-projeto/state/
 */
public interface MarioStates {

    MarioStates pegarCogumelo();

    MarioStates pegarFlor();

    MarioStates pegarPena();

    MarioStates levarDano();
}
