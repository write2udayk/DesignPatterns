package facadeDesginPattern;

public class MusicPlayerFacade {
	private MusicLoader loader;
	private MusicPlayer player;
	private VolumeControl volume;
	private LyricsDisplay lyrics;

	public MusicPlayerFacade() {
		super();
		this.loader = new MusicLoader();
		this.player = new MusicPlayer();
		this.volume = new VolumeControl();
		this.lyrics = new LyricsDisplay();
	}

	public void playTrack(String track, int level) {
		
		loader.loadMusic(track);
		player.playMusic();
		volume.setVolume(level);
		lyrics.displayLyric(track);

	}

	public void stopTrack() {
		
		player.stopMusic();

	}

	public void pausetrack() {
		
		player.pauseMusic();
	}

}
