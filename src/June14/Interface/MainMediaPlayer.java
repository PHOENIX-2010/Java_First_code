package June14.Interface;

import java.util.Scanner;

public class MainMediaPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("MediaPlayer options");
        System.out.println("===================");
        System.out.println("1.Spotify");
        System.out.println("2.Youtube Music");
        System.out.println("3.Youtube");
        System.out.println("4.Netflix");
        System.out.println("5.MXPlayer");
        System.out.println("6.VLC Player");
        System.out.println("7.Udemy");
        System.out.println("===================");

        System.out.println("Select the option of Media Player: ");
        int opt = scanner.nextInt();

        switch (opt){
            case 1:
                Spotify spotify = new Spotify();
                spotify.play();
                spotify.pause();
                spotify.stop();
                spotify.rewind();
                spotify.forward();
                spotify.speed();
                break;
            case 2:
                YoutubeMusic ym = new YoutubeMusic();
                ym.play();
                ym.pause();
                ym.stop();
                ym.rewind();
                ym.forward();
                ym.speed();
                break;
            case 3:
                YouTube youtube = new YouTube();
                youtube.play();
                youtube.pause();
                youtube.stop();
                youtube.rewind();
                youtube.forward();
                youtube.speed();
                break;
            case 4:
                Netflix netflix = new Netflix();
                netflix.play();
                netflix.pause();
                netflix.stop();
                netflix.rewind();
                netflix.forward();
                netflix.speed();
                break;
            case 5:
                MXPlayer mxp = new MXPlayer();
                mxp.play();
                mxp.pause();
                mxp.stop();
                mxp.rewind();
                mxp.forward();
                mxp.speed();
                break;
            case 6:
                VLCPlayer vlcp = new VLCPlayer();
                vlcp.play();
                vlcp.pause();
                vlcp.stop();
                vlcp.rewind();
                vlcp.forward();
                vlcp.speed();
                break;
            case 7:
                Udemy udemy = new Udemy();
                udemy.play();
                udemy.pause();
                udemy.stop();
                udemy.rewind();
                udemy.forward();
                udemy.speed();
                break;

            default:
                System.out.println("Thank you! Bye:)");
        }
    }
}
