// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserDevicesRequest$$JsonObjectMapper extends JsonMapper<JsonUserDevicesRequest>
{
    public static JsonUserDevicesRequest _parse(final qhe qhe) throws IOException {
        final JsonUserDevicesRequest jsonUserDevicesRequest = new JsonUserDevicesRequest();
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
            parseField(jsonUserDevicesRequest, d, qhe);
            qhe.m0();
        }
        return jsonUserDevicesRequest;
    }
    
    public static void _serialize(final JsonUserDevicesRequest jsonUserDevicesRequest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("checksum", jsonUserDevicesRequest.e);
        yfe.T("env", jsonUserDevicesRequest.d);
        yfe.u0("locale", jsonUserDevicesRequest.c);
        yfe.u0("os_version", jsonUserDevicesRequest.g);
        yfe.T("protocol_version", jsonUserDevicesRequest.f);
        final Map<String, String> h = jsonUserDevicesRequest.h;
        if (h != null) {
            yfe.i("settings");
            yfe.r0();
            for (final Map.Entry entry : h.entrySet()) {
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry.getValue());
                }
            }
            yfe.h();
        }
        yfe.u0("token", jsonUserDevicesRequest.b);
        yfe.u0("udid", jsonUserDevicesRequest.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserDevicesRequest jsonUserDevicesRequest, String j, final qhe qhe) throws IOException {
        if ("checksum".equals(j)) {
            jsonUserDevicesRequest.e = qhe.T((String)null);
        }
        else if ("env".equals(j)) {
            jsonUserDevicesRequest.d = qhe.z();
        }
        else if ("locale".equals(j)) {
            jsonUserDevicesRequest.c = qhe.T((String)null);
        }
        else if ("os_version".equals(j)) {
            jsonUserDevicesRequest.g = qhe.T((String)null);
        }
        else if ("protocol_version".equals(j)) {
            jsonUserDevicesRequest.f = qhe.z();
        }
        else if ("settings".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap h = new HashMap();
                while (qhe.i0() != rje.O0) {
                    j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        h.put(j, null);
                    }
                    else {
                        h.put(j, qhe.T((String)null));
                    }
                }
                jsonUserDevicesRequest.h = h;
            }
            else {
                jsonUserDevicesRequest.h = null;
            }
        }
        else if ("token".equals(j)) {
            jsonUserDevicesRequest.b = qhe.T((String)null);
        }
        else if ("udid".equals(j)) {
            jsonUserDevicesRequest.a = qhe.T((String)null);
        }
    }
    
    public JsonUserDevicesRequest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserDevicesRequest jsonUserDevicesRequest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserDevicesRequest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserDevicesRequest)o, yfe, b);
    }
}
