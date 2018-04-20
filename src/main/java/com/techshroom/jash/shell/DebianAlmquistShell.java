package com.techshroom.jash.shell;

import static com.google.common.base.Preconditions.checkArgument;

public class DebianAlmquistShell extends Shell {

    public static DebianAlmquistShell from(String shellProgram) {
        checkArgument(Shell.programValidate(shellProgram, "dash"));
        return new DebianAlmquistShell(shellProgram);
    }

    private final String shellProgram;

    DebianAlmquistShell(String shellProgram) {
        this.shellProgram = shellProgram;
    }

    @Override
    public String getShellProgram() {
        return shellProgram;
    }

}
