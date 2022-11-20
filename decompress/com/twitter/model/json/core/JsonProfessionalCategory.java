// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonProfessionalCategory extends fih<g4l>
{
    @JsonField
    public String a;
    @JsonField
    public Integer b;
    @JsonField
    public Boolean c;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final g4l t() {
        if (ikr.e((CharSequence)this.a)) {
            return null;
        }
        final g4l$a g4l$a = new g4l$a();
        final String a = this.a;
        czd.f((Object)a, "name");
        g4l$a.a = a;
        g4l$a.b = this.b;
        final Boolean c = this.c;
        g4l$a.c.b((Object)g4l$a, g4l$a.d[0], (Object)(c == null || c));
        return (g4l)((n4j)g4l$a).e();
    }
}
