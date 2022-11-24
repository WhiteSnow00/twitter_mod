// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBirthdate$$JsonObjectMapper extends JsonMapper<JsonBirthdate>
{
    public static JsonBirthdate _parse(final qhe qhe) throws IOException {
        final JsonBirthdate jsonBirthdate = new JsonBirthdate();
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
            parseField(jsonBirthdate, d, qhe);
            qhe.m0();
        }
        return jsonBirthdate;
    }
    
    public static void _serialize(final JsonBirthdate jsonBirthdate, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("day", jsonBirthdate.a);
        yfe.T("month", jsonBirthdate.b);
        if (jsonBirthdate.d != null) {
            LoganSquare.typeConverterFor((Class)vna$c.class).serialize((Object)jsonBirthdate.d, "visibility", true, yfe);
        }
        yfe.T("year", jsonBirthdate.c);
        if (jsonBirthdate.e != null) {
            LoganSquare.typeConverterFor((Class)vna$c.class).serialize((Object)jsonBirthdate.e, "year_visibility", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBirthdate jsonBirthdate, final String s, final qhe qhe) throws IOException {
        if ("day".equals(s)) {
            jsonBirthdate.a = qhe.z();
        }
        else if ("month".equals(s)) {
            jsonBirthdate.b = qhe.z();
        }
        else if ("visibility".equals(s)) {
            jsonBirthdate.d = (vna$c)LoganSquare.typeConverterFor((Class)vna$c.class).parse(qhe);
        }
        else if ("year".equals(s)) {
            jsonBirthdate.c = qhe.z();
        }
        else if ("year_visibility".equals(s)) {
            jsonBirthdate.e = (vna$c)LoganSquare.typeConverterFor((Class)vna$c.class).parse(qhe);
        }
    }
    
    public JsonBirthdate parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBirthdate jsonBirthdate, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBirthdate, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBirthdate)o, yfe, b);
    }
}
