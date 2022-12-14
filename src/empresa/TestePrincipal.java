package empresa;

import java.util.Scanner;

public class TestePrincipal {

	public static void main(String[] args) {

		int escolha;

		Dolar dolar = null;

		Euro euro = null;

		Real real = null;

		Scanner teclado = new Scanner(System.in);

		Cofre cofre = new Cofre(); // Instanciando a classe cofre

		Info info = new Info(); // Instanciando a classe info

		info.infoCofre();
		System.out.println("Escolha a opção desejada:");
		escolha = teclado.nextInt();

		// Criando o loop

		while (escolha != 0) {

			switch (escolha) {
			case 1: // Adicionar Moedas

				info.infoCot();
				int moedaAdd = teclado.nextInt();

				while (moedaAdd != 0) {

					switch (moedaAdd) {

					case 1:
						// Adicionar em Dolar
						System.out.println("Digite o valor a ser adicionado.");

						double valorD = teclado.nextDouble();

						dolar = new Dolar(valorD);

						cofre.adicionar(dolar);

						break; // fim do case1

					case 2:
						// Adicionar em Euro
						System.out.println("Digite o valor a ser adicionado.");

						double valorE = teclado.nextDouble();

						euro = new Euro(valorE);

						cofre.adicionar(euro);

						break;

					case 3:
						// Adicionar em Real
						System.out.println("Digite o valor a ser adicionado.");

						double valorR = teclado.nextDouble();

						real = new Real(valorR);

						cofre.adicionar(real);

						break;

					default:
						// Caso valor inválido
						System.out.println("Opção inválida.");
						System.out.println("Escolha entre 0 e 3.");

					}

					info.infoCot();
					moedaAdd = teclado.nextInt();
				}
				break;

			case 2: // Remover moeda
				info.infoCot();
				int moedaExc = teclado.nextInt();

				while (moedaExc != 0) {

					switch (moedaExc) {
					case 1:
						// Remover Dolar
						System.out.println("Digite o valor a ser removido.");

						double valorD = teclado.nextDouble();

						dolar = new Dolar(valorD);

						cofre.remover(dolar);

						break; 

					case 2:
						// Remover Euro
						System.out.println("Digite o valor a ser removido.");

						double valorE = teclado.nextDouble();

						euro = new Euro(valorE);

						cofre.remover(euro);

						break;

					case 3:
						// Remover Real
						System.out.println("Digite o valor a ser removido.");

						double valorR = teclado.nextDouble();

						real = new Real(valorR);

						cofre.remover(real);

						break;

					default:
						// Caso valor inválido
						System.out.println("Opção inválida.");
						System.out.println("Escolha entre 0 e 3.");
					}

					info.infoCot();
					moedaExc = teclado.nextInt();
				}
				break;

			case 3:
				// lista
				cofre.listar();

				break;

			case 4:
				// totalizar conversão em real
				cofre.totalConvertido();

				break;

			default:
				System.out.println("Opção inválida.");
				System.out.println("Escolha entre 0 e 4.");
			}

			info.infoCofre(); // caso opção incorreta 1* loop
			System.out.println("Escolha a opção desejada:");
			escolha = teclado.nextInt();

		}
		
		System.out.println("Encerrando o programa...0");
	}
}
