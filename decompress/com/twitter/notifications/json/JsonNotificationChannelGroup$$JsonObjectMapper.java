// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationChannelGroup$$JsonObjectMapper extends JsonMapper<JsonNotificationChannelGroup>
{
    public static JsonNotificationChannelGroup _parse(final qhe qhe) throws IOException {
        final JsonNotificationChannelGroup jsonNotificationChannelGroup = new JsonNotificationChannelGroup();
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
            parseField(jsonNotificationChannelGroup, d, qhe);
            qhe.m0();
        }
        return jsonNotificationChannelGroup;
    }
    
    public static void _serialize(final JsonNotificationChannelGroup jsonNotificationChannelGroup, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonNotificationChannelGroup.c);
        yfe.u0("id", jsonNotificationChannelGroup.a);
        yfe.u0("name", jsonNotificationChannelGroup.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationChannelGroup jsonNotificationChannelGroup, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonNotificationChannelGroup.c = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonNotificationChannelGroup.a = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonNotificationChannelGroup.b = qhe.T((String)null);
        }
    }
    
    public JsonNotificationChannelGroup parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationChannelGroup jsonNotificationChannelGroup, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationChannelGroup, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationChannelGroup)o, yfe, b);
    }
}
