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
    public static JsonFoundMediaData _parse(final tge tge) throws IOException {
        final JsonFoundMediaData jsonFoundMediaData = new JsonFoundMediaData();
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
            parseField(jsonFoundMediaData, d, tge);
            tge.l0();
        }
        return jsonFoundMediaData;
    }
    
    public static void _serialize(final JsonFoundMediaData jsonFoundMediaData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonFoundMediaData.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "groups", a);
            while (a2.hasNext()) {
                final kmb kmb = a2.next();
                if (kmb != null) {
                    LoganSquare.typeConverterFor((Class)kmb.class).serialize((Object)kmb, "lslocalgroupsElement", false, afe);
                }
            }
            afe.f();
        }
        final ArrayList b2 = jsonFoundMediaData.b;
        if (b2 != null) {
            final Iterator a3 = br.A(afe, "items", b2);
            while (a3.hasNext()) {
                final nmb nmb = a3.next();
                if (nmb != null) {
                    LoganSquare.typeConverterFor((Class)nmb.class).serialize((Object)nmb, "lslocalitemsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaData jsonFoundMediaData, final String s, final tge tge) throws IOException {
        if ("groups".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final kmb kmb = (kmb)LoganSquare.typeConverterFor((Class)kmb.class).parse(tge);
                    if (kmb != null) {
                        a.add(kmb);
                    }
                }
                jsonFoundMediaData.a = a;
            }
            else {
                jsonFoundMediaData.a = null;
            }
        }
        else if ("items".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final nmb nmb = (nmb)LoganSquare.typeConverterFor((Class)nmb.class).parse(tge);
                    if (nmb != null) {
                        b.add(nmb);
                    }
                }
                jsonFoundMediaData.b = b;
            }
            else {
                jsonFoundMediaData.b = null;
            }
        }
    }
    
    public JsonFoundMediaData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaData jsonFoundMediaData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaData)o, afe, b);
    }
}
