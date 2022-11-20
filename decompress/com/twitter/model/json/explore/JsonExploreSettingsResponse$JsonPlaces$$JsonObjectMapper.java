// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExploreSettingsResponse$JsonPlaces$$JsonObjectMapper extends JsonMapper<JsonExploreSettingsResponse.JsonPlaces>
{
    public static JsonExploreSettingsResponse.JsonPlaces _parse(final tge tge) throws IOException {
        final JsonExploreSettingsResponse.JsonPlaces jsonPlaces = new JsonExploreSettingsResponse.JsonPlaces();
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
            parseField(jsonPlaces, d, tge);
            tge.l0();
        }
        return jsonPlaces;
    }
    
    public static void _serialize(final JsonExploreSettingsResponse.JsonPlaces jsonPlaces, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name", jsonPlaces.b);
        afe.t0("place_id", jsonPlaces.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonExploreSettingsResponse.JsonPlaces jsonPlaces, final String s, final tge tge) throws IOException {
        if ("name".equals(s)) {
            jsonPlaces.b = tge.T((String)null);
        }
        else if ("place_id".equals(s)) {
            jsonPlaces.a = tge.T((String)null);
        }
    }
    
    public JsonExploreSettingsResponse.JsonPlaces parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonExploreSettingsResponse.JsonPlaces jsonPlaces, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPlaces, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonExploreSettingsResponse.JsonPlaces)o, afe, b);
    }
}
