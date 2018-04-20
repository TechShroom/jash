package com.techshroom.jash.shell;

public class UnknownShell extends Shell {

    public static UnknownShell from(String shellProgram) {
        return new UnknownShell(shellProgram);
    }

    private final String shellProgram;

    UnknownShell(String shellProgram) {
        this.shellProgram = shellProgram;
    }

    @Override
    public String getShellProgram() {
        return shellProgram;
    }

}
