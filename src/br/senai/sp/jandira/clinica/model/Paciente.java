package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate dataNascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado ;
	
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
		
	}
	public void classificarImc() {
		
	}
	public void mostrarFichaPaciente() {
		System.out.println("Nome " + nome);
		System.out.println("Peso " + peso);
		System.out.println("Telefone " + telefone);
		System.out.println("Dia Nascimento " + obterDiaSemanaNascimento());
		System.out.println();
		

	}
	private String  obterDiaSemanaNascimento() {
		String diaSemana = dataNascimento.getDayOfWeek().toString();
		return(diaSemana);
		
	}

}


