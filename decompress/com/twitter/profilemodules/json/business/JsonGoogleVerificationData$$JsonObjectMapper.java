// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGoogleVerificationData$$JsonObjectMapper extends JsonMapper<JsonGoogleVerificationData>
{
    public static JsonGoogleVerificationData _parse(final tge tge) throws IOException {
        final JsonGoogleVerificationData jsonGoogleVerificationData = new JsonGoogleVerificationData();
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
            parseField(jsonGoogleVerificationData, d, tge);
            tge.l0();
        }
        return jsonGoogleVerificationData;
    }
    
    public static void _serialize(final JsonGoogleVerificationData jsonGoogleVerificationData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("static_map_image_url", jsonGoogleVerificationData.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGoogleVerificationData jsonGoogleVerificationData, final String s, final tge tge) throws IOException {
        if ("static_map_image_url".equals(s)) {
            jsonGoogleVerificationData.a = tge.T((String)null);
        }
    }
    
    public JsonGoogleVerificationData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGoogleVerificationData jsonGoogleVerificationData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGoogleVerificationData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGoogleVerificationData)o, afe, b);
    }
}
