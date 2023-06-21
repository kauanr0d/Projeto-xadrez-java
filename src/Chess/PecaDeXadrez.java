package Chess;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaDeXadrez extends Peca {
    private Cor corDaPeca;
    private int contagemDeMovimento;

    public PecaDeXadrez(Tabuleiro tabuleiro, Cor corDaPeca) {
        super(tabuleiro);
        this.corDaPeca = corDaPeca;
    }

    public Cor getCorDaPeca() {
        return corDaPeca;
    }
}
