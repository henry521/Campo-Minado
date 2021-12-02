package henriquecm.modelo;

@FunctionalInterface
public interface CampoObservador {
	
	public void EventoOcorreu(Campo campo, CampoEvento evento);
}
