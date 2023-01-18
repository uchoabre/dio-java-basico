public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 12;

    public void ligar() {
        ligado = true;
        System.out.println("TV ligada");
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}