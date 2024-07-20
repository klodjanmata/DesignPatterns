package DesignPatterns.behavioral.Momento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(new EditorState(editor));
        System.out.println("1: " + editor.getContent());

        editor.setContent("b");
        history.push(new EditorState(editor));
        System.out.println("2: " +editor.getContent());

        editor.setContent("c");
        history.push(new EditorState(editor));
        System.out.println("3: " +editor.getContent());

        editor.setContent("da");
        System.out.println(editor.getContent());



        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
    }
}
