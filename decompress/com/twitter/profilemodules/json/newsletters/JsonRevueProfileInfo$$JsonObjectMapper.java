// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileInfo$$JsonObjectMapper extends JsonMapper<JsonRevueProfileInfo>
{
    public static JsonRevueProfileInfo _parse(final tge tge) throws IOException {
        final JsonRevueProfileInfo jsonRevueProfileInfo = new JsonRevueProfileInfo();
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
            parseField(jsonRevueProfileInfo, d, tge);
            tge.l0();
        }
        return jsonRevueProfileInfo;
    }
    
    public static void _serialize(final JsonRevueProfileInfo jsonRevueProfileInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonRevueProfileInfo.c != null) {
            LoganSquare.typeConverterFor((Class)hwm.class).serialize((Object)jsonRevueProfileInfo.c, "profile_image", true, afe);
        }
        afe.t0("profile_url", jsonRevueProfileInfo.b);
        afe.t0("slug", jsonRevueProfileInfo.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileInfo jsonRevueProfileInfo, final String s, final tge tge) throws IOException {
        if ("profile_image".equals(s)) {
            jsonRevueProfileInfo.c = (hwm)LoganSquare.typeConverterFor((Class)hwm.class).parse(tge);
        }
        else if ("profile_url".equals(s)) {
            jsonRevueProfileInfo.b = tge.T((String)null);
        }
        else if ("slug".equals(s)) {
            jsonRevueProfileInfo.a = tge.T((String)null);
        }
    }
    
    public JsonRevueProfileInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueProfileInfo jsonRevueProfileInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileInfo)o, afe, b);
    }
}
