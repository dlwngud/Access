package indian;
//���и� ������.
import java.util.*;
public class game extends card{
	
	public static void main(String[] args){
		card card = new card();
		int round = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("�÷��̾��� �̸� �Է��Ͻÿ�.");
		String player = scan.next();
		player player1 = new player(player);
		player player2 = new player("com1");
		player1.cardGet(card);
		player2.cardGet(card);
		System.out.println("���޹��� ���μ��� �Է��Ͻÿ�(50��õ)");
		//100���� �մϴ�.
		int coin = scan.nextInt();
		player1.rechip(coin);
		player2.rechip(coin);
		//�÷��̾�鿡�� ��������
		while (round <10){
			System.out.printf("%d round start!\n",round);
			if (player1.getChip()<1){
				System.out.println("you lose!\n");
				System.exit(0);
			} else if (player1.getChip()>99){
					System.out.println("you win!\n");
					System.exit(0);
			} else{
				System.out.printf("���� Ĩ�� ��:%d\n",player1.getChip());
				System.out.printf("��� Ĩ�� ��: %d\n", player2.getChip());
				player1.playerCardShow();
				player2.playerCardShow();
				System.out.printf("����� ī��: %d\n",player2.cardGet());
				System.out.println("������ �ݾ� �Է�");
				
				int bat = scan.nextInt();
			
				if (bat ==0){
					System.out.println("���� ����\n");
					System.out.printf("���� ī��: %d\n",player1.cardGet());
					if (player1.cardGet() == 10){
						System.out.println("�г�Ƽ! -10Ĩ\n");
						player1.batting(10);
						//Ĩ�� 10 ��
						player2.earning(10);
					}else{
						System.out.println("�г�Ƽ! -1Ĩ\n");
						player1.batting(1);
						//Ĩ�� 1 ��`
						player2.earning(1);
					}
				}else if(bat>player1.getChip()){
					System.out.println("Ĩ ����!\n");
					round--;
					
				} else if(bat>player2.getChip()){
					System.out.println("��밡 ���� Ĩ���� ���̹��� ����!\n");
					round--;
	
				} else{
					//ī������� ���� ������
					player1.batting(bat);
					player2.batting(bat);
					if (player1.cardGet()>player2.cardGet()){
						System.out.printf("%s ī��:%d!\n",player,player1.cardGet());
						System.out.printf("%s ��!\n",player);
						player1.earning(bat*2);
					} else if (player1.cardGet()<player2.cardGet()){
						System.out.printf("%s ī��:%d!\n",player,player1.cardGet());
						System.out.println("com ��!\n");
						player2.earning(bat*2);
					} else if (player1.cardGet() == player2.cardGet()){
						System.out.printf("%s ī��:%d!\n",player,player1.cardGet());
						System.out.println("���º�!\n");
						player1.earning(bat);
						player2.earning(bat);
					}
				}	
			} round ++;
		}if (player1.getChip()>player2.getChip()){
			System.out.printf("%s �����¸�\n",player);
		}else if (player1.getChip()<player2.getChip()){
			System.out.println("com �����¸�\n");
		}
	}
}
