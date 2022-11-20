// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenLink$$JsonObjectMapper extends JsonMapper<JsonOpenLink>
{
    public static JsonOpenLink _parse(final tge tge) throws IOException {
        final JsonOpenLink jsonOpenLink = new JsonOpenLink();
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
            parseField(jsonOpenLink, d, tge);
            tge.l0();
        }
        return jsonOpenLink;
    }
    
    public static void _serialize(final JsonOpenLink jsonOpenLink, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOpenLink.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOpenLink.a, "link", true, afe);
        }
        afe.t0("onboarding_callback_path", jsonOpenLink.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOpenLink jsonOpenLink, final String s, final tge tge) throws IOException {
        if ("link".equals(s)) {
            jsonOpenLink.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("onboarding_callback_path".equals(s)) {
            jsonOpenLink.b = tge.T((String)null);
        }
    }
    
    public JsonOpenLink parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOpenLink jsonOpenLink, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOpenLink, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOpenLink)o, afe, b);
    }
}
