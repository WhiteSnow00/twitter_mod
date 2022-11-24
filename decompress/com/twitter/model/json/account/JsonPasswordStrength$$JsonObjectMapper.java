// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPasswordStrength$$JsonObjectMapper extends JsonMapper<JsonPasswordStrength>
{
    public static JsonPasswordStrength _parse(final qhe qhe) throws IOException {
        final JsonPasswordStrength jsonPasswordStrength = new JsonPasswordStrength();
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
            parseField(jsonPasswordStrength, d, qhe);
            qhe.m0();
        }
        return jsonPasswordStrength;
    }
    
    public static void _serialize(final JsonPasswordStrength jsonPasswordStrength, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("message", jsonPasswordStrength.b);
        yfe.e("pass", jsonPasswordStrength.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPasswordStrength jsonPasswordStrength, final String s, final qhe qhe) throws IOException {
        if ("message".equals(s)) {
            jsonPasswordStrength.b = qhe.T((String)null);
        }
        else if ("pass".equals(s)) {
            jsonPasswordStrength.a = qhe.l();
        }
    }
    
    public JsonPasswordStrength parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPasswordStrength jsonPasswordStrength, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPasswordStrength, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPasswordStrength)o, yfe, b);
    }
}
