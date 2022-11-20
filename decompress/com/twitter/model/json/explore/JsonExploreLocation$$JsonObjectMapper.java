// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExploreLocation$$JsonObjectMapper extends JsonMapper<JsonExploreLocation>
{
    public static final tee JSON_EXPLORE_LOCATION_TYPE_CONVERTER;
    
    static {
        JSON_EXPLORE_LOCATION_TYPE_CONVERTER = new tee();
    }
    
    public static JsonExploreLocation _parse(final tge tge) throws IOException {
        final JsonExploreLocation jsonExploreLocation = new JsonExploreLocation();
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
            parseField(jsonExploreLocation, d, tge);
            tge.l0();
        }
        return jsonExploreLocation;
    }
    
    public static void _serialize(final JsonExploreLocation jsonExploreLocation, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonExploreLocation$$JsonObjectMapper.JSON_EXPLORE_LOCATION_TYPE_CONVERTER).serialize((Object)jsonExploreLocation.c, "location_type", true, afe);
        afe.t0("name", jsonExploreLocation.a);
        afe.t0("place_id", jsonExploreLocation.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonExploreLocation jsonExploreLocation, final String s, final tge tge) throws IOException {
        if ("location_type".equals(s)) {
            jsonExploreLocation.c = (int)((StringBasedTypeConverter)JsonExploreLocation$$JsonObjectMapper.JSON_EXPLORE_LOCATION_TYPE_CONVERTER).parse(tge);
        }
        else if ("name".equals(s)) {
            jsonExploreLocation.a = tge.T((String)null);
        }
        else if ("place_id".equals(s)) {
            jsonExploreLocation.b = tge.T((String)null);
        }
    }
    
    public JsonExploreLocation parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonExploreLocation jsonExploreLocation, final afe afe, final boolean b) throws IOException {
        _serialize(jsonExploreLocation, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonExploreLocation)o, afe, b);
    }
}
