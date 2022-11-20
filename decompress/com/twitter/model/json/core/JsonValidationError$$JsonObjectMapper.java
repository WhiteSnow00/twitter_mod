// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import java.util.Iterator;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonValidationError$$JsonObjectMapper extends JsonMapper<JsonValidationError>
{
    public static JsonValidationError _parse(final tge tge) throws IOException {
        final JsonValidationError jsonValidationError = new JsonValidationError();
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
            parseField(jsonValidationError, d, tge);
            tge.l0();
        }
        return jsonValidationError;
    }
    
    public static void _serialize(final JsonValidationError jsonValidationError, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("code", (int)jsonValidationError.a);
        final List<pn6> c = jsonValidationError.c;
        if (c != null) {
            final Iterator g = hee.g(afe, "context", (List)c);
            while (g.hasNext()) {
                final pn6 pn6 = g.next();
                if (pn6 != null) {
                    LoganSquare.typeConverterFor((Class)pn6.class).serialize((Object)pn6, "lslocalcontextElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("reason", jsonValidationError.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonValidationError jsonValidationError, final String s, final tge tge) throws IOException {
        final boolean equals = "code".equals(s);
        final Integer n = null;
        if (equals) {
            Integer value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.y();
            }
            jsonValidationError.a = value;
        }
        else if ("context".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final pn6 pn6 = (pn6)LoganSquare.typeConverterFor((Class)pn6.class).parse(tge);
                    if (pn6 != null) {
                        c.add(pn6);
                    }
                }
                jsonValidationError.c = c;
            }
            else {
                jsonValidationError.c = null;
            }
        }
        else if ("reason".equals(s)) {
            jsonValidationError.b = tge.T((String)null);
        }
    }
    
    public JsonValidationError parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonValidationError jsonValidationError, final afe afe, final boolean b) throws IOException {
        _serialize(jsonValidationError, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonValidationError)o, afe, b);
    }
}
