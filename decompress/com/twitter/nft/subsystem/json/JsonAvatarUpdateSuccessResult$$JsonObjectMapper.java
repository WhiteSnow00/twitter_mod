// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAvatarUpdateSuccessResult$$JsonObjectMapper extends JsonMapper<JsonAvatarUpdateSuccessResult>
{
    public static JsonAvatarUpdateSuccessResult _parse(final qhe qhe) throws IOException {
        final JsonAvatarUpdateSuccessResult jsonAvatarUpdateSuccessResult = new JsonAvatarUpdateSuccessResult();
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
            parseField(jsonAvatarUpdateSuccessResult, d, qhe);
            qhe.m0();
        }
        return jsonAvatarUpdateSuccessResult;
    }
    
    public static void _serialize(final JsonAvatarUpdateSuccessResult jsonAvatarUpdateSuccessResult, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("media_url", jsonAvatarUpdateSuccessResult.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAvatarUpdateSuccessResult jsonAvatarUpdateSuccessResult, final String s, final qhe qhe) throws IOException {
        if ("media_url".equals(s)) {
            jsonAvatarUpdateSuccessResult.a = qhe.T((String)null);
        }
    }
    
    public JsonAvatarUpdateSuccessResult parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAvatarUpdateSuccessResult jsonAvatarUpdateSuccessResult, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAvatarUpdateSuccessResult, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAvatarUpdateSuccessResult)o, yfe, b);
    }
}
