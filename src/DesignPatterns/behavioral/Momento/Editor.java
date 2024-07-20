package DesignPatterns.behavioral.Momento;

public class Editor {
    private String content;

    public EditorState createState(){
        EditorState state = new EditorState();
        state.setContent(this.content);
        return state;
    }

    public void restoreState(EditorState state){
        System.out.println("UNDO:");
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
