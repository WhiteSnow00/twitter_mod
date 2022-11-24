// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.card;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Iterator;
import com.twitter.model.json.unifiedcard.JsonUnifiedCardException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCardInstanceData extends tih<ck3>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(typeConverter = JsonCardInstanceData.JsonCardInstanceData$b.class)
    public Map<String, qgv> c;
    @JsonField
    public List<ziw> d;
    @JsonField
    public JsonCardInstanceData.JsonCardInstanceData$JsonCardPlatform e;
    @JsonField(typeConverter = JsonCardInstanceData.JsonCardInstanceData$a.class)
    public Map<String, dz1> f;
    
    @Override
    public final Object s() {
        final ck3.a a = new ck3.a();
        final String a2 = this.a;
        Object o = null;
        final uwv uwv = null;
        if (a2 == null) {
            mqb.o("Invalid name field for card instance data");
        }
        else {
            a.a = a2;
            final String b = this.b;
            if (b != null) {
                try {
                    a.b = y78.i(b);
                }
                catch (final MalformedURLException ex) {
                    r9a.d((Throwable)ex);
                    return o;
                }
            }
            final List c = dvc.c((List)this.d);
            if (c != null) {
                this.c = kr4.d(c, (lub)yr9.r);
            }
            final Map<String, qgv> c2 = this.c;
            if (c2 != null) {
                a.c = kr4.B((Map)c2, (x2j)pde.b);
            }
            final Map<String, dz1> f = this.f;
            if (f != null) {
                final kkg t = kkg.t();
                for (final Map.Entry entry : f.entrySet()) {
                    if (entry.getValue() != null) {
                        t.w((Object)entry.getKey(), (Object)entry.getValue());
                    }
                }
                a.o((Map<String, dz1>)((z4j)t).e());
            }
            final JsonCardInstanceData.JsonCardInstanceData$JsonCardPlatform e = this.e;
            if (e != null) {
                final JsonCardInstanceData.JsonCardInstanceData$JsonPlatform a3 = e.a;
                if (a3 != null) {
                    final JsonCardInstanceData.JsonCardInstanceData$JsonAudience a4 = a3.a;
                    if (a4 != null) {
                        a.f = a4.a;
                        a.g = a4.b;
                    }
                }
            }
            final String a5 = this.a;
            final Pattern a6 = flr.a;
            if (e0e.a((Object)a5, (Object)"unified_card")) {
                final String e2 = r1n.E("unified_card", s78.b((Map)this.f));
                uwv h = uwv;
                if (flr.g((CharSequence)e2)) {
                    try {
                        final uwv$a uwv$a = uih.e(e2, uwv$a.class, false);
                        if (uwv$a != null) {
                            uwv$a.b = this.b;
                            final uwv uwv2 = (uwv)((z4j)uwv$a).j();
                        }
                    }
                    finally {
                        final Throwable t2;
                        final m9a m9a = new m9a(t2);
                        ((HashMap<String, String>)m9a.a).put("url", this.b);
                        ((HashMap<String, String>)m9a.a).put("card_json", e2);
                        r9a.c(m9a);
                        this.t("unified_card_json_parsing_exception", this.b, nso.b);
                        h = uwv;
                    }
                }
                if (h != null) {
                    a.h = h;
                    this.t("unified_card_json_parsing_succeeded", this.b, jba.t("unified_cards_json_parsing_success_sampling_rate_android", nso.e));
                }
                else {
                    final String b2 = this.b;
                    r9a.d((Throwable)new JsonUnifiedCardException(mqb.l("Invalid UC Json response for card: ", b2)));
                    this.t("unified_card_json_parsing_failed", b2, jba.t("unified_cards_json_parsing_failure_sampling_rate_android", nso.e));
                }
            }
            o = a.e();
        }
        return o;
    }
    
    public final void t(final String s, final String c, final nso a) {
        final fg4 fg4 = new fg4(dda.g("", "", "", "json_card_instance_data_parsing", s));
        ((o1p)fg4).c = c;
        final int a2 = o5j.a;
        ((o1p)fg4).a = a;
        sbw.b((tlm)fg4);
    }
}
