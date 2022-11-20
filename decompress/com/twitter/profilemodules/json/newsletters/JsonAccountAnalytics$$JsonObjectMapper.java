// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAccountAnalytics$$JsonObjectMapper extends JsonMapper<JsonAccountAnalytics>
{
    public static JsonAccountAnalytics _parse(final tge tge) throws IOException {
        final JsonAccountAnalytics jsonAccountAnalytics = new JsonAccountAnalytics();
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
            parseField(jsonAccountAnalytics, d, tge);
            tge.l0();
        }
        return jsonAccountAnalytics;
    }
    
    public static void _serialize(final JsonAccountAnalytics jsonAccountAnalytics, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("issue_count", (long)jsonAccountAnalytics.b);
        afe.V("subscriber_count", (long)jsonAccountAnalytics.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAccountAnalytics jsonAccountAnalytics, final String s, final tge tge) throws IOException {
        final boolean equals = "issue_count".equals(s);
        final Long n = null;
        final Long n2 = null;
        if (equals) {
            Long value;
            if (tge.e() == vie.V0) {
                value = n2;
            }
            else {
                value = tge.K();
            }
            jsonAccountAnalytics.b = value;
        }
        else if ("subscriber_count".equals(s)) {
            Long value2;
            if (tge.e() == vie.V0) {
                value2 = n;
            }
            else {
                value2 = tge.K();
            }
            jsonAccountAnalytics.a = value2;
        }
    }
    
    public JsonAccountAnalytics parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAccountAnalytics jsonAccountAnalytics, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAccountAnalytics, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAccountAnalytics)o, afe, b);
    }
}
