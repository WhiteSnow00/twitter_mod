// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVendorInfo$JsonYelpInfo$$JsonObjectMapper extends JsonMapper<JsonVendorInfo.JsonYelpInfo>
{
    public static JsonVendorInfo.JsonYelpInfo _parse(final tge tge) throws IOException {
        final JsonVendorInfo.JsonYelpInfo jsonYelpInfo = new JsonVendorInfo.JsonYelpInfo();
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
            parseField(jsonYelpInfo, d, tge);
            tge.l0();
        }
        return jsonYelpInfo;
    }
    
    public static void _serialize(final JsonVendorInfo.JsonYelpInfo jsonYelpInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("business_id", jsonYelpInfo.a);
        afe.t0("mobile_url", jsonYelpInfo.c);
        afe.N("rating", jsonYelpInfo.e);
        afe.T("review_count", jsonYelpInfo.d);
        afe.t0("url", jsonYelpInfo.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonVendorInfo.JsonYelpInfo jsonYelpInfo, final String s, final tge tge) throws IOException {
        if ("business_id".equals(s)) {
            jsonYelpInfo.a = tge.T((String)null);
        }
        else if ("mobile_url".equals(s)) {
            jsonYelpInfo.c = tge.T((String)null);
        }
        else if ("rating".equals(s)) {
            jsonYelpInfo.e = tge.p();
        }
        else if ("review_count".equals(s)) {
            jsonYelpInfo.d = tge.y();
        }
        else if ("url".equals(s)) {
            jsonYelpInfo.b = tge.T((String)null);
        }
    }
    
    public JsonVendorInfo.JsonYelpInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonVendorInfo.JsonYelpInfo jsonYelpInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonYelpInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonVendorInfo.JsonYelpInfo)o, afe, b);
    }
}
