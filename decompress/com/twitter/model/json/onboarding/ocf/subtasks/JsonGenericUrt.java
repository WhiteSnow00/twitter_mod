// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGenericUrt extends qhh<o0c>
{
    @JsonField
    public oej a;
    @JsonField
    public ssv b;
    @JsonField
    public JsonTimelineQuery c;
    @JsonField
    public String d;
    @JsonField
    public gej e;
    @JsonField
    public cbi f;
    @JsonField
    public ucj g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    public final n4j t() {
        final o0c$a o0c$a = new o0c$a();
        ((dtr$a)o0c$a).h = this.a;
        final int a = c5j.a;
        final ssv b = this.b;
        jee.l((Object)b);
        ((dtr$a)o0c$a).a = b;
        ((am1$a)o0c$a).k = JsonTimelineQuery.s(this.c);
        ((am1$a)o0c$a).l = this.d;
        ((am1$a)o0c$a).m = this.e;
        ((am1$a)o0c$a).n = this.f;
        ((am1$a)o0c$a).o = this.g;
        final JsonOcfComponentCollection h = this.h;
        x06 t;
        if (h != null) {
            t = h.t();
        }
        else {
            t = null;
        }
        ((dtr$a)o0c$a).j = t;
        return (n4j)o0c$a;
    }
}
