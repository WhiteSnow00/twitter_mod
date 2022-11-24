// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnreadCountResponse$$JsonObjectMapper extends JsonMapper<JsonUnreadCountResponse>
{
    public static JsonUnreadCountResponse _parse(final qhe qhe) throws IOException {
        final JsonUnreadCountResponse jsonUnreadCountResponse = new JsonUnreadCountResponse();
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
            parseField(jsonUnreadCountResponse, d, qhe);
            qhe.m0();
        }
        return jsonUnreadCountResponse;
    }
    
    public static void _serialize(final JsonUnreadCountResponse jsonUnreadCountResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("dm_unread_count", jsonUnreadCountResponse.b);
        yfe.T("ntab_unread_count", jsonUnreadCountResponse.a);
        yfe.T("total_unread_count", jsonUnreadCountResponse.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUnreadCountResponse jsonUnreadCountResponse, final String s, final qhe qhe) throws IOException {
        if ("dm_unread_count".equals(s)) {
            jsonUnreadCountResponse.b = qhe.z();
        }
        else if ("ntab_unread_count".equals(s)) {
            jsonUnreadCountResponse.a = qhe.z();
        }
        else if ("total_unread_count".equals(s)) {
            jsonUnreadCountResponse.c = qhe.z();
        }
    }
    
    public JsonUnreadCountResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUnreadCountResponse jsonUnreadCountResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUnreadCountResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUnreadCountResponse)o, yfe, b);
    }
}
