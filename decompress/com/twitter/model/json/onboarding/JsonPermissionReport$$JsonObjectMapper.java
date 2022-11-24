// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.HashMap;
import java.util.Iterator;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPermissionReport$$JsonObjectMapper extends JsonMapper<JsonPermissionReport>
{
    public static JsonPermissionReport _parse(final qhe qhe) throws IOException {
        final JsonPermissionReport jsonPermissionReport = new JsonPermissionReport();
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
            parseField(jsonPermissionReport, d, qhe);
            qhe.m0();
        }
        return jsonPermissionReport;
    }
    
    public static void _serialize(final JsonPermissionReport jsonPermissionReport, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final Map<String, JsonNotificationChannel> k = jsonPermissionReport.k;
        if (k != null) {
            yfe.i("androidChannelSettings");
            yfe.r0();
            for (final Map.Entry<String, JsonNotificationChannel> entry : k.entrySet()) {
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonNotificationChannel$$JsonObjectMapper._serialize(entry.getValue(), yfe, true);
                }
            }
            yfe.h();
        }
        yfe.u0("clientApplicationId", jsonPermissionReport.d);
        yfe.u0("clientVersion", jsonPermissionReport.e);
        yfe.u0("deviceId", jsonPermissionReport.b);
        if (jsonPermissionReport.i != null) {
            LoganSquare.typeConverterFor((Class)ygd.class).serialize((Object)jsonPermissionReport.i, "inAppPermissionState", true, yfe);
        }
        final Map<String, String> j = jsonPermissionReport.j;
        if (j != null) {
            yfe.i("metadata");
            yfe.r0();
            for (final Map.Entry entry2 : j.entrySet()) {
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry2.getValue());
                }
            }
            yfe.h();
        }
        yfe.u0("osVersion", jsonPermissionReport.f);
        yfe.u0("permissionName", jsonPermissionReport.c);
        if (jsonPermissionReport.h != null) {
            LoganSquare.typeConverterFor((Class)t6s.class).serialize((Object)jsonPermissionReport.h, "systemPermissionState", true, yfe);
        }
        yfe.u0("timestampInMs", jsonPermissionReport.g);
        yfe.u0("userId", jsonPermissionReport.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPermissionReport jsonPermissionReport, final String s, final qhe qhe) throws IOException {
        if ("androidChannelSettings".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap k = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        k.put(j, null);
                    }
                    else {
                        k.put(j, JsonNotificationChannel$$JsonObjectMapper._parse(qhe));
                    }
                }
                jsonPermissionReport.k = k;
            }
            else {
                jsonPermissionReport.k = null;
            }
        }
        else if ("clientApplicationId".equals(s)) {
            jsonPermissionReport.d = qhe.T((String)null);
        }
        else if ("clientVersion".equals(s)) {
            jsonPermissionReport.e = qhe.T((String)null);
        }
        else if ("deviceId".equals(s)) {
            jsonPermissionReport.b = qhe.T((String)null);
        }
        else if ("inAppPermissionState".equals(s)) {
            jsonPermissionReport.i = (ygd)LoganSquare.typeConverterFor((Class)ygd.class).parse(qhe);
        }
        else if ("metadata".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap i = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String l = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        i.put(l, null);
                    }
                    else {
                        i.put(l, qhe.T((String)null));
                    }
                }
                jsonPermissionReport.j = i;
            }
            else {
                jsonPermissionReport.j = null;
            }
        }
        else if ("osVersion".equals(s)) {
            jsonPermissionReport.f = qhe.T((String)null);
        }
        else if ("permissionName".equals(s)) {
            jsonPermissionReport.c = qhe.T((String)null);
        }
        else if ("systemPermissionState".equals(s)) {
            jsonPermissionReport.h = (t6s)LoganSquare.typeConverterFor((Class)t6s.class).parse(qhe);
        }
        else if ("timestampInMs".equals(s)) {
            jsonPermissionReport.g = qhe.T((String)null);
        }
        else if ("userId".equals(s)) {
            jsonPermissionReport.a = qhe.T((String)null);
        }
    }
    
    public JsonPermissionReport parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPermissionReport jsonPermissionReport, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPermissionReport, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPermissionReport)o, yfe, b);
    }
}
