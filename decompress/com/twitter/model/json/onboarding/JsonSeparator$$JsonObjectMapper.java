// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSeparator$$JsonObjectMapper extends JsonMapper<JsonSeparator>
{
    public static JsonSeparator _parse(final tge tge) throws IOException {
        final JsonSeparator jsonSeparator = new JsonSeparator();
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
            parseField(jsonSeparator, d, tge);
            tge.l0();
        }
        return jsonSeparator;
    }
    
    public static void _serialize(final JsonSeparator jsonSeparator, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSeparator.a != null) {
            afe.i("label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSeparator.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSeparator jsonSeparator, final String s, final tge tge) throws IOException {
        if ("label".equals(s)) {
            jsonSeparator.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonSeparator parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSeparator jsonSeparator, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSeparator, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSeparator)o, afe, b);
    }
}
