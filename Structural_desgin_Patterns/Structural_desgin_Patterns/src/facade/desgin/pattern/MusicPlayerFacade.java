package facade.desgin.pattern;

/**
 * The {@code MusicPlayerFacade} class provides a simplified interface to
 * control various components of the music player system, such as loading music,
 * controlling volume, displaying lyrics, and managing music playback.
 * <p>
 * This class acts as a facade to hide the complexity of the underlying
 * subsystems (MusicLoader, MusicPlayer, VolumeControl, LyricsDisplay) and
 * provide an easy-to-use interface for clients.
 */

public class MusicPlayerFacade {
    /**
     * The {@code MusicLoader} component responsible for loading music tracks.
     */
    private MusicLoader loader;

    /**
     * The {@code MusicPlayer} component that controls the playback of music.
     */
    private MusicPlayer player;

    /**
     * The {@code VolumeControl} component that manages the volume settings.
     */
    private VolumeControl volume;

    /**
     * The {@code LyricsDisplay} component responsible for showing song lyrics.
     */
    private LyricsDisplay lyrics;

    /**
     * Constructs a new {@code MusicPlayerFacade} and initializes the subsystems
     * (MusicLoader, MusicPlayer, VolumeControl, and LyricsDisplay).
     */
    public MusicPlayerFacade() {
        super();
        this.loader = new MusicLoader();
        this.player = new MusicPlayer();
        this.volume = new VolumeControl();
        this.lyrics = new LyricsDisplay();
    }

    /**
     * Plays the specified music track at the given volume level.
     *This method loads
     * the track, plays the music, sets the volume, and displays the lyrics.
     * @param track The name of the music track to be played.
     * @param level The volume level to be set (e.g., 1-10).
     */
    public void playTrack(final String track, final int level) {
        loader.loadMusic(track);
        player.playMusic();
        volume.setVolume(level);
        lyrics.displayLyric(track);
    }

    /**
     * Stops the currently playing music track. This method stops the music
     * playback.
     */
    public void stopTrack() {
        player.stopMusic();
    }

    /**
     * Pauses the currently playing music track. This method pauses the music
     * playback.
     */
    public void pausetrack() {
        player.pauseMusic();
    }
}
