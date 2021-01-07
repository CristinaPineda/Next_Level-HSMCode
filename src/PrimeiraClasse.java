/*
 * Instru��es do projeto
A Next Level, uma moderna e conceituada universidade, necessita de um sistema de gest�o acad�mico.

Para o projeto piloto de implanta��o do sistema, voc� deve criar um programa que permita calcular a m�dia semestral dos alunos.

A m�dia semestral � a m�dia aritm�tica simples das m�dias bimestrais. 
As m�dias bimestrais s�o compostas pelas seguintes atividades: prova (peso 3), projeto (peso 3), lista de exerc�cios (2) e contribui��o em projetos de software livre/ conclus�o de MOOCs recomendados pelo docente (3).

Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi aprovado ou reprovado. Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.

Caso o aluno tenha m�dia menor que 8, determine tamb�m a nota m�nima necess�ria para a pontua��o na prova final, de forma que o aluno garanta aprova��o na disciplina. Para tal, basta subtrair do valor 10,00 o valor da m�dia.

Trabalhe esse c�digo em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analis�-lo.
 */

import java.util.Scanner;
public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		
		System.out.print("Digite a nota da prova final: ");
		float notaProva = sc.nextFloat();
		
		System.out.print("Digite a nota do projeto: ");
		float notaProjeto = sc.nextFloat();
		
		System.out.print("Digite a nota da lista de exercic�os: ");
		float notaExercicios = sc.nextFloat();
		
		System.out.print("Digite a nota de contribui��o em projetos de software livre/ conclus�o de MOOCs recomendados pelo docente: ");
		float notaProjetos = sc.nextFloat();
		
		float notaAprovacao = 8;
		float mediaAluno = ((notaProva*3) + (notaProjeto*3) + (notaExercicios*2) + (notaProjetos*3))/ (3+3+2+3);
		boolean alunoAprovado = mediaAluno >= notaAprovacao;
		
		float  notaMinima = 10 - notaProva;
		
		if (alunoAprovado == true)
			System.out.print("O aluno: "+ nomeAluno + " foi APROVADO com a m�dia: " + mediaAluno + ".");
		else System.out.print("O aluno: "+ nomeAluno + " foi REPROVADO com a m�dia: " + mediaAluno + ".\nA nota m�nima da prova final para aprova��o deveria ser: " + notaMinima);
	}

}
