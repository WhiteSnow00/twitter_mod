// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceParticipant$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceParticipant>
{
    public static JsonAudioSpaceParticipant _parse(final tge tge) throws IOException {
        final JsonAudioSpaceParticipant jsonAudioSpaceParticipant = new JsonAudioSpaceParticipant();
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
            parseField(jsonAudioSpaceParticipant, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceParticipant;
    }
    
    public static void _serialize(final JsonAudioSpaceParticipant jsonAudioSpaceParticipant, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("community_role", jsonAudioSpaceParticipant.f);
        afe.e("is_muted_by_admin", (boolean)jsonAudioSpaceParticipant.b);
        afe.e("is_muted_by_guest", (boolean)jsonAudioSpaceParticipant.c);
        afe.t0("raise_hand_emoji", jsonAudioSpaceParticipant.d);
        afe.t0("user_id", jsonAudioSpaceParticipant.a);
        if (jsonAudioSpaceParticipant.e != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonAudioSpaceParticipant.e, "user_results", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceParticipant jsonAudioSpaceParticipant, final String s, final tge tge) throws IOException {
        final boolean equals = "community_role".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        if (equals) {
            jsonAudioSpaceParticipant.f = tge.T((String)null);
        }
        else if ("is_muted_by_admin".equals(s)) {
            Boolean value;
            if (tge.e() == vie.V0) {
                value = b2;
            }
            else {
                value = tge.k();
            }
            jsonAudioSpaceParticipant.b = value;
        }
        else if ("is_muted_by_guest".equals(s)) {
            Boolean value2;
            if (tge.e() == vie.V0) {
                value2 = b;
            }
            else {
                value2 = tge.k();
            }
            jsonAudioSpaceParticipant.c = value2;
        }
        else if ("raise_hand_emoji".equals(s)) {
            jsonAudioSpaceParticipant.d = tge.T((String)null);
        }
        else if ("user_id".equals(s)) {
            jsonAudioSpaceParticipant.a = tge.T((String)null);
        }
        else if ("user_results".equals(s)) {
            jsonAudioSpaceParticipant.e = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
    }
    
    public JsonAudioSpaceParticipant parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceParticipant jsonAudioSpaceParticipant, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceParticipant, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceParticipant)o, afe, b);
    }
}
