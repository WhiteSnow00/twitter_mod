// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwoFactorAuthMethod$$JsonObjectMapper extends JsonMapper<JsonTwoFactorAuthMethod>
{
    public static JsonTwoFactorAuthMethod _parse(final qhe qhe) throws IOException {
        final JsonTwoFactorAuthMethod jsonTwoFactorAuthMethod = new JsonTwoFactorAuthMethod();
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
            parseField(jsonTwoFactorAuthMethod, d, qhe);
            qhe.m0();
        }
        return jsonTwoFactorAuthMethod;
    }
    
    public static void _serialize(final JsonTwoFactorAuthMethod jsonTwoFactorAuthMethod, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("id", jsonTwoFactorAuthMethod.a);
        final ArrayList c = jsonTwoFactorAuthMethod.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "tags", c);
            while (e.hasNext()) {
                final div div = e.next();
                if (div != null) {
                    LoganSquare.typeConverterFor((Class)div.class).serialize((Object)div, "lslocaltagsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (jsonTwoFactorAuthMethod.b != null) {
            LoganSquare.typeConverterFor((Class)fiv.class).serialize((Object)jsonTwoFactorAuthMethod.b, "twoFactorType", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTwoFactorAuthMethod jsonTwoFactorAuthMethod, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonTwoFactorAuthMethod.a = qhe.L();
        }
        else if ("tags".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final div div = (div)LoganSquare.typeConverterFor((Class)div.class).parse(qhe);
                    if (div != null) {
                        c.add(div);
                    }
                }
                jsonTwoFactorAuthMethod.c = c;
            }
            else {
                jsonTwoFactorAuthMethod.c = null;
            }
        }
        else if ("twoFactorType".equals(s)) {
            jsonTwoFactorAuthMethod.b = (fiv)LoganSquare.typeConverterFor((Class)fiv.class).parse(qhe);
        }
    }
    
    public JsonTwoFactorAuthMethod parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTwoFactorAuthMethod jsonTwoFactorAuthMethod, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTwoFactorAuthMethod, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTwoFactorAuthMethod)o, yfe, b);
    }
}
