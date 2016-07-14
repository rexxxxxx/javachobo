package javachobo;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck();
		Carda c = d.pick(0);
		System.out.println(c);

		for(int i=0;i<10;i++){
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		}
	}

}

class Deck {
	final int CARD_NUM = 52;
	Carda cardArr[] = new Carda[CARD_NUM];

	Deck() {
		int i = 0;
		for (int k = Carda.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Carda.NUM_MAX; n++)
				cardArr[i++] = new Carda(k, n + 1);
	}

	Carda pick(int index) {
		return cardArr[index];
	}

	Carda pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Carda tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}

class Carda {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Carda() {
		this(SPADE, 1);
	}

	Carda(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}