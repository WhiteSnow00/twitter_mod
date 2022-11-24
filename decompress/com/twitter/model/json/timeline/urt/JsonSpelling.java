// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSpelling extends tih<q2r>
{
    @JsonField(name = { "spellingResult" })
    public r2r a;
    @JsonField(name = { "spellingAction" })
    public aje b;
    @JsonField(name = { "originalQuery" })
    public String c;
    
    @Override
    public final Object s() {
        final r2r a = this.a;
        q2r q2r;
        if (a != null) {
            q2r = new q2r(a, this.b.a, this.c);
        }
        else {
            q2r = null;
        }
        return q2r;
    }
}
