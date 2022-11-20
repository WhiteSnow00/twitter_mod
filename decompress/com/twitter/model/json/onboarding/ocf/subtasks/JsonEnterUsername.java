// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEnterUsername extends qhh<i6a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public List<JsonOcfRichText> d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public ssv g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    public final n4j t() {
        final rif h = rif.H();
        Object o;
        if ((o = this.d) == null) {
            o = f2a.D0;
        }
        final Iterator iterator = ((List)o).iterator();
        while (iterator.hasNext()) {
            h.p((Object)JsonOcfRichText.s((JsonOcfRichText)iterator.next()));
        }
        final i6a.a a = new i6a.a();
        a.f = JsonOcfRichText.s(this.a);
        final int a2 = c5j.a;
        a.g = JsonOcfRichText.s(this.b);
        a.k = this.c;
        a.l = (List)((n4j)h).e();
        a.a = this.e;
        a.c = this.f;
        a.b = this.g;
        final JsonOcfComponentCollection h2 = this.h;
        x06 t;
        if (h2 != null) {
            t = h2.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (n4j)a;
    }
}
