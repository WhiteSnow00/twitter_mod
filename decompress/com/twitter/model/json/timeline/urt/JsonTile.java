// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTile extends tih<jqs>
{
    @JsonField
    public rca a;
    @JsonField(name = { "tileUrl", "url" })
    public c9t b;
    @JsonField
    public lqs c;
    
    @Override
    public final Object s() {
        final jqs.a a = new jqs.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        return a.j();
    }
}
