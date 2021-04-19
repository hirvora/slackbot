package com.chewy.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *@author Hirav Oza @created date  04/15/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prefs {
    private String[] channels;
    private String[] groups;

    public String[] getChannels() {
        return channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }
}
