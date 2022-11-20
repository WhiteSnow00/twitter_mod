// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueImageInfo$$JsonObjectMapper extends JsonMapper<JsonRevueImageInfo>
{
    public static JsonRevueImageInfo _parse(final tge tge) throws IOException {
        final JsonRevueImageInfo jsonRevueImageInfo = new JsonRevueImageInfo();
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
            parseField(jsonRevueImageInfo, d, tge);
            tge.l0();
        }
        return jsonRevueImageInfo;
    }
    
    public static void _serialize(final JsonRevueImageInfo jsonRevueImageInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("height", jsonRevueImageInfo.b);
        afe.t0("url", jsonRevueImageInfo.c);
        afe.T("width", jsonRevueImageInfo.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueImageInfo jsonRevueImageInfo, final String s, final tge tge) throws IOException {
        if ("height".equals(s)) {
            jsonRevueImageInfo.b = tge.y();
        }
        else if ("url".equals(s)) {
            jsonRevueImageInfo.c = tge.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonRevueImageInfo.a = tge.y();
        }
    }
    
    public JsonRevueImageInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueImageInfo jsonRevueImageInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueImageInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueImageInfo)o, afe, b);
    }
}
