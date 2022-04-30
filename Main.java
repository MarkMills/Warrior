//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Mar 17, 2022
// Homework 10 - Array of Warrior Objects
//////////////////////////////////////////////////////////////////////////////
package warrior;
import java.util.Random;
public class Main {

	public static void main(String[] args) {

		System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
	
		WarriorFred doug = new WarriorFred();
		WarriorFred james = new WarriorFred();
		WarriorFred carl = new WarriorFred();
		WarriorFred gabe = new WarriorFred();
		WarriorFred tim = new WarriorFred();

		WarriorFred[] fighter = {doug, james, carl, gabe, tim};

		fighter[0].setNickname("doug");

		fighter[1].setNickname("james");

		fighter[2].setNickname("carl");

		fighter[3].setNickname("gabe");

		fighter[4].setNickname("tim");
		
		for (int t = 1; t < 11; t++) {
			System.out.println("Round "+t+"\n-----");

			for (int i = 0; i < 5; i++) {
				Random r = new Random();
				fighter[i].getStatus();
				fighter[i].takeDamage(r.nextInt(10) + 1);
				fighter[i].reaction();
				System.out.println();
			}
		}
		System.out.println("How did the warriors fare?\n-----");
		for (int j = 0; j < 5; j++) {
			fighter[j].printInfo();
		}
	}

}
