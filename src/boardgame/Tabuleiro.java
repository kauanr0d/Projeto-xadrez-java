package boardgame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca [][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public Peca peca(int linha, int coluna){
        return pecas[linha][coluna];
    }
    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void posicionarPeca(Peca peca, Posicao posicao){
        //atribuindo uma peça para uma posição da matriz
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
}
