// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPayloadBadgeCount$$JsonObjectMapper extends JsonMapper<JsonPayloadBadgeCount>
{
    public static JsonPayloadBadgeCount _parse(final qhe qhe) throws IOException {
        final JsonPayloadBadgeCount jsonPayloadBadgeCount = new JsonPayloadBadgeCount();
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
            parseField(jsonPayloadBadgeCount, d, qhe);
            qhe.m0();
        }
        return jsonPayloadBadgeCount;
    }
    
    public static void _serialize(final JsonPayloadBadgeCount jsonPayloadBadgeCount, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("dm", (int)jsonPayloadBadgeCount.c);
        yfe.T("app_icon", (int)jsonPayloadBadgeCount.a);
        yfe.T("ntab", (int)jsonPayloadBadgeCount.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPayloadBadgeCount jsonPayloadBadgeCount, final String s, final qhe qhe) throws IOException {
        final boolean equals = "dm".equals(s);
        final Integer n = null;
        final Integer n2 = null;
        final Integer n3 = null;
        if (equals) {
            Integer value;
            if (qhe.e() == rje.X0) {
                value = n3;
            }
            else {
                value = qhe.z();
            }
            jsonPayloadBadgeCount.c = value;
        }
        else if ("app_icon".equals(s)) {
            Integer value2;
            if (qhe.e() == rje.X0) {
                value2 = n;
            }
            else {
                value2 = qhe.z();
            }
            jsonPayloadBadgeCount.a = value2;
        }
        else if ("ntab".equals(s)) {
            Integer value3;
            if (qhe.e() == rje.X0) {
                value3 = n2;
            }
            else {
                value3 = qhe.z();
            }
            jsonPayloadBadgeCount.b = value3;
        }
    }
    
    public JsonPayloadBadgeCount parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPayloadBadgeCount jsonPayloadBadgeCount, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPayloadBadgeCount, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPayloadBadgeCount)o, yfe, b);
    }
}
