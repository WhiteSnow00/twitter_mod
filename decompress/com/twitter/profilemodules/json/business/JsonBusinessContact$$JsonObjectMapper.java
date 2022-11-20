// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessContact$$JsonObjectMapper extends JsonMapper<JsonBusinessContact>
{
    public static JsonBusinessContact _parse(final tge tge) throws IOException {
        final JsonBusinessContact jsonBusinessContact = new JsonBusinessContact();
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
            parseField(jsonBusinessContact, d, tge);
            tge.l0();
        }
        return jsonBusinessContact;
    }
    
    public static void _serialize(final JsonBusinessContact jsonBusinessContact, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonBusinessContact.b != null) {
            LoganSquare.typeConverterFor((Class)mu2.class).serialize((Object)jsonBusinessContact.b, "email", true, afe);
        }
        if (jsonBusinessContact.a != null) {
            LoganSquare.typeConverterFor((Class)pu2.class).serialize((Object)jsonBusinessContact.a, "phone", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessContact jsonBusinessContact, final String s, final tge tge) throws IOException {
        if ("email".equals(s)) {
            jsonBusinessContact.b = (mu2)LoganSquare.typeConverterFor((Class)mu2.class).parse(tge);
        }
        else if ("phone".equals(s)) {
            jsonBusinessContact.a = (pu2)LoganSquare.typeConverterFor((Class)pu2.class).parse(tge);
        }
    }
    
    public JsonBusinessContact parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessContact jsonBusinessContact, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessContact, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessContact)o, afe, b);
    }
}
