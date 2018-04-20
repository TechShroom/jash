# Bootstrapping script for jash.
# Calls jash, and evaluates the output in the context of the shell.
# Intended to be sourced.

export JASH_CURRENT_SHELL="$0"
eval "$(jash)"
