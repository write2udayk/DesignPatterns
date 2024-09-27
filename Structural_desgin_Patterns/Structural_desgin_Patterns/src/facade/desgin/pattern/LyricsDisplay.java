package facade.desgin.pattern;

/**
 * The {@code LyricsDisplay} class is responsible for displaying lyrics of a
 * music track. It provides a method to display the lyrics of the specified
 * track.
 */
public class LyricsDisplay {

    /**
     * Displays the lyrics of the specified music track.
     *
     * @param track The name of the music track whose
     *  lyrics are to be displayed.
     */
    public void displayLyric(final String track) {
        System.out.println("Lyric Displayed: " + track);
    }

}
