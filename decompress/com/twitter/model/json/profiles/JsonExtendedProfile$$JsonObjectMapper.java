// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExtendedProfile$$JsonObjectMapper extends JsonMapper<JsonExtendedProfile>
{
    public static JsonExtendedProfile _parse(final qhe qhe) throws IOException {
        final JsonExtendedProfile jsonExtendedProfile = new JsonExtendedProfile();
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
            parseField(jsonExtendedProfile, d, qhe);
            qhe.m0();
        }
        return jsonExtendedProfile;
    }
    
    public static void _serialize(final JsonExtendedProfile jsonExtendedProfile, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonExtendedProfile.b != null) {
            yfe.i("birthdate");
            JsonBirthdate$$JsonObjectMapper._serialize(jsonExtendedProfile.b, yfe, true);
        }
        yfe.W("id", jsonExtendedProfile.a);
        if (jsonExtendedProfile.c != null) {
            LoganSquare.typeConverterFor((Class)xex.class).serialize((Object)jsonExtendedProfile.c, "vine_profile", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonExtendedProfile jsonExtendedProfile, final String s, final qhe qhe) throws IOException {
        if ("birthdate".equals(s)) {
            jsonExtendedProfile.b = JsonBirthdate$$JsonObjectMapper._parse(qhe);
        }
        else if ("id".equals(s)) {
            jsonExtendedProfile.a = qhe.L();
        }
        else if ("vine_profile".equals(s)) {
            jsonExtendedProfile.c = (xex)LoganSquare.typeConverterFor((Class)xex.class).parse(qhe);
        }
    }
    
    public JsonExtendedProfile parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonExtendedProfile jsonExtendedProfile, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonExtendedProfile, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonExtendedProfile)o, yfe, b);
    }
}
