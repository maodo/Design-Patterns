package strategyPattern.simpleImplementation;

public class App {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategie(new StrategyImpl1());
        context.process();
        System.out.println("---------------------------------");
        context.setStrategie(new StrategyImpl2());
        context.process();
        System.out.println("---------------------------------");
        context.setStrategie(new StrategyImpl3());
        context.process();
        System.out.println("---------------------------------");
        context.setStrategie(new DefaultStrategyImpl());
        context.process();
        System.out.println("---------------------------------");

    }

}
