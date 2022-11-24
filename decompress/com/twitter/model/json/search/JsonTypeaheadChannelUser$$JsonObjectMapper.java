// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadChannelUser$$JsonObjectMapper extends JsonMapper<JsonTypeaheadChannelUser>
{
    public static JsonTypeaheadChannelUser _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadChannelUser jsonTypeaheadChannelUser = new JsonTypeaheadChannelUser();
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
            parseField(jsonTypeaheadChannelUser, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadChannelUser;
    }
    
    public static void _serialize(final JsonTypeaheadChannelUser jsonTypeaheadChannelUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("id", jsonTypeaheadChannelUser.a);
        yfe.u0("id_str", jsonTypeaheadChannelUser.b);
        yfe.e("protected", jsonTypeaheadChannelUser.g);
        yfe.e("verified", jsonTypeaheadChannelUser.f);
        yfe.u0("name", jsonTypeaheadChannelUser.c);
        yfe.u0("profile_image_url_https", jsonTypeaheadChannelUser.e);
        yfe.u0("screen_name", jsonTypeaheadChannelUser.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadChannelUser jsonTypeaheadChannelUser, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonTypeaheadChannelUser.a = qhe.L();
        }
        else if ("id_str".equals(s)) {
            jsonTypeaheadChannelUser.b = qhe.T((String)null);
        }
        else if ("protected".equals(s)) {
            jsonTypeaheadChannelUser.g = qhe.l();
        }
        else if ("verified".equals(s)) {
            jsonTypeaheadChannelUser.f = qhe.l();
        }
        else if ("name".equals(s)) {
            jsonTypeaheadChannelUser.c = qhe.T((String)null);
        }
        else if ("profile_image_url_https".equals(s)) {
            jsonTypeaheadChannelUser.e = qhe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonTypeaheadChannelUser.d = qhe.T((String)null);
        }
    }
    
    public JsonTypeaheadChannelUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadChannelUser jsonTypeaheadChannelUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadChannelUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadChannelUser)o, yfe, b);
    }
}
