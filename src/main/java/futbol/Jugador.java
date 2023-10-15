package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
	super(nombre, edad, posicion);
	this.golesMarcados = golesMarcados;
	this.dorsal = dorsal;
}

public Jugador() {
	super("Maradona", 30, "delantero");
	this.golesMarcados = 289;
	this.dorsal = 7;
}

public int compareTo(Object f) {
	Jugador J = (Jugador)f;
	return Math.abs(this.getEdad() - J.getEdad());
}

public boolean jugarConLasManos() {
	return false;
}

public String toString() {
	
	return 
	super.toString()+ " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
}

}
