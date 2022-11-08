// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCoverImage extends aih<vnv>
{
    @JsonField
    public szg a;
    @JsonField(typeConverter = wov.class)
    public int b;
    @JsonField(typeConverter = vov.class)
    public int c;
    
    @Override
    public final Object s() {
        final vnv$a vnv$a = new vnv$a();
        vnv$a.a = this.a;
        vnv$a.b = this.b;
        vnv$a.c = this.c;
        return ((h4j)vnv$a).j();
    }
}
