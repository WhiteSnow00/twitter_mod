// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTombstoneInfo$$JsonObjectMapper extends JsonMapper<JsonURTTombstoneInfo>
{
    public static JsonURTTombstoneInfo _parse(final khe khe) throws IOException {
        final JsonURTTombstoneInfo jsonURTTombstoneInfo = new JsonURTTombstoneInfo();
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
            parseField(jsonURTTombstoneInfo, d, khe);
            khe.m0();
        }
        return jsonURTTombstoneInfo;
    }
    
    public static void _serialize(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTTombstoneInfo.b != null) {
            LoganSquare.typeConverterFor((Class)xqv.class).serialize((Object)jsonURTTombstoneInfo.b, "cta", true, tfe);
        }
        tfe.u0("revealText", jsonURTTombstoneInfo.c);
        if (jsonURTTombstoneInfo.e != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTTombstoneInfo.e, "richRevealText", true, tfe);
        }
        if (jsonURTTombstoneInfo.d != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTTombstoneInfo.d, "richText", true, tfe);
        }
        tfe.u0("text", jsonURTTombstoneInfo.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final String s, final khe khe) throws IOException {
        if ("cta".equals(s)) {
            jsonURTTombstoneInfo.b = (xqv)LoganSquare.typeConverterFor((Class)xqv.class).parse(khe);
        }
        else if ("revealText".equals(s)) {
            jsonURTTombstoneInfo.c = khe.T((String)null);
        }
        else if ("richRevealText".equals(s)) {
            jsonURTTombstoneInfo.e = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("richText".equals(s)) {
            jsonURTTombstoneInfo.d = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonURTTombstoneInfo.a = khe.T((String)null);
        }
    }
    
    public JsonURTTombstoneInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTTombstoneInfo, tfe, b);
    }
}
