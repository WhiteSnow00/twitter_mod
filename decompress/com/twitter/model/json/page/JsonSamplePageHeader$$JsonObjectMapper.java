// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSamplePageHeader$$JsonObjectMapper extends JsonMapper<JsonSamplePageHeader>
{
    public static JsonSamplePageHeader _parse(final qhe qhe) throws IOException {
        final JsonSamplePageHeader jsonSamplePageHeader = new JsonSamplePageHeader();
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
            parseField(jsonSamplePageHeader, d, qhe);
            qhe.m0();
        }
        return jsonSamplePageHeader;
    }
    
    public static void _serialize(final JsonSamplePageHeader jsonSamplePageHeader, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSamplePageHeader.b != null) {
            LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)jsonSamplePageHeader.b, "clientEventInfo", true, yfe);
        }
        yfe.u0("sampleText", jsonSamplePageHeader.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSamplePageHeader jsonSamplePageHeader, final String s, final qhe qhe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonSamplePageHeader.b = (b1p)LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe);
        }
        else if ("sampleText".equals(s)) {
            jsonSamplePageHeader.a = qhe.T((String)null);
        }
    }
    
    public JsonSamplePageHeader parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSamplePageHeader jsonSamplePageHeader, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSamplePageHeader, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSamplePageHeader)o, yfe, b);
    }
}
