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
    public static JsonPermissionReport _parse(final tge tge) throws IOException {
        final JsonPermissionReport jsonPermissionReport = new JsonPermissionReport();
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
            parseField(jsonPermissionReport, d, tge);
            tge.l0();
        }
        return jsonPermissionReport;
    }
    
    public static void _serialize(final JsonPermissionReport jsonPermissionReport, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final Map<String, JsonNotificationChannel> k = jsonPermissionReport.k;
        if (k != null) {
            afe.i("androidChannelSettings");
            afe.q0();
            for (final Map.Entry<String, JsonNotificationChannel> entry : k.entrySet()) {
                if (sde.e((String)entry.getKey(), afe, (Map.Entry)entry) == null) {
                    afe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonNotificationChannel$$JsonObjectMapper._serialize(entry.getValue(), afe, true);
                }
            }
            afe.h();
        }
        afe.t0("clientApplicationId", jsonPermissionReport.d);
        afe.t0("clientVersion", jsonPermissionReport.e);
        afe.t0("deviceId", jsonPermissionReport.b);
        if (jsonPermissionReport.i != null) {
            LoganSquare.typeConverterFor((Class)yfd.class).serialize((Object)jsonPermissionReport.i, "inAppPermissionState", true, afe);
        }
        final Map<String, String> j = jsonPermissionReport.j;
        if (j != null) {
            afe.i("metadata");
            afe.q0();
            for (final Map.Entry entry2 : j.entrySet()) {
                if (sde.e((String)entry2.getKey(), afe, (Map.Entry)entry2) == null) {
                    afe.j();
                }
                else {
                    afe.r0((String)entry2.getValue());
                }
            }
            afe.h();
        }
        afe.t0("osVersion", jsonPermissionReport.f);
        afe.t0("permissionName", jsonPermissionReport.c);
        if (jsonPermissionReport.h != null) {
            LoganSquare.typeConverterFor((Class)z5s.class).serialize((Object)jsonPermissionReport.h, "systemPermissionState", true, afe);
        }
        afe.t0("timestampInMs", jsonPermissionReport.g);
        afe.t0("userId", jsonPermissionReport.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonPermissionReport jsonPermissionReport, final String s, final tge tge) throws IOException {
        if ("androidChannelSettings".equals(s)) {
            if (tge.e() == vie.L0) {
                final HashMap k = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String j = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        k.put(j, null);
                    }
                    else {
                        k.put(j, JsonNotificationChannel$$JsonObjectMapper._parse(tge));
                    }
                }
                jsonPermissionReport.k = k;
            }
            else {
                jsonPermissionReport.k = null;
            }
        }
        else if ("clientApplicationId".equals(s)) {
            jsonPermissionReport.d = tge.T((String)null);
        }
        else if ("clientVersion".equals(s)) {
            jsonPermissionReport.e = tge.T((String)null);
        }
        else if ("deviceId".equals(s)) {
            jsonPermissionReport.b = tge.T((String)null);
        }
        else if ("inAppPermissionState".equals(s)) {
            jsonPermissionReport.i = (yfd)LoganSquare.typeConverterFor((Class)yfd.class).parse(tge);
        }
        else if ("metadata".equals(s)) {
            if (tge.e() == vie.L0) {
                final HashMap i = new HashMap();
                while (tge.h0() != vie.M0) {
                    final String l = tge.j();
                    tge.h0();
                    if (tge.e() == vie.V0) {
                        i.put(l, null);
                    }
                    else {
                        i.put(l, tge.T((String)null));
                    }
                }
                jsonPermissionReport.j = i;
            }
            else {
                jsonPermissionReport.j = null;
            }
        }
        else if ("osVersion".equals(s)) {
            jsonPermissionReport.f = tge.T((String)null);
        }
        else if ("permissionName".equals(s)) {
            jsonPermissionReport.c = tge.T((String)null);
        }
        else if ("systemPermissionState".equals(s)) {
            jsonPermissionReport.h = (z5s)LoganSquare.typeConverterFor((Class)z5s.class).parse(tge);
        }
        else if ("timestampInMs".equals(s)) {
            jsonPermissionReport.g = tge.T((String)null);
        }
        else if ("userId".equals(s)) {
            jsonPermissionReport.a = tge.T((String)null);
        }
    }
    
    public JsonPermissionReport parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonPermissionReport jsonPermissionReport, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPermissionReport, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonPermissionReport)o, afe, b);
    }
}
