package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;
	
public Portero(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesMarcados;
		this.dorsal = dorsal;
	}
	
@Override
public boolean jugarConLasManos() {
	return true;
}
	
@Override
public String toString() {
    System.out.println("El futbolista " + this.getNombre() + "tiene " + this.getEdad() +",y juega de " + this.getPosicion() +
        " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos);
}

@Override
public int compareTo(Futbolista f) {
	
	return this.getEdad() - f.getEdad();

}

}
