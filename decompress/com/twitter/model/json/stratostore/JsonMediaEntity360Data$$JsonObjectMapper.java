// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntity360Data$$JsonObjectMapper extends JsonMapper<JsonMediaEntity360Data>
{
    public static JsonMediaEntity360Data _parse(final qhe qhe) throws IOException {
        final JsonMediaEntity360Data jsonMediaEntity360Data = new JsonMediaEntity360Data();
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
            parseField(jsonMediaEntity360Data, d, qhe);
            qhe.m0();
        }
        return jsonMediaEntity360Data;
    }
    
    public static void _serialize(final JsonMediaEntity360Data jsonMediaEntity360Data, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is360", jsonMediaEntity360Data.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaEntity360Data jsonMediaEntity360Data, final String s, final qhe qhe) throws IOException {
        if ("is360".equals(s)) {
            jsonMediaEntity360Data.a = qhe.l();
        }
    }
    
    public JsonMediaEntity360Data parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaEntity360Data jsonMediaEntity360Data, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaEntity360Data, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaEntity360Data)o, yfe, b);
    }
}
