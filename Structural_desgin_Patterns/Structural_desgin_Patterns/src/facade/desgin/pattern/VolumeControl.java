package facade.desgin.pattern;

/**
 * The VolumeControl class handles the setting of the volume level
 * for the music player.
 */
public class VolumeControl {
    /**
     * Sets the volume to the specified level.
     * @param level the desired volume level (typically a range from 0 to 10).
     */
    public void setVolume(final int level) {
        System.out.println("Set volume to: " + level);
    }
}
