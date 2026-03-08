import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try{
            BufferedReader leitor = new BufferedReader(new FileReader("Texto.txt"));
            String linha;
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
            leitor.close();
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }
    }
}
