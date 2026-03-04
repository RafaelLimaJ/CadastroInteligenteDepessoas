import com.cadastropessoas.entitys.Pessoa;

import java.util.HashSet;
import java.util.Scanner;

public class CadastroInteligente {
    static Scanner scanner = new Scanner(System.in);
    static HashSet<Pessoa> ListaPessoas = new HashSet<>();
    static int quantidadeDePessoasTotal;

    public static void main(String[] args) {




        int escolha;

        do {
            System.out.println("Cadastro de Pessoas");
            System.out.println("1 - ADICIONAR PESSOA");
            System.out.println("2 - LISTAR PESSOAS");
            System.out.println("3 - SAIR");
            System.out.println("Digite sua escolha");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1 -> adicionarPessoa();
                case 2 -> listarPessoa();
                case 3 -> {
                    System.out.println("Saindo...");
                    break;
                }
            }
        } while (escolha < 3);
    }

    private static void listarPessoa() {

        System.out.println("Lista de pessoas");
        for (Pessoa p : ListaPessoas) {
            System.out.println(p);
        }

        System.out.println("Quantidade de pessoas :" + ListaPessoas.size());
        System.out.println("Vc digitou " + quantidadeDePessoasTotal + " nomes porem só vai aparecer " + ListaPessoas.size() + " nomes pois estamos usando HashSet que ele nao mostra nem conta as pessoas que tem nome e idade Iguais");
    }

    private static void adicionarPessoa() {
        quantidadeDePessoasTotal++;
        System.out.println("Digite o nome da pessoa que deseja adicionar");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa que deseja adicionar");
        int idade = scanner.nextInt();
        scanner.nextLine();
        ListaPessoas.add(new Pessoa(nome, idade));
        System.out.println("Pessoa cadastrada");
    }


}
