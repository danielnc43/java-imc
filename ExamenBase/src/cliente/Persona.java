package cliente;

import java.util.UUID;

public class Persona {
	
    private String nombre, nss;
    private int edad;
    private char sexo;
    private double peso, altura;
    
    private static final char SEXO_DEFAULT = 'H';
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int PESO_ALTO = 1;
    private static final int EDAD_ADULTA = 18;
    
    public Persona()
    {
       nombre = "";
       edad = 0;
       sexo = SEXO_DEFAULT;
       peso = 0;
       altura = 0;
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
    	this.nombre = nombre;
    	this.edad = edad;
    	this.sexo = (this.comprobarSexo(sexo) ) ? sexo : SEXO_DEFAULT;
    	this.peso = peso;
    	this.altura = altura;
    	this.nss = this.generarNss();
    }
    public String getImcEvaluacion() {
    	int imc = this.calcularIMC();
    	String res = null;
    	if(imc == -1) {
    		res = "SE ENCUENTRA DEBAJO DEL PESO IDEAL";
    	} else if(imc == 0) {
    		res = "SE ENCUENTRA EN EL PESO IDEAL";
    	} else if(imc == 1) {
    		res = "SE ENCUENTRA SOBRE EL PESO IDEAL";
    	}
		return res;
 
    }
    public int calcularIMC() {
    	double imc = peso / (altura*altura);
    	
    	if(this.sexo == 'M') {
    		if(imc < 20) {
    			return PESO_BAJO;
    		} else if (imc > 25) {
    			return PESO_ALTO;
    		} else {
    			return PESO_IDEAL;
    		}
    	} else {
    		if(imc < 19) {
    			return PESO_BAJO;
    		} else if (imc > 24) {
    			return PESO_ALTO;
    		} else {
    			return PESO_IDEAL;
    		}
    	}
    }
    
    public boolean esMayorDeEdad() {
    	return this.edad >= EDAD_ADULTA;
    }
  
    private boolean comprobarSexo(char sexo) {
		return (sexo == 'M' || sexo == 'H');	
    }
    
    private String generarNss() {
    	return generarRandonString().substring(0, 8).toUpperCase();
    	
    }
    
    private String generarRandonString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
    
    public String getNombre() {
      return this.nombre;
    }
    public void setNombre(String newNombre) {
      this.nombre = newNombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }
    public String getNss() {
        return this.nss;
    }
    public char getSexo() {
        return this.sexo;
    }
    public String getSexoNombre() {
        String nombreSexo = null;
    	if(this.sexo == 'H') {
    		nombreSexo = "Hombre";
        } else if(this.sexo == 'M') {
        	nombreSexo = "Mujer";
        }
		return nombreSexo;
    }
    public void setSexo(char newSexo) {
        this.sexo = newSexo;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(char newPeso) {
        this.peso = newPeso;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(char newAltura) {
        this.altura = newAltura;
    }
    
    @Override
    public String toString()
    {
        return("Nombre: "+ this.getNombre() +
        		"\nNSS: " +this.getNss() +
        		"\nEdad: " +this.getEdad() + ", " +((this.esMayorDeEdad())?"Mayor de edad":"Menor de edad") +
        		"\nSexo: " +this.getSexoNombre() +
        		"\nPeso: " +this.getPeso() + " Kg." +
        		"\nAltura: " +this.getAltura() + " Mts." +
        		"\nResultado: " +this.getImcEvaluacion()        
               );
    }
	
}
