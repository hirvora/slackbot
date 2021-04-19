package com.chewy.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Hirav Oza @created date  04/15/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bot {
    private String id;
    private String name;
    private Icon icons;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Icon getIcons() {
        return icons;
    }

    public void setIcons(Icon icons) {
        this.icons = icons;
    }
}
