package Chess.pecas;

import Chess.Cor;
import Chess.PecaDeXadrez;
import boardgame.Tabuleiro;

public class Rei extends PecaDeXadrez {

    public Rei(Tabuleiro tabuleiro, Cor corDaPeca) {
        super(tabuleiro, corDaPeca);
    }
    @Override
    public String toString(){
        return "K";
    }
}
