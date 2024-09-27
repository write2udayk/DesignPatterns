package facadeDesginPattern;

public class Execution {

	public static void main(String[] args) {
			MusicPlayerFacade musicPlayer = new MusicPlayerFacade();
	
			String track = "justin byber";
			int volume = 7;
	
			musicPlayer.playTrack(track, volume);
			musicPlayer.pausetrack();
			musicPlayer.stopTrack();
	
		}

	

}
