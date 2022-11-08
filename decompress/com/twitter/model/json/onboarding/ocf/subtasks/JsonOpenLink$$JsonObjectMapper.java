// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenLink$$JsonObjectMapper extends JsonMapper<JsonOpenLink>
{
    public static JsonOpenLink _parse(final khe khe) throws IOException {
        final JsonOpenLink jsonOpenLink = new JsonOpenLink();
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
            parseField(jsonOpenLink, d, khe);
            khe.m0();
        }
        return jsonOpenLink;
    }
    
    public static void _serialize(final JsonOpenLink jsonOpenLink, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonOpenLink.a != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOpenLink.a, "link", true, tfe);
        }
        tfe.u0("onboarding_callback_path", jsonOpenLink.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOpenLink jsonOpenLink, final String s, final khe khe) throws IOException {
        if ("link".equals(s)) {
            jsonOpenLink.a = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("onboarding_callback_path".equals(s)) {
            jsonOpenLink.b = khe.T((String)null);
        }
    }
    
    public JsonOpenLink parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOpenLink jsonOpenLink, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOpenLink, tfe, b);
    }
}
