// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtHitHighlights$$JsonObjectMapper extends JsonMapper<JsonUrtHitHighlights>
{
    public static JsonUrtHitHighlights _parse(final tge tge) throws IOException {
        final JsonUrtHitHighlights jsonUrtHitHighlights = new JsonUrtHitHighlights();
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
            parseField(jsonUrtHitHighlights, d, tge);
            tge.l0();
        }
        return jsonUrtHitHighlights;
    }
    
    public static void _serialize(final JsonUrtHitHighlights jsonUrtHitHighlights, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("endIndex", jsonUrtHitHighlights.b);
        afe.T("startIndex", jsonUrtHitHighlights.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUrtHitHighlights jsonUrtHitHighlights, final String s, final tge tge) throws IOException {
        if ("endIndex".equals(s)) {
            jsonUrtHitHighlights.b = tge.y();
        }
        else if ("startIndex".equals(s)) {
            jsonUrtHitHighlights.a = tge.y();
        }
    }
    
    public JsonUrtHitHighlights parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUrtHitHighlights jsonUrtHitHighlights, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUrtHitHighlights, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUrtHitHighlights)o, afe, b);
    }
}
