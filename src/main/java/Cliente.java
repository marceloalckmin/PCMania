public class Cliente {
    String nome;
    long cpf;

    Computador pc1;
    Computador pc2;
    Computador pc3;

    int n1 = 0;
    int n2 = 0;
    int n3 = 0;

    public Cliente(String nome, long cpf, Computador pc1, Computador pc2, Computador pc3) {
        this.nome = nome;
        this.cpf = cpf;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
    }

    float calculaTotalCompra(){
        float total;
         total = n1*pc1.preco + n2*pc2.preco + n3*pc3.preco;
        return total;
    }
}
