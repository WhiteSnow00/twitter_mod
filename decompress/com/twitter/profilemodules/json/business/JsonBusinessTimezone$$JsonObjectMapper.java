// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessTimezone$$JsonObjectMapper extends JsonMapper<JsonBusinessTimezone>
{
    public static JsonBusinessTimezone _parse(final tge tge) throws IOException {
        final JsonBusinessTimezone jsonBusinessTimezone = new JsonBusinessTimezone();
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
            parseField(jsonBusinessTimezone, d, tge);
            tge.l0();
        }
        return jsonBusinessTimezone;
    }
    
    public static void _serialize(final JsonBusinessTimezone jsonBusinessTimezone, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name", jsonBusinessTimezone.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessTimezone jsonBusinessTimezone, final String s, final tge tge) throws IOException {
        if ("name".equals(s)) {
            jsonBusinessTimezone.a = tge.T((String)null);
        }
    }
    
    public JsonBusinessTimezone parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessTimezone jsonBusinessTimezone, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessTimezone, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessTimezone)o, afe, b);
    }
}
