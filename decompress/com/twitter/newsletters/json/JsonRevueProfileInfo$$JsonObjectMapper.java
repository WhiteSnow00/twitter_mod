// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileInfo$$JsonObjectMapper extends JsonMapper<JsonRevueProfileInfo>
{
    public static JsonRevueProfileInfo _parse(final qhe qhe) throws IOException {
        final JsonRevueProfileInfo jsonRevueProfileInfo = new JsonRevueProfileInfo();
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
            parseField(jsonRevueProfileInfo, d, qhe);
            qhe.m0();
        }
        return jsonRevueProfileInfo;
    }
    
    public static void _serialize(final JsonRevueProfileInfo jsonRevueProfileInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("profile_image_url", jsonRevueProfileInfo.c);
        yfe.u0("profile_url", jsonRevueProfileInfo.b);
        yfe.u0("revue_username", jsonRevueProfileInfo.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileInfo jsonRevueProfileInfo, final String s, final qhe qhe) throws IOException {
        if ("profile_image_url".equals(s)) {
            jsonRevueProfileInfo.c = qhe.T((String)null);
        }
        else if ("profile_url".equals(s)) {
            jsonRevueProfileInfo.b = qhe.T((String)null);
        }
        else if ("revue_username".equals(s)) {
            jsonRevueProfileInfo.a = qhe.T((String)null);
        }
    }
    
    public JsonRevueProfileInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRevueProfileInfo jsonRevueProfileInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileInfo)o, yfe, b);
    }
}
