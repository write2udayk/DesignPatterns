package facade.desgin.pattern;

/**
 * The {@code MusicLoader} class is responsible for loading music tracks.
 * It provides a method to load a music track by name and simulate the loading
 * process.
 */
public class MusicLoader {

    /**
     * Loads a music track.
     *
     * @param track The name of the music track to load.
     */
    public void loadMusic(final String track) {
        System.out.println(track + " is Loaded");
    }
}
