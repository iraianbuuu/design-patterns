public class YoutubeVideo extends Video {
    public YoutubeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String video) {
        videoProcessor.process(video);
    }
}
