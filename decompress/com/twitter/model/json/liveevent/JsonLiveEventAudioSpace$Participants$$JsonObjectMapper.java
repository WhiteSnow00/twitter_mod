// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAudioSpace$Participants$$JsonObjectMapper extends JsonMapper<JsonLiveEventAudioSpace.Participants>
{
    public static JsonLiveEventAudioSpace.Participants _parse(final tge tge) throws IOException {
        final JsonLiveEventAudioSpace.Participants participants = new JsonLiveEventAudioSpace.Participants();
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
            parseField(participants, d, tge);
            tge.l0();
        }
        return participants;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace.Participants participants, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = participants.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "admins", a);
            while (a2.hasNext()) {
                final JsonLiveEventAudioSpace.Admins admins = a2.next();
                if (admins != null) {
                    JsonLiveEventAudioSpace$Admins$$JsonObjectMapper._serialize(admins, afe, true);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace.Participants participants, final String s, final tge tge) throws IOException {
        if ("admins".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonLiveEventAudioSpace.Admins parse = JsonLiveEventAudioSpace$Admins$$JsonObjectMapper._parse(tge);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                participants.a = a;
            }
            else {
                participants.a = null;
            }
        }
    }
    
    public JsonLiveEventAudioSpace.Participants parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventAudioSpace.Participants participants, final afe afe, final boolean b) throws IOException {
        _serialize(participants, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventAudioSpace.Participants)o, afe, b);
    }
}
