package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class TestaConstrutor {

	public static void main(String[] args) {

		Animal animal = new Animal("ave", "insetos", "voa", 70, "Falcão");
		animal.setNome("Papagaio");

		System.out.println(animal);
	}

}
