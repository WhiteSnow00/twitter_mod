// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationChannel$$JsonObjectMapper extends JsonMapper<JsonNotificationChannel>
{
    public static final zge JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER;
    public static final ahe JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER;
    
    static {
        JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER = new zge();
        JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER = new ahe();
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
        yfe.e("bypassDoNotDisturb", jsonNotificationChannel.d);
        yfe.u0("channelGroup", jsonNotificationChannel.l);
        ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).serialize((Object)jsonNotificationChannel.c, "channelImportance", true, yfe);
        yfe.e("hasCustomSound", jsonNotificationChannel.f);
        yfe.e("isBadgeEnabled", jsonNotificationChannel.k);
        yfe.e("isChannelEnabled", jsonNotificationChannel.b);
        yfe.e("isVibrationEnabled", jsonNotificationChannel.j);
        yfe.T("lightColor", jsonNotificationChannel.h);
        yfe.e("lightsEnabled", jsonNotificationChannel.g);
        ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER).serialize((Object)jsonNotificationChannel.e, "lockScreenVisibility", true, yfe);
        yfe.u0("name", jsonNotificationChannel.a);
        final long[] i = jsonNotificationChannel.i;
        if (i != null) {
            yfe.i("vibration");
            yfe.q0();
            for (int length = i.length, j = 0; j < length; ++j) {
                yfe.r(i[j]);
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationChannel jsonNotificationChannel, final String s, final qhe qhe) throws IOException {
        if ("bypassDoNotDisturb".equals(s)) {
            jsonNotificationChannel.d = qhe.l();
        }
        else if ("channelGroup".equals(s)) {
            jsonNotificationChannel.l = qhe.T((String)null);
        }
        else if ("channelImportance".equals(s)) {
            jsonNotificationChannel.c = (int)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("hasCustomSound".equals(s)) {
            jsonNotificationChannel.f = qhe.l();
        }
        else if ("isBadgeEnabled".equals(s)) {
            jsonNotificationChannel.k = qhe.l();
        }
        else if ("isChannelEnabled".equals(s)) {
            jsonNotificationChannel.b = qhe.l();
        }
        else if ("isVibrationEnabled".equals(s)) {
            jsonNotificationChannel.j = qhe.l();
        }
        else if ("lightColor".equals(s)) {
            jsonNotificationChannel.h = qhe.z();
        }
        else if ("lightsEnabled".equals(s)) {
            jsonNotificationChannel.g = qhe.l();
        }
        else if ("lockScreenVisibility".equals(s)) {
            jsonNotificationChannel.e = (int)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER).parse(qhe);
        }
        else if ("name".equals(s)) {
            jsonNotificationChannel.a = qhe.T((String)null);
        }
        else if ("vibration".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList list = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    list.add(qhe.L());
                }
                final long[] i = new long[list.size()];
                int n = 0;
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    i[n] = (long)iterator.next();
                    ++n;
                }
                jsonNotificationChannel.i = i;
            }
            else {
                jsonNotificationChannel.i = null;
            }
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
