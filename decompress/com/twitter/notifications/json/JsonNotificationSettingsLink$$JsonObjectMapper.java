// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsLink$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsLink>
{
    public static JsonNotificationSettingsLink _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsLink jsonNotificationSettingsLink = new JsonNotificationSettingsLink();
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
            parseField(jsonNotificationSettingsLink, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingsLink;
    }
    
    public static void _serialize(final JsonNotificationSettingsLink jsonNotificationSettingsLink, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("scribe_component", jsonNotificationSettingsLink.d);
        yfe.u0("text", jsonNotificationSettingsLink.a);
        yfe.u0("type", jsonNotificationSettingsLink.b);
        yfe.u0("uri", jsonNotificationSettingsLink.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsLink jsonNotificationSettingsLink, final String s, final qhe qhe) throws IOException {
        if ("scribe_component".equals(s)) {
            jsonNotificationSettingsLink.d = qhe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonNotificationSettingsLink.a = qhe.T((String)null);
        }
        else if ("type".equals(s)) {
            jsonNotificationSettingsLink.b = qhe.T((String)null);
        }
        else if ("uri".equals(s)) {
            jsonNotificationSettingsLink.c = qhe.T((String)null);
        }
    }
    
    public JsonNotificationSettingsLink parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsLink jsonNotificationSettingsLink, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingsLink, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsLink)o, yfe, b);
    }
}
