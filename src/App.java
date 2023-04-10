import java.util.Scanner;

public class App {
    
    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Variáveis
        double tempo_aproximado, megabits, megabyte;
        
        // Dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tamanho do aquivo para download em MB " );
        megabytes = teclado.nextDouble();
        System.out.println ("Informe a velocidade de um link de internet em Mbps " );
        megabits = teclado.nextDouble();
        teclado.close();

        // Cálculo (aproximado)
        tempo_aproximado = megabytes / megabits / 60;


        // Resposta
        System.out.println ("O tempo, aproximado, de download é de " + tempo_aproximado + "minutos");

    }
}
