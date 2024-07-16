public class iPhone2007 {

    // iTunes (Reprodutor Musical)
    public static class iTunes {
        private String currentSong;
        private boolean isPlaying;
        private int volumeLevel;

        public iTunes() {
            this.currentSong = "";
            this.isPlaying = false;
            this.volumeLevel = 50;
        }

        public void play() {
        }

        public void pause() {
        }

        public void selectSong(String song) {
        }

        public void adjustVolume(int volume) {
        }
    }

    // Telefone
    public static class Telefone {
        private String currentCallStatus;
        private boolean isRinging;
        private boolean isOnHold;

        public Telefone() {
            this.currentCallStatus = "";
            this.isRinging = false;
            this.isOnHold = false;
        }

        public void call(String number) {
        }

        public void answer() {
        }

        public void startVoiceMail() {
        }
    }

    // Navegador de Internet
    public static class NavegadorInternet {
        private String currentURL;
        private int numberOfTabs;

        public NavegadorInternet() {
            this.currentURL = "";
            this.numberOfTabs = 1;
        }

        public void displayPage(String url) {
        }

        public void addNewTab() {
        }

        public void updatePage() {
        }
    }

    // Exemplo de uso das classes
    public static void main(String[] args) {
        // Exemplo de uso do iTunes
        iTunes iTunesPlayer = new iTunes();
        iTunesPlayer.selectSong("Bohemian Rhapsody");
        iTunesPlayer.play();
        iTunesPlayer.adjustVolume(75);
        iTunesPlayer.pause();

        // Exemplo de uso do Telefone
        Telefone phone = new Telefone();
        phone.call("123456789");
        phone.answer();
        phone.startVoiceMail();

        // Exemplo de uso do Navegador de Internet
        NavegadorInternet browser = new NavegadorInternet();
        browser.displayPage("https://www.youtube.com");
        browser.addNewTab();
        browser.displayPage("https://www.youtube.com");
        browser.updatePage();
    }
}
