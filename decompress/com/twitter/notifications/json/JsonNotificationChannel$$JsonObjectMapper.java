// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationChannel$$JsonObjectMapper extends JsonMapper<JsonNotificationChannel>
{
    public static final yge JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER;
    public static final bhe JSON_NOTIFICATION_CHANNEL_SOUND_CONVERTER;
    
    static {
        JSON_NOTIFICATION_CHANNEL_SOUND_CONVERTER = new bhe();
        JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER = new yge();
    }
    
    public static JsonNotificationChannel _parse(final qhe qhe) throws IOException {
        final JsonNotificationChannel jsonNotificationChannel = new JsonNotificationChannel();
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
            parseField(jsonNotificationChannel, d, qhe);
            qhe.m0();
        }
        return jsonNotificationChannel;
    }
    
    public static void _serialize(final JsonNotificationChannel jsonNotificationChannel, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonNotificationChannel.d);
        yfe.u0("id", jsonNotificationChannel.a);
        ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).serialize((Object)jsonNotificationChannel.c, "importance", true, yfe);
        yfe.e("lights", jsonNotificationChannel.e);
        yfe.u0("name", jsonNotificationChannel.b);
        final nqi g = jsonNotificationChannel.g;
        if (g != null) {
            ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_SOUND_CONVERTER).serialize((Object)g, "sound", true, yfe);
        }
        yfe.e("vibrate", jsonNotificationChannel.f);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationChannel jsonNotificationChannel, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonNotificationChannel.d = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonNotificationChannel.a = qhe.T((String)null);
        }
        else if ("importance".equals(s)) {
            jsonNotificationChannel.c = (int)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("lights".equals(s)) {
            jsonNotificationChannel.e = qhe.l();
        }
        else if ("name".equals(s)) {
            jsonNotificationChannel.b = qhe.T((String)null);
        }
        else if ("sound".equals(s)) {
            jsonNotificationChannel.g = (nqi)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_SOUND_CONVERTER).parse(qhe);
        }
        else if ("vibrate".equals(s)) {
            jsonNotificationChannel.f = qhe.l();
        }
    }
    
    public JsonNotificationChannel parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationChannel jsonNotificationChannel, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationChannel, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationChannel)o, yfe, b);
    }
}
