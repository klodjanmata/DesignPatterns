package DesignPatterns.behavioral.Momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> editorHistory;

    public History() {
        this.editorHistory = new ArrayList<>();
    }

    public void push(EditorState state){
        editorHistory.add(state);
    }

    public EditorState pop(){
        if (editorHistory.isEmpty()){
            return new EditorState();
        }
        EditorState state = editorHistory.get(editorHistory.size() - 1);
        editorHistory.remove(state);
        return state;
    }
}


// There are 10 types of programers,
// those whu understand binary and those who dont.