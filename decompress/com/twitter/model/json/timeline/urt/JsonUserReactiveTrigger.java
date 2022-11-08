// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserReactiveTrigger extends aih<ozl.c>
{
    @JsonField
    public j1t a;
    
    @Override
    public final Object s() {
        final j1t a = this.a;
        ozl ozl;
        if (a != null) {
            ozl = new ozl.c(a);
        }
        else {
            ozl = null;
        }
        return ozl;
    }
}
