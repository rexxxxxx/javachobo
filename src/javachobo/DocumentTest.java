package javachobo;

public class DocumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document d1 = new Document();
		Document d2 = new Document("Java.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		Document d5 = new Document(d1);
		Document d6 = new Document(d5);
	}

}
class Document{
	static int count = 0;
	String name;
	
	Document(){
		this("NONAME"+ ++count);
	}
	Document(Document doc){
		name = doc.name;
		System.out.println("Doc " +this.name + " is maden");
	}
	Document(String name){
		this.name = name;
		System.out.println("Doc " +this.name + " is maden");
	}
}