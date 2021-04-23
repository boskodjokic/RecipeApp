package com.bosko.springrecipeapp.domain;

import lombok.Getter;

@Getter
public enum Difficulty {

    EASY("Easy"),
    MODERATE("Moderate"),
    HARD("Hard");

    public final String value;

    Difficulty(String value) {
        this.value = value;
    }

}
