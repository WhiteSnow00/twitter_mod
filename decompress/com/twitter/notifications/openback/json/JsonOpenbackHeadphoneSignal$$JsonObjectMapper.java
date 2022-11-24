// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackHeadphoneSignal$$JsonObjectMapper extends JsonMapper<JsonOpenbackHeadphoneSignal>
{
    public static JsonOpenbackHeadphoneSignal _parse(final qhe qhe) throws IOException {
        final JsonOpenbackHeadphoneSignal jsonOpenbackHeadphoneSignal = new JsonOpenbackHeadphoneSignal();
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
            parseField(jsonOpenbackHeadphoneSignal, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackHeadphoneSignal;
    }
    
    public static void _serialize(final JsonOpenbackHeadphoneSignal jsonOpenbackHeadphoneSignal, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("connected", jsonOpenbackHeadphoneSignal.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackHeadphoneSignal jsonOpenbackHeadphoneSignal, final String s, final qhe qhe) throws IOException {
        if ("connected".equals(s)) {
            jsonOpenbackHeadphoneSignal.a = qhe.l();
        }
    }
    
    public JsonOpenbackHeadphoneSignal parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackHeadphoneSignal jsonOpenbackHeadphoneSignal, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackHeadphoneSignal, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackHeadphoneSignal)o, yfe, b);
    }
}
