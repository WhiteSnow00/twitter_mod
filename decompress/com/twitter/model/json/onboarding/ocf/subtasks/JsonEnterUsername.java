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
public class JsonEnterUsername extends lhh<z6a>
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
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public xrv g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    @Override
    public final h4j t() {
        final ijf h = ijf.H();
        Object o;
        if ((o = this.d) == null) {
            o = v2a.C0;
        }
        final Iterator iterator = ((List)o).iterator();
        while (iterator.hasNext()) {
            h.p((Object)JsonOcfRichText.s((JsonOcfRichText)iterator.next()));
        }
        final z6a.a a = new z6a.a();
        a.f = JsonOcfRichText.s(this.a);
        final int a2 = w4j.a;
        a.g = JsonOcfRichText.s(this.b);
        a.k = this.c;
        a.l = (List)((h4j)h).e();
        a.a = this.e;
        a.c = this.f;
        a.b = this.g;
        final JsonOcfComponentCollection h2 = this.h;
        n16 t;
        if (h2 != null) {
            t = h2.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (h4j)a;
    }
}
