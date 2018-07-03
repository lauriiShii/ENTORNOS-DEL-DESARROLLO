
public class Aspirador {
	
	//ATRIBUTOS
	private int potencia;
	private boolean encendido;
	
	//CONSTRUCTOR
	public  Aspirador(){
		System.out.println("Ha nacido un Aspiradoooooor ...");
		setPotencia(1);//Nace con potencia uno
		encendido = false; //Nace apagado
	}
	
	//METODOS
	//El get para ver el atributo potencia
	public int getPotencia(){
		return potencia;
	}
	
	//El set para modificar el atributo potencia
	public void setPotencia (int potencia){
		this.potencia = potencia;
	}
	
	//Encendido apagado
	public void arrancarParar (){
		if (encendido) {
			System.out.println("Apagado ... ");
			encendido=false;
		} else{
			System.out.println("Encendido con potencia actual "+potencia);
			encendido=true;
		}
	}
	
	//Recoger cable
	public void recogerCable(){
		System.out.println("Recogiendo cable ... ");
	}
	
	static public void main(String args[]){
		
		//Creamos objeto
		Aspirador miAspirador = new Aspirador();
		
		//Probamos que funcionan todos los casos de uso
		miAspirador.arrancarParar();//Encendemos asprador
		miAspirador.setPotencia(4);//Damos potencia concreta
		System.out.println("Potencia actual "+miAspirador.getPotencia());//Mostramos
		miAspirador.arrancarParar();//Apagamos aspirador
		
	}
}
