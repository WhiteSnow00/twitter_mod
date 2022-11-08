// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaProvider$$JsonObjectMapper extends JsonMapper<JsonFoundMediaProvider>
{
    public static JsonFoundMediaProvider _parse(final khe khe) throws IOException {
        final JsonFoundMediaProvider jsonFoundMediaProvider = new JsonFoundMediaProvider();
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
            parseField(jsonFoundMediaProvider, d, khe);
            khe.m0();
        }
        return jsonFoundMediaProvider;
    }
    
    public static void _serialize(final JsonFoundMediaProvider jsonFoundMediaProvider, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_name", jsonFoundMediaProvider.a);
        final ArrayList b2 = jsonFoundMediaProvider.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "icon_images", b2);
            while (g.hasNext()) {
                final pnb pnb = g.next();
                if (pnb != null) {
                    LoganSquare.typeConverterFor((Class)pnb.class).serialize((Object)pnb, "lslocalicon_imagesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("name", jsonFoundMediaProvider.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaProvider jsonFoundMediaProvider, final String s, final khe khe) throws IOException {
        if ("display_name".equals(s)) {
            jsonFoundMediaProvider.a = khe.T((String)null);
        }
        else if ("icon_images".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final pnb pnb = (pnb)LoganSquare.typeConverterFor((Class)pnb.class).parse(khe);
                    if (pnb != null) {
                        b.add(pnb);
                    }
                }
                jsonFoundMediaProvider.b = b;
            }
            else {
                jsonFoundMediaProvider.b = null;
            }
        }
        else if ("name".equals(s)) {
            jsonFoundMediaProvider.c = khe.T((String)null);
        }
    }
    
    public JsonFoundMediaProvider parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaProvider jsonFoundMediaProvider, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaProvider, tfe, b);
    }
}
