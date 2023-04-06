package ar.edu.unlam.pb2;

public class Fila {

	private Integer totalButacas = 0;

	private Butaca[] butacas = new Butaca[0];

	public Fila(Integer totalButacas) {
		super();
		this.totalButacas = totalButacas;
		butacas = new Butaca[totalButacas];
		for (int i = 0; i < totalButacas; i++) {
			butacas[i] = new Butaca();
		}
	}

	public Butaca obtenerButaca(Integer asiento) {
		return butacas[asiento];
	}
	
	

}