// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaItem$$JsonObjectMapper extends JsonMapper<JsonFoundMediaItem>
{
    public static JsonFoundMediaItem _parse(final khe khe) throws IOException {
        final JsonFoundMediaItem jsonFoundMediaItem = new JsonFoundMediaItem();
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
            parseField(jsonFoundMediaItem, d, khe);
            khe.m0();
        }
        return jsonFoundMediaItem;
    }
    
    public static void _serialize(final JsonFoundMediaItem jsonFoundMediaItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("alt_text", jsonFoundMediaItem.h);
        if (jsonFoundMediaItem.d != null) {
            LoganSquare.typeConverterFor((Class)snb.class).serialize((Object)jsonFoundMediaItem.d, "found_media_origin", true, tfe);
        }
        tfe.u0("id", jsonFoundMediaItem.c);
        tfe.u0("item_type", jsonFoundMediaItem.b);
        if (jsonFoundMediaItem.g != null) {
            LoganSquare.typeConverterFor((Class)pnb.class).serialize((Object)jsonFoundMediaItem.g, "original_image", true, tfe);
        }
        if (jsonFoundMediaItem.a != null) {
            LoganSquare.typeConverterFor((Class)tnb.class).serialize((Object)jsonFoundMediaItem.a, "provider", true, tfe);
        }
        final ArrayList f = jsonFoundMediaItem.f;
        if (f != null) {
            final Iterator g = q1a.g(tfe, "thumbnail_images", f);
            while (g.hasNext()) {
                final pnb pnb = g.next();
                if (pnb != null) {
                    LoganSquare.typeConverterFor((Class)pnb.class).serialize((Object)pnb, "lslocalthumbnail_imagesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("url", jsonFoundMediaItem.e);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaItem jsonFoundMediaItem, final String s, final khe khe) throws IOException {
        if ("alt_text".equals(s)) {
            jsonFoundMediaItem.h = khe.T((String)null);
        }
        else if ("found_media_origin".equals(s)) {
            jsonFoundMediaItem.d = (snb)LoganSquare.typeConverterFor((Class)snb.class).parse(khe);
        }
        else if ("id".equals(s)) {
            jsonFoundMediaItem.c = khe.T((String)null);
        }
        else if ("item_type".equals(s)) {
            jsonFoundMediaItem.b = khe.T((String)null);
        }
        else if ("original_image".equals(s)) {
            jsonFoundMediaItem.g = (pnb)LoganSquare.typeConverterFor((Class)pnb.class).parse(khe);
        }
        else if ("provider".equals(s)) {
            jsonFoundMediaItem.a = (tnb)LoganSquare.typeConverterFor((Class)tnb.class).parse(khe);
        }
        else if ("thumbnail_images".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList f = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final pnb pnb = (pnb)LoganSquare.typeConverterFor((Class)pnb.class).parse(khe);
                    if (pnb != null) {
                        f.add(pnb);
                    }
                }
                jsonFoundMediaItem.f = f;
            }
            else {
                jsonFoundMediaItem.f = null;
            }
        }
        else if ("url".equals(s)) {
            jsonFoundMediaItem.e = khe.T((String)null);
        }
    }
    
    public JsonFoundMediaItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaItem jsonFoundMediaItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaItem, tfe, b);
    }
}
