package com.module.use.internal;

public class SharedSecrets {
    public static SharedSecrets INSTANCE = new SharedSecrets();
    public SecretCharacter secretCharacter;

    /**
     * Prevent construction.
     */
    private SharedSecrets() {}
}
