package Chess.pecas;

import Chess.Cor;
import Chess.PecaDeXadrez;
import boardgame.Tabuleiro;

public class Torre extends PecaDeXadrez {

    public Torre(Tabuleiro tabuleiro, Cor corDaPeca) {
        super(tabuleiro, corDaPeca);
    }
    @Override
    public String toString(){
        return "T";
    }
}
