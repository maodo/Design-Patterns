package strategyPattern.simpleImplementation;

public class Context {
    private IStrategie strategie;

    public Context(){
        this.strategie = new DefaultStrategyImpl();
    }

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }
    public void process(){
        System.out.println("Étape 1 de l'algo");
        strategie.applyStrategie();
        System.out.println("Étape finale de l'algo");
    }
}
