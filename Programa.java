package application;
import entities.Monitores;
import entities.Impressoras;
import entities.Placavideos;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Monitores monitor = new Monitores("Monitor 1", 5);
        Impressoras impressora = new Impressoras("Impressora 1", 3);
        Placavideos placaVideo = new Placavideos("Placa de Vídeo 1", 2);

        while (true) {
            System.out.println("\nMENU DE CADASTRO");
            System.out.println("1. Monitores");
            System.out.println("2. Impressoras");
            System.out.println("3. Placavideos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Digite o novo nome do monitor: ");
                    String novoNome = scanner.nextLine();
                    monitor.setNome(novoNome);
                    monitor.imprimirInformacoes();
                    break;

                case 2:
                    System.out.print("Digite o novo nome da impressora: ");
                    novoNome = scanner.nextLine();
                    impressora.setNome(novoNome);
                    impressora.imprimirInformacoes();
                    break;

                case 3:
                    System.out.print("Digite o novo nome da placa de video: ");
                    novoNome = scanner.nextLine();
                    placaVideo.setNome(novoNome);
                    placaVideo.imprimirInformacoes();
                    break;

                case 4:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcao invalida. Por favor, escolha novamente.");
            }
        }
    }
}