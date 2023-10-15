package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;
	
public Portero(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesMarcados;
		this.dorsal = dorsal;
	}
	

public short getGolesRecibidos() {
	return golesRecibidos;
}

public void setGolesRecibidos(short golesRecibidos) {
	this.golesRecibidos = golesRecibidos;
}

public byte getDorsal() {
	return dorsal;
}

public void setDorsal(byte dorsal) {
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
	return Math.abs(this.getGolesRecibidos() - P.getGolesRecibidos());

}

}
