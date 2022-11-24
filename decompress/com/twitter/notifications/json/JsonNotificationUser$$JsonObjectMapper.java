// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationUser$$JsonObjectMapper extends JsonMapper<JsonNotificationUser>
{
    public static JsonNotificationUser _parse(final qhe qhe) throws IOException {
        final JsonNotificationUser jsonNotificationUser = new JsonNotificationUser();
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
            parseField(jsonNotificationUser, d, qhe);
            qhe.m0();
        }
        return jsonNotificationUser;
    }
    
    public static void _serialize(final JsonNotificationUser jsonNotificationUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("full_name", jsonNotificationUser.c);
        yfe.W("id", jsonNotificationUser.a);
        yfe.e("following", jsonNotificationUser.f);
        yfe.e("protected", jsonNotificationUser.e);
        yfe.u0("profile_image_url", jsonNotificationUser.d);
        yfe.u0("screen_name", jsonNotificationUser.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationUser jsonNotificationUser, final String s, final qhe qhe) throws IOException {
        if ("full_name".equals(s)) {
            jsonNotificationUser.c = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonNotificationUser.a = qhe.L();
        }
        else if ("following".equals(s)) {
            jsonNotificationUser.f = qhe.l();
        }
        else if ("protected".equals(s)) {
            jsonNotificationUser.e = qhe.l();
        }
        else if ("profile_image_url".equals(s)) {
            jsonNotificationUser.d = qhe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonNotificationUser.b = qhe.T((String)null);
        }
    }
    
    public JsonNotificationUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationUser jsonNotificationUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationUser)o, yfe, b);
    }
}
