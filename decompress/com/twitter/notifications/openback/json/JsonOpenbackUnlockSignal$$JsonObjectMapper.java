// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackUnlockSignal$$JsonObjectMapper extends JsonMapper<JsonOpenbackUnlockSignal>
{
    public static JsonOpenbackUnlockSignal _parse(final qhe qhe) throws IOException {
        final JsonOpenbackUnlockSignal jsonOpenbackUnlockSignal = new JsonOpenbackUnlockSignal();
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
            parseField(jsonOpenbackUnlockSignal, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackUnlockSignal;
    }
    
    public static void _serialize(final JsonOpenbackUnlockSignal jsonOpenbackUnlockSignal, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("unlocked", jsonOpenbackUnlockSignal.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackUnlockSignal jsonOpenbackUnlockSignal, final String s, final qhe qhe) throws IOException {
        if ("unlocked".equals(s)) {
            jsonOpenbackUnlockSignal.a = qhe.l();
        }
    }
    
    public JsonOpenbackUnlockSignal parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackUnlockSignal jsonOpenbackUnlockSignal, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackUnlockSignal, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackUnlockSignal)o, yfe, b);
    }
}
