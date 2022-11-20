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
    public static JsonFoundMediaProvider _parse(final tge tge) throws IOException {
        final JsonFoundMediaProvider jsonFoundMediaProvider = new JsonFoundMediaProvider();
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
            parseField(jsonFoundMediaProvider, d, tge);
            tge.l0();
        }
        return jsonFoundMediaProvider;
    }
    
    public static void _serialize(final JsonFoundMediaProvider jsonFoundMediaProvider, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("display_name", jsonFoundMediaProvider.a);
        final ArrayList b2 = jsonFoundMediaProvider.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "icon_images", b2);
            while (a.hasNext()) {
                final mmb mmb = a.next();
                if (mmb != null) {
                    LoganSquare.typeConverterFor((Class)mmb.class).serialize((Object)mmb, "lslocalicon_imagesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("name", jsonFoundMediaProvider.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaProvider jsonFoundMediaProvider, final String s, final tge tge) throws IOException {
        if ("display_name".equals(s)) {
            jsonFoundMediaProvider.a = tge.T((String)null);
        }
        else if ("icon_images".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mmb mmb = (mmb)LoganSquare.typeConverterFor((Class)mmb.class).parse(tge);
                    if (mmb != null) {
                        b.add(mmb);
                    }
                }
                jsonFoundMediaProvider.b = b;
            }
            else {
                jsonFoundMediaProvider.b = null;
            }
        }
        else if ("name".equals(s)) {
            jsonFoundMediaProvider.c = tge.T((String)null);
        }
    }
    
    public JsonFoundMediaProvider parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaProvider jsonFoundMediaProvider, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaProvider, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaProvider)o, afe, b);
    }
}
