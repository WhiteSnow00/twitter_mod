// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonReferrerContext$$JsonObjectMapper extends JsonMapper<JsonReferrerContext>
{
    public static JsonReferrerContext _parse(final qhe qhe) throws IOException {
        final JsonReferrerContext jsonReferrerContext = new JsonReferrerContext();
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
            parseField(jsonReferrerContext, d, qhe);
            qhe.m0();
        }
        return jsonReferrerContext;
    }
    
    public static void _serialize(final JsonReferrerContext jsonReferrerContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("referral_details", jsonReferrerContext.a);
        yfe.u0("referrer_url", jsonReferrerContext.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonReferrerContext jsonReferrerContext, final String s, final qhe qhe) throws IOException {
        if ("referral_details".equals(s)) {
            jsonReferrerContext.a = qhe.T((String)null);
        }
        else if ("referrer_url".equals(s)) {
            jsonReferrerContext.b = qhe.T((String)null);
        }
    }
    
    public JsonReferrerContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonReferrerContext jsonReferrerContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonReferrerContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonReferrerContext)o, yfe, b);
    }
}
