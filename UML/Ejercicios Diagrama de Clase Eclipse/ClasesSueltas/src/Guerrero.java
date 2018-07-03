
public class Guerrero {
	
	//ATRIBUTOS	
	private int vida;
	private int destreza;
	private int resistencia;
	private int constitucion;
	private int fuerza;
	private int x, y; // es 2D no 3D
	private int nivel;
	private String nombre;
	private boolean esHombre;
	
	//CONSTRUCTORES
	public Guerrero (){
		System.out.println("Soy un Guerrero, ¡Ten cuidado! (Tengo valores determinados ya)");
		this.vida= 100;
		this.constitucion=50;
		this.fuerza=7;
		this.x=590;
		this.y=300;
		this.nombre="Farfly";
		this.esHombre=true; // true= es hombre, false= es mujer.
	}
	
	public Guerrero (int vida, int destreza, int constitucion, int fuerza, int x, int y, String nombre, boolean esHombre){
		System.out.println("Soy un Guerrero, ¡Ten cuidado! (No tengo valores determinados)");
		this.vida= vida;
		this.constitucion= constitucion;
		this.fuerza= fuerza;
		this.x=x;
		this.y=y;
		this.nombre= nombre;
		this.esHombre= esHombre; 
	}
	
	
	//METODOS GET Y SET
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getConstitucion() {
		return constitucion;
	}
	public void setConstitucion(int constitucion) {
		this.constitucion = constitucion;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEsHombre() {
		return esHombre;
	}
	public void setEsHombre(boolean esHombre) {
		this.esHombre = esHombre;
	}
	
	//OTROS METODOS
	//Metodo para calcular donde ira
	
}
