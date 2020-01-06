package com.scaffold.action;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarativeJobPropertyTrackerAction {

    @XmlAttribute(name = "plugin")
    private String plugin="pipeline-model-definition@1.5.0";

    private String jobProperties="";

    @XmlElement(name = "triggers")
    private Triggers triggers;

    private String parameters="";

    private String options="";
}
