package headfirstjava;
import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got a sequencer");
		} catch (MidiUnavailableException ex) {
			// TODO: handle exception
			System.out.println("Bummer");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}
