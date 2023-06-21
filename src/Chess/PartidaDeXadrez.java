package Chess;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PartidaDeXadrez {
    private int turno;
    private Cor jogadorAtual;
    private boolean cheque;
    private PecaDeXadrez vulneravel;
    private PecaDeXadrez promovido;
    private Tabuleiro tabuleiro;
    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8,8);
    }
    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez [][]mat= new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i =0;i< tabuleiro.getLinhas();i++){
            for(int j = 0;j<tabuleiro.getColunas();j++){
                mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i,j);
            }
        }
        return mat;
    }
}
