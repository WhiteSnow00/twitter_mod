// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceSharing$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceSharing>
{
    public static JsonAudioSpaceSharing _parse(final tge tge) throws IOException {
        final JsonAudioSpaceSharing jsonAudioSpaceSharing = new JsonAudioSpaceSharing();
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
            parseField(jsonAudioSpaceSharing, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceSharing;
    }
    
    public static void _serialize(final JsonAudioSpaceSharing jsonAudioSpaceSharing, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("created_at_ms", jsonAudioSpaceSharing.c);
        if (jsonAudioSpaceSharing.e != null) {
            LoganSquare.typeConverterFor((Class)w21.class).serialize((Object)jsonAudioSpaceSharing.e, "shared_item", true, afe);
        }
        afe.t0("sharing_id", jsonAudioSpaceSharing.a);
        afe.V("updated_at_ms", jsonAudioSpaceSharing.d);
        if (jsonAudioSpaceSharing.b != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonAudioSpaceSharing.b, "user_results", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceSharing jsonAudioSpaceSharing, final String s, final tge tge) throws IOException {
        if ("created_at_ms".equals(s)) {
            jsonAudioSpaceSharing.c = tge.K();
        }
        else if ("shared_item".equals(s)) {
            jsonAudioSpaceSharing.e = (w21)LoganSquare.typeConverterFor((Class)w21.class).parse(tge);
        }
        else if ("sharing_id".equals(s)) {
            jsonAudioSpaceSharing.a = tge.T((String)null);
        }
        else if ("updated_at_ms".equals(s)) {
            jsonAudioSpaceSharing.d = tge.K();
        }
        else if ("user_results".equals(s)) {
            jsonAudioSpaceSharing.b = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
    }
    
    public JsonAudioSpaceSharing parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceSharing jsonAudioSpaceSharing, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceSharing, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceSharing)o, afe, b);
    }
}
