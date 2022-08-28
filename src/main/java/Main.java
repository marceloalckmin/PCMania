import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemoriaUSB musb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB musb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo", 1);

        Computador pc1 = new Computador("Positivo", 1300,"Linux Ubuntu", 32,"Pentium Core i3",1200, "Memória RAM", 4,  "HD", 500);
        Computador pc2 = new Computador("Acer", 1800, "Windows 8", 64, "Pentium Core i5", 2260, "Memória RAM", 8, "HD", 1 );
        Computador pc3 = new Computador("Vaio", 2800, "Windows 10", 64, "Pentium Core i7", 3500, "Memória RAM", 16, "HD", 2);

        pc1.addMemoriaUSB(musb1);
        pc2.addMemoriaUSB(musb2);
        pc3.addMemoriaUSB(musb3);

        Cliente client = new Cliente("Renato Russo", 1234567890,pc1,pc2,pc3);

        Scanner input = new Scanner(System.in);

        // Flag que permite a execução em loop do menu
        boolean fla = true;

        while(fla){
            System.out.println("Bem-vindo ao menu de compra:");
            System.out.println("1 - Adiciona a primeira promoção no carrinho");
            System.out.println("2 - Adiciona a segunda promoção no carrinho");
            System.out.println("3 - Adiciona a terceira promoção no carrinho");
            System.out.println("0 - Finaliza a compra e mostra todas as informações");
            int op = input.nextInt();
            switch (op){
                case 1:
                    client.n1 += 1;
                    break;
                case 2:
                    client.n2 += 1;
                    break;
                case 3:
                    client.n3 += 1;
                    break;
                case 0:
                    fla = false;
                    System.out.println("Você finalizou sua compra!");
                    System.out.println("Nome do cliente: " + client.nome);
                    System.out.println("Cpf do cliente: " + client.cpf);
                    System.out.println();
                    pc1.mostraPCConfigs();
                    pc2.mostraPCConfigs();
                    pc3.mostraPCConfigs();
                    System.out.println("Total da compra: " + client.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}
