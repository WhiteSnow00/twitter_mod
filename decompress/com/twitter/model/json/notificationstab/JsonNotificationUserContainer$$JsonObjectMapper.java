// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationUserContainer$$JsonObjectMapper extends JsonMapper<JsonNotificationUserContainer>
{
    public static JsonNotificationUserContainer _parse(final qhe qhe) throws IOException {
        final JsonNotificationUserContainer jsonNotificationUserContainer = new JsonNotificationUserContainer();
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
            parseField(jsonNotificationUserContainer, d, qhe);
            qhe.m0();
        }
        return jsonNotificationUserContainer;
    }
    
    public static void _serialize(final JsonNotificationUserContainer jsonNotificationUserContainer, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("id", jsonNotificationUserContainer.a);
        yfe.u0("reactionType", jsonNotificationUserContainer.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationUserContainer jsonNotificationUserContainer, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonNotificationUserContainer.a = qhe.L();
        }
        else if ("reactionType".equals(s)) {
            jsonNotificationUserContainer.b = qhe.T((String)null);
        }
    }
    
    public JsonNotificationUserContainer parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationUserContainer jsonNotificationUserContainer, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationUserContainer, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationUserContainer)o, yfe, b);
    }
}
