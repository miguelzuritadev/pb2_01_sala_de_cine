package ar.edu.unlam.pb2;

public class SalaDeCineTest {
	public static void main(String[] args) {
		String textoBienvenida = "Texto Bienvenida";
		System.out.println(textoBienvenida);
		
		SalaDeCine salaCine = new SalaDeCine(2, 5);
		//System.out.println(salaCine );
		
		if(!salaCine.ocuparButaca(0, 1)) {
			System.out.println("1 butaca ocupada");
		}
		if(!salaCine.ocuparButaca(0, 2)) {
			System.out.println("2a butaca ocupada");
		}

		if(!salaCine.ocuparButaca(0, 2)) {
			System.out.println("2b butaca ocupada");
		}
		
	}
}
