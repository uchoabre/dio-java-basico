public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligado);

        smartTv.ligar();

        System.out.println("Qual canal: " + smartTv.canal);

        smartTv.subirCanal();

        System.out.println("Qual canal: " + smartTv.canal);

        smartTv.mudarCanal(32);

        System.out.println("Qual canal: " + smartTv.canal);

        System.out.println("Qual volume: " + smartTv.volume);

        smartTv.aumentarVolume();
    }
}
