public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        //System.out.println("Ligando a TV - " + smartTv.ligada);
        
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(15);
        smartTv.diminuirCanal();
          
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();       

        smartTv.desligar();
        
    }
}
