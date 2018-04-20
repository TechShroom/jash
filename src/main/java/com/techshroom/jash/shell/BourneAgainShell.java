package com.techshroom.jash.shell;

import static com.google.common.base.Preconditions.checkArgument;

public class BourneAgainShell extends Shell {

    public static BourneAgainShell from(String shellProgram) {
        checkArgument(Shell.programValidate(shellProgram, "bash"));
        return new BourneAgainShell(shellProgram);
    }

    private final String shellProgram;

    BourneAgainShell(String shellProgram) {
        this.shellProgram = shellProgram;
    }

    @Override
    public String getShellProgram() {
        return shellProgram;
    }

}
