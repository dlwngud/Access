package indian;
//�÷��̾��� ���� ���ų� ��´�.
import java.util.*;
public class player {
	public player(String name){
		this.name = name;
	}
	card card = new card();
	List <Integer> playerList = new ArrayList<>();
	;
	/*Random r = new Random();
	/public int randomAi(){
	/	return r.nextInt(10)+1;
	}*/
	//�ΰ����� Ȯ�� ����(1���� 10)
	public void cardGet(card card){
		playerList.add(card.getCards());
	}
	private int chip;
	private String name;
	public void rechip(int chip){
		this.chip = chip;
	}
	public void batting(int bat){
		chip = chip - bat;
	}
	public void earning(int earn){
		chip = chip+earn;
	}
	public int getChip(){
		return chip;
	}
	public String getName(){
		return name;
	}
	public int cardGet(){
		return playerList.get(0);
	}
	public Object playerCardShow(){
		cardGet(card);
		cardGet();
		return playerList.remove(0);
	}
	
}
