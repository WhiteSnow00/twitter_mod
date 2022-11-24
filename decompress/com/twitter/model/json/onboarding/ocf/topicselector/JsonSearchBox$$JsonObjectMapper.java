// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchBox$$JsonObjectMapper extends JsonMapper<JsonSearchBox>
{
    public static JsonSearchBox _parse(final qhe qhe) throws IOException {
        final JsonSearchBox jsonSearchBox = new JsonSearchBox();
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
            parseField(jsonSearchBox, d, qhe);
            qhe.m0();
        }
        return jsonSearchBox;
    }
    
    public static void _serialize(final JsonSearchBox jsonSearchBox, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("done_label", jsonSearchBox.b);
        yfe.u0("hint", jsonSearchBox.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSearchBox jsonSearchBox, final String s, final qhe qhe) throws IOException {
        if ("done_label".equals(s)) {
            jsonSearchBox.b = qhe.T((String)null);
        }
        else if ("hint".equals(s)) {
            jsonSearchBox.a = qhe.T((String)null);
        }
    }
    
    public JsonSearchBox parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSearchBox jsonSearchBox, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSearchBox, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSearchBox)o, yfe, b);
    }
}
