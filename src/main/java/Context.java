public class Context {

    private Strategy strategy = new DefaultStrategyImpl();

    public  void perform(){
        System.out.println("#### début de l'opération #####");
        System.out.println("===== Initialisation =====");

        strategy.apply();

        System.out.println("++++ Noyau de l'opération Version par default +++++");
        System.out.println("***** Nettoyage *******");

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
