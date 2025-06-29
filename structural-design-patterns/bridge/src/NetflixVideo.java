public class NetflixVideo extends Video {
    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String video) {
        videoProcessor.process(video);
    }
}
