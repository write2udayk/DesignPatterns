package facade.desgin.pattern;

/**
 * The Execution class demonstrates the use of the MusicPlayerFacade to play,
 * pause, and stop a track. It also eliminates the magic number by defining
 * the volume level as a constant.
 */
public final class Execution {

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private Execution() {
        throw new UnsupportedOperationException("Utility class");
    }
    /**
     * Constant representing the default volume level for playing music.
     */
    public static final int VOLUME_LEVEL = 7;

    /**
     * Main method to execute the MusicPlayerFacade functionalities.
     *
     * @param args command-line arguments (not used in this example).
     */
    public static void main(final String[] args) {
        MusicPlayerFacade musicPlayer = new MusicPlayerFacade();
        String track = "justin byber";  // Track to be played
        int volume = VOLUME_LEVEL;      // Set volume level

        musicPlayer.playTrack(track, volume);
        musicPlayer.pausetrack();
        musicPlayer.stopTrack();
    }
}
