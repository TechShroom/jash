package com.techshroom.jash.shell;

import static com.google.common.base.Preconditions.checkArgument;

public class ZShell extends Shell {

    public static ZShell from(String shellProgram) {
        checkArgument(Shell.programValidate(shellProgram, "zsh"));
        return new ZShell(shellProgram);
    }

    private final String shellProgram;

    ZShell(String shellProgram) {
        this.shellProgram = shellProgram;
    }

    @Override
    public String getShellProgram() {
        return shellProgram;
    }

}
