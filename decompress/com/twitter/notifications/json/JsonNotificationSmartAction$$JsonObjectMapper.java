// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSmartAction$$JsonObjectMapper extends JsonMapper<JsonNotificationSmartAction>
{
    public static JsonNotificationSmartAction _parse(final qhe qhe) throws IOException {
        final JsonNotificationSmartAction jsonNotificationSmartAction = new JsonNotificationSmartAction();
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
            parseField(jsonNotificationSmartAction, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSmartAction;
    }
    
    public static void _serialize(final JsonNotificationSmartAction jsonNotificationSmartAction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNotificationSmartAction.b != null) {
            LoganSquare.typeConverterFor((Class)xvi.class).serialize((Object)jsonNotificationSmartAction.b, "action_details", true, yfe);
        }
        yfe.u0("notification_action", jsonNotificationSmartAction.a);
        yfe.u0("score", jsonNotificationSmartAction.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSmartAction jsonNotificationSmartAction, final String s, final qhe qhe) throws IOException {
        if ("action_details".equals(s)) {
            jsonNotificationSmartAction.b = (xvi)LoganSquare.typeConverterFor((Class)xvi.class).parse(qhe);
        }
        else if ("notification_action".equals(s)) {
            jsonNotificationSmartAction.a = qhe.T((String)null);
        }
        else if ("score".equals(s)) {
            jsonNotificationSmartAction.c = qhe.T((String)null);
        }
    }
    
    public JsonNotificationSmartAction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSmartAction jsonNotificationSmartAction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSmartAction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSmartAction)o, yfe, b);
    }
}
