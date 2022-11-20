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
    public static JsonFoundMediaItem _parse(final tge tge) throws IOException {
        final JsonFoundMediaItem jsonFoundMediaItem = new JsonFoundMediaItem();
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
            parseField(jsonFoundMediaItem, d, tge);
            tge.l0();
        }
        return jsonFoundMediaItem;
    }
    
    public static void _serialize(final JsonFoundMediaItem jsonFoundMediaItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("alt_text", jsonFoundMediaItem.h);
        if (jsonFoundMediaItem.d != null) {
            LoganSquare.typeConverterFor((Class)pmb.class).serialize((Object)jsonFoundMediaItem.d, "found_media_origin", true, afe);
        }
        afe.t0("id", jsonFoundMediaItem.c);
        afe.t0("item_type", jsonFoundMediaItem.b);
        if (jsonFoundMediaItem.g != null) {
            LoganSquare.typeConverterFor((Class)mmb.class).serialize((Object)jsonFoundMediaItem.g, "original_image", true, afe);
        }
        if (jsonFoundMediaItem.a != null) {
            LoganSquare.typeConverterFor((Class)qmb.class).serialize((Object)jsonFoundMediaItem.a, "provider", true, afe);
        }
        final ArrayList f = jsonFoundMediaItem.f;
        if (f != null) {
            final Iterator a = br.A(afe, "thumbnail_images", f);
            while (a.hasNext()) {
                final mmb mmb = a.next();
                if (mmb != null) {
                    LoganSquare.typeConverterFor((Class)mmb.class).serialize((Object)mmb, "lslocalthumbnail_imagesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("url", jsonFoundMediaItem.e);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaItem jsonFoundMediaItem, final String s, final tge tge) throws IOException {
        if ("alt_text".equals(s)) {
            jsonFoundMediaItem.h = tge.T((String)null);
        }
        else if ("found_media_origin".equals(s)) {
            jsonFoundMediaItem.d = (pmb)LoganSquare.typeConverterFor((Class)pmb.class).parse(tge);
        }
        else if ("id".equals(s)) {
            jsonFoundMediaItem.c = tge.T((String)null);
        }
        else if ("item_type".equals(s)) {
            jsonFoundMediaItem.b = tge.T((String)null);
        }
        else if ("original_image".equals(s)) {
            jsonFoundMediaItem.g = (mmb)LoganSquare.typeConverterFor((Class)mmb.class).parse(tge);
        }
        else if ("provider".equals(s)) {
            jsonFoundMediaItem.a = (qmb)LoganSquare.typeConverterFor((Class)qmb.class).parse(tge);
        }
        else if ("thumbnail_images".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList f = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mmb mmb = (mmb)LoganSquare.typeConverterFor((Class)mmb.class).parse(tge);
                    if (mmb != null) {
                        f.add(mmb);
                    }
                }
                jsonFoundMediaItem.f = f;
            }
            else {
                jsonFoundMediaItem.f = null;
            }
        }
        else if ("url".equals(s)) {
            jsonFoundMediaItem.e = tge.T((String)null);
        }
    }
    
    public JsonFoundMediaItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaItem jsonFoundMediaItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaItem)o, afe, b);
    }
}
