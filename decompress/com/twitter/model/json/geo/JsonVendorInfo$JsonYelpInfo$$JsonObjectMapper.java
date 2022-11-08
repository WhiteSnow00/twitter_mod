// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$JsonYelpInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo$JsonYelpInfo>
{
    public static JsonVendorInfo$JsonYelpInfo _parse(final khe khe) throws IOException {
        final JsonVendorInfo$JsonYelpInfo jsonVendorInfo$JsonYelpInfo = new JsonVendorInfo$JsonYelpInfo();
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
            parseField(jsonVendorInfo$JsonYelpInfo, d, khe);
            khe.m0();
        }
        return jsonVendorInfo$JsonYelpInfo;
    }
    
    public static void _serialize(final JsonVendorInfo$JsonYelpInfo jsonVendorInfo$JsonYelpInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("business_id", jsonVendorInfo$JsonYelpInfo.a);
        tfe.u0("mobile_url", jsonVendorInfo$JsonYelpInfo.c);
        tfe.N("rating", jsonVendorInfo$JsonYelpInfo.e);
        tfe.T("review_count", jsonVendorInfo$JsonYelpInfo.d);
        tfe.u0("url", jsonVendorInfo$JsonYelpInfo.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo$JsonYelpInfo jsonVendorInfo$JsonYelpInfo, final String s, final khe khe) throws IOException {
        if ("business_id".equals(s)) {
            jsonVendorInfo$JsonYelpInfo.a = khe.T((String)null);
        }
        else if ("mobile_url".equals(s)) {
            jsonVendorInfo$JsonYelpInfo.c = khe.T((String)null);
        }
        else if ("rating".equals(s)) {
            jsonVendorInfo$JsonYelpInfo.e = khe.p();
        }
        else if ("review_count".equals(s)) {
            jsonVendorInfo$JsonYelpInfo.d = khe.z();
        }
        else if ("url".equals(s)) {
            jsonVendorInfo$JsonYelpInfo.b = khe.T((String)null);
        }
    }
    
    public JsonVendorInfo$JsonYelpInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVendorInfo$JsonYelpInfo jsonVendorInfo$JsonYelpInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVendorInfo$JsonYelpInfo, tfe, b);
    }
}
