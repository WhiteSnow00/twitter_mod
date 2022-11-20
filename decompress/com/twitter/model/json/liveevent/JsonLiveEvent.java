// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEvent extends qhh<cof>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public List<JsonLiveEventTimelineInfo> d;
    @JsonField(name = { "remind_me_subscription" })
    public vwf e;
    @JsonField
    public String f;
    @JsonField
    public long g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField(name = { "time_string" })
    public String j;
    @JsonField
    public boolean k;
    @JsonField
    public List<mxf> l;
    @JsonField(name = { "description_entities" })
    public List<atf> m;
    
    public final n4j t() {
        Object o;
        if ((o = this.d) == null) {
            o = f2a.D0;
        }
        final List c = fq4.c((List)o, (jtb)tq9.r);
        final String a = this.a;
        jee.k(a);
        final cof$a cof$a = new cof$a(a);
        String b = this.b;
        cof$a.b = b;
        cof$a.c = this.c;
        cof$a.d = c;
        cof$a.e = this.e;
        cof$a.f = this.f;
        final String h = this.h;
        if (h != null) {
            b = h;
        }
        cof$a.h = b;
        cof$a.i = this.i;
        cof$a.j = this.j;
        cof$a.m = this.k;
        cof$a.k = this.l;
        cof$a.o((List)this.m);
        if (this.g != 0L) {
            final cgv$b cgv$b = new cgv$b();
            ((cgv$a)cgv$b).a = this.g;
            final int a2 = c5j.a;
            cof$a.g = (cgv)((n4j)cgv$b).e();
        }
        return (n4j)cof$a;
    }
}
