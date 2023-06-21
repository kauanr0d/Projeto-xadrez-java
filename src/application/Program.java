package application;

import Chess.PartidaDeXadrez;
import boardgame.Posicao;
import boardgame.Tabuleiro;

public class Program {
    public static void main(String[] args) {
        Tabuleiro t = new Tabuleiro(8,8);
        PartidaDeXadrez px1 = new PartidaDeXadrez();
        UI.imprimirTabuleiro(px1.getPecas());
    }
}
