public abstract class Video {
    // Composition - implementor
    protected VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }
    
    public abstract void play(String video);
}
