// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInAppMessageInfo$$JsonObjectMapper extends JsonMapper<JsonInAppMessageInfo>
{
    public static JsonInAppMessageInfo _parse(final qhe qhe) throws IOException {
        final JsonInAppMessageInfo jsonInAppMessageInfo = new JsonInAppMessageInfo();
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
            parseField(jsonInAppMessageInfo, d, qhe);
            qhe.m0();
        }
        return jsonInAppMessageInfo;
    }
    
    public static void _serialize(final JsonInAppMessageInfo jsonInAppMessageInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("preview", jsonInAppMessageInfo.b);
        yfe.u0("title", jsonInAppMessageInfo.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInAppMessageInfo jsonInAppMessageInfo, final String s, final qhe qhe) throws IOException {
        if ("preview".equals(s)) {
            jsonInAppMessageInfo.b = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonInAppMessageInfo.a = qhe.T((String)null);
        }
    }
    
    public JsonInAppMessageInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInAppMessageInfo jsonInAppMessageInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInAppMessageInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInAppMessageInfo)o, yfe, b);
    }
}
