package com.techshroom.jash.shell;

import java.nio.file.Paths;

import com.techshroom.jash.Environment;

public abstract class Shell {

    private static final Shell CURRENT_SHELL = getByPath(Environment.CURRENT_SHELL);
    private static final Shell DEFAULT_SHELL = getByPath(Environment.DEFAULT_SHELL);

    public static Shell getCurrentShell() {
        return CURRENT_SHELL;
    }

    public static Shell getDefaultShell() {
        return DEFAULT_SHELL;
    }

    public static Shell getByPath(String shell) {
        switch (getLastPathItem(shell)) {
            case "dash":
                return new DebianAlmquistShell(shell);
            case "bash":
                return new BourneAgainShell(shell);
            case "zsh":
                return new ZShell(shell);
            default:
                return new UnknownShell(shell);
        }
    }

    static boolean programValidate(String shellProgram, String string) {
        return getLastPathItem(shellProgram).equals(string);
    }

    private static String getLastPathItem(String path) {
        return Paths.get(path).getFileName().toString();
    }

    public abstract String getShellProgram();

}
