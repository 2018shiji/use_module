package com.module.module.external;

import com.module.use.internal.Characters;
import com.module.use.internal.SharedSecrets;

public final class Story {
    public void introduce(Characters characters)
    {
        System.out.println(characters.name() + " enters the room and says: " + SharedSecrets.INSTANCE.secretCharacter.getPhrase(characters));
    }
}
