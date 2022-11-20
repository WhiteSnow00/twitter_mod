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
    public static final cge JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER;
    public static final dge JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER;
    
    static {
        JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER = new cge();
        JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER = new dge();
    }
    
    public static JsonNotificationChannel _parse(final tge tge) throws IOException {
        final JsonNotificationChannel jsonNotificationChannel = new JsonNotificationChannel();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonNotificationChannel, d, tge);
            tge.l0();
        }
        return jsonNotificationChannel;
    }
    
    public static void _serialize(final JsonNotificationChannel jsonNotificationChannel, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("bypassDoNotDisturb", jsonNotificationChannel.d);
        afe.t0("channelGroup", jsonNotificationChannel.l);
        ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).serialize((Object)jsonNotificationChannel.c, "channelImportance", true, afe);
        afe.e("hasCustomSound", jsonNotificationChannel.f);
        afe.e("isBadgeEnabled", jsonNotificationChannel.k);
        afe.e("isChannelEnabled", jsonNotificationChannel.b);
        afe.e("isVibrationEnabled", jsonNotificationChannel.j);
        afe.T("lightColor", jsonNotificationChannel.h);
        afe.e("lightsEnabled", jsonNotificationChannel.g);
        ((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER).serialize((Object)jsonNotificationChannel.e, "lockScreenVisibility", true, afe);
        afe.t0("name", jsonNotificationChannel.a);
        final long[] i = jsonNotificationChannel.i;
        if (i != null) {
            afe.i("vibration");
            afe.p0();
            for (int length = i.length, j = 0; j < length; ++j) {
                afe.q(i[j]);
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonNotificationChannel jsonNotificationChannel, final String s, final tge tge) throws IOException {
        if ("bypassDoNotDisturb".equals(s)) {
            jsonNotificationChannel.d = tge.k();
        }
        else if ("channelGroup".equals(s)) {
            jsonNotificationChannel.l = tge.T((String)null);
        }
        else if ("channelImportance".equals(s)) {
            jsonNotificationChannel.c = (int)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_IMPORTANCE_TYPE_CONVERTER).parse(tge);
        }
        else if ("hasCustomSound".equals(s)) {
            jsonNotificationChannel.f = tge.k();
        }
        else if ("isBadgeEnabled".equals(s)) {
            jsonNotificationChannel.k = tge.k();
        }
        else if ("isChannelEnabled".equals(s)) {
            jsonNotificationChannel.b = tge.k();
        }
        else if ("isVibrationEnabled".equals(s)) {
            jsonNotificationChannel.j = tge.k();
        }
        else if ("lightColor".equals(s)) {
            jsonNotificationChannel.h = tge.y();
        }
        else if ("lightsEnabled".equals(s)) {
            jsonNotificationChannel.g = tge.k();
        }
        else if ("lockScreenVisibility".equals(s)) {
            jsonNotificationChannel.e = (int)((StringBasedTypeConverter)JsonNotificationChannel$$JsonObjectMapper.JSON_NOTIFICATION_CHANNEL_LOCK_SCREEN_CONVERTER).parse(tge);
        }
        else if ("name".equals(s)) {
            jsonNotificationChannel.a = tge.T((String)null);
        }
        else if ("vibration".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list = new ArrayList();
                while (tge.h0() != vie.O0) {
                    list.add(tge.K());
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
    
    public JsonNotificationChannel parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonNotificationChannel jsonNotificationChannel, final afe afe, final boolean b) throws IOException {
        _serialize(jsonNotificationChannel, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonNotificationChannel)o, afe, b);
    }
}
