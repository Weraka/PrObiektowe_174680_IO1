import java.util.*;

public class Main
{
    interface SoundPlayer
    {
        abstract void playSound();
        default void stopSound()
        {
            System.out.println("Sound Stopped");
        };
        static String getDeviceType()
        {
            return "Sound Device";
        };

    }
    public static class MusicPlayer implements SoundPlayer
    {

        @Override
        public void playSound() {
            System.out.println("Playing Music");
        }
    }
    public static class Radio implements SoundPlayer
    {
        @Override
        public void playSound()
        {
            System.out.println("Playing Radio");
        }
    }

    public static void main(String[] args)
    {
        MusicPlayer mp1 = new MusicPlayer();
        mp1.playSound();
        mp1.stopSound();
        SoundPlayer.getDeviceType();

    }
}
/*import java.util.*;

public class Main
{
    interface SoundPlayer
    {
        abstract void playSound();
        default void stopSound()
        {
            System.out.println("Sound Stopped");
        };
        static String getDeviceType()
        {
            return "Generic Sound Device";
        };
    }

    public static class MusicPlayer implements SoundPlayer
    {
        @Override
        public void playSound() {
            System.out.println("Playing Music");
        }

        public void shufflePlaylist() {
            System.out.println("Shuffling playlist...");
        }
    }

    public static class Radio implements SoundPlayer
    {
        @Override
        public void playSound()
        {
            System.out.println("Playing Radio");
        }

        public void tuneFrequency(double frequency) {
            System.out.println("Tuning to frequency: " + frequency + " MHz");
        }
    }

    public static void main(String[] args)
    {
        // Przykład użycia MusicPlayer
        MusicPlayer mp1 = new MusicPlayer();
        mp1.playSound();
        mp1.stopSound();
        mp1.shufflePlaylist();

        // Przykład użycia Radio
        Radio radio1 = new Radio();
        radio1.playSound();
        radio1.stopSound();
        radio1.tuneFrequency(101.2);

        // Wywołanie metody statycznej
        System.out.println(SoundPlayer.getDeviceType());

        // Obsługa listy urządzeń
        List<SoundPlayer> devices = new ArrayList<>();
        devices.add(mp1);
        devices.add(radio1);

        System.out.println("\nIteracja przez urządzenia:");
        for (SoundPlayer device : devices) {
            device.playSound();
            device.stopSound();
        }
    }
}
*/