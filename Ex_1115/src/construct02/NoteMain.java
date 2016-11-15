package construct02;

public class NoteMain {

	public static void main(String[] args) {
		
		Note no = new Note();
		Note note = new Note(20, 1000, "white");
		Note primium = new Note(30, 2000, "gold");
		
		note.toString();
		primium.toString();

	}

}
