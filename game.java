package indian;
//승패를 가린다.
import java.util.*;
public class game extends card{
	
	public static void main(String[] args){
		card card = new card();
		int round = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("플레이어의 이름 입력하시오.");
		String player = scan.next();
		player player1 = new player(player);
		player player2 = new player("com1");
		player1.cardGet(card);
		player2.cardGet(card);
		System.out.println("지급받을 코인수를 입력하시오(50추천)");
		//100개로 합니다.
		int coin = scan.nextInt();
		player1.rechip(coin);
		player2.rechip(coin);
		//플레이어들에게 코인지급
		while (round <10){
			System.out.printf("%d round start!\n",round);
			if (player1.getChip()<1){
				System.out.println("you lose!\n");
				System.exit(0);
			} else if (player1.getChip()>99){
					System.out.println("you win!\n");
					System.exit(0);
			} else{
				System.out.printf("현재 칩의 수:%d\n",player1.getChip());
				System.out.printf("상대 칩의 수: %d\n", player2.getChip());
				player1.playerCardShow();
				player2.playerCardShow();
				System.out.printf("상대의 카드: %d\n",player2.cardGet());
				System.out.println("배팅할 금액 입력");
				
				int bat = scan.nextInt();
			
				if (bat ==0){
					System.out.println("배팅 포기\n");
					System.out.printf("나의 카드: %d\n",player1.cardGet());
					if (player1.cardGet() == 10){
						System.out.println("패널티! -10칩\n");
						player1.batting(10);
						//칩을 10 뺌
						player2.earning(10);
					}else{
						System.out.println("패널티! -1칩\n");
						player1.batting(1);
						//칩을 1 뺌`
						player2.earning(1);
					}
				}else if(bat>player1.getChip()){
					System.out.println("칩 부족!\n");
					round--;
					
				} else if(bat>player2.getChip()){
					System.out.println("상대가 가진 칩보다 많이배팅 금지!\n");
					round--;
	
				} else{
					//카드게임의 승자 가르기
					player1.batting(bat);
					player2.batting(bat);
					if (player1.cardGet()>player2.cardGet()){
						System.out.printf("%s 카드:%d!\n",player,player1.cardGet());
						System.out.printf("%s 승!\n",player);
						player1.earning(bat*2);
					} else if (player1.cardGet()<player2.cardGet()){
						System.out.printf("%s 카드:%d!\n",player,player1.cardGet());
						System.out.println("com 승!\n");
						player2.earning(bat*2);
					} else if (player1.cardGet() == player2.cardGet()){
						System.out.printf("%s 카드:%d!\n",player,player1.cardGet());
						System.out.println("무승부!\n");
						player1.earning(bat);
						player2.earning(bat);
					}
				}	
			} round ++;
		}if (player1.getChip()>player2.getChip()){
			System.out.printf("%s 최종승리\n",player);
		}else if (player1.getChip()<player2.getChip()){
			System.out.println("com 최종승리\n");
		}
	}
}
