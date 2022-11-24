// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineMoment extends tih<x0t>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(typeConverter = qph.class)
    public int c;
    @JsonField(typeConverter = d.class)
    public o5t d;
    
    public JsonTimelineMoment() {
        this.c = 1;
    }
    
    @Override
    public final Object s() {
        final x0t.a a = new x0t.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = ix.w(this.d);
        return a.j();
    }
}
