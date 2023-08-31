import java.util.ArrayList;
import java.util.List;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }
}

class GerenciadorEstoque {
    private List<ItemEstoque> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println(quantidade + " unidades de " + nome + " foram adicionadas ao estoque.");
                return;
            }
        }

        ItemEstoque novoItem = new ItemEstoque(nome, quantidade);
        estoque.add(novoItem);
        System.out.println(quantidade + " unidades de " + nome + " foram adicionadas ao estoque.");
    }

    public void removerItem(String nome) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                int quantidadeRemovida = item.getQuantidade();
                estoque.remove(item);
                System.out.println(quantidadeRemovida + " unidades de " + nome + " foram removidas do estoque.");
                return;
            }
        }
        System.out.println(nome + " não foi encontrado no estoque.");
    }

    public void listarItens() {
        System.out.println("Itens no estoque:");
        for (ItemEstoque item : estoque) {
            System.out.println(item.getNome() + ": " + item.getQuantidade() + " unidades");
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                System.out.println("A quantidade de " + nome + " foi atualizada para " + novaQuantidade + " unidades.");
                return;
            }
        }
        System.out.println(nome + " não foi encontrado no estoque.");
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();

        gerenciador.adicionarItem("Caneta", 50);
        gerenciador.adicionarItem("Lápis", 30);
        gerenciador.adicionarItem("Caneta", 20);
        gerenciador.listarItens();

        gerenciador.atualizarQuantidade("Lápis", 40);
        gerenciador.removerItem("Borracha");
        gerenciador.listarItens();
    }
}
