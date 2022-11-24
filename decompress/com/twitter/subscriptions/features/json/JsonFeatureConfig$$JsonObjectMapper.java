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
    public static JsonFeatureConfig _parse(final qhe qhe) throws IOException {
        final JsonFeatureConfig jsonFeatureConfig = new JsonFeatureConfig();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonFeatureConfig, d, qhe);
            qhe.m0();
        }
        return jsonFeatureConfig;
    }
    
    public static void _serialize(final JsonFeatureConfig jsonFeatureConfig, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("deeplink", jsonFeatureConfig.g);
        final String[] f = jsonFeatureConfig.f;
        if (f != null) {
            yfe.i("feature_switches");
            yfe.q0();
            for (int length = f.length, i = 0; i < length; ++i) {
                yfe.s0(f[i]);
            }
            yfe.f();
        }
        yfe.u0("icon", jsonFeatureConfig.a);
        yfe.u0("icon_alt_text", jsonFeatureConfig.b);
        yfe.e("is_labs_feature", jsonFeatureConfig.e);
        yfe.u0("summary", jsonFeatureConfig.c);
        yfe.u0("title", jsonFeatureConfig.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonFeatureConfig jsonFeatureConfig, String t, final qhe qhe) throws IOException {
        if ("deeplink".equals(t)) {
            jsonFeatureConfig.g = qhe.T((String)null);
        }
        else if ("feature_switches".equals(t)) {
            if (qhe.e() != rje.P0) {
                Objects.requireNonNull(jsonFeatureConfig);
                e0e.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList list = new ArrayList();
            while (qhe.i0() != rje.Q0) {
                t = qhe.T((String)null);
                if (t != null) {
                    list.add(t);
                }
            }
            final String[] f = list.toArray(new String[list.size()]);
            Objects.requireNonNull(jsonFeatureConfig);
            e0e.f((Object)f, "<set-?>");
            jsonFeatureConfig.f = f;
        }
        else if ("icon".equals(t)) {
            jsonFeatureConfig.a = qhe.T((String)null);
        }
        else if ("icon_alt_text".equals(t)) {
            jsonFeatureConfig.b = qhe.T((String)null);
        }
        else if ("is_labs_feature".equals(t)) {
            jsonFeatureConfig.e = qhe.l();
        }
        else if ("summary".equals(t)) {
            jsonFeatureConfig.c = qhe.T((String)null);
        }
        else if ("title".equals(t)) {
            jsonFeatureConfig.d = qhe.T((String)null);
        }
    }
    
    public JsonFeatureConfig parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonFeatureConfig jsonFeatureConfig, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonFeatureConfig, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonFeatureConfig)o, yfe, b);
    }
}
