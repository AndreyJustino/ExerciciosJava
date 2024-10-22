import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a hora inicial e a final");
		int timeStart = sc.nextInt();
		int timeEnd = sc.nextInt();
		
		if(timeStart <= 24 && timeEnd <= 24) {
			int total = 0;
			
			if(timeStart > timeEnd) {
				
				total = 24 - timeStart + timeEnd;
				
			}  
			else if(timeStart == timeEnd)
				total = 24;
			else {

				total = timeEnd - timeStart;
			}
			
			System.out.printf("O JOGO DUROU %d HORA (S)", total);
			
		} else {
			System.out.println("Horarios colocados invalidos, coloque os dentro de 0 - 24");
		}
		
		
		
		sc.close();
	}

}
