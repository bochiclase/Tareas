
public class ArraysDeObjetos {

	public static void main(String[] args) {
		
		String [] dias;  // cuando creo la clase String no invoco a ningun constructor
		dias= new String[7]; //creo la array
		
		dias [0] = "Lunes";
		dias [1] = "Martes";
		dias [2] = "Miercoles";
		dias [3] = "Jueves";
		dias [4] = "Viernes";
		dias [5] = "Sabado";
		dias [6] = "Domingo";
		
		for (int i=0; i<dias.length; i++)
			System.out.println(dias[i]);
		
		

	}

}
