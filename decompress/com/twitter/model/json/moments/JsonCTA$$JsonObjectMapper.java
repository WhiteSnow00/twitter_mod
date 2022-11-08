// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCTA$$JsonObjectMapper extends JsonMapper<JsonCTA>
{
    public static JsonCTA _parse(final khe khe) throws IOException {
        final JsonCTA jsonCTA = new JsonCTA();
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
            parseField(jsonCTA, d, khe);
            khe.m0();
        }
        return jsonCTA;
    }
    
    public static void _serialize(final JsonCTA jsonCTA, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCTA.c != null) {
            LoganSquare.typeConverterFor((Class)bmd.class).serialize((Object)jsonCTA.c, "badge", true, tfe);
        }
        tfe.u0("text", jsonCTA.a);
        tfe.u0("uri", jsonCTA.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCTA jsonCTA, final String s, final khe khe) throws IOException {
        if ("badge".equals(s)) {
            jsonCTA.c = (bmd)LoganSquare.typeConverterFor((Class)bmd.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonCTA.a = khe.T((String)null);
        }
        else if ("uri".equals(s)) {
            jsonCTA.b = khe.T((String)null);
        }
    }
    
    public JsonCTA parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCTA jsonCTA, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCTA, tfe, b);
    }
}
