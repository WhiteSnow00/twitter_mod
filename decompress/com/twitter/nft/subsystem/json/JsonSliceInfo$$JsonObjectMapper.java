// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSliceInfo$$JsonObjectMapper extends JsonMapper<JsonSliceInfo>
{
    public static JsonSliceInfo _parse(final qhe qhe) throws IOException {
        final JsonSliceInfo jsonSliceInfo = new JsonSliceInfo();
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
            parseField(jsonSliceInfo, d, qhe);
            qhe.m0();
        }
        return jsonSliceInfo;
    }
    
    public static void _serialize(final JsonSliceInfo jsonSliceInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("next_cursor", jsonSliceInfo.b);
        yfe.u0("previous_cursor", jsonSliceInfo.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSliceInfo jsonSliceInfo, final String s, final qhe qhe) throws IOException {
        if ("next_cursor".equals(s)) {
            jsonSliceInfo.b = qhe.T((String)null);
        }
        else if ("previous_cursor".equals(s)) {
            jsonSliceInfo.a = qhe.T((String)null);
        }
    }
    
    public JsonSliceInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSliceInfo jsonSliceInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSliceInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSliceInfo)o, yfe, b);
    }
}
