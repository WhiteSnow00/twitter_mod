// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.common;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterErrors$$JsonObjectMapper extends JsonMapper<JsonTwitterErrors>
{
    public static JsonTwitterErrors _parse(final khe khe) throws IOException {
        final JsonTwitterErrors jsonTwitterErrors = new JsonTwitterErrors();
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
            parseField(jsonTwitterErrors, d, khe);
            khe.m0();
        }
        return jsonTwitterErrors;
    }
    
    public static void _serialize(final JsonTwitterErrors jsonTwitterErrors, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonTwitterErrors.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "errors", a);
            while (g.hasNext()) {
                final mav mav = g.next();
                if (mav != null) {
                    LoganSquare.typeConverterFor((Class)mav.class).serialize((Object)mav, "lslocalerrorsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterErrors jsonTwitterErrors, final String s, final khe khe) throws IOException {
        if ("errors".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final mav mav = (mav)LoganSquare.typeConverterFor((Class)mav.class).parse(khe);
                    if (mav != null) {
                        a.add(mav);
                    }
                }
                jsonTwitterErrors.a = a;
            }
            else {
                jsonTwitterErrors.a = null;
            }
        }
    }
    
    public JsonTwitterErrors parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterErrors jsonTwitterErrors, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTwitterErrors, tfe, b);
    }
}
