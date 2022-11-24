// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCtaSuffix$$JsonObjectMapper extends JsonMapper<JsonCtaSuffix>
{
    public static JsonCtaSuffix _parse(final qhe qhe) throws IOException {
        final JsonCtaSuffix jsonCtaSuffix = new JsonCtaSuffix();
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
            parseField(jsonCtaSuffix, d, qhe);
            qhe.m0();
        }
        return jsonCtaSuffix;
    }
    
    public static void _serialize(final JsonCtaSuffix jsonCtaSuffix, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("color_compact", jsonCtaSuffix.b);
        yfe.u0("color_expanded", jsonCtaSuffix.d);
        yfe.u0("copy_compact", jsonCtaSuffix.a);
        yfe.u0("copy_expanded", jsonCtaSuffix.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCtaSuffix jsonCtaSuffix, final String s, final qhe qhe) throws IOException {
        if ("color_compact".equals(s)) {
            jsonCtaSuffix.b = qhe.T((String)null);
        }
        else if ("color_expanded".equals(s)) {
            jsonCtaSuffix.d = qhe.T((String)null);
        }
        else if ("copy_compact".equals(s)) {
            jsonCtaSuffix.a = qhe.T((String)null);
        }
        else if ("copy_expanded".equals(s)) {
            jsonCtaSuffix.c = qhe.T((String)null);
        }
    }
    
    public JsonCtaSuffix parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCtaSuffix jsonCtaSuffix, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCtaSuffix, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCtaSuffix)o, yfe, b);
    }
}
