package com.app.borowicz.Rikai;

import java.util.ArrayList;

/**
 * Created by Robert on 9/1/2015.
 */
public class DictionaryWord {

    private String word;
    private String partOfSpeech;
    private ArrayList<String> definitions;
    private String inflection;
    private String contextSentence;

    public DictionaryWord(String w, String pos, String infl) {
        word = w;
        partOfSpeech = pos;
        inflection = infl;
        definitions = new ArrayList<String>();
    }

    public void addDefinition(String def) {
        definitions.add(def);
    }

    public String getWord() {
        return word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getInflection() {
        return inflection;
    }

    public String getContextSentence() {
        return contextSentence;
    }

    public void setContextSentence(String context) {
        contextSentence = context;
    }

    public String toString() {
        return word;
    }

}
