// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTDismissInfo$$JsonObjectMapper extends JsonMapper<JsonURTDismissInfo>
{
    public static JsonURTDismissInfo _parse(final khe khe) throws IOException {
        final JsonURTDismissInfo jsonURTDismissInfo = new JsonURTDismissInfo();
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
            parseField(jsonURTDismissInfo, d, khe);
            khe.m0();
        }
        return jsonURTDismissInfo;
    }
    
    public static void _serialize(final JsonURTDismissInfo jsonURTDismissInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonURTDismissInfo.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "callbacks", a);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalcallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTDismissInfo jsonURTDismissInfo, final String s, final khe khe) throws IOException {
        if ("callbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                    if (lnv != null) {
                        a.add(lnv);
                    }
                }
                jsonURTDismissInfo.a = a;
            }
            else {
                jsonURTDismissInfo.a = null;
            }
        }
    }
    
    public JsonURTDismissInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTDismissInfo jsonURTDismissInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTDismissInfo, tfe, b);
    }
}
