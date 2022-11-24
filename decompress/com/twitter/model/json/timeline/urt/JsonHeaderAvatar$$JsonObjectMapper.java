// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHeaderAvatar$$JsonObjectMapper extends JsonMapper<JsonHeaderAvatar>
{
    public static JsonHeaderAvatar _parse(final qhe qhe) throws IOException {
        final JsonHeaderAvatar jsonHeaderAvatar = new JsonHeaderAvatar();
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
            parseField(jsonHeaderAvatar, d, qhe);
            qhe.m0();
        }
        return jsonHeaderAvatar;
    }
    
    public static void _serialize(final JsonHeaderAvatar jsonHeaderAvatar, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("userId", jsonHeaderAvatar.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHeaderAvatar jsonHeaderAvatar, final String s, final qhe qhe) throws IOException {
        if ("userId".equals(s)) {
            jsonHeaderAvatar.a = qhe.T((String)null);
        }
    }
    
    public JsonHeaderAvatar parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHeaderAvatar jsonHeaderAvatar, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHeaderAvatar, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHeaderAvatar)o, yfe, b);
    }
}
