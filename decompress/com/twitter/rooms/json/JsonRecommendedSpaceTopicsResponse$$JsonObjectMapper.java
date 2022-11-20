// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRecommendedSpaceTopicsResponse$$JsonObjectMapper extends JsonMapper<JsonRecommendedSpaceTopicsResponse>
{
    public static JsonRecommendedSpaceTopicsResponse _parse(final tge tge) throws IOException {
        final JsonRecommendedSpaceTopicsResponse jsonRecommendedSpaceTopicsResponse = new JsonRecommendedSpaceTopicsResponse();
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
            parseField(jsonRecommendedSpaceTopicsResponse, d, tge);
            tge.l0();
        }
        return jsonRecommendedSpaceTopicsResponse;
    }
    
    public static void _serialize(final JsonRecommendedSpaceTopicsResponse jsonRecommendedSpaceTopicsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List a = jsonRecommendedSpaceTopicsResponse.a;
        if (a != null) {
            final Iterator g = hee.g(afe, "recommended_space_topics", a);
            while (g.hasNext()) {
                final h31 h31 = g.next();
                if (h31 != null) {
                    LoganSquare.typeConverterFor((Class)h31.class).serialize((Object)h31, "lslocalrecommended_space_topicsElement", false, afe);
                }
            }
            afe.f();
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("recommendedSpaceTopics");
        throw null;
    }
    
    public static void parseField(final JsonRecommendedSpaceTopicsResponse jsonRecommendedSpaceTopicsResponse, final String s, final tge tge) throws IOException {
        if ("recommended_space_topics".equals(s)) {
            if (tge.e() != vie.N0) {
                Objects.requireNonNull(jsonRecommendedSpaceTopicsResponse);
                czd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (tge.h0() != vie.O0) {
                final h31 h31 = (h31)LoganSquare.typeConverterFor((Class)h31.class).parse(tge);
                if (h31 != null) {
                    a.add(h31);
                }
            }
            Objects.requireNonNull(jsonRecommendedSpaceTopicsResponse);
            jsonRecommendedSpaceTopicsResponse.a = a;
        }
    }
    
    public JsonRecommendedSpaceTopicsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRecommendedSpaceTopicsResponse jsonRecommendedSpaceTopicsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRecommendedSpaceTopicsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRecommendedSpaceTopicsResponse)o, afe, b);
    }
}
