// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCoordinate$$JsonObjectMapper extends JsonMapper<JsonCoordinate>
{
    public static JsonCoordinate _parse(final tge tge) throws IOException {
        final JsonCoordinate jsonCoordinate = new JsonCoordinate();
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
            parseField(jsonCoordinate, d, tge);
            tge.l0();
        }
        return jsonCoordinate;
    }
    
    public static void _serialize(final JsonCoordinate jsonCoordinate, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.N("latitude", jsonCoordinate.a);
        afe.N("longitude", jsonCoordinate.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCoordinate jsonCoordinate, final String s, final tge tge) throws IOException {
        if ("latitude".equals(s)) {
            jsonCoordinate.a = tge.p();
        }
        else if ("longitude".equals(s)) {
            jsonCoordinate.b = tge.p();
        }
    }
    
    public JsonCoordinate parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCoordinate jsonCoordinate, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCoordinate, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCoordinate)o, afe, b);
    }
}
