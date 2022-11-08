// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTSportsEvent$JsonSportsParticipant$$JsonObjectMapper extends JsonMapper<JsonURTSportsEvent.JsonSportsParticipant>
{
    public static JsonURTSportsEvent.JsonSportsParticipant _parse(final khe khe) throws IOException {
        final JsonURTSportsEvent.JsonSportsParticipant jsonSportsParticipant = new JsonURTSportsEvent.JsonSportsParticipant();
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
            parseField(jsonSportsParticipant, d, khe);
            khe.m0();
        }
        return jsonSportsParticipant;
    }
    
    public static void _serialize(final JsonURTSportsEvent.JsonSportsParticipant jsonSportsParticipant, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("affiliation", jsonSportsParticipant.a);
        tfe.u0("fullName", jsonSportsParticipant.b);
        tfe.u0("id", jsonSportsParticipant.c);
        tfe.u0("imageUrl", jsonSportsParticipant.d);
        tfe.u0("status", jsonSportsParticipant.e);
        tfe.W("twitterUserId", jsonSportsParticipant.f);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTSportsEvent.JsonSportsParticipant jsonSportsParticipant, final String s, final khe khe) throws IOException {
        final boolean equals = "affiliation".equals(s);
        final Long n = null;
        if (equals) {
            jsonSportsParticipant.a = khe.T((String)null);
        }
        else if ("fullName".equals(s)) {
            jsonSportsParticipant.b = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonSportsParticipant.c = khe.T((String)null);
        }
        else if ("imageUrl".equals(s)) {
            jsonSportsParticipant.d = khe.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonSportsParticipant.e = khe.T((String)null);
        }
        else if ("twitterUserId".equals(s)) {
            Long value;
            if (khe.e() == lje.U0) {
                value = n;
            }
            else {
                value = khe.L();
            }
            jsonSportsParticipant.f = value;
        }
    }
    
    public JsonURTSportsEvent.JsonSportsParticipant parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTSportsEvent.JsonSportsParticipant jsonSportsParticipant, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSportsParticipant, tfe, b);
    }
}
