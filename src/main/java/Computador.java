public class Computador {

    String marca;
    float preco;
    HardwareBasico peca1;
    HardwareBasico peca2;
    HardwareBasico peca3;

    // criacao do sistema tem que ser dentro do computador por ser conjuncao
    SistemaOperacional sistemaOperacional;

    MemoriaUSB usb = null;

    public Computador(String marca, float preco, String nomeSis, int tipoSis, String nom1, float cap1, String nom2, float cap2, String nom3, float cap3) {
        this.marca = marca;
        this.preco = preco;

        //criação do sistema operacional
        sistemaOperacional = new SistemaOperacional(nomeSis,tipoSis);


        //criação das peças do computador
        this.peca1 = new HardwareBasico(nom1,cap1);
        this.peca2 = new HardwareBasico(nom2,cap2);
        this.peca3 = new HardwareBasico(nom3,cap3);
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println(this.peca1.nome + "(" + this.peca1.capacidade + " Mhz)");
        System.out.println(this.peca2.capacidade + "Gb de " +  this.peca2.nome);
        if(this.peca3.capacidade > 10) {
            System.out.println(this.peca3.capacidade + "Gb de " + this.peca3.nome);
        }
        else{
            System.out.println(this.peca3.capacidade + "Tb de " + this.peca3.nome);
        }
        System.out.println("Sistema Operacional " + this.sistemaOperacional.nome + "(" + this.sistemaOperacional.tipo + " bits)");
        if(this.usb == null){
            System.out.println("Não acompanha memória usb");
        }
        else {
            if(this.usb.capacidade < 3) {
                System.out.println("Acompanha " + this.usb.nome + " de " + this.usb.capacidade + "Tb");
            }
            else {
                System.out.println("Acompanha " + this.usb.nome + " de " + this.usb.capacidade + "Gb");
            }
        }
    }

    //adiciona a memoria usb
    void addMemoriaUSB(MemoriaUSB musb){
        this.usb = musb;
    }

}
