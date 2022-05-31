package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class ExecutaAnimal {

	public static void main(String[] args) {

		Animal ave = new Animal();
		ave.setTipo("Ave");
		ave.setTipoAlimentacao("Carnívoca");
		ave.setMeioLocomocao("Voar");
		ave.setIdadeMaxima(70);
		ave.setNome("Falcão Real");

		System.out.println(ave);
		System.out.println("\n");

		Animal foca = new Animal();
		foca.setTipo("Mamífero");
		foca.setTipoAlimentacao("Algas");
		foca.setMeioLocomocao("Nadar");
		foca.setIdadeMaxima(20);
		foca.setNome("Geraldo");

		System.out.println(foca);

		Animal foca2 = new Animal();
		foca2.setTipo("Mamífero");
		foca2.setTipoAlimentacao("Algas");
		foca2.setMeioLocomocao("Nadar");
		foca2.setIdadeMaxima(20);
		foca2.setNome("Geraldo");

		System.out.println(foca2);

		System.out.println(foca.equals(foca2) ? "Igual" : "Diferente");

	}

}
