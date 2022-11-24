// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTFullCover extends tih<rpv>
{
    @JsonField(name = { "displayType", "fullCoverDisplayType" }, typeConverter = epv.class)
    public int a;
    @JsonField
    public fym b;
    @JsonField
    public cpv c;
    @JsonField
    public fym d;
    @JsonField
    public cpv e;
    @JsonField
    public fym f;
    @JsonField
    public opv g;
    @JsonField
    public l0h h;
    @JsonField
    public List<vov> i;
    @JsonField(typeConverter = fqv.class)
    public int j;
    
    public JsonURTFullCover() {
        this.a = 0;
    }
    
    @Override
    public final Object s() {
        final rpv.a a = new rpv.a();
        a.c = this.a;
        a.a = this.b;
        a.b = this.c;
        a.d = this.d;
        a.e = this.e;
        a.f = this.f;
        a.g = this.g;
        a.h = this.h;
        a.i = this.i;
        a.j = this.j;
        return a.j();
    }
}
