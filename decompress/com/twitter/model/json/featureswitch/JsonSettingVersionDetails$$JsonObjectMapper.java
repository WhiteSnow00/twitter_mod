// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingVersionDetails$$JsonObjectMapper extends JsonMapper<JsonSettingVersionDetails>
{
    public static JsonSettingVersionDetails _parse(final tge tge) throws IOException {
        final JsonSettingVersionDetails jsonSettingVersionDetails = new JsonSettingVersionDetails();
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
            parseField(jsonSettingVersionDetails, d, tge);
            tge.l0();
        }
        return jsonSettingVersionDetails;
    }
    
    public static void _serialize(final JsonSettingVersionDetails jsonSettingVersionDetails, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("experiments", jsonSettingVersionDetails.a);
        afe.t0("feature_switches", jsonSettingVersionDetails.b);
        afe.t0("settings", jsonSettingVersionDetails.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSettingVersionDetails jsonSettingVersionDetails, final String s, final tge tge) throws IOException {
        if ("experiments".equals(s)) {
            jsonSettingVersionDetails.a = tge.T((String)null);
        }
        else if ("feature_switches".equals(s)) {
            jsonSettingVersionDetails.b = tge.T((String)null);
        }
        else if ("settings".equals(s)) {
            jsonSettingVersionDetails.c = tge.T((String)null);
        }
    }
    
    public JsonSettingVersionDetails parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSettingVersionDetails jsonSettingVersionDetails, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSettingVersionDetails, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSettingVersionDetails)o, afe, b);
    }
}
