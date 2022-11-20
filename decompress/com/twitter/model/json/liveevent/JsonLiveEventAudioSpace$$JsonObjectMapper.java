// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAudioSpace$$JsonObjectMapper extends JsonMapper<JsonLiveEventAudioSpace>
{
    public static JsonLiveEventAudioSpace _parse(final tge tge) throws IOException {
        final JsonLiveEventAudioSpace jsonLiveEventAudioSpace = new JsonLiveEventAudioSpace();
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
            parseField(jsonLiveEventAudioSpace, d, tge);
            tge.l0();
        }
        return jsonLiveEventAudioSpace;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("broadcast_id", jsonLiveEventAudioSpace.b);
        afe.t0("id", jsonLiveEventAudioSpace.a);
        afe.e("is_space_available_for_replay", (boolean)jsonLiveEventAudioSpace.i);
        if (jsonLiveEventAudioSpace.e != null) {
            afe.i("participants");
            JsonLiveEventAudioSpace$Participants$$JsonObjectMapper._serialize(jsonLiveEventAudioSpace.e, afe, true);
        }
        afe.t0("scheduled_start_ms", jsonLiveEventAudioSpace.h);
        afe.t0("state", jsonLiveEventAudioSpace.c);
        afe.t0("title", jsonLiveEventAudioSpace.d);
        afe.T("total_participated", (int)jsonLiveEventAudioSpace.g);
        afe.T("total_participating", (int)jsonLiveEventAudioSpace.f);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final String s, final tge tge) throws IOException {
        final boolean equals = "broadcast_id".equals(s);
        final Integer n = null;
        final Integer n2 = null;
        final Boolean b = null;
        if (equals) {
            jsonLiveEventAudioSpace.b = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonLiveEventAudioSpace.a = tge.T((String)null);
        }
        else if ("is_space_available_for_replay".equals(s)) {
            Boolean value;
            if (tge.e() == vie.V0) {
                value = b;
            }
            else {
                value = tge.k();
            }
            jsonLiveEventAudioSpace.i = value;
        }
        else if ("participants".equals(s)) {
            jsonLiveEventAudioSpace.e = JsonLiveEventAudioSpace$Participants$$JsonObjectMapper._parse(tge);
        }
        else if ("scheduled_start_ms".equals(s)) {
            jsonLiveEventAudioSpace.h = tge.T((String)null);
        }
        else if ("state".equals(s)) {
            jsonLiveEventAudioSpace.c = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonLiveEventAudioSpace.d = tge.T((String)null);
        }
        else if ("total_participated".equals(s)) {
            Integer value2;
            if (tge.e() == vie.V0) {
                value2 = n;
            }
            else {
                value2 = tge.y();
            }
            jsonLiveEventAudioSpace.g = value2;
        }
        else if ("total_participating".equals(s)) {
            Integer value3;
            if (tge.e() == vie.V0) {
                value3 = n2;
            }
            else {
                value3 = tge.y();
            }
            jsonLiveEventAudioSpace.f = value3;
        }
    }
    
    public JsonLiveEventAudioSpace parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventAudioSpace jsonLiveEventAudioSpace, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventAudioSpace, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventAudioSpace)o, afe, b);
    }
}
