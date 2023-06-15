package HerenciaYPolimorfismo;

public class Funcionario {
	
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	//CONSTRUCTOR VACIO
	public Funcionario() {
		
	}
	
	//FUNCION PARA BONIFICACION DEL FUNCIONARIO
	
	public double getBonificacion() {
		//si tipo = 1 es gerente
		//si tipo es 0 es funcionario
		
		if (this.tipo == 0) {
			return this.salario *0.1;
		} else if (this.tipo ==1){
			return this.salario;
		} else {
			return 0;
		}
	}
	
	
	//GETTERS AND SETTER DE TIPO
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

	
	//GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	//CUANDO UNA CLASE ES ABSTRACTA, NO SE PUEDE INSTANCEAR, ES OBLIGATORIO CREAR UNA CLASE
	//HIJA, LA CUAL HEREDE SUS ATRIBUTOS Y FUNCIONES,
		//TAMBIEN UNA CLASE ABSTRACTA PUEDE TENER METODOS ABSTRACTOS, CUANDO UN METODO
	//ES ABSTRACTO, SUS HIJAS, LAS QUE HEREDAN LA CLASE ABSTRACTA, SE VEN OBLIGADAS A 
	//SOBREESCRIBIR ESE METODO EN SU CLASE.
	//SI UNA CLASE ES ABSTRACTA Y HEREDA DE OTRA ABSTRACTA NO ESTA OBLIGADA A IMPLEMENTAR
	//LOS METODOS
	
	//lOS METODOS ABSTRACTOS NO TIENEN CUERPO.
	
	//TODOS LOS METODOS DE LAS INTERFACES, SON ABSTRACTOS Y NO TIENEN CUERPO
	//UNA INTERFAZ NO EXTIENDE DE UNA CLASE, SINO DE OTRA INTEFAZ
	//para implemtar una clase interfaz en una clase normal, se hace con la palabra IMPLEMENTS
		//Y ES OBLIGATORIO IMPLEMENTAR SUS METODOS

}
