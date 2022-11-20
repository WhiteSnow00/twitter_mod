// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceSharingsResponse$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceSharingsResponse>
{
    public static JsonAudioSpaceSharingsResponse _parse(final tge tge) throws IOException {
        final JsonAudioSpaceSharingsResponse jsonAudioSpaceSharingsResponse = new JsonAudioSpaceSharingsResponse();
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
            parseField(jsonAudioSpaceSharingsResponse, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceSharingsResponse;
    }
    
    public static void _serialize(final JsonAudioSpaceSharingsResponse jsonAudioSpaceSharingsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonAudioSpaceSharingsResponse.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "items", a);
            while (a2.hasNext()) {
                final y21 y21 = a2.next();
                if (y21 != null) {
                    LoganSquare.typeConverterFor((Class)y21.class).serialize((Object)y21, "lslocalitemsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceSharingsResponse jsonAudioSpaceSharingsResponse, final String s, final tge tge) throws IOException {
        if ("items".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final y21 y21 = (y21)LoganSquare.typeConverterFor((Class)y21.class).parse(tge);
                    if (y21 != null) {
                        a.add(y21);
                    }
                }
                jsonAudioSpaceSharingsResponse.a = a;
            }
            else {
                jsonAudioSpaceSharingsResponse.a = null;
            }
        }
    }
    
    public JsonAudioSpaceSharingsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceSharingsResponse jsonAudioSpaceSharingsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceSharingsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceSharingsResponse)o, afe, b);
    }
}
