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
	
	Jugador nuevoJugador = (Jugador)f;
	return Math.abs(this.getEdad() - nuevoJugador.getEdad());
}

public String toString() {
	
	return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
}

public boolean jugarConLasManos() {
	
	return false;
}

}