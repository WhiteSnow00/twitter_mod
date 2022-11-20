// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.hashflag;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAnimation$$JsonObjectMapper extends JsonMapper<JsonAnimation>
{
    public static JsonAnimation _parse(final tge tge) throws IOException {
        final JsonAnimation jsonAnimation = new JsonAnimation();
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
            parseField(jsonAnimation, d, tge);
            tge.l0();
        }
        return jsonAnimation;
    }
    
    public static void _serialize(final JsonAnimation jsonAnimation, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("assetUrl", jsonAnimation.b);
        afe.t0("context", jsonAnimation.a);
        afe.T("priority", jsonAnimation.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAnimation jsonAnimation, final String s, final tge tge) throws IOException {
        if (!"assetUrl".equals(s) && !"asset_url".equals(s)) {
            if ("context".equals(s)) {
                jsonAnimation.a = tge.T((String)null);
            }
            else if ("priority".equals(s)) {
                jsonAnimation.c = tge.y();
            }
        }
        else {
            jsonAnimation.b = tge.T((String)null);
        }
    }
    
    public JsonAnimation parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAnimation jsonAnimation, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAnimation, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAnimation)o, afe, b);
    }
}
