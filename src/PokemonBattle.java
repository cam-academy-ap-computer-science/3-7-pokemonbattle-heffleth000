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
		int pokemonHP = damage(name);
		statsTable(name, pokemonHP);
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
	
	public static int damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		System.out.print("Level: ");			//starting here user will enter stats of pokemon for battle
		int level = userInput.nextInt();
		System.out.print("Attack: ");
		int attack = userInput.nextInt();
		System.out.print("Defense: ");
		int defense = userInput.nextInt();
		System.out.print("Base: ");
		int base = userInput.nextInt();
		System.out.print("STAB: ");
		int stab = userInput.nextInt();
		System.out.print("HP: ");
		int hp = userInput.nextInt();
		System.out.println();
		double modifier = 0.85 + (Math.random() * 0.15);	//creates a random number between 0.85 and 1.0
		int damage = (int) ((((2 * level + 10 )/ (250)) + ((attack / defense) * base) + 2) * modifier);		//calculates damage
		System.out.println("Alakazam sustained " + damage + " points damage.");
		int newHP = hp - damage;		//finds new HP after subtracting damage
		System.out.println("HP, after damage, are mow " + newHP);		//prints new HP of Alakazam
		return newHP;		//returns new HP
	}
	
	public static void statsTable(String name, int HP) {
		System.out.println("");
		System.out.println("NAME: " + name);
		System.out.println("LEVEL: 40");
		System.out.println("------------------------------");
		System.out.println("HP: " + HP);
		System.out.println("ATTACK: 52");
		System.out.println("DEFENSE: 51");
		System.out.println("SP. ATK: 121");
		System.out.println("SP. DEF: 81");
		System.out.println("SPEED: 107");
		System.out.println("------------------------------");
	}
}
