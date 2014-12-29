public class Pote {

	private int id;
	private String nombre;
	private int tipo; 


	//getters
	public int getId() {
		return this.id;
	}	
	public String getNombre() {
		return this.nombre;
	}
	public int getTipo() {
		return this.tipo;
	}
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}