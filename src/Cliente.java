public class Cliente {

	private int id;
	private String nombre;
	private Cartilla cartilla;
	//getters
	public int getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public Cartilla getCartilla() {
		return this.cartilla;
	}
	//setters
	public void setId(int id) {
		this.id = id;
	} 
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public void setCartilla(Cartilla cartilla) {
		this.cartilla = cartilla;
	}
}