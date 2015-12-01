package com.enedilim.rest.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Notes {

    private String rule;
    private String ruleExample;

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRuleExample() {
        return ruleExample;
    }

    public void setRuleExample(String ruleExample) {
        this.ruleExample = ruleExample;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
