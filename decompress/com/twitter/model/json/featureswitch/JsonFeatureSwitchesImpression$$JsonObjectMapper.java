// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesImpression$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesImpression>
{
    public static JsonFeatureSwitchesImpression _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesImpression jsonFeatureSwitchesImpression = new JsonFeatureSwitchesImpression();
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
            parseField(jsonFeatureSwitchesImpression, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesImpression;
    }
    
    public static void _serialize(final JsonFeatureSwitchesImpression jsonFeatureSwitchesImpression, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("bucket", jsonFeatureSwitchesImpression.b);
        afe.t0("key", jsonFeatureSwitchesImpression.a);
        afe.T("version", (int)jsonFeatureSwitchesImpression.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesImpression jsonFeatureSwitchesImpression, final String s, final tge tge) throws IOException {
        final boolean equals = "bucket".equals(s);
        final Integer n = null;
        if (equals) {
            jsonFeatureSwitchesImpression.b = tge.T((String)null);
        }
        else if ("key".equals(s)) {
            jsonFeatureSwitchesImpression.a = tge.T((String)null);
        }
        else if ("version".equals(s)) {
            Integer value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.y();
            }
            jsonFeatureSwitchesImpression.c = value;
        }
    }
    
    public JsonFeatureSwitchesImpression parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesImpression jsonFeatureSwitchesImpression, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesImpression, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesImpression)o, afe, b);
    }
}
