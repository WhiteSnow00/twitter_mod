// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCoordinate$$JsonObjectMapper extends JsonMapper<JsonCoordinate>
{
    public static JsonCoordinate _parse(final khe khe) throws IOException {
        final JsonCoordinate jsonCoordinate = new JsonCoordinate();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonCoordinate, d, khe);
            khe.m0();
        }
        return jsonCoordinate;
    }
    
    public static void _serialize(final JsonCoordinate jsonCoordinate, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.N("latitude", jsonCoordinate.a);
        tfe.N("longitude", jsonCoordinate.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCoordinate jsonCoordinate, final String s, final khe khe) throws IOException {
        if ("latitude".equals(s)) {
            jsonCoordinate.a = khe.p();
        }
        else if ("longitude".equals(s)) {
            jsonCoordinate.b = khe.p();
        }
    }
    
    public JsonCoordinate parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCoordinate jsonCoordinate, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCoordinate, tfe, b);
    }
}
