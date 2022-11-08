// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaData$$JsonObjectMapper extends JsonMapper<JsonFoundMediaData>
{
    public static JsonFoundMediaData _parse(final khe khe) throws IOException {
        final JsonFoundMediaData jsonFoundMediaData = new JsonFoundMediaData();
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
            parseField(jsonFoundMediaData, d, khe);
            khe.m0();
        }
        return jsonFoundMediaData;
    }
    
    public static void _serialize(final JsonFoundMediaData jsonFoundMediaData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonFoundMediaData.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "groups", a);
            while (g.hasNext()) {
                final nnb nnb = g.next();
                if (nnb != null) {
                    LoganSquare.typeConverterFor((Class)nnb.class).serialize((Object)nnb, "lslocalgroupsElement", false, tfe);
                }
            }
            tfe.f();
        }
        final ArrayList b2 = jsonFoundMediaData.b;
        if (b2 != null) {
            final Iterator g2 = q1a.g(tfe, "items", b2);
            while (g2.hasNext()) {
                final qnb qnb = g2.next();
                if (qnb != null) {
                    LoganSquare.typeConverterFor((Class)qnb.class).serialize((Object)qnb, "lslocalitemsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaData jsonFoundMediaData, final String s, final khe khe) throws IOException {
        if ("groups".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final nnb nnb = (nnb)LoganSquare.typeConverterFor((Class)nnb.class).parse(khe);
                    if (nnb != null) {
                        a.add(nnb);
                    }
                }
                jsonFoundMediaData.a = a;
            }
            else {
                jsonFoundMediaData.a = null;
            }
        }
        else if ("items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final qnb qnb = (qnb)LoganSquare.typeConverterFor((Class)qnb.class).parse(khe);
                    if (qnb != null) {
                        b.add(qnb);
                    }
                }
                jsonFoundMediaData.b = b;
            }
            else {
                jsonFoundMediaData.b = null;
            }
        }
    }
    
    public JsonFoundMediaData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaData jsonFoundMediaData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaData, tfe, b);
    }
}
