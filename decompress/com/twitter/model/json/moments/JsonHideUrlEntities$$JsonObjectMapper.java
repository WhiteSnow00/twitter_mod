// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHideUrlEntities$$JsonObjectMapper extends JsonMapper<JsonHideUrlEntities>
{
    public static JsonHideUrlEntities _parse(final khe khe) throws IOException {
        final JsonHideUrlEntities jsonHideUrlEntities = new JsonHideUrlEntities();
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
            parseField(jsonHideUrlEntities, d, khe);
            khe.m0();
        }
        return jsonHideUrlEntities;
    }
    
    public static void _serialize(final JsonHideUrlEntities jsonHideUrlEntities, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonHideUrlEntities.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "indices", a);
            while (g.hasNext()) {
                tfe.p((int)g.next());
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonHideUrlEntities jsonHideUrlEntities, final String s, final khe khe) throws IOException {
        if ("indices".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    Integer value;
                    if (khe.e() == lje.U0) {
                        value = null;
                    }
                    else {
                        value = khe.z();
                    }
                    if (value != null) {
                        a.add(value);
                    }
                }
                jsonHideUrlEntities.a = a;
            }
            else {
                jsonHideUrlEntities.a = null;
            }
        }
    }
    
    public JsonHideUrlEntities parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonHideUrlEntities jsonHideUrlEntities, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonHideUrlEntities, tfe, b);
    }
}
