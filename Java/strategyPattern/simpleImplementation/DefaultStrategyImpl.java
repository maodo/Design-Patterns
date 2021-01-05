package strategyPattern.simpleImplementation;

public class DefaultStrategyImpl implements IStrategie{
    @Override
    public void applyStrategie() {
        System.out.println("Étape intermédiaire de l'algo avec la stratégie par défaut");
    }
}
