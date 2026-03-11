public class NoAVL {

    String palavra;
    NoAVL esquerda;
    NoAVL direita;
    int altura;

    public NoAVL(String palavra) {
        this.palavra = palavra;
        this.altura = 1;
    }

}