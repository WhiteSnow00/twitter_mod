// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterSearchQuery$$JsonObjectMapper extends JsonMapper<JsonTwitterSearchQuery>
{
    public static JsonTwitterSearchQuery _parse(final qhe qhe) throws IOException {
        final JsonTwitterSearchQuery jsonTwitterSearchQuery = new JsonTwitterSearchQuery();
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
            parseField(jsonTwitterSearchQuery, d, qhe);
            qhe.m0();
        }
        return jsonTwitterSearchQuery;
    }
    
    public static void _serialize(final JsonTwitterSearchQuery jsonTwitterSearchQuery, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("created_at", jsonTwitterSearchQuery.d);
        yfe.W("id", jsonTwitterSearchQuery.c);
        yfe.u0("name", jsonTwitterSearchQuery.a);
        yfe.u0("query", jsonTwitterSearchQuery.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterSearchQuery jsonTwitterSearchQuery, final String s, final qhe qhe) throws IOException {
        if ("created_at".equals(s)) {
            jsonTwitterSearchQuery.d = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonTwitterSearchQuery.c = qhe.L();
        }
        else if ("name".equals(s)) {
            jsonTwitterSearchQuery.a = qhe.T((String)null);
        }
        else if ("query".equals(s)) {
            jsonTwitterSearchQuery.b = qhe.T((String)null);
        }
    }
    
    public JsonTwitterSearchQuery parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTwitterSearchQuery jsonTwitterSearchQuery, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTwitterSearchQuery, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTwitterSearchQuery)o, yfe, b);
    }
}
