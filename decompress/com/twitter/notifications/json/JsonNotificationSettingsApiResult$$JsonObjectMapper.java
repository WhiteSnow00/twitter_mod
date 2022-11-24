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

public final class JsonNotificationSettingsApiResult$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsApiResult>
{
    public static JsonNotificationSettingsApiResult _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsApiResult jsonNotificationSettingsApiResult = new JsonNotificationSettingsApiResult();
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
            parseField(jsonNotificationSettingsApiResult, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingsApiResult;
    }
    
    public static void _serialize(final JsonNotificationSettingsApiResult jsonNotificationSettingsApiResult, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("_code", jsonNotificationSettingsApiResult.d);
        final ArrayList c = jsonNotificationSettingsApiResult.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "_result", c);
            while (e.hasNext()) {
                final JsonNotificationSettingsApiResult.ResultInfo resultInfo = e.next();
                if (resultInfo != null) {
                    JsonNotificationSettingsApiResult$ResultInfo$$JsonObjectMapper._serialize(resultInfo, yfe, true);
                }
            }
            yfe.f();
        }
        final HashMap a = jsonNotificationSettingsApiResult.a;
        if (a != null) {
            final Iterator a2 = af.A(yfe, "_smsSettings", a);
            while (a2.hasNext()) {
                final Map.Entry entry = a2.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry.getValue());
                }
            }
            yfe.h();
        }
        final HashMap b2 = jsonNotificationSettingsApiResult.b;
        if (b2 != null) {
            final Iterator a3 = af.A(yfe, "_smsSettingsTemplate", b2);
            while (a3.hasNext()) {
                final Map.Entry<String, JsonNotificationSettingsTemplate> entry2 = a3.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    JsonNotificationSettingsTemplate$$JsonObjectMapper._serialize(entry2.getValue(), yfe, true);
                }
            }
            yfe.h();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsApiResult jsonNotificationSettingsApiResult, final String s, final qhe qhe) throws IOException {
        if ("_code".equals(s)) {
            jsonNotificationSettingsApiResult.d = qhe.z();
        }
        else if ("_result".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonNotificationSettingsApiResult.ResultInfo parse = JsonNotificationSettingsApiResult$ResultInfo$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonNotificationSettingsApiResult.c = c;
            }
            else {
                jsonNotificationSettingsApiResult.c = null;
            }
        }
        else if ("_smsSettings".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap a = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        a.put(j, null);
                    }
                    else {
                        a.put(j, qhe.T((String)null));
                    }
                }
                jsonNotificationSettingsApiResult.a = a;
            }
            else {
                jsonNotificationSettingsApiResult.a = null;
            }
        }
        else if ("_smsSettingsTemplate".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap b = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String i = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        b.put(i, null);
                    }
                    else {
                        b.put(i, JsonNotificationSettingsTemplate$$JsonObjectMapper._parse(qhe));
                    }
                }
                jsonNotificationSettingsApiResult.b = b;
            }
            else {
                jsonNotificationSettingsApiResult.b = null;
            }
        }
    }
    
    public JsonNotificationSettingsApiResult parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsApiResult jsonNotificationSettingsApiResult, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingsApiResult, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsApiResult)o, yfe, b);
    }
}
