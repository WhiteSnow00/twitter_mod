// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSamplePageNavBar$$JsonObjectMapper extends JsonMapper<JsonSamplePageNavBar>
{
    public static JsonSamplePageNavBar _parse(final qhe qhe) throws IOException {
        final JsonSamplePageNavBar jsonSamplePageNavBar = new JsonSamplePageNavBar();
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
            parseField(jsonSamplePageNavBar, d, qhe);
            qhe.m0();
        }
        return jsonSamplePageNavBar;
    }
    
    public static void _serialize(final JsonSamplePageNavBar jsonSamplePageNavBar, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSamplePageNavBar.b != null) {
            LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)jsonSamplePageNavBar.b, "clientEventInfo", true, yfe);
        }
        yfe.u0("sampleText", jsonSamplePageNavBar.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSamplePageNavBar jsonSamplePageNavBar, final String s, final qhe qhe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonSamplePageNavBar.b = (b1p)LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe);
        }
        else if ("sampleText".equals(s)) {
            jsonSamplePageNavBar.a = qhe.T((String)null);
        }
    }
    
    public JsonSamplePageNavBar parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSamplePageNavBar jsonSamplePageNavBar, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSamplePageNavBar, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSamplePageNavBar)o, yfe, b);
    }
}
