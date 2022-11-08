// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineTrend extends aih<ivv>
{
    @JsonField
    public String a;
    @JsonField(name = { "url" })
    public q7t b;
    @JsonField
    public String c;
    @JsonField
    public List<erv> d;
    @JsonField
    public dvv e;
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
    public List<o9c> k;
    
    @Override
    public final Object s() {
        final boolean e = pjr.e((CharSequence)this.a);
        final Object o = null;
        final wzt wzt = null;
        Object o2 = o;
        if (!e) {
            final q7t b = this.b;
            if (b == null) {
                o2 = o;
            }
            else {
                final JsonTrendMetadata f = this.f;
                wzt wzt2 = wzt;
                if (f != null) {
                    final q7t a = f.a;
                    final String b2 = f.b;
                    Object o3;
                    if ((o3 = this.i) == null) {
                        o3 = v2a.C0;
                    }
                    wzt2 = new wzt((Object)a, (Object)b2, o3, (Object)f.c);
                }
                o2 = new ivv(this.a, b, wzt2, this.c, (List)this.d, this.e, (List)this.g, (List)this.h, this.j, (List)this.k);
            }
        }
        return o2;
    }
}
