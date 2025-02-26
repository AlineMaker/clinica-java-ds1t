package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	 public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.setAltura(1.65);
		p1.setPeso(59.9);
		p1.telefone = "(11)98888-8888";
		p1.dataNascimento = LocalDate.of(2003, 2, 28);
		p1.estaInternado = true;
		
				
		
		
		
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Aline Alves de Souza";
		p2.setAltura(1.50);
		p2.setPeso(45.0);
		p2.telefone = "(11)97148-2863";
		p2.dataNascimento = LocalDate.of(1995, 12, 18);
		p2.estaInternado = false;
		
		
		
		// Mostrar dados dos pacientes
		p1.mostrarFichaPaciente();
		p2.mostrarFichaPaciente();
	
	
	
		/*
		 * Paciente p3 = p1;
		 
		programador empresa data
		int idade = 25;
		System.out.println("Eu tenho " + idade + "anos de idade.");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3); */
		
		
		
	}
}	
