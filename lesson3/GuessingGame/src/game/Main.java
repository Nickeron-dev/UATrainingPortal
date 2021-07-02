package game;

/*
 * Created by Koshkin Illia on 29.06.2021.
 */
public class Main {
	
	public static void main(String[] args) {
		Controller controller = new Controller(new Model(), new View());
		
		controller.run();
	}
	
}
