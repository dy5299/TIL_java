package eip;

// process: 순차 진행

class User {
	String player;
	int max_hp;
	int hp;
	
	void status() {
		if(0 < hp) {
			System.out.printf("플레이어 이름: %s \n", player);
			System.out.printf("%s의 체력: %d/%d \n\n", player, hp, max_hp);
		}
	}
}


class Monster {
	
	String boss;
	int dmg;
	int poison_dmg;
	
	
	User user = new User();
	
	void attack(User user, int dmg) {
		System.out.printf("%s가 %s를 공격합니다. \n",  boss, user.player);
		user.hp = user.hp - dmg;
		user.status();
	}
	
	void poison_attack(User user, int poison_dmg) {
		System.out.printf("%s가 %s에게 중독피해를 줍니다. \n",  boss, user.player);
		user.hp = user.hp - poison_dmg;
		user.status();
	}
	
	void status() {
		System.out.println("몬스터 이름: " + boss);
		System.out.println("몬스터 기본 데미지: " + dmg);
		System.out.println("몬스터 중독 데미지: " + poison_dmg);
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
					System.out.printf("%s이 죽었습니다.\n GAME OVER", user.player);
				}
			}
		}
		
	}
}
