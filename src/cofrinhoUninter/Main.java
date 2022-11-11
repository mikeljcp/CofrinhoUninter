package cofrinhoUninter;

import java.util.Scanner;

public class Main {

	// Metodo menu() e encarregado de implementar o Menu principal dentro do
	// programa principal e desta forma evitar replicação do código
	public static void menu() {
		System.out.println("*** *** *** *** ***");
		System.out.println("*** *** MENU *** ***");
		System.out.println("1 - ADICIONAR MOEDAS");
		System.out.println("2 - REMOVER MOEDAS");
		System.out.println("3 - LISTAR MOEDAS");
		System.out.println("4 - CONVERTER MOEDAS");
		System.out.println("5 - ENCERRAR PROGRAMA");
		System.out.println("*** *** *** *** ***");

	}

	// Metodo miniMenu() e encarregado de implementar o sub-Menu dentro do programa
	// principal e desta forma evitar replicação do código
	public static void miniMenu() {
		System.out.println("*** *** *** *** ***");
		System.out.println("*** *** MOEDAS *** ***");
		System.out.println("1 - DOLAR");
		System.out.println("2 - EURO");
		System.out.println("3 - REAL");
		System.out.println("4 - VOLTAR AO MENU PRINCIPAL");
		System.out.println("*** *** *** *** ***");
	}

	// Início do programa principal
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // lê a entrada do usuário
		int opcao = 0; // atributo utilizado para escolhas do usuário

		// Instanciação da classe Cofrinho na classe principal Main
		Cofrinho cofrinho = new Cofrinho();
		// Criação dos objetos dolar, euro e real referentes as moedas que serão
		// trabalhadas e inclusão das moedas dentro do Arraylist
		Moeda dolar = new Dolar();
		cofrinho.getListaMoedas().add(dolar);
		Moeda euro = new Euro();
		cofrinho.getListaMoedas().add(euro);
		Moeda real = new Real();
		cofrinho.getListaMoedas().add(real);

		// laço encarregado de manter o programa rodando enquanto o usuário desejar
		while (opcao != 5) {
			menu();
			System.out.println("Qual opção deseja? ");
			opcao = teclado.nextInt(); // leitura da escolha do usuário

			if (opcao == 1) {
				// Opção encarregada de adicionar moedas dentro do nosso cofrinho
				miniMenu();
				System.out.println("Qual tipo de moeda deseja adicionar? ");
				opcao = teclado.nextInt();
				// logica encarregada de adicionar as moedas no cofrinho
				if (opcao == 1) {
					System.out.println("Qual o valor que deseja acrescentar em Dolar? ");
					dolar.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Qual o valor que deseja acrescentar em Euro? ");
					euro.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 3) {
					System.out.println("Qual o valor que deseja acrescentar em Real? ");
					real.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

			if (opcao == 2) {
				// Opção encarregada de remover moedas dentro do nosso cofrinho
				miniMenu();
				System.out.println("Qual tipo de moeda deseja remover? ");
				opcao = teclado.nextInt();// leitura da escolha do usuário

				// logica encarregada de remover as moedas no cofrinho
				if (opcao == 1) {
					System.out.println("Qual o valor que deseja remover em Dolar? ");
					dolar.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Qual o valor que deseja remover em Euro? ");
					euro.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 3) {
					System.out.println("Qual o valor que deseja remover Real? ");
					real.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

			if (opcao == 3) {
				// Opção encarregada de listar as moedas dentro do nosso cofrinho
				cofrinho.listagemMoedas(null);
				System.out.println("");
			}

			if (opcao == 4) {
				System.out.println("*** *** *** *** ***");
				System.out.println("*** *** MOEDAS *** ***");
				System.out.println("1 - DOLAR");
				System.out.println("2 - EURO");
				System.out.println("3 - TODAS AS MOEDAS CONVERTIDAS EM REAL");
				System.out.println("4 - VOLTAR AO MENU PRINCIPAL");
				System.out.println("*** *** *** *** ***");
				System.out.println("Qual tipo de moeda deseja converter para real? ");
				opcao = teclado.nextInt(); // leitura da escolha do usuário

				// logica encarregada de apresentar a conversão das moedas ao usuário
				if (opcao == 1) {
					System.out.println("Dolar convertido para Real= " + cofrinho.totalConvertido(dolar));
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Euro convertido para Real= " + cofrinho.totalConvertido(euro));
					opcao = 0;
				} else if (opcao == 3) {
					double total = 0;
					total += cofrinho.totalConvertido(real);
					total += cofrinho.totalConvertido(dolar);
					total += cofrinho.totalConvertido(euro);
					System.out.println(total);
					System.out.println("Valor de todas as moedas convertidas em Real= " + total);
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

		}

		System.out.println("PROGRAMA ENCERRADO, VOLTE SEMPRE...");

	}

}
