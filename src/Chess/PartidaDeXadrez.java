package Chess;

import Chess.pecas.Rei;
import Chess.pecas.Torre;
import boardgame.Peca;
import boardgame.Posicao;
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
        iniciarPartida();
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
    private void posicionarNovaPeca(int linha, char coluna,PecaDeXadrez peca){
        tabuleiro.posicionarPeca(peca,new PosicaoDoXadrez(linha,coluna).paraPosicao());
    }
    private void iniciarPartida(){
        posicionarNovaPeca(1,'a',new Rei(tabuleiro,Cor.PRETO));
        posicionarNovaPeca(1,'b',new Torre(tabuleiro,Cor.BRANCO));

    }
}
