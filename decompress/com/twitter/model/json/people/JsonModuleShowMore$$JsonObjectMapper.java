// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonModuleShowMore$$JsonObjectMapper extends JsonMapper<JsonModuleShowMore>
{
    public static JsonModuleShowMore _parse(final qhe qhe) throws IOException {
        final JsonModuleShowMore jsonModuleShowMore = new JsonModuleShowMore();
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
            parseField(jsonModuleShowMore, d, qhe);
            qhe.m0();
        }
        return jsonModuleShowMore;
    }
    
    public static void _serialize(final JsonModuleShowMore jsonModuleShowMore, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("extra_to_show", jsonModuleShowMore.b);
        yfe.T("initial_to_show", jsonModuleShowMore.a);
        yfe.u0("text", jsonModuleShowMore.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonModuleShowMore jsonModuleShowMore, final String s, final qhe qhe) throws IOException {
        if ("extra_to_show".equals(s)) {
            jsonModuleShowMore.b = qhe.z();
        }
        else if ("initial_to_show".equals(s)) {
            jsonModuleShowMore.a = qhe.z();
        }
        else if ("text".equals(s)) {
            jsonModuleShowMore.c = qhe.T((String)null);
        }
    }
    
    public JsonModuleShowMore parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonModuleShowMore jsonModuleShowMore, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonModuleShowMore, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonModuleShowMore)o, yfe, b);
    }
}
