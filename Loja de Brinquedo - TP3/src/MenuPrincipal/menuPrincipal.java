package MenuPrincipal;

import java.util.Scanner; //Bibliotecas
import java.util.Arrays;
import Dados.*;
import Brinquedos.*;



public class menuPrincipal {

	public static void main(String[] args) {

int sair = 0;
int opcoes = 0;
		
 //                                 Cadastrado Novo Cliente 
		
//                                            Menu principal 
		
		System.out.println(" ------------------ BEM VINDOS A TOYS UNION ---------------------- \n ");

		int  menuOpcoes;
		Scanner input = new Scanner(System.in);
		System.out.println("  Escolha a opção desejada: \n "
				+ " \n1. Realizar cadastro de novo Cliente"
				+ " \n2. Consultar Cliente ja cadastrado "
				+ " \n3. Realizar cadastro de novo Brinquedo "
				+ " \n4. Consultar lista de Brinquedos "
				+ " \n5. Cadastrar venda "
				+ " \n6. Consultar Vendedor "
				+ " \n7. Consultar produtos em estoque"
				+ " \n8. Localizar loja fisica mais próxima"
				+ " \n9. Retirada de produto"
				+ " \n0. Sair");    
		
		menuOpcoes = input.nextInt();

//                                            Estrutura de decisão
		
		switch (menuOpcoes) {
		case 1:
//                                             Cadastrar Cliente
			
			break;
		case 2:
//                                             Consultar Cliente Cadastrado
			
			break;
		case 3:
//                                             Realizar Cadastro de Novo Brinquedo
			break;
		case 4:
//                                             Consultar Lista de Brinquedos
			
			BolaEsportiva BE[] = new BolaEsportiva[10];
			BE[0] = new BolaEsportiva("Bola de Baquete", "Bola Esportiva", 39.99f, "Modelo de quadra esportiva", "MBA" , "Profissional" );
			BE[1] = new BolaEsportiva("Bola de Futebol", "Bola Esportiva", 39.99f, "Modelo de quadra esportiva", "FIFA " , "Profissional" );
			for(int i=0; i<2; i++) {
				BE[i].cadastrarBola ();
				
			}
			break;
		case 5:
//                                             Cadastrar Venda
			break;
		case 6:
//                                             Consultar Vendedor
			break;
		case 7:
//                                             Consultar Produtos em Estoque
			break;
		case 8:
//                                             Localizador de Loja
			break;
		case 9:		
//                                             Retirada de Produto
			break;
			
		case 0: opcoes = sair;

		//                                     Sair

		System.out.println(" ------------------ SAIR ---------------------- \n ");

		Scanner ler1 = new Scanner(System.in);
		System.out.println("Tem certeza que deseja sair? \n1. Sim \n2. Não");    
		sair = ler1.nextInt();
		if(sair==1) {
			System.out.println("Programa encerrado");
			opcoes = sair;
		} else {
			System.out.println("Escolha a opção desejada: \n1. Realizar cadastro de novo Cliente \n2. Consultar Cliente ja cadastrado \n3. Realizar cadastro de novo produto \n4. Consultar produto ja cadastrado \n5. Cadastro de venda \n6. Consultar produtos em estoque \n0. Sair");    
			menuOpcoes = input.nextInt();
			
			break;
			


		} 
		 while (opcoes!=sair);
		}

	}

}
