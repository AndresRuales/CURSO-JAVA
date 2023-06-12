package HerenciaYPolimorfismo;

public class Gerente extends Funcionario{

	private String clave;
	
	
	public void setClave(String clave) {
		this.clave=clave;
	}
	

	public boolean iniciarSesion(String clave) {
		return clave =="Alura";
	}
	
	
	//CON LA PALABRA SUPER, TENEMOS ACCESO A LOS METODOS DE LA CLASE PADRE
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
	
}
