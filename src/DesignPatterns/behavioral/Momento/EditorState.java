package DesignPatterns.behavioral.Momento;

public class EditorState {
    private String content;

    public EditorState(){
        this.content = "";
    }

    public EditorState(Editor editor){
        this.content = editor.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
