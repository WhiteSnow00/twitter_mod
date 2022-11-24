// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCoverImage extends tih<fpv>
{
    @JsonField
    public l0h a;
    @JsonField(typeConverter = fqv.class)
    public int b;
    @JsonField(typeConverter = eqv.class)
    public int c;
    
    @Override
    public final Object s() {
        final fpv.a a = new fpv.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        return a.j();
    }
}
