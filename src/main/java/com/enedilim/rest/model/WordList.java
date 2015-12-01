package com.enedilim.rest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement
@XmlType(name = "wordList")
@XmlAccessorType(XmlAccessType.FIELD)
public class WordList {

    @XmlElementRef
    private List<WordItem> wordItem;

    public List<WordItem> getWordItem() {
        if (wordItem == null) {
            wordItem = new ArrayList();
        }

        return wordItem;
    }

    public void setWordItem(List<WordItem> wordItem) {
        this.wordItem = wordItem;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
