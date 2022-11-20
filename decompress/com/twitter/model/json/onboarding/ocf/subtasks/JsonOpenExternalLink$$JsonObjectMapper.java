// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenExternalLink$$JsonObjectMapper extends JsonMapper<JsonOpenExternalLink>
{
    public static JsonOpenExternalLink _parse(final tge tge) throws IOException {
        final JsonOpenExternalLink jsonOpenExternalLink = new JsonOpenExternalLink();
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
            parseField(jsonOpenExternalLink, d, tge);
            tge.l0();
        }
        return jsonOpenExternalLink;
    }
    
    public static void _serialize(final JsonOpenExternalLink jsonOpenExternalLink, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("external_link_url", jsonOpenExternalLink.a);
        if (jsonOpenExternalLink.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOpenExternalLink.c, "fail_link", true, afe);
        }
        if (jsonOpenExternalLink.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOpenExternalLink.b, "next_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOpenExternalLink jsonOpenExternalLink, final String s, final tge tge) throws IOException {
        if ("external_link_url".equals(s)) {
            jsonOpenExternalLink.a = tge.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonOpenExternalLink.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonOpenExternalLink.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonOpenExternalLink parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOpenExternalLink jsonOpenExternalLink, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOpenExternalLink, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOpenExternalLink)o, afe, b);
    }
}
