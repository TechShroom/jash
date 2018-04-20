package com.techshroom.jash;

public class Environment {

    public static final String PROFILE = System.getenv().getOrDefault("JASH_PROFILE", "default");
    public static final String LOADERS = System.getenv().getOrDefault("JASH_LOADERS", "file(${HOME})");
    public static final String CURRENT_SHELL = System.getenv().getOrDefault("JASH_CURRENT_SHELL", "");

    public static final String DEFAULT_SHELL = System.getenv().getOrDefault("SHELL", "sh");

}
