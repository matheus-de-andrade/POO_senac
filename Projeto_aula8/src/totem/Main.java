package totem;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		 int opcao = 0;
		 int senha = 1;
		 do {
			 System.out.print("==================================================\r\n"
			 		+ "   SISTEMA DE TOTEM DE ATENDIMENTO - CLÍNICA      \r\n"
			 		+ "==================================================\r\n"
			 		+ "1 - Emitir Senha Comum\r\n"
			 		+ "2 - Emitir Senha Preferencial\r\n"
			 		+ "3 - Chamar Próxima Senha\r\n"
			 		+ "4 - Listar Senhas Pendentes\r\n"
			 		+ "5 - Relatório de Senhas Atendidas\r\n"
			 		+ "0 - Encerrar Sistema\r\n"
			 		+ "Escolha uma opção: ");
			 opcao = tc.nextInt();
			 switch(opcao) {
			 case 1: {
				 break;
			 }
			 case 2:{
				 break;
			 }
			 }
		 }while(opcao == 0);

	}

}
