// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import com.twitter.model.json.core.JsonUserName;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPromotedContent extends lhh<hil>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField(name = { "promoted_trend_id_str", "promoted_trend_id" })
    public long d;
    @JsonField(typeConverter = JsonPromotedContent.JsonPromotedContent$a.class)
    public Map<String, String> e;
    @JsonField
    public JsonPromotedContent.JsonPromotedContent$PromotedContentAdvertiser f;
    @JsonField
    public JsonPromotedContent.JsonPromotedContent$PromotedContentTrend g;
    @JsonField
    public JsonPromotedContent.JsonPromotedContent$PromotedContext h;
    @JsonField
    public JsonUserName[] i;
    @JsonField
    public Set<String> j;
    @JsonField
    public yd4 k;
    
    @Override
    public final h4j t() {
        final hil$a hil$a = new hil$a();
        hil$a.a = this.a;
        hil$a.b = this.b;
        hil$a.f = this.c;
        hil$a.j = this.j;
        final Map<String, String> e = this.e;
        if (e != null) {
            for (final Map.Entry<String, V> entry : e.entrySet()) {
                final String s = entry.getKey();
                final String s2 = (String)entry.getValue();
                Objects.requireNonNull(s);
                if (!s.equals("pac_in_timeline")) {
                    if (!s.equals("suppress_media_forward")) {
                        ((sjg)hil$a.k).w((Object)s, (Object)s2);
                    }
                    else {
                        hil$a.i = "true".equals(s2);
                    }
                }
                else {
                    hil$a.h = "true".equals(s2);
                }
            }
        }
        final JsonPromotedContent.JsonPromotedContent$PromotedContentAdvertiser f = this.f;
        if (f != null) {
            hil$a.e = f.a;
        }
        final JsonPromotedContent.JsonPromotedContent$PromotedContentTrend g = this.g;
        if (g != null) {
            hil$a.c = g.a;
            hil$a.d = g.b;
        }
        final JsonUserName[] i = this.i;
        if (i != null) {
            for (final JsonUserName jsonUserName : i) {
                if (hil$a.d == null) {
                    final String a = jsonUserName.a;
                    final String b = jsonUserName.b;
                    String d;
                    if ((d = a) == null) {
                        d = b;
                    }
                    hil$a.d = d;
                }
            }
        }
        hil$a.m = this.k;
        return (h4j)hil$a;
    }
}
