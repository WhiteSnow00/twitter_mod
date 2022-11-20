// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExploreSettingsResponse$$JsonObjectMapper extends JsonMapper<JsonExploreSettingsResponse>
{
    public static JsonExploreSettingsResponse _parse(final tge tge) throws IOException {
        final JsonExploreSettingsResponse jsonExploreSettingsResponse = new JsonExploreSettingsResponse();
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
            parseField(jsonExploreSettingsResponse, d, tge);
            tge.l0();
        }
        return jsonExploreSettingsResponse;
    }
    
    public static void _serialize(final JsonExploreSettingsResponse jsonExploreSettingsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList c = jsonExploreSettingsResponse.c;
        if (c != null) {
            final Iterator a = br.A(afe, "places", c);
            while (a.hasNext()) {
                final JsonExploreSettingsResponse.JsonPlaces jsonPlaces = a.next();
                if (jsonPlaces != null) {
                    JsonExploreSettingsResponse$JsonPlaces$$JsonObjectMapper._serialize(jsonPlaces, afe, true);
                }
            }
            afe.f();
        }
        afe.e("is_unified_trends", jsonExploreSettingsResponse.d);
        afe.e("use_current_location", jsonExploreSettingsResponse.b);
        afe.e("use_personalized_trends", jsonExploreSettingsResponse.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonExploreSettingsResponse jsonExploreSettingsResponse, final String s, final tge tge) throws IOException {
        if ("places".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonExploreSettingsResponse.JsonPlaces parse = JsonExploreSettingsResponse$JsonPlaces$$JsonObjectMapper._parse(tge);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonExploreSettingsResponse.c = c;
            }
            else {
                jsonExploreSettingsResponse.c = null;
            }
        }
        else if ("is_unified_trends".equals(s)) {
            jsonExploreSettingsResponse.d = tge.k();
        }
        else if ("use_current_location".equals(s)) {
            jsonExploreSettingsResponse.b = tge.k();
        }
        else if ("use_personalized_trends".equals(s)) {
            jsonExploreSettingsResponse.a = tge.k();
        }
    }
    
    public JsonExploreSettingsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonExploreSettingsResponse jsonExploreSettingsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonExploreSettingsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonExploreSettingsResponse)o, afe, b);
    }
}
