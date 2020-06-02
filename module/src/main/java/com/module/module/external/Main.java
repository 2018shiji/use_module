package com.module.module.external;

import com.module.use.internal.Characters;

public class Main {
    public static void main(String[] args)
    {
        Story story = new Story();
        story.introduce(Characters.HARRY_POTTER);
        story.introduce(Characters.RON_WEASLEY);
        story.introduce(Characters.HERMIONE_GRANGER);
    }
}
