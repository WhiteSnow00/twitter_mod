// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserResults$$JsonObjectMapper extends JsonMapper<JsonUserResults>
{
    public static final oiw USER_RESULT_UNION_CONVERTER;
    
    static {
        USER_RESULT_UNION_CONVERTER = new oiw();
    }
    
    public static JsonUserResults _parse(final tge tge) throws IOException {
        final JsonUserResults jsonUserResults = new JsonUserResults();
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
            parseField(jsonUserResults, d, tge);
            tge.l0();
        }
        return jsonUserResults;
    }
    
    public static void _serialize(final JsonUserResults jsonUserResults, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final kiw a = jsonUserResults.a;
        if (a == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<kiw>)JsonUserResults$$JsonObjectMapper.USER_RESULT_UNION_CONVERTER).serialize(a, "result", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonUserResults jsonUserResults, final String s, final tge tge) throws IOException {
        if ("result".equals(s)) {
            jsonUserResults.a = ((hfe<kiw>)JsonUserResults$$JsonObjectMapper.USER_RESULT_UNION_CONVERTER).parse(tge);
        }
    }
    
    public JsonUserResults parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUserResults jsonUserResults, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUserResults, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUserResults)o, afe, b);
    }
}
