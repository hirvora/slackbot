package com.chewy.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Hirav Oza @created date  04/15/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Edited {
    private String user;
    private String ts;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
