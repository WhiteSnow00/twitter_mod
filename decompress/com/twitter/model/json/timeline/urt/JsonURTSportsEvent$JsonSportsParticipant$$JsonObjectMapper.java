// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTSportsEvent$JsonSportsParticipant$$JsonObjectMapper extends JsonMapper<JsonURTSportsEvent$JsonSportsParticipant>
{
    public static JsonURTSportsEvent$JsonSportsParticipant _parse(final tge tge) throws IOException {
        final JsonURTSportsEvent$JsonSportsParticipant jsonURTSportsEvent$JsonSportsParticipant = new JsonURTSportsEvent$JsonSportsParticipant();
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
            parseField(jsonURTSportsEvent$JsonSportsParticipant, d, tge);
            tge.l0();
        }
        return jsonURTSportsEvent$JsonSportsParticipant;
    }
    
    public static void _serialize(final JsonURTSportsEvent$JsonSportsParticipant jsonURTSportsEvent$JsonSportsParticipant, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("affiliation", jsonURTSportsEvent$JsonSportsParticipant.a);
        afe.t0("fullName", jsonURTSportsEvent$JsonSportsParticipant.b);
        afe.t0("id", jsonURTSportsEvent$JsonSportsParticipant.c);
        afe.t0("imageUrl", jsonURTSportsEvent$JsonSportsParticipant.d);
        afe.t0("status", jsonURTSportsEvent$JsonSportsParticipant.e);
        afe.V("twitterUserId", (long)jsonURTSportsEvent$JsonSportsParticipant.f);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTSportsEvent$JsonSportsParticipant jsonURTSportsEvent$JsonSportsParticipant, final String s, final tge tge) throws IOException {
        final boolean equals = "affiliation".equals(s);
        final Long n = null;
        if (equals) {
            jsonURTSportsEvent$JsonSportsParticipant.a = tge.T((String)null);
        }
        else if ("fullName".equals(s)) {
            jsonURTSportsEvent$JsonSportsParticipant.b = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonURTSportsEvent$JsonSportsParticipant.c = tge.T((String)null);
        }
        else if ("imageUrl".equals(s)) {
            jsonURTSportsEvent$JsonSportsParticipant.d = tge.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonURTSportsEvent$JsonSportsParticipant.e = tge.T((String)null);
        }
        else if ("twitterUserId".equals(s)) {
            Long value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.K();
            }
            jsonURTSportsEvent$JsonSportsParticipant.f = value;
        }
    }
    
    public JsonURTSportsEvent$JsonSportsParticipant parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTSportsEvent$JsonSportsParticipant jsonURTSportsEvent$JsonSportsParticipant, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTSportsEvent$JsonSportsParticipant, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTSportsEvent$JsonSportsParticipant)o, afe, b);
    }
}
