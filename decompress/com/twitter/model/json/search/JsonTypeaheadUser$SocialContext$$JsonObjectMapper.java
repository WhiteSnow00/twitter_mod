// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadUser$SocialContext$$JsonObjectMapper extends JsonMapper<JsonTypeaheadUser.SocialContext>
{
    public static JsonTypeaheadUser.SocialContext _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadUser.SocialContext socialContext = new JsonTypeaheadUser.SocialContext();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(socialContext, d, qhe);
            qhe.m0();
        }
        return socialContext;
    }
    
    public static void _serialize(final JsonTypeaheadUser.SocialContext socialContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("followed_by", socialContext.b);
        yfe.e("following", socialContext.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadUser.SocialContext socialContext, final String s, final qhe qhe) throws IOException {
        if ("followed_by".equals(s)) {
            socialContext.b = qhe.l();
        }
        else if ("following".equals(s)) {
            socialContext.a = qhe.l();
        }
    }
    
    public JsonTypeaheadUser.SocialContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadUser.SocialContext socialContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(socialContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadUser.SocialContext)o, yfe, b);
    }
}
