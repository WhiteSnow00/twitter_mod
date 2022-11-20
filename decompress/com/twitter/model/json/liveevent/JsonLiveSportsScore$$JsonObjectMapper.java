// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveSportsScore$$JsonObjectMapper extends JsonMapper<JsonLiveSportsScore>
{
    public static JsonLiveSportsScore _parse(final tge tge) throws IOException {
        final JsonLiveSportsScore jsonLiveSportsScore = new JsonLiveSportsScore();
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
            parseField(jsonLiveSportsScore, d, tge);
            tge.l0();
        }
        return jsonLiveSportsScore;
    }
    
    public static void _serialize(final JsonLiveSportsScore jsonLiveSportsScore, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLiveSportsScore.b != null) {
            afe.i("data");
            JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper._serialize(jsonLiveSportsScore.b, afe, true);
        }
        afe.t0("status", jsonLiveSportsScore.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveSportsScore jsonLiveSportsScore, final String s, final tge tge) throws IOException {
        if ("data".equals(s)) {
            jsonLiveSportsScore.b = JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper._parse(tge);
        }
        else if ("status".equals(s)) {
            jsonLiveSportsScore.a = tge.T((String)null);
        }
    }
    
    public JsonLiveSportsScore parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveSportsScore jsonLiveSportsScore, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveSportsScore, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveSportsScore)o, afe, b);
    }
}
