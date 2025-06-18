package June14.Interface;

public class Udemy implements VideoMediaPlayer{

    @Override
    public void play() {
        System.out.println("Play the Songs");
    }

    @Override
    public void pause() {
        System.out.println("Pause the Songs");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Songs");
    }

    @Override
    public void rewind() {
        System.out.println("Rewind the Songs");
    }

    @Override
    public void forward() {
        System.out.println("Forward the Songs");
    }

    @Override
    public void speed() {
        System.out.println("Speed up the Songs");
    }
}
