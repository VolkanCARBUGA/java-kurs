package Abstractclasses;

public class AbstractClassesMain {
    public static void main(String[] args) {
    //    GameCalculator gameCalculator=new KidsGameCalculator();
    //    gameCalculator.hesapla();
    GameCalculator[] gameCalculators=new GameCalculator[]{new KidsGameCalculator(),new ManGameCalculator(),new WomangameCalculator(),new OlderGameCalculator()};
    for(GameCalculator gameCalculator:gameCalculators){
        gameCalculator.hesapla();
       
    }

    }
    
}
