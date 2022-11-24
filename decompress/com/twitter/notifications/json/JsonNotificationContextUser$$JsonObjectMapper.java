// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationContextUser$$JsonObjectMapper extends JsonMapper<JsonNotificationContextUser>
{
    public static JsonNotificationContextUser _parse(final qhe qhe) throws IOException {
        final JsonNotificationContextUser jsonNotificationContextUser = new JsonNotificationContextUser();
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
            parseField(jsonNotificationContextUser, d, qhe);
            qhe.m0();
        }
        return jsonNotificationContextUser;
    }
    
    public static void _serialize(final JsonNotificationContextUser jsonNotificationContextUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("image_url", jsonNotificationContextUser.b);
        yfe.u0("screen_name", jsonNotificationContextUser.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationContextUser jsonNotificationContextUser, final String s, final qhe qhe) throws IOException {
        if ("image_url".equals(s)) {
            jsonNotificationContextUser.b = qhe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonNotificationContextUser.a = qhe.T((String)null);
        }
    }
    
    public JsonNotificationContextUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationContextUser jsonNotificationContextUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationContextUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationContextUser)o, yfe, b);
    }
}
