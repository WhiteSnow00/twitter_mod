// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackLimits$$JsonObjectMapper extends JsonMapper<JsonOpenbackLimits>
{
    public static JsonOpenbackLimits _parse(final qhe qhe) throws IOException {
        final JsonOpenbackLimits jsonOpenbackLimits = new JsonOpenbackLimits();
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
            parseField(jsonOpenbackLimits, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackLimits;
    }
    
    public static void _serialize(final JsonOpenbackLimits jsonOpenbackLimits, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("clickInterval", jsonOpenbackLimits.d);
        yfe.W("clicks", jsonOpenbackLimits.c);
        yfe.W("dismissInterval", jsonOpenbackLimits.f);
        yfe.W("dismisses", jsonOpenbackLimits.e);
        yfe.W("displayInterval", jsonOpenbackLimits.b);
        yfe.W("displays", jsonOpenbackLimits.a);
        yfe.e("ignoreGlobalLimits", jsonOpenbackLimits.j);
        yfe.e("ignoreNightTime", jsonOpenbackLimits.i);
        yfe.W("interactionInterval", jsonOpenbackLimits.h);
        yfe.W("interactions", jsonOpenbackLimits.g);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackLimits jsonOpenbackLimits, final String s, final qhe qhe) throws IOException {
        if ("clickInterval".equals(s)) {
            jsonOpenbackLimits.d = qhe.L();
        }
        else if ("clicks".equals(s)) {
            jsonOpenbackLimits.c = qhe.L();
        }
        else if ("dismissInterval".equals(s)) {
            jsonOpenbackLimits.f = qhe.L();
        }
        else if ("dismisses".equals(s)) {
            jsonOpenbackLimits.e = qhe.L();
        }
        else if ("displayInterval".equals(s)) {
            jsonOpenbackLimits.b = qhe.L();
        }
        else if ("displays".equals(s)) {
            jsonOpenbackLimits.a = qhe.L();
        }
        else if ("ignoreGlobalLimits".equals(s)) {
            jsonOpenbackLimits.j = qhe.l();
        }
        else if ("ignoreNightTime".equals(s)) {
            jsonOpenbackLimits.i = qhe.l();
        }
        else if ("interactionInterval".equals(s)) {
            jsonOpenbackLimits.h = qhe.L();
        }
        else if ("interactions".equals(s)) {
            jsonOpenbackLimits.g = qhe.L();
        }
    }
    
    public JsonOpenbackLimits parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackLimits jsonOpenbackLimits, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackLimits, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackLimits)o, yfe, b);
    }
}
