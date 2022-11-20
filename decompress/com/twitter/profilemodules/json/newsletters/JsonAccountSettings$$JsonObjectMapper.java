// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAccountSettings$$JsonObjectMapper extends JsonMapper<JsonAccountSettings>
{
    public static JsonAccountSettings _parse(final tge tge) throws IOException {
        final JsonAccountSettings jsonAccountSettings = new JsonAccountSettings();
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
            parseField(jsonAccountSettings, d, tge);
            tge.l0();
        }
        return jsonAccountSettings;
    }
    
    public static void _serialize(final JsonAccountSettings jsonAccountSettings, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("twitter_profile_subscriptions_enabled", jsonAccountSettings.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAccountSettings jsonAccountSettings, final String s, final tge tge) throws IOException {
        if ("twitter_profile_subscriptions_enabled".equals(s)) {
            jsonAccountSettings.a = tge.k();
        }
    }
    
    public JsonAccountSettings parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAccountSettings jsonAccountSettings, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAccountSettings, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAccountSettings)o, afe, b);
    }
}
