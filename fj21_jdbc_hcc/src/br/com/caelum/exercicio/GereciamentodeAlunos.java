package br.com.caelum.exercicio;

public class GereciamentodeAlunos {

	public String nome;
	public int matricula;
	public double[] notas;
	public int indicenotas;
	
	public  GereciamentodeAlunos(String nome, int matricula ) {
		this.nome =nome;
		this.matricula=matricula;
		this.notas = new double[4];//Ate quatro notas
		this.indicenotas =0;
			}
		
	public void adicionanota(double nota) {
		/* o indice de notas menor que 4 
		 * se verdadeiro adicione mais uma notas
		 * se falso mensagem : numero de notas atigindo
		 */
		if (indicenotas < notas.length) {
			notas[indicenotas++] = nota;
		}else {
			System.out.println("numero de notas atigindo");
		}
	
	}
			public double CalcularMedia() {
				double soma=0;
				
			
				for (int i =0;i< indicenotas;i++) {
				soma +=notas[i];
					
				}
			return soma/=indicenotas;
			
							
				}
			
			public boolean estaAprovado() {
				
				return CalcularMedia() >=7;
			}	
				public void exibirInfo() {
					
					System.out.println("nome:"+ nome);
					System.out.println("matricula:"+ matricula);
					System.out.println("media:"+ CalcularMedia());
					System.out.println("aprovado" + (estaAprovado() ? "sim " : "nao"));
				
			}
		}
	
	
		
		
	
	
	

