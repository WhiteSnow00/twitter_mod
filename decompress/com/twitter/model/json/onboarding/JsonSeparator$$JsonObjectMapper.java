// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSeparator$$JsonObjectMapper extends JsonMapper<JsonSeparator>
{
    public static JsonSeparator _parse(final qhe qhe) throws IOException {
        final JsonSeparator jsonSeparator = new JsonSeparator();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonSeparator, d, qhe);
            qhe.m0();
        }
        return jsonSeparator;
    }
    
    public static void _serialize(final JsonSeparator jsonSeparator, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSeparator.a != null) {
            yfe.i("label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSeparator.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSeparator jsonSeparator, final String s, final qhe qhe) throws IOException {
        if ("label".equals(s)) {
            jsonSeparator.a = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonSeparator parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSeparator jsonSeparator, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSeparator, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSeparator)o, yfe, b);
    }
}
