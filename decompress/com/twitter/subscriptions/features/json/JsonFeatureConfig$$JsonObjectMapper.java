// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import java.util.ArrayList;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureConfig$$JsonObjectMapper extends JsonMapper<JsonFeatureConfig>
{
    public static JsonFeatureConfig _parse(final khe khe) throws IOException {
        final JsonFeatureConfig jsonFeatureConfig = new JsonFeatureConfig();
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
            parseField(jsonFeatureConfig, d, khe);
            khe.m0();
        }
        return jsonFeatureConfig;
    }
    
    public static void _serialize(final JsonFeatureConfig jsonFeatureConfig, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("deeplink", jsonFeatureConfig.g);
        final String[] f = jsonFeatureConfig.f;
        if (f != null) {
            tfe.i("feature_switches");
            tfe.q0();
            for (int length = f.length, i = 0; i < length; ++i) {
                tfe.s0(f[i]);
            }
            tfe.f();
        }
        tfe.u0("icon", jsonFeatureConfig.a);
        tfe.u0("icon_alt_text", jsonFeatureConfig.b);
        tfe.e("is_labs_feature", jsonFeatureConfig.e);
        tfe.u0("summary", jsonFeatureConfig.c);
        tfe.u0("title", jsonFeatureConfig.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFeatureConfig jsonFeatureConfig, String t, final khe khe) throws IOException {
        if ("deeplink".equals(t)) {
            jsonFeatureConfig.g = khe.T((String)null);
        }
        else if ("feature_switches".equals(t)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonFeatureConfig);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList list = new ArrayList();
            while (khe.i0() != lje.N0) {
                t = khe.T((String)null);
                if (t != null) {
                    list.add(t);
                }
            }
            final String[] f = list.toArray(new String[list.size()]);
            Objects.requireNonNull(jsonFeatureConfig);
            zzd.f((Object)f, "<set-?>");
            jsonFeatureConfig.f = f;
        }
        else if ("icon".equals(t)) {
            jsonFeatureConfig.a = khe.T((String)null);
        }
        else if ("icon_alt_text".equals(t)) {
            jsonFeatureConfig.b = khe.T((String)null);
        }
        else if ("is_labs_feature".equals(t)) {
            jsonFeatureConfig.e = khe.k();
        }
        else if ("summary".equals(t)) {
            jsonFeatureConfig.c = khe.T((String)null);
        }
        else if ("title".equals(t)) {
            jsonFeatureConfig.d = khe.T((String)null);
        }
    }
    
    public JsonFeatureConfig parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFeatureConfig jsonFeatureConfig, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFeatureConfig, tfe, b);
    }
}
