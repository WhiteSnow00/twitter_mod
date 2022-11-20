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
public class JsonOcfRichText extends qfe
{
    @JsonField
    public String a;
    @JsonField
    public List<JsonOcfEntity> b;
    @JsonField
    public List<JsonOcfStylingRange> c;
    @JsonField(typeConverter = ujs.class)
    public int d;
    @JsonField(typeConverter = pjs.class)
    public int e;
    
    public static cej s(final JsonOcfRichText jsonOcfRichText) {
        if (jsonOcfRichText == null) {
            return null;
        }
        final qjg t = qjg.t();
        Object o;
        if ((o = jsonOcfRichText.b) == null) {
            o = f2a.D0;
        }
        for (final JsonOcfEntity jsonOcfEntity : o) {
            final adj$a adj$a = new adj$a();
            adj$a.a = jsonOcfEntity.c;
            adj$a.b = jsonOcfEntity.d;
            t.w((Object)((n4j)adj$a).e(), (Object)new vwl(jsonOcfEntity.a, jsonOcfEntity.b));
        }
        Object o2;
        if ((o2 = jsonOcfRichText.c) == null) {
            o2 = f2a.D0;
        }
        for (final JsonOcfStylingRange jsonOcfStylingRange : o2) {
            final adj$a adj$a2 = new adj$a();
            adj$a2.c = new mej(jsonOcfStylingRange.c);
            t.w((Object)((n4j)adj$a2).e(), (Object)new vwl(jsonOcfStylingRange.a, jsonOcfStylingRange.b));
        }
        final oxm.b b = new oxm.b<Object>();
        b.a = jsonOcfRichText.a;
        final int a = c5j.a;
        b.b = (Map)((n4j)t).e();
        final luh luh = new luh((oxm<sfs>)((n4j)b).e());
        ii8.s(luh, (List)null, true);
        return new cej(luh, jsonOcfRichText.d, jsonOcfRichText.e);
    }
}
