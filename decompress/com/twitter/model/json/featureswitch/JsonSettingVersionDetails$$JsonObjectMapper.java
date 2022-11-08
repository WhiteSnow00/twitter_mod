// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingVersionDetails$$JsonObjectMapper extends JsonMapper<JsonSettingVersionDetails>
{
    public static JsonSettingVersionDetails _parse(final khe khe) throws IOException {
        final JsonSettingVersionDetails jsonSettingVersionDetails = new JsonSettingVersionDetails();
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
            parseField(jsonSettingVersionDetails, d, khe);
            khe.m0();
        }
        return jsonSettingVersionDetails;
    }
    
    public static void _serialize(final JsonSettingVersionDetails jsonSettingVersionDetails, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("experiments", jsonSettingVersionDetails.a);
        tfe.u0("feature_switches", jsonSettingVersionDetails.b);
        tfe.u0("settings", jsonSettingVersionDetails.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSettingVersionDetails jsonSettingVersionDetails, final String s, final khe khe) throws IOException {
        if ("experiments".equals(s)) {
            jsonSettingVersionDetails.a = khe.T((String)null);
        }
        else if ("feature_switches".equals(s)) {
            jsonSettingVersionDetails.b = khe.T((String)null);
        }
        else if ("settings".equals(s)) {
            jsonSettingVersionDetails.c = khe.T((String)null);
        }
    }
    
    public JsonSettingVersionDetails parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSettingVersionDetails jsonSettingVersionDetails, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSettingVersionDetails, tfe, b);
    }
}
