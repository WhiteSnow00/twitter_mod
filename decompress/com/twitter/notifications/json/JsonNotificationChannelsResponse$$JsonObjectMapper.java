// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationChannelsResponse$$JsonObjectMapper extends JsonMapper<JsonNotificationChannelsResponse>
{
    public static JsonNotificationChannelsResponse _parse(final qhe qhe) throws IOException {
        final JsonNotificationChannelsResponse jsonNotificationChannelsResponse = new JsonNotificationChannelsResponse();
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
            parseField(jsonNotificationChannelsResponse, d, qhe);
            qhe.m0();
        }
        return jsonNotificationChannelsResponse;
    }
    
    public static void _serialize(final JsonNotificationChannelsResponse jsonNotificationChannelsResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList b2 = jsonNotificationChannelsResponse.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "channelList", b2);
            while (e.hasNext()) {
                final kqi kqi = e.next();
                if (kqi != null) {
                    LoganSquare.typeConverterFor((Class)kqi.class).serialize((Object)kqi, "lslocalchannelListElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (jsonNotificationChannelsResponse.a != null) {
            LoganSquare.typeConverterFor((Class)mqi.class).serialize((Object)jsonNotificationChannelsResponse.a, "group", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationChannelsResponse jsonNotificationChannelsResponse, final String s, final qhe qhe) throws IOException {
        if ("channelList".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final kqi kqi = (kqi)LoganSquare.typeConverterFor((Class)kqi.class).parse(qhe);
                    if (kqi != null) {
                        b.add(kqi);
                    }
                }
                jsonNotificationChannelsResponse.b = b;
            }
            else {
                jsonNotificationChannelsResponse.b = null;
            }
        }
        else if ("group".equals(s)) {
            jsonNotificationChannelsResponse.a = (mqi)LoganSquare.typeConverterFor((Class)mqi.class).parse(qhe);
        }
    }
    
    public JsonNotificationChannelsResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationChannelsResponse jsonNotificationChannelsResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationChannelsResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationChannelsResponse)o, yfe, b);
    }
}
