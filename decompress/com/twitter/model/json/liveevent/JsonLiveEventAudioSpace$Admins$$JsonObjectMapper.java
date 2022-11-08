// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAudioSpace$Admins$$JsonObjectMapper extends JsonMapper<JsonLiveEventAudioSpace.Admins>
{
    public static JsonLiveEventAudioSpace.Admins _parse(final khe khe) throws IOException {
        final JsonLiveEventAudioSpace.Admins admins = new JsonLiveEventAudioSpace.Admins();
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
            parseField(admins, d, khe);
            khe.m0();
        }
        return admins;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace.Admins admins, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("twitter_user_id", admins.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace.Admins admins, final String s, final khe khe) throws IOException {
        if ("twitter_user_id".equals(s)) {
            admins.a = khe.T((String)null);
        }
    }
    
    public JsonLiveEventAudioSpace.Admins parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventAudioSpace.Admins admins, final tfe tfe, final boolean b) throws IOException {
        _serialize(admins, tfe, b);
    }
}
