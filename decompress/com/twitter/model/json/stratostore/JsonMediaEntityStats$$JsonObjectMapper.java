// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntityStats$$JsonObjectMapper extends JsonMapper<JsonMediaEntityStats>
{
    public static JsonMediaEntityStats _parse(final qhe qhe) throws IOException {
        final JsonMediaEntityStats jsonMediaEntityStats = new JsonMediaEntityStats();
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
            parseField(jsonMediaEntityStats, d, qhe);
            qhe.m0();
        }
        return jsonMediaEntityStats;
    }
    
    public static void _serialize(final JsonMediaEntityStats jsonMediaEntityStats, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("viewCount", jsonMediaEntityStats.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaEntityStats jsonMediaEntityStats, final String s, final qhe qhe) throws IOException {
        if ("viewCount".equals(s)) {
            jsonMediaEntityStats.a = qhe.L();
        }
    }
    
    public JsonMediaEntityStats parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaEntityStats jsonMediaEntityStats, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaEntityStats, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaEntityStats)o, yfe, b);
    }
}
