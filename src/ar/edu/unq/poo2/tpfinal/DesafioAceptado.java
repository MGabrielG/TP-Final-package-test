package ar.edu.unq.poo2.tpfinal;

public abstract class DesafioAceptado extends EstadoDeDesafio {
	
	public DesafioAceptado(DesafioUsuario desafio) {
		super(desafio);
	}


	protected int votoGuardado;
	
	
	public Boolean votarDesafio(int voto) {
		if(voto >= 0 && voto <=5) {
			this.votoGuardado=voto;
			return true;
		}
		return false;
	}
}
