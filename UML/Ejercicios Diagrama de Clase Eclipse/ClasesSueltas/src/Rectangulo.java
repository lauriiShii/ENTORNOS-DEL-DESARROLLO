
public class Rectangulo {

	//ATRIBUTOS
	private float base;
	private float altura;
	
	//CONSTRUCTORES 
	//Nace con una altura y una bese
	public Rectangulo (float base, float altura){
		this.base = base;
		this.altura= altura;
	}
	
	//Nace con altura y base concreta
	public Rectangulo(){
		this.base = 1;
		this.altura = 1;
	}
	
	//METODOS
	//Para obtener el area
	public float obtenerArea(){
		return base  * altura;
	}
	
	//Para obtener el perimetro
	public float obtenerPerimetro(){
		return 2*base+2*altura;
	}
	
	//Para obtener la diagonal
	public float obtenerDiagonal(){
		double miFloat = base*base+altura*altura;
		return  (float) Math.sqrt(miFloat);
	}
	
	//Get y set
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//PROBAMOS LA CLASE RECTANGULO
	static public void main(String args[]){
		
		//Creamos objetos
		Rectangulo rectangulo1 = new Rectangulo(3,4);
		Rectangulo rectangulo2 = new Rectangulo(4,6);
		
		//Obtenemos area		
		System.out.println("Area rectangulo 1:"+rectangulo1.obtenerArea());
		System.out.println("Area rectangulo 2: "+rectangulo2.obtenerArea());
		
		//Obtenemos perimetro
		System.out.println("Perímetro rectangulo 1: "+rectangulo1.obtenerPerimetro());
		System.out.println("Perímetro rectangulo 2:"+rectangulo2.obtenerPerimetro());
		
		//obtenemos diagonal
		System.out.println("Diagonal rectangulo 1:"+rectangulo1.obtenerDiagonal());
		System.out.println("Diagonal rectangulo 2:"+rectangulo2.obtenerDiagonal());
		
		
		
		
		
		
		
	}
	
	
}
