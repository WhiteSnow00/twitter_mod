// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppPrice$$JsonObjectMapper extends JsonMapper<JsonMobileAppPrice>
{
    public static JsonMobileAppPrice _parse(final tge tge) throws IOException {
        final JsonMobileAppPrice jsonMobileAppPrice = new JsonMobileAppPrice();
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
            parseField(jsonMobileAppPrice, d, tge);
            tge.l0();
        }
        return jsonMobileAppPrice;
    }
    
    public static void _serialize(final JsonMobileAppPrice jsonMobileAppPrice, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String b2 = jsonMobileAppPrice.b;
        if (b2 != null) {
            afe.t0("currency_code", b2);
            afe.N("price", (double)jsonMobileAppPrice.a);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("currencyCode");
        throw null;
    }
    
    public static void parseField(final JsonMobileAppPrice jsonMobileAppPrice, String t, final tge tge) throws IOException {
        final boolean equals = "currency_code".equals(t);
        final Double n = null;
        if (equals) {
            t = tge.T((String)null);
            Objects.requireNonNull(jsonMobileAppPrice);
            czd.f((Object)t, "<set-?>");
            jsonMobileAppPrice.b = t;
        }
        else if ("price".equals(t)) {
            Double value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.p();
            }
            jsonMobileAppPrice.a = value;
        }
    }
    
    public JsonMobileAppPrice parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppPrice jsonMobileAppPrice, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppPrice, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppPrice)o, afe, b);
    }
}
