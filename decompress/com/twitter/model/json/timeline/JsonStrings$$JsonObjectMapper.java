// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStrings$$JsonObjectMapper extends JsonMapper<JsonStrings>
{
    public static JsonStrings _parse(final qhe qhe) throws IOException {
        final JsonStrings jsonStrings = new JsonStrings();
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
            parseField(jsonStrings, d, qhe);
            qhe.m0();
        }
        return jsonStrings;
    }
    
    public static void _serialize(final JsonStrings jsonStrings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("header", jsonStrings.a);
        yfe.u0("show_more", jsonStrings.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonStrings jsonStrings, final String s, final qhe qhe) throws IOException {
        if ("header".equals(s)) {
            jsonStrings.a = qhe.T((String)null);
        }
        else if ("show_more".equals(s)) {
            jsonStrings.b = qhe.T((String)null);
        }
    }
    
    public JsonStrings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonStrings jsonStrings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonStrings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonStrings)o, yfe, b);
    }
}
