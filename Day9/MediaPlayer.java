class Media {
    void play() {
        System.out.println("Playing Media");
    }
}

class Audio extends Media {
    @Override
    void play() {
    
        System.out.println("Playing Audio");
    }
}

class Video extends Media {
    @Override
    void play() {
        System.out.println("Playing Video");
    }
}

public class MediaPlayer {
    public static void main(String[] args) {

        Media m;

        m = new Audio();
        m.play();

        m = new Video();
        m.play();
    }
}