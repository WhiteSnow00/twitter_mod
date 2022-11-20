// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExploreLocation$JsonTwitterLocationPlaceLocationType$$JsonObjectMapper extends JsonMapper<JsonExploreLocation.JsonTwitterLocationPlaceLocationType>
{
    public static final tee JSON_EXPLORE_LOCATION_TYPE_CONVERTER;
    
    static {
        JSON_EXPLORE_LOCATION_TYPE_CONVERTER = new tee();
    }
    
    public static JsonExploreLocation.JsonTwitterLocationPlaceLocationType _parse(final tge tge) throws IOException {
        final JsonExploreLocation.JsonTwitterLocationPlaceLocationType jsonTwitterLocationPlaceLocationType = new JsonExploreLocation.JsonTwitterLocationPlaceLocationType();
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
            parseField(jsonTwitterLocationPlaceLocationType, d, tge);
            tge.l0();
        }
        return jsonTwitterLocationPlaceLocationType;
    }
    
    public static void _serialize(final JsonExploreLocation.JsonTwitterLocationPlaceLocationType jsonTwitterLocationPlaceLocationType, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonExploreLocation$JsonTwitterLocationPlaceLocationType$$JsonObjectMapper.JSON_EXPLORE_LOCATION_TYPE_CONVERTER).serialize((Object)jsonTwitterLocationPlaceLocationType.a, "original_name", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonExploreLocation.JsonTwitterLocationPlaceLocationType jsonTwitterLocationPlaceLocationType, final String s, final tge tge) throws IOException {
        if ("original_name".equals(s)) {
            jsonTwitterLocationPlaceLocationType.a = (int)((StringBasedTypeConverter)JsonExploreLocation$JsonTwitterLocationPlaceLocationType$$JsonObjectMapper.JSON_EXPLORE_LOCATION_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonExploreLocation.JsonTwitterLocationPlaceLocationType parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonExploreLocation.JsonTwitterLocationPlaceLocationType jsonTwitterLocationPlaceLocationType, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTwitterLocationPlaceLocationType, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonExploreLocation.JsonTwitterLocationPlaceLocationType)o, afe, b);
    }
}
