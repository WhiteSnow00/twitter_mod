// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueSubscribeResult$$JsonObjectMapper extends JsonMapper<JsonRevueSubscribeResult>
{
    public static final kje JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER;
    
    static {
        JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER = new kje();
    }
    
    public static JsonRevueSubscribeResult _parse(final qhe qhe) throws IOException {
        final JsonRevueSubscribeResult jsonRevueSubscribeResult = new JsonRevueSubscribeResult();
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
            parseField(jsonRevueSubscribeResult, d, qhe);
            qhe.m0();
        }
        return jsonRevueSubscribeResult;
    }
    
    public static void _serialize(final JsonRevueSubscribeResult jsonRevueSubscribeResult, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("revue_account_id", jsonRevueSubscribeResult.a);
        final xor b2 = jsonRevueSubscribeResult.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonRevueSubscribeResult$$JsonObjectMapper.JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER).serialize((Object)b2, "subscription_status", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRevueSubscribeResult jsonRevueSubscribeResult, final String s, final qhe qhe) throws IOException {
        if ("revue_account_id".equals(s)) {
            jsonRevueSubscribeResult.a = qhe.T((String)null);
        }
        else if ("subscription_status".equals(s)) {
            jsonRevueSubscribeResult.b = (xor)((StringBasedTypeConverter)JsonRevueSubscribeResult$$JsonObjectMapper.JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonRevueSubscribeResult parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRevueSubscribeResult jsonRevueSubscribeResult, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonRevueSubscribeResult, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRevueSubscribeResult)o, yfe, b);
    }
}
