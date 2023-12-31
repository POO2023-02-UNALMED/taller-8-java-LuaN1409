package futbol;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private String posicion;
	
	
public Futbolista(String nombre, int edad, String posicion) {
	
	this.nombre = nombre;
	this.edad = edad;
	this.posicion = posicion;
}

public Futbolista(){
	   this("Maradona", 30, "delantero");
	}

public String toString() {
	return "El futbolista " + this.nombre + " tiene " + this.edad +", y juega de " + this.posicion;
}


public boolean equals (Futbolista f, Futbolista g) {
if (f.nombre.equals(g.nombre) && f.edad == g.edad &&f.posicion.equals(g.posicion)) {
	return true;
}
else {
	return false;}
}

public abstract boolean jugarConLasManos();

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getPosicion() {
	return posicion;
}
}
