package DesignPatterns.structural.Flyweight;

import java.util.Random;

public class FlyweightPatternDemo {
    private static final String[] TREE_TYPES = {"Oak", "Pine", "Birch"};
    private static final String[] TREE_TEXTURES = {"Smooth", "Rough", "Grainy"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Tree tree = TreeFactory.getTree(getRandomType(), getRandomTexture());
            tree.display(getRandomX(), getRandomY());
        }
    }

    private static String getRandomType() {
        return TREE_TYPES[new Random().nextInt(TREE_TYPES.length)];
    }

    private static String getRandomTexture() {
        return TREE_TEXTURES[new Random().nextInt(TREE_TEXTURES.length)];
    }

    private static int getRandomX() {
        return new Random().nextInt(100);
    }

    private static int getRandomY() {
        return new Random().nextInt(100);
    }
}
