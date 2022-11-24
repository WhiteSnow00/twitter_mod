// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCursorDisplayTreatment$$JsonObjectMapper extends JsonMapper<JsonCursorDisplayTreatment>
{
    public static JsonCursorDisplayTreatment _parse(final qhe qhe) throws IOException {
        final JsonCursorDisplayTreatment jsonCursorDisplayTreatment = new JsonCursorDisplayTreatment();
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
            parseField(jsonCursorDisplayTreatment, d, qhe);
            qhe.m0();
        }
        return jsonCursorDisplayTreatment;
    }
    
    public static void _serialize(final JsonCursorDisplayTreatment jsonCursorDisplayTreatment, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("actionText", jsonCursorDisplayTreatment.a);
        yfe.u0("labelText", jsonCursorDisplayTreatment.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCursorDisplayTreatment jsonCursorDisplayTreatment, final String s, final qhe qhe) throws IOException {
        if ("actionText".equals(s)) {
            jsonCursorDisplayTreatment.a = qhe.T((String)null);
        }
        else if ("labelText".equals(s)) {
            jsonCursorDisplayTreatment.b = qhe.T((String)null);
        }
    }
    
    public JsonCursorDisplayTreatment parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCursorDisplayTreatment jsonCursorDisplayTreatment, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCursorDisplayTreatment, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCursorDisplayTreatment)o, yfe, b);
    }
}
