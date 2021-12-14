package c;

//Ejercicio aplicando la funcion random a los modos de "on", "of", "stand_by".
//Cada una de estas situaciones es un numero ordinal dentro del array.
public class Challenge {

	public static void main(String[] args) {
		
		String[] modes = {"on", "off", "stand_by"};
		
		int index = (int) (Math.random() * modes.length);
		System.out.println(modes[index]);
		

	}

}
