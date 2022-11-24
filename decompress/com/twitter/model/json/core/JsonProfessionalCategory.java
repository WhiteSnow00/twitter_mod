// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonProfessionalCategory extends tih<v4l>
{
    @JsonField
    public String a;
    @JsonField
    public Integer b;
    @JsonField
    public Boolean c;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final v4l t() {
        if (flr.e((CharSequence)this.a)) {
            return null;
        }
        final v4l$a v4l$a = new v4l$a();
        final String a = this.a;
        e0e.f((Object)a, "name");
        v4l$a.a = a;
        v4l$a.b = this.b;
        final Boolean c = this.c;
        v4l$a.c.b((Object)v4l$a, v4l$a.d[0], (Object)(c == null || c));
        return (v4l)((z4j)v4l$a).e();
    }
}
