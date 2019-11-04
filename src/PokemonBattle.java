/* BATTLESTART
 * intro for trainer and pokemon
 * user input pokemon's name
 * 
 * DAMAGE
 * takes pokemon's name as parameter and input stats of pokemon
 * returns amount of HP left after damage
 * Calculate damage: (((2 * level + 10 )/ (250)) + ((attack / defense) * base) + 2) * modifier
 * Calculate modifier: Random * STAB		*random will be between 0.85 and 1.00
 *      call random  by: low + (Math.random() * (high - low))  --------->  0.85 + (Math.random() * 0.15)
 * store return in variable in main
 *  
 * STATSTABLE
 * call stats from main and print in table
 */

import java.util.*;

public class PokemonBattle {
	
static Scanner userInput = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = battleStart();
		damage(name);			
	}

	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose? ");
		String pokename = userInput.nextLine();					//put in pokemon's name here
		System.out.println("You chose " + pokename + "!");
		System.out.println("It's a Pokemon battle between " + pokename + " and Zebstrika! Go!");
		System.out.println();
		return pokename;
	}
	
	public static void damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		
	}
}
