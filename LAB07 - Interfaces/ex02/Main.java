public class Main {
    public static void main(String[] args){

        Produto[] produtos = new Produto[]{
            new Produto(10),
            new Produto(50),
            new Produto(30)
        };

        Cliente[] clientes = new Cliente[]{
            new Cliente("Gustavo"),
            new Cliente("Vitor"),
            new Cliente("Jose")
        };

        Servico[] servicos = new Servico[]{
            new Servico(100.0),
            new Servico(500.0),
            new Servico(300.0)
        };

        Classificador classificador = new Classificador();
        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        System.out.println("Produtos ordenados:");
        for(Produto produto : produtos){
            System.out.println("Codigo: " + produto.getCode());
        }

        System.out.println("Clientes ordenados:");
        for(Cliente cliente : clientes){
            System.out.println("Nome: " + cliente.getNome());
        }

        System.out.println("Servicos ordenados:");
        for(Servico servico : servicos){
            System.out.println("Preco: " + servico.getPreco());
        }
    }
}