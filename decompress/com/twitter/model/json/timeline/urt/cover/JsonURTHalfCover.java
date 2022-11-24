// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTHalfCover extends tih<ypv>
{
    @JsonField(name = { "displayType", "halfCoverDisplayType" }, typeConverter = epv.class)
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
    public List<vov> f;
    @JsonField
    public opv g;
    @JsonField
    public fpv h;
    @JsonField
    public boolean i;
    
    public JsonURTHalfCover() {
        this.a = 0;
    }
    
    @Override
    public final Object s() {
        final ypv$a ypv$a = new ypv$a();
        ypv$a.c = this.a;
        ypv$a.a = this.b;
        ypv$a.b = this.c;
        ypv$a.d = this.d;
        ypv$a.e = this.e;
        ypv$a.f = this.f;
        ypv$a.g = this.h;
        ypv$a.i = this.i;
        ypv$a.h = this.g;
        return ((z4j)ypv$a).j();
    }
}
