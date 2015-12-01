package com.enedilim.rest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WordItem {

    @XmlElementWrapper(name = "defs")
    @XmlElement(name = "def")
    private List<Def> defs;

    @XmlElementWrapper(name = "phrases")
    @XmlElement(name = "phraseItem")
    private List<PhraseItem> phrases;

    private Word word;
    private Notes notes;
    private String pronun;

    public List<Def> getDefs() {
        if (defs == null) {
            defs = new ArrayList();
        }
        return defs;
    }

    public void setDefs(List<Def> defs) {
        this.defs = defs;
    }

    public List<PhraseItem> getPhrases() {
        if (phrases == null) {
            phrases = new ArrayList();
        }

        return phrases;
    }

    public void setPhrases(List<PhraseItem> phrases) {
        this.phrases = phrases;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getPronun() {
        return pronun;
    }

    public void setPronun(String pronun) {
        this.pronun = pronun;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
