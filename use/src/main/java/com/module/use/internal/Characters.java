package com.module.use.internal;

public enum Characters {
    HARRY_POTTER
            {
                @Override
                String getPhrase()
                {
                    return "Your bird, there was nothing I could do. He just caught fire.";
                }
            },
    RON_WEASLEY
            {
                @Override
                String getPhrase()
                {
                    return "Who are you and what have you done with Hermione Granger?";
                }
            },
    HERMIONE_GRANGER
            {
                @Override
                String getPhrase()
                {
                    return "I'm not an owl!";
                }
            };

    static
    {
        SharedSecrets.INSTANCE.secretCharacter = new SecretCharacter()
        {
            @Override
            public String getPhrase(Characters characters)
            {
                return characters.getPhrase();
            }
        };
    }

    /**
     * @return the character's introductory phrase
     */
    abstract String getPhrase();
}
