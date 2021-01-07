/*
 * Instruções do projeto
A Next Level, uma moderna e conceituada universidade, necessita de um sistema de gestão acadêmico.

Para o projeto piloto de implantação do sistema, você deve criar um programa que permita calcular a média semestral dos alunos.

A média semestral é a média aritmética simples das médias bimestrais. 
As médias bimestrais são compostas pelas seguintes atividades: prova (peso 3), projeto (peso 3), lista de exercícios (2) e contribuição em projetos de software livre/ conclusão de MOOCs recomendados pelo docente (3).

Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi aprovado ou reprovado. Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.

Caso o aluno tenha média menor que 8, determine também a nota mínima necessária para a pontuação na prova final, de forma que o aluno garanta aprovação na disciplina. Para tal, basta subtrair do valor 10,00 o valor da média.

Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.
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
		
		System.out.print("Digite a nota da lista de exercicíos: ");
		float notaExercicios = sc.nextFloat();
		
		System.out.print("Digite a nota de contribuição em projetos de software livre/ conclusão de MOOCs recomendados pelo docente: ");
		float notaProjetos = sc.nextFloat();
		
		float notaAprovacao = 8;
		float mediaAluno = ((notaProva*3) + (notaProjeto*3) + (notaExercicios*2) + (notaProjetos*3))/ (3+3+2+3);
		boolean alunoAprovado = mediaAluno >= notaAprovacao;
		
		float  notaMinima = 10 - notaProva;
		
		if (alunoAprovado == true)
			System.out.print("O aluno: "+ nomeAluno + " foi APROVADO com a média: " + mediaAluno + ".");
		else System.out.print("O aluno: "+ nomeAluno + " foi REPROVADO com a média: " + mediaAluno + ".\nA nota mínima da prova final para aprovação deveria ser: " + notaMinima);
	}

}
