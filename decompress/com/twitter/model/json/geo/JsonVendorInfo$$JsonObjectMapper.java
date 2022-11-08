// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo>
{
    public static JsonVendorInfo _parse(final khe khe) throws IOException {
        final JsonVendorInfo jsonVendorInfo = new JsonVendorInfo();
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
            parseField(jsonVendorInfo, d, khe);
            khe.m0();
        }
        return jsonVendorInfo;
    }
    
    public static void _serialize(final JsonVendorInfo jsonVendorInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonVendorInfo.b != null) {
            LoganSquare.typeConverterFor((Class)vpw$a.class).serialize((Object)jsonVendorInfo.b, "foursquare", true, tfe);
        }
        if (jsonVendorInfo.a != null) {
            LoganSquare.typeConverterFor((Class)vpw.c.class).serialize((Object)jsonVendorInfo.a, "yelp", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo jsonVendorInfo, final String s, final khe khe) throws IOException {
        if ("foursquare".equals(s)) {
            jsonVendorInfo.b = (vpw$a)LoganSquare.typeConverterFor((Class)vpw$a.class).parse(khe);
        }
        else if ("yelp".equals(s)) {
            jsonVendorInfo.a = (vpw.c)LoganSquare.typeConverterFor((Class)vpw.c.class).parse(khe);
        }
    }
    
    public JsonVendorInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVendorInfo jsonVendorInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVendorInfo, tfe, b);
    }
}
