// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfRichText extends nge
{
    @JsonField
    public String a;
    @JsonField
    public List<JsonOcfEntity> b;
    @JsonField
    public List<JsonOcfStylingRange> c;
    @JsonField(typeConverter = mks.class)
    public int d;
    @JsonField(typeConverter = hks.class)
    public int e;
    
    public static pej s(final JsonOcfRichText jsonOcfRichText) {
        if (jsonOcfRichText == null) {
            return null;
        }
        final kkg t = kkg.t();
        Object o;
        if ((o = jsonOcfRichText.b) == null) {
            o = h3a.F0;
        }
        for (final JsonOcfEntity jsonOcfEntity : o) {
            final ndj.a a = new ndj.a();
            a.a = jsonOcfEntity.c;
            a.b = jsonOcfEntity.d;
            t.w((Object)a.e(), (Object)new fxl(jsonOcfEntity.a, jsonOcfEntity.b));
        }
        Object o2;
        if ((o2 = jsonOcfRichText.c) == null) {
            o2 = h3a.F0;
        }
        for (final JsonOcfStylingRange jsonOcfStylingRange : o2) {
            final ndj.a a2 = new ndj.a();
            a2.c = new yej(jsonOcfStylingRange.c);
            t.w((Object)a2.e(), (Object)new fxl(jsonOcfStylingRange.a, jsonOcfStylingRange.b));
        }
        final fym.b b = new fym.b<Object>();
        b.a = jsonOcfRichText.a;
        final int a3 = o5j.a;
        b.b = (Map)((z4j)t).e();
        final bvh bvh = new bvh((fym)((z4j)b).e());
        xd.j0(bvh, null, true);
        return new pej(bvh, jsonOcfRichText.d, jsonOcfRichText.e);
    }
}
