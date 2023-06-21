package boardgame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca [][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas<1){
            throw new BoardException("Erro:Deve haver ao menos uma e linha e uma coluna!");
        }
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
        if(!posicaoExiste(posicao)){
            throw new BoardException("Erro: posiçaõ inexistente no tabuleiro!");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void posicionarPeca(Peca peca, Posicao posicao){
        //atribuindo uma peça para uma posição da matriz
        if(existePeca(posicao)){
            throw new BoardException("Erro: Já existe uma peça na posição "+ posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    private boolean posicaoExiste(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >=0 && coluna<colunas;
    }
    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }
    public boolean existePeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new BoardException("Erro: posiçaõ inexistente no tabuleiro!");
        }
        return peca(posicao)!=null;
    }
}
