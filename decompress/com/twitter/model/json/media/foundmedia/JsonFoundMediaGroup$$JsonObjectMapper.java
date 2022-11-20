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
    public static JsonFoundMediaGroup _parse(final tge tge) throws IOException {
        final JsonFoundMediaGroup jsonFoundMediaGroup = new JsonFoundMediaGroup();
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
            parseField(jsonFoundMediaGroup, d, tge);
            tge.l0();
        }
        return jsonFoundMediaGroup;
    }
    
    public static void _serialize(final JsonFoundMediaGroup jsonFoundMediaGroup, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("display_name", jsonFoundMediaGroup.a);
        afe.t0("id", jsonFoundMediaGroup.b);
        if (jsonFoundMediaGroup.d != null) {
            LoganSquare.typeConverterFor((Class)mmb.class).serialize((Object)jsonFoundMediaGroup.d, "original_image", true, afe);
        }
        final ArrayList c = jsonFoundMediaGroup.c;
        if (c != null) {
            final Iterator a = br.A(afe, "thumbnail_images", c);
            while (a.hasNext()) {
                final mmb mmb = a.next();
                if (mmb != null) {
                    LoganSquare.typeConverterFor((Class)mmb.class).serialize((Object)mmb, "lslocalthumbnail_imagesElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaGroup jsonFoundMediaGroup, final String s, final tge tge) throws IOException {
        if ("display_name".equals(s)) {
            jsonFoundMediaGroup.a = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonFoundMediaGroup.b = tge.T((String)null);
        }
        else if ("original_image".equals(s)) {
            jsonFoundMediaGroup.d = (mmb)LoganSquare.typeConverterFor((Class)mmb.class).parse(tge);
        }
        else if ("thumbnail_images".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mmb mmb = (mmb)LoganSquare.typeConverterFor((Class)mmb.class).parse(tge);
                    if (mmb != null) {
                        c.add(mmb);
                    }
                }
                jsonFoundMediaGroup.c = c;
            }
            else {
                jsonFoundMediaGroup.c = null;
            }
        }
    }
    
    public JsonFoundMediaGroup parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaGroup jsonFoundMediaGroup, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaGroup, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaGroup)o, afe, b);
    }
}
