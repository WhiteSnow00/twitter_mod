// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.twitter.model.json.card.JsonImageModel;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSlate extends qhh<deq>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public List<JsonImageModel> e;
    @JsonField
    public String f;
    @JsonField
    public List<JsonFocusRects> g;
    @JsonField
    public JsonLiveEventAttribution h;
    
    public final n4j t() {
        Object o;
        if ((o = this.e) == null) {
            o = f2a.D0;
        }
        final List c = fq4.c((List)o, (jtb)rq9.m);
        Object o2;
        if ((o2 = this.g) == null) {
            o2 = f2a.D0;
        }
        final List c2 = fq4.c((List)o2, (jtb)wq9.q);
        final String a = this.a;
        jee.k(a);
        final deq$a deq$a = new deq$a(a);
        deq$a.b = this.b;
        deq$a.c = this.c;
        deq$a.d = this.d;
        deq$a.p(c);
        deq$a.o(c2);
        deq$a.f = this.f;
        final JsonLiveEventAttribution h = this.h;
        qof h2;
        if (h == null) {
            h2 = null;
        }
        else {
            h2 = (qof)h.s();
        }
        deq$a.h = h2;
        return (n4j)deq$a;
    }
}
