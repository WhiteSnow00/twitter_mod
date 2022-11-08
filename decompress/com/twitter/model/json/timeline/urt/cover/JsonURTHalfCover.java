// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTHalfCover extends aih<oov>
{
    @JsonField(name = { "displayType", "halfCoverDisplayType" }, typeConverter = unv.class)
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
    public List<lnv> f;
    @JsonField
    public eov g;
    @JsonField
    public vnv h;
    @JsonField
    public boolean i;
    
    public JsonURTHalfCover() {
        this.a = 0;
    }
    
    @Override
    public final Object s() {
        final oov.a a = new oov.a();
        a.c = this.a;
        a.a = this.b;
        a.b = this.c;
        a.d = this.d;
        a.e = this.e;
        a.f = this.f;
        a.g = this.h;
        a.i = this.i;
        a.h = this.g;
        return a.j();
    }
}
