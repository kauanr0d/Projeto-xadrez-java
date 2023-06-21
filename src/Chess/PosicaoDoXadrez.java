package Chess;

import boardgame.Posicao;

public class PosicaoDoXadrez {
    private int linha;
    private char coluna;

    public PosicaoDoXadrez(int linha, char coluna) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
            throw new ChessException("Erro: Posição inválida!");
        }
        this.linha = linha;
        this.coluna = coluna;
    }


    public int getLinha() {
        return linha;
    }

    public char getColuna() {
        return coluna;
    }
    protected Posicao paraPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }
    protected static PosicaoDoXadrez daPosicao(Posicao posicao){
        return new PosicaoDoXadrez(8-posicao.getLinha(), (char) ((char)'a' - posicao.getColuna()));
    }
    @Override
    public String toString(){
        return "" + linha + coluna;
    }
}
