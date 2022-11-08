// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMomentInfoBadge$$JsonObjectMapper extends JsonMapper<JsonMomentInfoBadge>
{
    public static JsonMomentInfoBadge _parse(final khe khe) throws IOException {
        final JsonMomentInfoBadge jsonMomentInfoBadge = new JsonMomentInfoBadge();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonMomentInfoBadge, d, khe);
            khe.m0();
        }
        return jsonMomentInfoBadge;
    }
    
    public static void _serialize(final JsonMomentInfoBadge jsonMomentInfoBadge, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("bg_color", jsonMomentInfoBadge.b);
        tfe.u0("text", jsonMomentInfoBadge.a);
        tfe.T("text_color", jsonMomentInfoBadge.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMomentInfoBadge jsonMomentInfoBadge, final String s, final khe khe) throws IOException {
        if ("bg_color".equals(s)) {
            jsonMomentInfoBadge.b = khe.z();
        }
        else if ("text".equals(s)) {
            jsonMomentInfoBadge.a = khe.T((String)null);
        }
        else if ("text_color".equals(s)) {
            jsonMomentInfoBadge.c = khe.z();
        }
    }
    
    public JsonMomentInfoBadge parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMomentInfoBadge jsonMomentInfoBadge, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMomentInfoBadge, tfe, b);
    }
}
