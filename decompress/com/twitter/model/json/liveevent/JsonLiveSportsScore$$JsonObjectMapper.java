// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveSportsScore$$JsonObjectMapper extends JsonMapper<JsonLiveSportsScore>
{
    public static JsonLiveSportsScore _parse(final khe khe) throws IOException {
        final JsonLiveSportsScore jsonLiveSportsScore = new JsonLiveSportsScore();
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
            parseField(jsonLiveSportsScore, d, khe);
            khe.m0();
        }
        return jsonLiveSportsScore;
    }
    
    public static void _serialize(final JsonLiveSportsScore jsonLiveSportsScore, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonLiveSportsScore.b != null) {
            tfe.i("data");
            JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper._serialize(jsonLiveSportsScore.b, tfe, true);
        }
        tfe.u0("status", jsonLiveSportsScore.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveSportsScore jsonLiveSportsScore, final String s, final khe khe) throws IOException {
        if ("data".equals(s)) {
            jsonLiveSportsScore.b = JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper._parse(khe);
        }
        else if ("status".equals(s)) {
            jsonLiveSportsScore.a = khe.T((String)null);
        }
    }
    
    public JsonLiveSportsScore parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveSportsScore jsonLiveSportsScore, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveSportsScore, tfe, b);
    }
}
