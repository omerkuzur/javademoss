package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A': 
			System.out.println("M�kemmel : Ge�tiniz");
			break;
			
		case 'B':
		case 'C': 
			System.out.println("�yi  : Ge�tiniz");
			break;
			
		case 'D': 
			System.out.println("Fena de�il : Ge�tiniz");
			break;
			
		case 'F': 
			System.out.println("Malesef kald�n�z");
			break;			
		
		default:
			throw new IllegalArgumentException("Ge�ersiz not girdiniz");
		}

	}

}
