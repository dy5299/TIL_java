package eip;

// process: ���� ����

class User {
	String player;
	int max_hp;
	int hp;
	
	void status() {
		if(0 < hp) {
			System.out.printf("�÷��̾� �̸�: %s \n", player);
			System.out.printf("%s�� ü��: %d/%d \n\n", player, hp, max_hp);
		}
	}
}


class Monster {
	
	String boss;
	int dmg;
	int poison_dmg;
	
	
	User user = new User();
	
	void attack(User user, int dmg) {
		System.out.printf("%s�� %s�� �����մϴ�. \n",  boss, user.player);
		user.hp = user.hp - dmg;
		user.status();
	}
	
	void poison_attack(User user, int poison_dmg) {
		System.out.printf("%s�� %s���� �ߵ����ظ� �ݴϴ�. \n",  boss, user.player);
		user.hp = user.hp - poison_dmg;
		user.status();
	}
	
	void status() {
		System.out.println("���� �̸�: " + boss);
		System.out.println("���� �⺻ ������: " + dmg);
		System.out.println("���� �ߵ� ������: " + poison_dmg);
	}
	
}



public class processs {
	
	public static void main(String[] args) {
		
		User user = new User();
		user.player = "meme";
		user.max_hp = 100;
		user.hp = 100;
		
		Monster monster = new Monster();
		monster.boss = "BBBOSSS";
		monster.dmg = 30;
		monster.poison_dmg = 1;
		
//		user.status();
//		monster.status();
		
		if(user.hp <= 100) {
			for(int i = 0; i < user.hp; i++) {
				monster.attack(user,  monster.dmg);
				monster.poison_attack(user, monster.poison_dmg);
				if(user.hp < 0) {
					System.out.printf("%s�� �׾����ϴ�.\n GAME OVER", user.player);
				}
			}
		}
		
	}
}
