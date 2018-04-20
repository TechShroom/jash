package com.techshroom.jash.profile;

import java.util.Optional;

public interface JashProfileLoader {

    /**
     * Load the profile know by {@code name} (to this loader), if possible. If
     * the profile doesn't exist, simply return nothing. If there's an error
     * loading it, throw the error.
     * 
     * @return the profile
     */
    Optional<JashProfile> loadProfile(String name);

}
