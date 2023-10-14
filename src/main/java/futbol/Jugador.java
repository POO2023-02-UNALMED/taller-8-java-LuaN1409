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


@Override
public int compareTo(Futbolista f) {
	
	int diferencia = Math.abs(this.getEdad() - f.getEdad());
	return diferencia;
}

@Override
public abstract boolean jugarConLasManos();

@Override 
public String toString() {
	
	System.out.println("El futbolista " + this.getNombre() + "tiene " + this.getEdad() +",y juega de " + this.getPosicion());
}

}
