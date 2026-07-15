interface MusicPlayer {
    void play();
}

class Spotify implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing Spotify Music");
    }
}

class JioSaavn implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing JioSaavn Music");
    }
}

class Phone {

    MusicPlayer player;

    Phone(MusicPlayer player) {
        this.player = player;
    }

    void start() {
        player.play();
    }
}

public class Songs {
    public static void main(String[] args) {

        Phone p = new Phone(new Spotify());
        p.start();
    }
}