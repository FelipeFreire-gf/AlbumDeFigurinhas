package modelo;

public class Esportivos extends Album {

	private String eventoEsportivo;
	private String anoEvento;
	
	//Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void listar() {
        System.out.println("Apresentacao do album esportivo: ");
        apresentacao();
        
    }

	public String getEventoEsportivo() {
		return eventoEsportivo;
	}

	public void setEventoEsportivo(String eventoEsportivo) {
		this.eventoEsportivo = eventoEsportivo;
	}

	public String getAnoEvento() {
		return anoEvento;
	}

	public void setAnoEvento(String anoEvento) {
		this.anoEvento = anoEvento;
	}
	
	 @Override
	    public String toString() {
	        return "Evento: " + eventoEsportivo + "\n" +
	               "Ano do evento: " + anoEvento + "\n" + "\n";
	    }
	
}
