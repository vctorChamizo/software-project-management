package presentacion.comando.comandos.cuestionario;

import presentacion.comando.Comando;
import presentacion.controlador.Contexto;
import presentacion.controlador.Evento;


public class ComandoAbrirGUISeleccionCuestionario implements Comando {

	@Override
	public Contexto execute(Object datos) {
		return new Contexto(Evento.abrirGUISeleccionCuestionario, datos);
	}
}
