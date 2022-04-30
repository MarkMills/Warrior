//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Mar 17, 2022
// Homework 10 - Array of Warrior Objects
//////////////////////////////////////////////////////////////////////////////
package warrior;

import java.util.Random;
public class WarriorFred {

	private String nickName = "unknown";
	private int lifeForce = 10;
	private int damage = 0;
	
	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
	
	public void reSpawn() {
		lifeForce = 10;
	}
	
	public void takeDamage(int n) {
		damage += n;
		System.out.println(nickName+" is attacked and takes "+n+" units of damage");
		if (damage >= 10) {
			lifeForce--;
			damage = 0;
		}
	}
	
	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}
	
	public boolean isDead() {
		if (lifeForce <= 0) return true;
		else return false;
	}
	
	public boolean isAlive() {
		if (lifeForce > 0) return true;
		else return false;
	}
	public void printInfo() {
        System.out.println("Nick Name:" + getNickName());
        System.out.println("Life Force:" + getLifeForce());
        System.out.println("Damage:" + getDamage());
        for(int i=0;i<armory.length;i++)
            System.out.println("Armory:" + this.armory[i]);
        System.out.println();
    }
	public String getNickName() {
		return nickName;
	}
	public int getLifeForce() {
		return lifeForce;
	}
	public int getDamage() {
		return damage;
	}
	public void setNickname(String nickName) {
		this.nickName = nickName;
	}
	public void getStatus() {
		System.out.println("Warrior "+ getNickName() +" status (health="+ getLifeForce() +", damage="+ getDamage() +")");
	}
}