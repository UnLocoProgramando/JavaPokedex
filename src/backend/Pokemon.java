package backend;

import java.util.Vector;

public class Pokemon {
	// Section: attributes 
	private int numeroDePokemon;
	private String nombre;
	private String tipo;
	private String descripcion; 
	
	// Section: static attributes
	private static Vector<Pokemon> pokemones = new Vector<Pokemon>();
	
	public Pokemon(int numeroDePokemon, String nombre, String tipo, String descripcion) {
		// TODO Auto-generated constructor stub
		this.numeroDePokemon = numeroDePokemon;
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		
		Pokemon.pokemones.add(this);
	}

	public int getNumeroDePokemon() {
		return numeroDePokemon;
	}
	public void setNumeroDePokemon(int numeroDePokemon) {
		this.numeroDePokemon = numeroDePokemon;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static Vector<Pokemon> getPokemones() {
		return Pokemon.pokemones;
	}

	public void setPokemones(Vector<Pokemon> pokemones) {
		Pokemon.pokemones = pokemones;
	}
	
	public static void tellAboutSelf() {
		System.out.printf("--------------------------------%n");
		System.out.printf(" PokedexBackend.txt             %n");
		System.out.printf(" 2024-05-21                     %n");

		System.out.printf("--------------------------------%n");
		System.out.printf("| %-4s | %-12s | %8s |%n", "#", "NAME", "TYPE");
		System.out.printf("--------------------------------%n");
		//println(Pokemon.getPokemones().elementAt(2).getNombre());
		for(int i = 0; i < Pokemon.pokemones.size(); i++)
			System.out.printf("| %04d | %-12s | %-8s |%n", Pokemon.getPokemones().elementAt(i).getNumeroDePokemon(), Pokemon.getPokemones().elementAt(i).getNombre(),  Pokemon.getPokemones().elementAt(i).getTipo());
	}
}
