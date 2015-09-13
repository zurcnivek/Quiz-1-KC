import java.util.Scanner;

// This program will calculate the NFL passing rate with the formulas required inputs

public class NFLPassingRating {
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		
		//Declare and assign input variables
		System.out.print(" Enter total touch downs");//TD
		double touchDowns = input.nextDouble();
		System.out.print(" Enter total yards");//YDS
		double totalYards = input.nextDouble();		
		System.out.print(" Enter total interceptions");//INT
		double interceptions = input.nextDouble();
		System.out.print(" Enter total number of completions");//COMP
		double completions = input.nextDouble();
		System.out.print(" Enter total number of passes attempted");//ATT
		double passesAtempted = input.nextDouble();
		
		//Calculate the four NFL passer rating formula variables
		double comlpetionPercentage = (( completions / passesAtempted )- .3) * 5;
		double yardsPerAttempt = ((totalYards/passesAtempted)-3)* .25;
		double touchdownsPerAttempt = ((touchDowns/passesAtempted)* 20 );
		double interceptionsPerAttempt = (2.375 - ((interceptions/passesAtempted)*25));
		
		//Calculate the passer rating based on the four previous calculations
		double passingRating = ((comlpetionPercentage + yardsPerAttempt + 
				touchdownsPerAttempt + interceptionsPerAttempt)/6)*100;
		
		//Display system output or the passing rating
		System.out.println(" Based on the information received, the passing rating for " +
		" this player is: " + passingRating);
				
	}
}