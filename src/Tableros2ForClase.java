
public class Tableros2ForClase {

	static void tableros(int f, int c) { // aqui creo un metodo tableros que luego voy a
		// darele valor al final del ejercicio

		for (int i = 0; i < f; i++) {

			//for (int v = 0; v < 4; v++) {
			
			

				for (int j = 0; j < c; j++) {

					//for (int r = 0; r < 4; r++) {

						if (((i % 2 == 0 && j % 2 != 0) || i % 2 != 0 && j % 2 == 0))

							System.out.print("*");
						else
							System.out.print(" ");

					}
				System.out.println();
				}
				
			}

		

	

	public static void main(String[] args) {

		tableros(10, 10);
	}

}
