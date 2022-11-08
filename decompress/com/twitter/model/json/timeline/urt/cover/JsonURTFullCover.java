// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTFullCover extends aih<hov>
{
    @JsonField(name = { "displayType", "fullCoverDisplayType" }, typeConverter = unv.class)
    public int a;
    @JsonField
    public xwm b;
    @JsonField
    public snv c;
    @JsonField
    public xwm d;
    @JsonField
    public snv e;
    @JsonField
    public xwm f;
    @JsonField
    public eov g;
    @JsonField
    public szg h;
    @JsonField
    public List<lnv> i;
    @JsonField(typeConverter = wov.class)
    public int j;
    
    public JsonURTFullCover() {
        this.a = 0;
    }
    
    @Override
    public final Object s() {
        final hov$a hov$a = new hov$a();
        hov$a.c = this.a;
        hov$a.a = this.b;
        hov$a.b = this.c;
        hov$a.d = this.d;
        hov$a.e = this.e;
        hov$a.f = this.f;
        hov$a.g = this.g;
        hov$a.h = this.h;
        hov$a.i = this.i;
        hov$a.j = this.j;
        return ((h4j)hov$a).j();
    }
}
