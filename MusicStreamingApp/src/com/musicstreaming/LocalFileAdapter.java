package com.musicstreaming;

public class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play() {
        localFilePlayer.startPlaying();
    }

    @Override
    public void stop() {
        localFilePlayer.stopPlaying();
    }

    @Override
    public void pause() {
        localFilePlayer.pausePlaying();
    }

    @Override
    public void setVolume(int level) {
        localFilePlayer.setVolume(level);
    }
}
