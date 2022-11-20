// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.delegate;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDelegateMembership$$JsonObjectMapper extends JsonMapper<JsonDelegateMembership>
{
    public static final mm8 DELEGATION_INVITATION_STATUS_TYPE_CONVERTER;
    public static final pm8 DELEGATION_ROLE_TYPE_CONVERTER;
    
    static {
        DELEGATION_INVITATION_STATUS_TYPE_CONVERTER = new mm8();
        DELEGATION_ROLE_TYPE_CONVERTER = new pm8();
    }
    
    public static JsonDelegateMembership _parse(final tge tge) throws IOException {
        final JsonDelegateMembership jsonDelegateMembership = new JsonDelegateMembership();
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
            parseField(jsonDelegateMembership, d, tge);
            tge.l0();
        }
        return jsonDelegateMembership;
    }
    
    public static void _serialize(final JsonDelegateMembership jsonDelegateMembership, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final om8 b2 = jsonDelegateMembership.b;
        if (b2 != null) {
            JsonDelegateMembership$$JsonObjectMapper.DELEGATION_ROLE_TYPE_CONVERTER.serialize((Object)b2, "role", true, afe);
        }
        final lm8 c = jsonDelegateMembership.c;
        if (c != null) {
            JsonDelegateMembership$$JsonObjectMapper.DELEGATION_INVITATION_STATUS_TYPE_CONVERTER.serialize((Object)c, "status", true, afe);
        }
        if (jsonDelegateMembership.a != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonDelegateMembership.a, "user_results", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonDelegateMembership jsonDelegateMembership, final String s, final tge tge) throws IOException {
        if ("role".equals(s)) {
            jsonDelegateMembership.b = (om8)((StringBasedTypeConverter)JsonDelegateMembership$$JsonObjectMapper.DELEGATION_ROLE_TYPE_CONVERTER).parse(tge);
        }
        else if ("status".equals(s)) {
            jsonDelegateMembership.c = (lm8)((StringBasedTypeConverter)JsonDelegateMembership$$JsonObjectMapper.DELEGATION_INVITATION_STATUS_TYPE_CONVERTER).parse(tge);
        }
        else if ("user_results".equals(s)) {
            jsonDelegateMembership.a = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
    }
    
    public JsonDelegateMembership parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonDelegateMembership jsonDelegateMembership, final afe afe, final boolean b) throws IOException {
        _serialize(jsonDelegateMembership, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonDelegateMembership)o, afe, b);
    }
}
