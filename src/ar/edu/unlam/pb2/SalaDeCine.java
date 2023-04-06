package ar.edu.unlam.pb2;

public class SalaDeCine {

	private Integer cantidadFilas = 0;
	private Integer totalButacas = 0;

	private Fila[] filas = new Fila[0];

	public SalaDeCine(Integer cantidadFilas, Integer totalButacas) {
		super();
		this.cantidadFilas = cantidadFilas;
		filas = new Fila[cantidadFilas];
		for (int i = 0; i < cantidadFilas; i++) {
			filas[i] = new Fila(totalButacas);
		}
	}

	public Boolean butacaEstaOcupada(Integer fila, Integer asiento) {
		Boolean result = false;
		if (filas[fila] != null) {
			result = filas[fila].obtenerButaca(asiento).obtenerOcupada();
		}
		return result;
	}

	public Boolean ocuparButaca(Integer fila, Integer asiento) {
		Boolean result = true;
		if (!butacaEstaOcupada(fila, asiento)) {
			Butaca butaca = filas[fila].obtenerButaca(asiento);
			butaca.asignarOcupada(true);
		} else {
			result = false;
		}
		return result;
	}

}