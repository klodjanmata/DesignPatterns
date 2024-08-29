package DesignPatterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String type, String texture) {
        String key = type + "-" + texture;
        Tree tree = treeMap.get(key);

        if (tree == null) {
            tree = new ConcreteTree(type, texture);
            treeMap.put(key, tree);
            System.out.println("Creating a new tree of type: " + type + " and texture: " + texture);
        }
        return tree;
    }
}
