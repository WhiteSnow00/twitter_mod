// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$UserContainer$$JsonObjectMapper extends JsonMapper<JsonNotification.UserContainer>
{
    public static JsonNotification.UserContainer _parse(final qhe qhe) throws IOException {
        final JsonNotification.UserContainer userContainer = new JsonNotification.UserContainer();
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
            parseField(userContainer, d, qhe);
            qhe.m0();
        }
        return userContainer;
    }
    
    public static void _serialize(final JsonNotification.UserContainer userContainer, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (userContainer.a != null) {
            yfe.i("user");
            JsonNotificationUserContainer$$JsonObjectMapper._serialize(userContainer.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.UserContainer userContainer, final String s, final qhe qhe) throws IOException {
        if ("user".equals(s)) {
            userContainer.a = JsonNotificationUserContainer$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNotification.UserContainer parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.UserContainer userContainer, final yfe yfe, final boolean b) throws IOException {
        _serialize(userContainer, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.UserContainer)o, yfe, b);
    }
}
