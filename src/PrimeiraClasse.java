import java.util.Scanner;
import java.text.DecimalFormat;
public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		
		double notaProva1, notaProjeto1, notaExercicios1, notaProjetos1, mediaSemestre, notaMinima, media1;
		double notaProva2, notaProjeto2, notaExercicios2, notaProjetos2, media2;
		double notaProva3, notaProjeto3, notaExercicios3, notaProjetos3, media3;
		DecimalFormat x = new DecimalFormat("0.00");
	
		// Primeiro bimestre
		System.out.print("Digite a nota da prova do primeiro bimestre: ");
		notaProva1 = sc.nextDouble();
		
		System.out.print("Digite a nota do projeto do primeiro bimestre: ");
		notaProjeto1 = sc.nextDouble();
		
		System.out.print("Digite a nota da lista de exercicíos do primeiro bimestre: ");
		notaExercicios1 = sc.nextDouble();
		
		System.out.print("Digite a nota de contribuição em projetos de software livre/conclusão de MOOCs recomendados pelo docente do primeiro bimestre: ");
		notaProjetos1 = sc.nextDouble();
		
		media1 = ((notaProva1*3) + (notaProjeto1*3) + (notaExercicios1*2) + (notaProjetos1*3)) / (3+3+2+3); 
		String media1f = x.format(media1);
		System.out.println("Aluno: " + nomeAluno + "\nMédia primeiro bimestre: " + media1f +"\n");
		
		
		//Segundo bimestre
		System.out.print("Entre com as notas do segundo bimestre \nDigite a nota da prova do segundo bimestre: ");
		notaProva2 = sc.nextDouble();
		
		System.out.print("Digite a nota do projeto do segundo bimestre: ");
		notaProjeto2 = sc.nextDouble();
		
		System.out.print("Digite a nota da lista de exercicíos do segundo bimestre: ");
		notaExercicios2 = sc.nextDouble();
		
		System.out.print("Digite a nota de contribuição em projetos de software livre/conclusão de MOOCs recomendados pelo docente do segundo bimestre: ");
		notaProjetos2 = sc.nextDouble();
		
		media2 = ((notaProva2*3) + (notaProjeto2*3) + (notaExercicios2*2) + (notaProjetos2*3)) / (3+3+2+3);
		String media2f = x.format(media2);
		System.out.println("Média segundo bimestre: " + media2f +"\n");
		
		
		
		//Terceiro bimestre
		System.out.print("Entre com as notas do terceiro bimestre \nDigite a nota da prova do terceiro bimestre: ");
		notaProva3 = sc.nextDouble();
		
		System.out.print("Digite a nota do projeto do terceiro bimestre: ");
		notaProjeto3 = sc.nextDouble();
		
		System.out.print("Digite a nota da lista de exercicíos do terceiro bimestre: ");
		notaExercicios3 = sc.nextDouble();
		
		System.out.print("Digite a nota de contribuição em projetos de software livre/conclusão de MOOCs recomendados pelo docente do terceiro bimestre: ");
		notaProjetos3 = sc.nextDouble();
			
		media3 = ((notaProva3*3) + (notaProjeto3*3) + (notaExercicios3*2) + (notaProjetos3*3)) / (3+3+2+3);
		String media3f = x.format(media1);
		System.out.println("Média terceiro bimestre: " + media3f +"\n");

		
		//Média do semestre
		mediaSemestre = (media1 + media2 + media3)/3;
		notaMinima = 10 - mediaSemestre;
		String mediaSemestref = x.format(mediaSemestre);
		String notaMinimaf = x.format(notaMinima);
		
		if (mediaSemestre >= 8)
			System.out.print("O aluno: "+ nomeAluno + " foi APROVADO com a média semestral de: " + mediaSemestref + ".");
		else System.out.print("O aluno: "+ nomeAluno + " foi REPROVADO com a média semestral de: " + mediaSemestref + ".\nRealize a PROVA FINAL e obtenha nota mínima de: " + notaMinimaf + " para conseguir aprovação!");
	}

}

//Cristina Pineda.