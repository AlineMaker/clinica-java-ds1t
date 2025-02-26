package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado ;
	private double imc;
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}else {
			 System.out.println("Altura do(a) paciente " + nome + " está incorreto");
			
		}
		
		
}
	
	public void setPeso(double peso) {
			if(peso >= 40.0) {
				this.peso = peso;			
			}else {
				System.out.println("Peso do paciente " + nome + " está incorreto");
			}
}
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		imc = peso / Math.pow(altura, 2);
		
			
	}
	public void classificarImc() {
		
	}
	public void mostrarFichaPaciente() {
		calcularImc();
		System.out.println("Nome " + nome);
		System.out.println("Peso " + peso);
		System.out.println("Imc " + imc);
		System.out.println("Telefone " + telefone);
		System.out.println("Dia Nascimento " + obterDiaSemanaNascimento());
		System.out.println();
		

	}
	private String  obterDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();
		return(diaSemana);
		
	}

}


