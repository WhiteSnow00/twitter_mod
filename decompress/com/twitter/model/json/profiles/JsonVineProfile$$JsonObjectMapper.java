// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVineProfile$$JsonObjectMapper extends JsonMapper<JsonVineProfile>
{
    public static JsonVineProfile _parse(final qhe qhe) throws IOException {
        final JsonVineProfile jsonVineProfile = new JsonVineProfile();
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
            parseField(jsonVineProfile, d, qhe);
            qhe.m0();
        }
        return jsonVineProfile;
    }
    
    public static void _serialize(final JsonVineProfile jsonVineProfile, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("app_link", jsonVineProfile.b);
        yfe.W("loop_count", jsonVineProfile.c);
        yfe.e("visible", jsonVineProfile.d);
        yfe.u0("web_link", jsonVineProfile.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonVineProfile jsonVineProfile, final String s, final qhe qhe) throws IOException {
        if ("app_link".equals(s)) {
            jsonVineProfile.b = qhe.T((String)null);
        }
        else if ("loop_count".equals(s)) {
            jsonVineProfile.c = qhe.L();
        }
        else if ("visible".equals(s)) {
            jsonVineProfile.d = qhe.l();
        }
        else if ("web_link".equals(s)) {
            jsonVineProfile.a = qhe.T((String)null);
        }
    }
    
    public JsonVineProfile parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonVineProfile jsonVineProfile, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonVineProfile, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonVineProfile)o, yfe, b);
    }
}
