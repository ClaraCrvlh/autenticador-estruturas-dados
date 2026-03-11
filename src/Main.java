import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {

            BufferedReader leitor = new BufferedReader(new FileReader("Texto.txt"));

            String linha;

            while ((linha = leitor.readLine()) != null) {

                ArrayList<String> listaPalavras = new ArrayList<>();

                String[] palavras = linha.split(" ");

                for (String palavra : palavras) {

                    palavra = palavra.replaceAll("[^a-zA-ZáéíóúãõâêôçÁÉÍÓÚÃÕÂÊÔÇ]", "");

                    if (!palavra.isEmpty()) {
                        listaPalavras.add(palavra);
                    }

                }

                System.out.println(listaPalavras);

            }

            leitor.close();

        } catch (IOException e) {

            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();

        }

    }

}