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
public class Def {

    private String d;

    @XmlElementWrapper(name = "examples")
    @XmlElement(name = "ex")
    List<Ex> examples;

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public List<Ex> getExamples() {
        if (examples == null) {
            examples = new ArrayList();
        }
        return examples;
    }

    public void setExamples(List<Ex> examples) {
        this.examples = examples;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
