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
   return 
   super.toString()+ " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
}

@Override
public int compareTo(Futbolista f) {
	Portero P = (Portero)f;
	return Math.abs(this.golesRecibidos() - f.golesRecibidos());

}

}
