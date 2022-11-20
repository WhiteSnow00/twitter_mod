// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo>
{
    public static JsonVendorInfo _parse(final tge tge) throws IOException {
        final JsonVendorInfo jsonVendorInfo = new JsonVendorInfo();
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
            parseField(jsonVendorInfo, d, tge);
            tge.l0();
        }
        return jsonVendorInfo;
    }
    
    public static void _serialize(final JsonVendorInfo jsonVendorInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonVendorInfo.b != null) {
            LoganSquare.typeConverterFor((Class)pqw$a.class).serialize((Object)jsonVendorInfo.b, "foursquare", true, afe);
        }
        if (jsonVendorInfo.a != null) {
            LoganSquare.typeConverterFor((Class)pqw$c.class).serialize((Object)jsonVendorInfo.a, "yelp", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo jsonVendorInfo, final String s, final tge tge) throws IOException {
        if ("foursquare".equals(s)) {
            jsonVendorInfo.b = (pqw$a)LoganSquare.typeConverterFor((Class)pqw$a.class).parse(tge);
        }
        else if ("yelp".equals(s)) {
            jsonVendorInfo.a = (pqw$c)LoganSquare.typeConverterFor((Class)pqw$c.class).parse(tge);
        }
    }
    
    public JsonVendorInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonVendorInfo jsonVendorInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonVendorInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonVendorInfo)o, afe, b);
    }
}
