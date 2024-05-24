package tester;
import backend.Pokemon;

public class Main {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon(1, "Bulbasaur", "Planta", "Una rara semilla fue plantada en su espalda al nacer.");
		Pokemon p2 = new Pokemon(2, "Ivysaur", "Planta", "Cuando el bulbo de su espalda crece, parece no poder ponerse de pie sobre sus patas traseras.");
		Pokemon p3 = new Pokemon(3, "Venusaur", "Planta", "La planta florece cuando absorbe energía solar. Ésta le obliga a ponerse en busca de la luz solar.");
		Pokemon p4 = new Pokemon(4, "Charmander", "Fuego", "Prefiere los sitios calientes. Dicen que cuando llueve sale vapor de la punta de su cola.");
		Pokemon p6 = new Pokemon(6, "Charizard", "Fuego", "Escupe fuego tan caliente que funde las rocas. Causa incendios forestales sin querer.");
		Pokemon p7 = new Pokemon(7, "Squirtle", "Agua", "Tras nacer, su espalda se hincha y endurece como una concha. Echa potente espuma por la boca.");
		Pokemon p8 = new Pokemon(8, "Wartortle", "Agua", "Se oculta en el agua para cazar a sus presas. Al nadar rápidamente, mueve sus orejas para nivelarse.");
		Pokemon p9 = new Pokemon(9, "Blastoise", "Agua", "Un brutal Pokémon con reactores de agua en su caparazón. Éstos son usados para rápidos placajes.");
		Pokemon p10 = new Pokemon(10, "Caterpie", "Bicho", "Sus cortas patas están recubiertas de ventosas que le permiten subir incansable por muros y cuestas.");
		
		System.out.println("Test 1");
		System.out.println("--------------------------------%n");
		System.out.println("PokedexBackend.txt");
		System.out.println("2024-05-21");
		System.out.println("--------------------------------%n");
		System.out.println(p1.getNumeroDePokemon() + " " + p1.getTipo() + " " + p1.getDescripcion());
		
		System.out.println();
		System.out.println("===================================");
		System.out.println();
		
		System.out.println("Test 2");
		p1.getPokemones().elementAt(2).tellAboutSelf();
	}
}
