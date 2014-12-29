import java.util.ArrayList;

public class Bar {

		private int id;
		private String nombre, direccion;
		private ArrayList<Pintxo> pintxos;
		private ArrayList<Pote> potes;

		//getters
		public int getId() {
			return this.id;
		}
		public String getNombre() {
			return this.nombre;
		}
		public String getDireccion() {
			return this.direccion;
		}
		public ArrayList<Pintxo> getPintxos() {
			return this.pintxos;
		}
		public ArrayList<Pote> getPotes() {
			return this.potes;
		}
		//setters
		public void setId(int id) {
			this.id = id;
		}
		public void setNombre(String nom) {
			this.nombre = nom;
		}
		public void setDireccion(String dire) {
			this.direccion = dire;
		}
		public void setPintxos(ArrayList<Pintxo> pintxos) {
			this.pintxos = pintxos;
		}
		public void setPotes(ArrayList<Pote> potes) {
			this.potes = potes;
		}
}
