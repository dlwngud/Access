package indian;
import java.util.*;

public class card {
//카드를 랜덤으로 배열함
	List<Integer> Cards = new  ArrayList<>();
	public card(){
		int num[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
		for (int i = 0;i<num.length;i++){
			Cards.add(num[i]);
		}
	}
	public void shake(){
		Collections.shuffle(Cards);
	}
	public Integer getCards(){
		shake();
		return Cards.remove(0);
	}
}