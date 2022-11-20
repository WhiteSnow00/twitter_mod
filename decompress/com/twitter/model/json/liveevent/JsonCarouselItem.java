// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import tv.periscope.model.b$a;
import tv.periscope.model.a$a;
import tv.periscope.model.b;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCarouselItem extends qhh<ll3>
{
    @JsonField(name = { "entry_id" })
    public String a;
    @JsonField
    public boolean b;
    @JsonField
    public hl3 c;
    @JsonField
    public rof d;
    @JsonField
    public lnu e;
    @JsonField
    public deq f;
    @JsonField
    public deq g;
    @JsonField
    public roh h;
    @JsonField
    public dm3 i;
    
    public final n4j t() {
        final String a = this.a;
        jee.k(a);
        final ll3$a ll3$a = new ll3$a(a);
        ll3$a.d = this.g;
        ll3$a.e = this.h;
        ll3$a.f = this.e;
        ll3$a.g = this.f;
        ll3$a.h = this.i;
        ll3$a.i = this.b;
        if (this.c != null) {
            final b$a g = tv.periscope.model.b.g();
            final hl3 c = this.c;
            jee.l((Object)c);
            g.e(c.a);
            final a$a a$a = (a$a)g;
            a$a.n = "";
            a$a.z = "";
            ll3$a.b = a$a.a();
        }
        final rof d = this.d;
        if (d != null) {
            ll3$a.c = (rof)((n4j)new rof$a(d.a)).e();
        }
        return (n4j)ll3$a;
    }
}
