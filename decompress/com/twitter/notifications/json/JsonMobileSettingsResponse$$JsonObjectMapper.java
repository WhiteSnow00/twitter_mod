// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.HashMap;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileSettingsResponse$$JsonObjectMapper extends JsonMapper<JsonMobileSettingsResponse>
{
    public static JsonMobileSettingsResponse _parse(final qhe qhe) throws IOException {
        final JsonMobileSettingsResponse jsonMobileSettingsResponse = new JsonMobileSettingsResponse();
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
            parseField(jsonMobileSettingsResponse, d, qhe);
            qhe.m0();
        }
        return jsonMobileSettingsResponse;
    }
    
    public static void _serialize(final JsonMobileSettingsResponse jsonMobileSettingsResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("checkin_time", (long)jsonMobileSettingsResponse.f);
        yfe.u0("method", jsonMobileSettingsResponse.a);
        final HashMap d = jsonMobileSettingsResponse.d;
        if (d != null) {
            final Iterator a = af.A(yfe, "push_settings", d);
            while (a.hasNext()) {
                final Map.Entry entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry.getValue());
                }
            }
            yfe.h();
        }
        if (jsonMobileSettingsResponse.b != null) {
            LoganSquare.typeConverterFor((Class)jrp.class).serialize((Object)jsonMobileSettingsResponse.b, "push_settings_template", true, yfe);
        }
        if (jsonMobileSettingsResponse.g != null) {
            LoganSquare.typeConverterFor((Class)khe.class).serialize((Object)jsonMobileSettingsResponse.g, "sms_device_available", true, yfe);
        }
        final HashMap e = jsonMobileSettingsResponse.e;
        if (e != null) {
            final Iterator a2 = af.A(yfe, "sms_settings", e);
            while (a2.hasNext()) {
                final Map.Entry entry2 = a2.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry2.getValue());
                }
            }
            yfe.h();
        }
        if (jsonMobileSettingsResponse.c != null) {
            LoganSquare.typeConverterFor((Class)jrp.class).serialize((Object)jsonMobileSettingsResponse.c, "sms_settings_template", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMobileSettingsResponse jsonMobileSettingsResponse, String j, final qhe qhe) throws IOException {
        final boolean equals = "checkin_time".equals(j);
        final Long n = null;
        if (equals) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = n;
            }
            else {
                value = qhe.L();
            }
            jsonMobileSettingsResponse.f = value;
        }
        else if ("method".equals(j)) {
            jsonMobileSettingsResponse.a = qhe.T((String)null);
        }
        else if ("push_settings".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap d = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String i = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        d.put(i, null);
                    }
                    else {
                        d.put(i, qhe.T((String)null));
                    }
                }
                jsonMobileSettingsResponse.d = d;
            }
            else {
                jsonMobileSettingsResponse.d = null;
            }
        }
        else if ("push_settings_template".equals(j)) {
            jsonMobileSettingsResponse.b = (jrp)LoganSquare.typeConverterFor((Class)jrp.class).parse(qhe);
        }
        else if ("sms_device_available".equals(j)) {
            jsonMobileSettingsResponse.g = (khe)LoganSquare.typeConverterFor((Class)khe.class).parse(qhe);
        }
        else if ("sms_settings".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap e = new HashMap();
                while (qhe.i0() != rje.O0) {
                    j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        e.put(j, null);
                    }
                    else {
                        e.put(j, qhe.T((String)null));
                    }
                }
                jsonMobileSettingsResponse.e = e;
            }
            else {
                jsonMobileSettingsResponse.e = null;
            }
        }
        else if ("sms_settings_template".equals(j)) {
            jsonMobileSettingsResponse.c = (jrp)LoganSquare.typeConverterFor((Class)jrp.class).parse(qhe);
        }
    }
    
    public JsonMobileSettingsResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMobileSettingsResponse jsonMobileSettingsResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMobileSettingsResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMobileSettingsResponse)o, yfe, b);
    }
}
