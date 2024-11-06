import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Context ctx = new Context();
        Scanner scanner = new Scanner(System.in); // input
        Map<String, Strategy> strategyMap = new HashMap<>(); // mapping inputs with classes
        strategyMap.put("st1",new StrategyImpl1());
        strategyMap.put("st2",new StrategyImpl2());
        strategyMap.put("st3",new StrategyImpl3());
        strategyMap.put("d",new DefaultStrategyImpl());


        while (true) {
            System.out.print("Donner votre stratégie (st1,st2,st3,d): ");
            String st = scanner.nextLine();
            Strategy strategy = strategyMap.get(st.toLowerCase());
            ctx.setStrategy(strategy);
            ctx.perform();

        }
    }
}
