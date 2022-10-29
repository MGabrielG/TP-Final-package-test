package ar.edu.unq.poo2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private Recomendacion metodoRecomendacion;
	private PreferenciasUsuario preferenciasActuales;

	private List<DesafioUsuario> desafiosCompletos = new ArrayList<DesafioUsuario>();

	public float porcentajeCompletitud(DesafioUsuario desafio) {
		return desafio.getPorcentajeCompletitud();
	}


	public List<DesafioUsuario> getDesafiosCompletos() {
		return desafiosCompletos;
	}

	public Recomendacion setMetodoDeRecomendacion(Recomendacion metodoUtilizado) {
		return metodoRecomendacion = metodoUtilizado;
	}

	public Recomendacion getMetodoRecomendacion() {
		return metodoRecomendacion;
	}

	public void superoElDesafio(DesafioUsuario desafioCompletado) {
		desafiosCompletos.add(desafioCompletado);
	}

	public LocalDate momentoSuperacion(DesafioUsuario desafio) {
		return desafio.getMomentoSuperacion();
	}

	public float porcentajeCompletitudGeneral(Proyecto proyecto) {
		float cantidadDePorcentaje = 0;
		for (Desafio desafioUsuario : proyecto.getDesafios()) {
			cantidadDePorcentaje += desafioUsuario.getPorcentajeCompletitud();
		}
		return cantidadDePorcentaje / proyecto.getDesafios().size();
	}
	
	public PreferenciasUsuario getPreferenciasUsuario() {
		return preferenciasActuales;
	}
	
	public void setPreferenciasUsuario(int muestrasPreferencia, int dificultadPreferida,
			int recompensaPreferida,DesafioUsuario desafioPreferido) {
		preferenciasActuales.setCantidadMuestras( muestrasPreferencia);
		preferenciasActuales.setDificultad(dificultadPreferida);
		preferenciasActuales.setRecompensaPreferida(recompensaPreferida);
		preferenciasActuales.setDesafioPreferido(desafioPreferido);
	}
	

}