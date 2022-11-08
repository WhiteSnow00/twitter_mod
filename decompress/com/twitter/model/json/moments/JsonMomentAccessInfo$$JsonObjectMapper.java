// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentAccessInfo$$JsonObjectMapper extends JsonMapper<JsonMomentAccessInfo>
{
    public static JsonMomentAccessInfo _parse(final khe khe) throws IOException {
        final JsonMomentAccessInfo jsonMomentAccessInfo = new JsonMomentAccessInfo();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonMomentAccessInfo, d, khe);
            khe.m0();
        }
        return jsonMomentAccessInfo;
    }
    
    public static void _serialize(final JsonMomentAccessInfo jsonMomentAccessInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("access_type", jsonMomentAccessInfo.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMomentAccessInfo jsonMomentAccessInfo, final String s, final khe khe) throws IOException {
        if ("access_type".equals(s)) {
            jsonMomentAccessInfo.a = khe.T((String)null);
        }
    }
    
    public JsonMomentAccessInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMomentAccessInfo jsonMomentAccessInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMomentAccessInfo, tfe, b);
    }
}
