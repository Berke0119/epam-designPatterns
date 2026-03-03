package com.epam.structuraldesignpatterns.proxy.createobjectsondemand;

public interface Video {

    void play();

}

class HighResVideo implements Video {
    private String fileName;

    public HighResVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading: " + fileName + " (1GB data reading...)");
    }

    @Override
    public void play() {
        System.out.println("Playing: " + fileName);
    }
}

// Proxy
class VideoProxy implements Video {
    private HighResVideo realVideo;
    private String fileName;

    public VideoProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        if (realVideo == null) {
            realVideo = new HighResVideo(fileName);
        }
        realVideo.play();
    }

}
