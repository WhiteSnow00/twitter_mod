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
    public static JsonLiveEventAudioSpace.Participants _parse(final khe khe) throws IOException {
        final JsonLiveEventAudioSpace.Participants participants = new JsonLiveEventAudioSpace.Participants();
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
            parseField(participants, d, khe);
            khe.m0();
        }
        return participants;
    }
    
    public static void _serialize(final JsonLiveEventAudioSpace.Participants participants, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = participants.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "admins", a);
            while (g.hasNext()) {
                final JsonLiveEventAudioSpace.Admins admins = g.next();
                if (admins != null) {
                    JsonLiveEventAudioSpace$Admins$$JsonObjectMapper._serialize(admins, tfe, true);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAudioSpace.Participants participants, final String s, final khe khe) throws IOException {
        if ("admins".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonLiveEventAudioSpace.Admins parse = JsonLiveEventAudioSpace$Admins$$JsonObjectMapper._parse(khe);
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
    
    public JsonLiveEventAudioSpace.Participants parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventAudioSpace.Participants participants, final tfe tfe, final boolean b) throws IOException {
        _serialize(participants, tfe, b);
    }
}
