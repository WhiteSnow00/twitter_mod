// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDate$$JsonObjectMapper extends JsonMapper<JsonDate>
{
    public static JsonDate _parse(final qhe qhe) throws IOException {
        final JsonDate jsonDate = new JsonDate();
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
            parseField(jsonDate, d, qhe);
            qhe.m0();
        }
        return jsonDate;
    }
    
    public static void _serialize(final JsonDate jsonDate, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("day", jsonDate.a);
        yfe.T("month", jsonDate.b);
        yfe.T("year", jsonDate.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonDate jsonDate, final String s, final qhe qhe) throws IOException {
        if ("day".equals(s)) {
            jsonDate.a = qhe.z();
        }
        else if ("month".equals(s)) {
            jsonDate.b = qhe.z();
        }
        else if ("year".equals(s)) {
            jsonDate.c = qhe.z();
        }
    }
    
    public JsonDate parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonDate jsonDate, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonDate, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonDate)o, yfe, b);
    }
}
