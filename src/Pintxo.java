public class Pintxo {

	private int id;
	private int tipo; 
	private String nombre;
	private String[] ingredientes;

	//getters
	public int getId() {
		return this.id;
	}public int getTipo() {
		return this.tipo;
	}public String getNombre() {
		return this.nombre;
	}public String[] getIngredientes() {
		return this.ingredientes;
	}
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setIngredientes(String[] ingre) {
		this.ingredientes = ingre;
	}
}

