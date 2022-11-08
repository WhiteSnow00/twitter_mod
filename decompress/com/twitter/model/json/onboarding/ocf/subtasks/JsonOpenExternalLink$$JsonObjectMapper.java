// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenExternalLink$$JsonObjectMapper extends JsonMapper<JsonOpenExternalLink>
{
    public static JsonOpenExternalLink _parse(final khe khe) throws IOException {
        final JsonOpenExternalLink jsonOpenExternalLink = new JsonOpenExternalLink();
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
            parseField(jsonOpenExternalLink, d, khe);
            khe.m0();
        }
        return jsonOpenExternalLink;
    }
    
    public static void _serialize(final JsonOpenExternalLink jsonOpenExternalLink, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("external_link_url", jsonOpenExternalLink.a);
        if (jsonOpenExternalLink.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOpenExternalLink.c, "fail_link", true, tfe);
        }
        if (jsonOpenExternalLink.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOpenExternalLink.b, "next_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOpenExternalLink jsonOpenExternalLink, final String s, final khe khe) throws IOException {
        if ("external_link_url".equals(s)) {
            jsonOpenExternalLink.a = khe.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonOpenExternalLink.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonOpenExternalLink.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonOpenExternalLink parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOpenExternalLink jsonOpenExternalLink, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOpenExternalLink, tfe, b);
    }
}
