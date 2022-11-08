// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.hashflag;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAnimation$$JsonObjectMapper extends JsonMapper<JsonAnimation>
{
    public static JsonAnimation _parse(final khe khe) throws IOException {
        final JsonAnimation jsonAnimation = new JsonAnimation();
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
            parseField(jsonAnimation, d, khe);
            khe.m0();
        }
        return jsonAnimation;
    }
    
    public static void _serialize(final JsonAnimation jsonAnimation, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("assetUrl", jsonAnimation.b);
        tfe.u0("context", jsonAnimation.a);
        tfe.T("priority", jsonAnimation.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAnimation jsonAnimation, final String s, final khe khe) throws IOException {
        if (!"assetUrl".equals(s) && !"asset_url".equals(s)) {
            if ("context".equals(s)) {
                jsonAnimation.a = khe.T((String)null);
            }
            else if ("priority".equals(s)) {
                jsonAnimation.c = khe.z();
            }
        }
        else {
            jsonAnimation.b = khe.T((String)null);
        }
    }
    
    public JsonAnimation parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAnimation jsonAnimation, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAnimation, tfe, b);
    }
}
