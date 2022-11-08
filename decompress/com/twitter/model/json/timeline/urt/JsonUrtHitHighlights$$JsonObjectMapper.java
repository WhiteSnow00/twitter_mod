// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtHitHighlights$$JsonObjectMapper extends JsonMapper<JsonUrtHitHighlights>
{
    public static JsonUrtHitHighlights _parse(final khe khe) throws IOException {
        final JsonUrtHitHighlights jsonUrtHitHighlights = new JsonUrtHitHighlights();
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
            parseField(jsonUrtHitHighlights, d, khe);
            khe.m0();
        }
        return jsonUrtHitHighlights;
    }
    
    public static void _serialize(final JsonUrtHitHighlights jsonUrtHitHighlights, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("endIndex", jsonUrtHitHighlights.b);
        tfe.T("startIndex", jsonUrtHitHighlights.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtHitHighlights jsonUrtHitHighlights, final String s, final khe khe) throws IOException {
        if ("endIndex".equals(s)) {
            jsonUrtHitHighlights.b = khe.z();
        }
        else if ("startIndex".equals(s)) {
            jsonUrtHitHighlights.a = khe.z();
        }
    }
    
    public JsonUrtHitHighlights parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtHitHighlights jsonUrtHitHighlights, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUrtHitHighlights, tfe, b);
    }
}
