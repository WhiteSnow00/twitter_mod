// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserResult$$JsonObjectMapper extends JsonMapper<JsonUserResult>
{
    public static JsonUserResult _parse(final tge tge) throws IOException {
        final JsonUserResult jsonUserResult = new JsonUserResult();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonUserResult, d, tge);
            tge.l0();
        }
        return jsonUserResult;
    }
    
    public static void _serialize(final JsonUserResult jsonUserResult, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonUserResult.t();
        LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonUserResult.t(), "user_result", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUserResult jsonUserResult, final String s, final tge tge) throws IOException {
        if ("user_result".equals(s)) {
            final kiw a = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
            Objects.requireNonNull(jsonUserResult);
            czd.f((Object)a, "<set-?>");
            jsonUserResult.a = a;
        }
    }
    
    public JsonUserResult parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUserResult jsonUserResult, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUserResult, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUserResult)o, afe, b);
    }
}
