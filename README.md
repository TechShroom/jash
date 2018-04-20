jash
=====
Simple overlay over `bash`, `zsh`, or any other shell.

Runs at start-up and applies changes to the shell environment based on profiles.
Profile can be automatically selected, set by environment variable, or prompted.

## Configuration

### Environment variables
#### `JASH_PROFILE`
The profile to use for this session.

Special values:
  - `default`: Use the profile specified in the **config file**.
  - `prompt`: Prompt for a profile to use.

Defaults to `default`.
If this variable is empty, it uses the `default` profile, which may be configured in `$XDG_CONFIG_DIR/jash/config.ini` (`$XDG_CONFIG_DIR` defaults to `$HOME/.config`).
`JASH_PROFILE` may be set to 

It then attempts to _load_ the profile using the loaders in `JASH_LOADERS`, following the order they are specified in the variable.
`JASH_LOADERS` defaults to `file(${HOME})`.
