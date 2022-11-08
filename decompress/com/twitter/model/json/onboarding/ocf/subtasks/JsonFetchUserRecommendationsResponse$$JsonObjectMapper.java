// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchUserRecommendationsResponse$$JsonObjectMapper extends JsonMapper<JsonFetchUserRecommendationsResponse>
{
    public static JsonFetchUserRecommendationsResponse _parse(final khe khe) throws IOException {
        final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse = new JsonFetchUserRecommendationsResponse();
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
            parseField(jsonFetchUserRecommendationsResponse, d, khe);
            khe.m0();
        }
        return jsonFetchUserRecommendationsResponse;
    }
    
    public static void _serialize(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("deduplication", jsonFetchUserRecommendationsResponse.b);
        if (jsonFetchUserRecommendationsResponse.a != null) {
            LoganSquare.typeConverterFor((Class)egw.class).serialize((Object)jsonFetchUserRecommendationsResponse.a, "user_recommendations", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final String s, final khe khe) throws IOException {
        if ("deduplication".equals(s)) {
            jsonFetchUserRecommendationsResponse.b = khe.k();
        }
        else if ("user_recommendations".equals(s)) {
            jsonFetchUserRecommendationsResponse.a = (egw)LoganSquare.typeConverterFor((Class)egw.class).parse(khe);
        }
    }
    
    public JsonFetchUserRecommendationsResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchUserRecommendationsResponse, tfe, b);
    }
}
