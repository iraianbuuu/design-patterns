public class Main {
    public static void main(String... args) {
        Video youtubeVideo = new YoutubeVideo(new HDProcessor());
        Video netflixVideo = new NetflixVideo(new UHDProcessor());

        youtubeVideo.play("The Blinding Lights");
        netflixVideo.play("Breaking Bad");
    }
}