// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTombstoneInfo$$JsonObjectMapper extends JsonMapper<JsonURTTombstoneInfo>
{
    public static JsonURTTombstoneInfo _parse(final tge tge) throws IOException {
        final JsonURTTombstoneInfo jsonURTTombstoneInfo = new JsonURTTombstoneInfo();
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
            parseField(jsonURTTombstoneInfo, d, tge);
            tge.l0();
        }
        return jsonURTTombstoneInfo;
    }
    
    public static void _serialize(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonURTTombstoneInfo.b != null) {
            LoganSquare.typeConverterFor((Class)srv.class).serialize((Object)jsonURTTombstoneInfo.b, "cta", true, afe);
        }
        afe.t0("revealText", jsonURTTombstoneInfo.c);
        if (jsonURTTombstoneInfo.e != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonURTTombstoneInfo.e, "richRevealText", true, afe);
        }
        if (jsonURTTombstoneInfo.d != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonURTTombstoneInfo.d, "richText", true, afe);
        }
        afe.t0("text", jsonURTTombstoneInfo.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final String s, final tge tge) throws IOException {
        if ("cta".equals(s)) {
            jsonURTTombstoneInfo.b = (srv)LoganSquare.typeConverterFor((Class)srv.class).parse(tge);
        }
        else if ("revealText".equals(s)) {
            jsonURTTombstoneInfo.c = tge.T((String)null);
        }
        else if ("richRevealText".equals(s)) {
            jsonURTTombstoneInfo.e = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
        else if ("richText".equals(s)) {
            jsonURTTombstoneInfo.d = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonURTTombstoneInfo.a = tge.T((String)null);
        }
    }
    
    public JsonURTTombstoneInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTTombstoneInfo jsonURTTombstoneInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTTombstoneInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTTombstoneInfo)o, afe, b);
    }
}
