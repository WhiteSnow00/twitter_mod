// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineTrend extends tih<owv>
{
    @JsonField
    public String a;
    @JsonField(name = { "url" })
    public c9t b;
    @JsonField
    public String c;
    @JsonField
    public List<ksv> d;
    @JsonField
    public jwv e;
    @JsonField
    public JsonTrendMetadata f;
    @JsonField
    public List<String> g;
    @JsonField
    public List<String> h;
    @JsonField
    public List<String> i;
    @JsonField
    public String j;
    @JsonField
    public List<q9c> k;
    
    @Override
    public final Object s() {
        final boolean e = flr.e((CharSequence)this.a);
        final Object o = null;
        final xuy xuy = null;
        Object o2 = o;
        if (!e) {
            final c9t b = this.b;
            if (b == null) {
                o2 = o;
            }
            else {
                final JsonTrendMetadata f = this.f;
                xuy xuy2 = xuy;
                if (f != null) {
                    final c9t a = f.a;
                    final String b2 = f.b;
                    Object o3;
                    if ((o3 = this.i) == null) {
                        o3 = h3a.F0;
                    }
                    xuy2 = new xuy((Object)a, (Object)b2, o3, (Object)f.c);
                }
                o2 = new owv(this.a, b, xuy2, this.c, (List)this.d, this.e, (List)this.g, (List)this.h, this.j, (List)this.k);
            }
        }
        return o2;
    }
}
