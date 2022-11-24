// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAccountSettings$$JsonObjectMapper extends JsonMapper<JsonAccountSettings>
{
    public static JsonAccountSettings _parse(final qhe qhe) throws IOException {
        final JsonAccountSettings jsonAccountSettings = new JsonAccountSettings();
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
            parseField(jsonAccountSettings, d, qhe);
            qhe.m0();
        }
        return jsonAccountSettings;
    }
    
    public static void _serialize(final JsonAccountSettings jsonAccountSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("twitter_profile_subscriptions_enabled", jsonAccountSettings.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAccountSettings jsonAccountSettings, final String s, final qhe qhe) throws IOException {
        if ("twitter_profile_subscriptions_enabled".equals(s)) {
            jsonAccountSettings.a = qhe.l();
        }
    }
    
    public JsonAccountSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAccountSettings jsonAccountSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAccountSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAccountSettings)o, yfe, b);
    }
}
