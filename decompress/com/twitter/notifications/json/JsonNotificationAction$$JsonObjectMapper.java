// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationAction$$JsonObjectMapper extends JsonMapper<JsonNotificationAction>
{
    public static JsonNotificationAction _parse(final qhe qhe) throws IOException {
        final JsonNotificationAction jsonNotificationAction = new JsonNotificationAction();
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
            parseField(jsonNotificationAction, d, qhe);
            qhe.m0();
        }
        return jsonNotificationAction;
    }
    
    public static void _serialize(final JsonNotificationAction jsonNotificationAction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonNotificationAction.a);
        yfe.u0("scribe_target", jsonNotificationAction.b);
        yfe.u0("title", jsonNotificationAction.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationAction jsonNotificationAction, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonNotificationAction.a = qhe.T((String)null);
        }
        else if ("scribe_target".equals(s)) {
            jsonNotificationAction.b = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonNotificationAction.c = qhe.T((String)null);
        }
    }
    
    public JsonNotificationAction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationAction jsonNotificationAction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationAction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationAction)o, yfe, b);
    }
}
