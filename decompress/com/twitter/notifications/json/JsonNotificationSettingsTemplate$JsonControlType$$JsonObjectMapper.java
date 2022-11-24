// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsTemplate$JsonControlType$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsTemplate.JsonControlType>
{
    public static JsonNotificationSettingsTemplate.JsonControlType _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsTemplate.JsonControlType jsonControlType = new JsonNotificationSettingsTemplate.JsonControlType();
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
            parseField(jsonControlType, d, qhe);
            qhe.m0();
        }
        return jsonControlType;
    }
    
    public static void _serialize(final JsonNotificationSettingsTemplate.JsonControlType jsonControlType, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("default", jsonControlType.a);
        final ArrayList b2 = jsonControlType.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "values", b2);
            while (e.hasNext()) {
                final Map map = e.next();
                if (map != null) {
                    yfe.r0();
                    for (final Map.Entry<String, V> entry : map.entrySet()) {
                        if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                            yfe.j();
                        }
                        else {
                            yfe.s0((String)entry.getValue());
                        }
                    }
                    yfe.h();
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsTemplate.JsonControlType jsonControlType, String j, final qhe qhe) throws IOException {
        if ("default".equals(j)) {
            jsonControlType.a = qhe.T((String)null);
        }
        else if ("values".equals(j)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o;
                    if (qhe.e() == rje.N0) {
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        while (true) {
                            o = hashMap;
                            if (qhe.i0() == rje.O0) {
                                break;
                            }
                            j = qhe.j();
                            qhe.i0();
                            if (qhe.e() == rje.X0) {
                                hashMap.put(j, null);
                            }
                            else {
                                hashMap.put(j, qhe.T((String)null));
                            }
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        b.add(o);
                    }
                }
                jsonControlType.b = b;
            }
            else {
                jsonControlType.b = null;
            }
        }
    }
    
    public JsonNotificationSettingsTemplate.JsonControlType parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsTemplate.JsonControlType jsonControlType, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonControlType, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsTemplate.JsonControlType)o, yfe, b);
    }
}
