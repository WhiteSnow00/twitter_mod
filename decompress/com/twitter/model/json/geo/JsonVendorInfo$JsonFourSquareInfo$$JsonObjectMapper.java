// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$JsonFourSquareInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo.JsonFourSquareInfo>
{
    public static JsonVendorInfo.JsonFourSquareInfo _parse(final tge tge) throws IOException {
        final JsonVendorInfo.JsonFourSquareInfo jsonFourSquareInfo = new JsonVendorInfo.JsonFourSquareInfo();
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
            parseField(jsonFourSquareInfo, d, tge);
            tge.l0();
        }
        return jsonFourSquareInfo;
    }
    
    public static void _serialize(final JsonVendorInfo.JsonFourSquareInfo jsonFourSquareInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("venue_id", jsonFourSquareInfo.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo.JsonFourSquareInfo jsonFourSquareInfo, final String s, final tge tge) throws IOException {
        if ("venue_id".equals(s)) {
            jsonFourSquareInfo.a = tge.T((String)null);
        }
    }
    
    public JsonVendorInfo.JsonFourSquareInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonVendorInfo.JsonFourSquareInfo jsonFourSquareInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFourSquareInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonVendorInfo.JsonFourSquareInfo)o, afe, b);
    }
}
