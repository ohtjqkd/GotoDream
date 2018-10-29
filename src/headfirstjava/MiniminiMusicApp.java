package headfirstjava;

import javax.sound.midi.*;

public class MiniminiMusicApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniminiMusicApp mini = new MiniminiMusicApp();
		mini.play();
	}
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,20,100);
			MidiEvent noteOn= new MidiEvent(a,1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,44,100);
			MidiEvent noteOff= new MidiEvent(b,3);
			track.add(noteOff);
			

			
			player.start();
			
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}

}
