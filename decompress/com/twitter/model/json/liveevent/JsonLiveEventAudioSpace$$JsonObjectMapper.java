// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAudioSpace$$JsonObjectMapper extends JsonMapper<JsonLiveEventAudioSpace>
{
    public static JsonLiveEventAudioSpace _parse(final khe khe) throws IOException {
        final JsonLiveEventAudioSpace jsonLiveEventAudioSpace = new JsonLiveEventAudioSpace();
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
            parseField(jsonLiveEventAudioSpace, d, khe);
            khe.m0();
        }
        return jsonLiveEventAudioSpace;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("broadcast_id", jsonLiveEventAudioSpace.b);
        tfe.u0("id", jsonLiveEventAudioSpace.a);
        tfe.e("is_space_available_for_replay", jsonLiveEventAudioSpace.i);
        if (jsonLiveEventAudioSpace.e != null) {
            tfe.i("participants");
            JsonLiveEventAudioSpace$Participants$$JsonObjectMapper._serialize(jsonLiveEventAudioSpace.e, tfe, true);
        }
        tfe.u0("scheduled_start_ms", jsonLiveEventAudioSpace.h);
        tfe.u0("state", jsonLiveEventAudioSpace.c);
        tfe.u0("title", jsonLiveEventAudioSpace.d);
        tfe.T("total_participated", jsonLiveEventAudioSpace.g);
        tfe.T("total_participating", jsonLiveEventAudioSpace.f);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final String s, final khe khe) throws IOException {
        final boolean equals = "broadcast_id".equals(s);
        final Integer n = null;
        final Integer n2 = null;
        final Boolean b = null;
        if (equals) {
            jsonLiveEventAudioSpace.b = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonLiveEventAudioSpace.a = khe.T((String)null);
        }
        else if ("is_space_available_for_replay".equals(s)) {
            Boolean value;
            if (khe.e() == lje.U0) {
                value = b;
            }
            else {
                value = khe.k();
            }
            jsonLiveEventAudioSpace.i = value;
        }
        else if ("participants".equals(s)) {
            jsonLiveEventAudioSpace.e = JsonLiveEventAudioSpace$Participants$$JsonObjectMapper._parse(khe);
        }
        else if ("scheduled_start_ms".equals(s)) {
            jsonLiveEventAudioSpace.h = khe.T((String)null);
        }
        else if ("state".equals(s)) {
            jsonLiveEventAudioSpace.c = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonLiveEventAudioSpace.d = khe.T((String)null);
        }
        else if ("total_participated".equals(s)) {
            Integer value2;
            if (khe.e() == lje.U0) {
                value2 = n;
            }
            else {
                value2 = khe.z();
            }
            jsonLiveEventAudioSpace.g = value2;
        }
        else if ("total_participating".equals(s)) {
            Integer value3;
            if (khe.e() == lje.U0) {
                value3 = n2;
            }
            else {
                value3 = khe.z();
            }
            jsonLiveEventAudioSpace.f = value3;
        }
    }
    
    public JsonLiveEventAudioSpace parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventAudioSpace, tfe, b);
    }
}
