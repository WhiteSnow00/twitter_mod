// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaGroup$$JsonObjectMapper extends JsonMapper<JsonFoundMediaGroup>
{
    public static JsonFoundMediaGroup _parse(final khe khe) throws IOException {
        final JsonFoundMediaGroup jsonFoundMediaGroup = new JsonFoundMediaGroup();
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
            parseField(jsonFoundMediaGroup, d, khe);
            khe.m0();
        }
        return jsonFoundMediaGroup;
    }
    
    public static void _serialize(final JsonFoundMediaGroup jsonFoundMediaGroup, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_name", jsonFoundMediaGroup.a);
        tfe.u0("id", jsonFoundMediaGroup.b);
        if (jsonFoundMediaGroup.d != null) {
            LoganSquare.typeConverterFor((Class)pnb.class).serialize((Object)jsonFoundMediaGroup.d, "original_image", true, tfe);
        }
        final ArrayList c = jsonFoundMediaGroup.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "thumbnail_images", c);
            while (g.hasNext()) {
                final pnb pnb = g.next();
                if (pnb != null) {
                    LoganSquare.typeConverterFor((Class)pnb.class).serialize((Object)pnb, "lslocalthumbnail_imagesElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaGroup jsonFoundMediaGroup, final String s, final khe khe) throws IOException {
        if ("display_name".equals(s)) {
            jsonFoundMediaGroup.a = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonFoundMediaGroup.b = khe.T((String)null);
        }
        else if ("original_image".equals(s)) {
            jsonFoundMediaGroup.d = (pnb)LoganSquare.typeConverterFor((Class)pnb.class).parse(khe);
        }
        else if ("thumbnail_images".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final pnb pnb = (pnb)LoganSquare.typeConverterFor((Class)pnb.class).parse(khe);
                    if (pnb != null) {
                        c.add(pnb);
                    }
                }
                jsonFoundMediaGroup.c = c;
            }
            else {
                jsonFoundMediaGroup.c = null;
            }
        }
    }
    
    public JsonFoundMediaGroup parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaGroup jsonFoundMediaGroup, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaGroup, tfe, b);
    }
}
