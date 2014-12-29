import java.util.ArrayList;

public class Cuenta {
	
	private ArrayList <Pintxopote> cuenta; 

	// getter
	public ArrayList <Pintxopote> getCuenta() {
		return this.cuenta;
	}

	// setter
	public void setCuenta(ArrayList <Pintxopote> cuenta) {
		this.cuenta = cuenta;
	}
	//imprimir en pantalla
	public void inprimirCuenta() {
		for (int i=0; i<cuenta.size(); i++) {
			System.out.println("Pintxo: "+this.cuenta.get(i).getPintxo());
			System.out.println("Pote: "+this.cuenta.get(i).getPote());
			System.out.println("Precio: "+this.cuenta.get(i).getPrecio());
		}
	}

}
