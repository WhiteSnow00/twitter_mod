// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetReactiveTrigger extends aih<ozl.b>
{
    @JsonField(typeConverter = jke.class)
    public ozl$b$a a;
    @JsonField
    public j1t b;
    
    @Override
    public final Object s() {
        final j1t b = this.b;
        ozl ozl;
        if (b != null) {
            ozl = new ozl.b(this.a, b);
        }
        else {
            ozl = null;
        }
        return ozl;
    }
}
