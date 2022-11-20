// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchUserRecommendationsResponse$$JsonObjectMapper extends JsonMapper<JsonFetchUserRecommendationsResponse>
{
    public static JsonFetchUserRecommendationsResponse _parse(final tge tge) throws IOException {
        final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse = new JsonFetchUserRecommendationsResponse();
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
            parseField(jsonFetchUserRecommendationsResponse, d, tge);
            tge.l0();
        }
        return jsonFetchUserRecommendationsResponse;
    }
    
    public static void _serialize(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("deduplication", jsonFetchUserRecommendationsResponse.b);
        if (jsonFetchUserRecommendationsResponse.a != null) {
            LoganSquare.typeConverterFor((Class)xgw.class).serialize((Object)jsonFetchUserRecommendationsResponse.a, "user_recommendations", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final String s, final tge tge) throws IOException {
        if ("deduplication".equals(s)) {
            jsonFetchUserRecommendationsResponse.b = tge.k();
        }
        else if ("user_recommendations".equals(s)) {
            jsonFetchUserRecommendationsResponse.a = (xgw)LoganSquare.typeConverterFor((Class)xgw.class).parse(tge);
        }
    }
    
    public JsonFetchUserRecommendationsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFetchUserRecommendationsResponse jsonFetchUserRecommendationsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFetchUserRecommendationsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFetchUserRecommendationsResponse)o, afe, b);
    }
}
