// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceParticipants$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceParticipants>
{
    public static JsonAudioSpaceParticipants _parse(final tge tge) throws IOException {
        final JsonAudioSpaceParticipants jsonAudioSpaceParticipants = new JsonAudioSpaceParticipants();
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
            parseField(jsonAudioSpaceParticipants, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceParticipants;
    }
    
    public static void _serialize(final JsonAudioSpaceParticipants jsonAudioSpaceParticipants, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonAudioSpaceParticipants.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "admins", a);
            while (a2.hasNext()) {
                final s21 s21 = a2.next();
                if (s21 != null) {
                    LoganSquare.typeConverterFor((Class)s21.class).serialize((Object)s21, "lslocaladminsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList c = jsonAudioSpaceParticipants.c;
        if (c != null) {
            final Iterator a3 = br.A(afe, "listeners", c);
            while (a3.hasNext()) {
                final s21 s22 = a3.next();
                if (s22 != null) {
                    LoganSquare.typeConverterFor((Class)s21.class).serialize((Object)s22, "lslocallistenersElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList b2 = jsonAudioSpaceParticipants.b;
        if (b2 != null) {
            final Iterator a4 = br.A(afe, "speakers", b2);
            while (a4.hasNext()) {
                final s21 s23 = a4.next();
                if (s23 != null) {
                    LoganSquare.typeConverterFor((Class)s21.class).serialize((Object)s23, "lslocalspeakersElement", false, afe);
                }
            }
            afe.f();
        }
        afe.T("total", jsonAudioSpaceParticipants.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceParticipants jsonAudioSpaceParticipants, final String s, final tge tge) throws IOException {
        if ("admins".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final s21 s2 = (s21)LoganSquare.typeConverterFor((Class)s21.class).parse(tge);
                    if (s2 != null) {
                        a.add(s2);
                    }
                }
                jsonAudioSpaceParticipants.a = a;
            }
            else {
                jsonAudioSpaceParticipants.a = null;
            }
        }
        else if ("listeners".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final s21 s3 = (s21)LoganSquare.typeConverterFor((Class)s21.class).parse(tge);
                    if (s3 != null) {
                        c.add(s3);
                    }
                }
                jsonAudioSpaceParticipants.c = c;
            }
            else {
                jsonAudioSpaceParticipants.c = null;
            }
        }
        else if ("speakers".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final s21 s4 = (s21)LoganSquare.typeConverterFor((Class)s21.class).parse(tge);
                    if (s4 != null) {
                        b.add(s4);
                    }
                }
                jsonAudioSpaceParticipants.b = b;
            }
            else {
                jsonAudioSpaceParticipants.b = null;
            }
        }
        else if ("total".equals(s)) {
            jsonAudioSpaceParticipants.d = tge.y();
        }
    }
    
    public JsonAudioSpaceParticipants parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceParticipants jsonAudioSpaceParticipants, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceParticipants, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceParticipants)o, afe, b);
    }
}
