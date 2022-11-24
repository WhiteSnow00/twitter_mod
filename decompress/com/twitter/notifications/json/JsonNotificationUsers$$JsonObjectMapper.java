// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationUsers$$JsonObjectMapper extends JsonMapper<JsonNotificationUsers>
{
    public static JsonNotificationUsers _parse(final qhe qhe) throws IOException {
        final JsonNotificationUsers jsonNotificationUsers = new JsonNotificationUsers();
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
            parseField(jsonNotificationUsers, d, qhe);
            qhe.m0();
        }
        return jsonNotificationUsers;
    }
    
    public static void _serialize(final JsonNotificationUsers jsonNotificationUsers, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList d = jsonNotificationUsers.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "context", d);
            while (e.hasNext()) {
                final ori ori = e.next();
                if (ori != null) {
                    LoganSquare.typeConverterFor((Class)ori.class).serialize((Object)ori, "lslocalcontextElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (jsonNotificationUsers.c != null) {
            LoganSquare.typeConverterFor((Class)dwi.class).serialize((Object)jsonNotificationUsers.c, "original_sender", true, yfe);
        }
        if (jsonNotificationUsers.a != null) {
            LoganSquare.typeConverterFor((Class)dwi.class).serialize((Object)jsonNotificationUsers.a, "recipient", true, yfe);
        }
        if (jsonNotificationUsers.b != null) {
            LoganSquare.typeConverterFor((Class)dwi.class).serialize((Object)jsonNotificationUsers.b, "sender", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationUsers jsonNotificationUsers, final String s, final qhe qhe) throws IOException {
        if ("context".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ori ori = (ori)LoganSquare.typeConverterFor((Class)ori.class).parse(qhe);
                    if (ori != null) {
                        d.add(ori);
                    }
                }
                jsonNotificationUsers.d = d;
            }
            else {
                jsonNotificationUsers.d = null;
            }
        }
        else if ("original_sender".equals(s)) {
            jsonNotificationUsers.c = (dwi)LoganSquare.typeConverterFor((Class)dwi.class).parse(qhe);
        }
        else if ("recipient".equals(s)) {
            jsonNotificationUsers.a = (dwi)LoganSquare.typeConverterFor((Class)dwi.class).parse(qhe);
        }
        else if ("sender".equals(s)) {
            jsonNotificationUsers.b = (dwi)LoganSquare.typeConverterFor((Class)dwi.class).parse(qhe);
        }
    }
    
    public JsonNotificationUsers parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationUsers jsonNotificationUsers, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationUsers, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationUsers)o, yfe, b);
    }
}
