// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAudioSpace$Admins$$JsonObjectMapper extends JsonMapper<JsonLiveEventAudioSpace.Admins>
{
    public static JsonLiveEventAudioSpace.Admins _parse(final tge tge) throws IOException {
        final JsonLiveEventAudioSpace.Admins admins = new JsonLiveEventAudioSpace.Admins();
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
            parseField(admins, d, tge);
            tge.l0();
        }
        return admins;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace.Admins admins, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("twitter_user_id", admins.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace.Admins admins, final String s, final tge tge) throws IOException {
        if ("twitter_user_id".equals(s)) {
            admins.a = tge.T((String)null);
        }
    }
    
    public JsonLiveEventAudioSpace.Admins parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventAudioSpace.Admins admins, final afe afe, final boolean b) throws IOException {
        _serialize(admins, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventAudioSpace.Admins)o, afe, b);
    }
}
