// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppMetadata$$JsonObjectMapper extends JsonMapper<JsonMobileAppMetadata>
{
    public static JsonMobileAppMetadata _parse(final tge tge) throws IOException {
        final JsonMobileAppMetadata jsonMobileAppMetadata = new JsonMobileAppMetadata();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonMobileAppMetadata, d, tge);
            tge.l0();
        }
        return jsonMobileAppMetadata;
    }
    
    public static void _serialize(final JsonMobileAppMetadata jsonMobileAppMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonMobileAppMetadata.g != null) {
            LoganSquare.typeConverterFor((Class)och.class).serialize((Object)jsonMobileAppMetadata.g, "app_icon", true, afe);
        }
        final String a = jsonMobileAppMetadata.a;
        if (a != null) {
            afe.t0("app_id", a);
            if (jsonMobileAppMetadata.e != null) {
                LoganSquare.typeConverterFor((Class)ofh.class).serialize((Object)jsonMobileAppMetadata.e, "app_price", true, afe);
            }
            afe.N("average_stars", (double)jsonMobileAppMetadata.j);
            afe.t0("description", jsonMobileAppMetadata.d);
            afe.t0("developer_name", jsonMobileAppMetadata.i);
            afe.t0("name", jsonMobileAppMetadata.b);
            afe.t0("original_app_icon", jsonMobileAppMetadata.h);
            afe.t0("primary_category_name", jsonMobileAppMetadata.f);
            afe.t0("store_url", jsonMobileAppMetadata.k);
            afe.t0("subtitle", jsonMobileAppMetadata.c);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("appId");
        throw null;
    }
    
    public static void parseField(final JsonMobileAppMetadata jsonMobileAppMetadata, String t, final tge tge) throws IOException {
        if ("app_icon".equals(t)) {
            jsonMobileAppMetadata.g = (och)LoganSquare.typeConverterFor((Class)och.class).parse(tge);
        }
        else {
            final boolean equals = "app_id".equals(t);
            final Double n = null;
            if (equals) {
                t = tge.T((String)null);
                Objects.requireNonNull(jsonMobileAppMetadata);
                czd.f((Object)t, "<set-?>");
                jsonMobileAppMetadata.a = t;
            }
            else if ("app_price".equals(t)) {
                jsonMobileAppMetadata.e = (ofh)LoganSquare.typeConverterFor((Class)ofh.class).parse(tge);
            }
            else if ("average_stars".equals(t)) {
                Double value;
                if (tge.e() == vie.V0) {
                    value = n;
                }
                else {
                    value = tge.p();
                }
                jsonMobileAppMetadata.j = value;
            }
            else if ("description".equals(t)) {
                jsonMobileAppMetadata.d = tge.T((String)null);
            }
            else if ("developer_name".equals(t)) {
                jsonMobileAppMetadata.i = tge.T((String)null);
            }
            else if ("name".equals(t)) {
                jsonMobileAppMetadata.b = tge.T((String)null);
            }
            else if ("original_app_icon".equals(t)) {
                jsonMobileAppMetadata.h = tge.T((String)null);
            }
            else if ("primary_category_name".equals(t)) {
                jsonMobileAppMetadata.f = tge.T((String)null);
            }
            else if ("store_url".equals(t)) {
                jsonMobileAppMetadata.k = tge.T((String)null);
            }
            else if ("subtitle".equals(t)) {
                jsonMobileAppMetadata.c = tge.T((String)null);
            }
        }
    }
    
    public JsonMobileAppMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppMetadata jsonMobileAppMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppMetadata)o, afe, b);
    }
}
