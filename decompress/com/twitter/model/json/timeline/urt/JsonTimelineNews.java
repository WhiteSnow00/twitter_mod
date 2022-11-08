// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineNews extends aih<tzs>
{
    @JsonField(typeConverter = ffi.class)
    public int a;
    @JsonField
    public q7t b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField(typeConverter = d.class)
    public d4t f;
    @JsonField
    public String g;
    @JsonField
    public moj h;
    
    @Override
    public final Object s() {
        final tzs.a a = new tzs.a();
        a.a = this.a;
        a.b = this.c;
        a.f = this.d;
        a.c = this.b;
        a.d = this.e;
        a.e = poa.V(this.f);
        a.g = this.g;
        a.h = this.h;
        return a.j();
    }
}
