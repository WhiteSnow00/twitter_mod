// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineNews extends tih<c1t>
{
    @JsonField(typeConverter = zfi.class)
    public int a;
    @JsonField
    public c9t b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField(typeConverter = d.class)
    public o5t f;
    @JsonField
    public String g;
    @JsonField
    public hpj h;
    
    @Override
    public final Object s() {
        final c1t.a a = new c1t.a();
        a.a = this.a;
        a.b = this.c;
        a.f = this.d;
        a.c = this.b;
        a.d = this.e;
        a.e = ix.w(this.f);
        a.g = this.g;
        a.h = this.h;
        return a.j();
    }
}
