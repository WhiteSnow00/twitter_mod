// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$JsonFourSquareInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo$JsonFourSquareInfo>
{
    public static JsonVendorInfo$JsonFourSquareInfo _parse(final khe khe) throws IOException {
        final JsonVendorInfo$JsonFourSquareInfo jsonVendorInfo$JsonFourSquareInfo = new JsonVendorInfo$JsonFourSquareInfo();
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
            parseField(jsonVendorInfo$JsonFourSquareInfo, d, khe);
            khe.m0();
        }
        return jsonVendorInfo$JsonFourSquareInfo;
    }
    
    public static void _serialize(final JsonVendorInfo$JsonFourSquareInfo jsonVendorInfo$JsonFourSquareInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("venue_id", jsonVendorInfo$JsonFourSquareInfo.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo$JsonFourSquareInfo jsonVendorInfo$JsonFourSquareInfo, final String s, final khe khe) throws IOException {
        if ("venue_id".equals(s)) {
            jsonVendorInfo$JsonFourSquareInfo.a = khe.T((String)null);
        }
    }
    
    public JsonVendorInfo$JsonFourSquareInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVendorInfo$JsonFourSquareInfo jsonVendorInfo$JsonFourSquareInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVendorInfo$JsonFourSquareInfo, tfe, b);
    }
}
