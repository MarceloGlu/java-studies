package d;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Switch
		
		String mode;
		mode= "off";
	//	mode = "on";
	//	mode = "standby";
		
		switch(mode) {
		case "off":
			System.out.println("machine off");
			break;
		case "on":
			System.out.println("machine on");
			break;
		case "standby":
			System.out.println("stanby");
			break;			
		}
		
		/* Switch va pasando por todos los casos, desde el primero que esta activo.
		 * para que esto no suceda pongo un break, de modo que cuando encuentra el primer
		 * switch activo sale del programa y termina*/

	}

}