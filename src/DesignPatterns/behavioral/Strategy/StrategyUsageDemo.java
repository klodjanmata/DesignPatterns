package DesignPatterns.behavioral.Strategy;

public class StrategyUsageDemo {
    public static void main(String[] args) {
        final StrategyType strategyType = StrategyType.valueOf(args[0]);
        final String input = "hello from SDA knowledge base!";

        final SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

        SpacesModificationStrategy strategy = provider.get(strategyType);
        final String output = strategy.modify(input);
        System.out.println("Result is " + output);
    }
}
