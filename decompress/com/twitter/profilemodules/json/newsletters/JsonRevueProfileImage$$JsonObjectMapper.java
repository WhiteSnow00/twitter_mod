// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileImage$$JsonObjectMapper extends JsonMapper<JsonRevueProfileImage>
{
    public static JsonRevueProfileImage _parse(final tge tge) throws IOException {
        final JsonRevueProfileImage jsonRevueProfileImage = new JsonRevueProfileImage();
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
            parseField(jsonRevueProfileImage, d, tge);
            tge.l0();
        }
        return jsonRevueProfileImage;
    }
    
    public static void _serialize(final JsonRevueProfileImage jsonRevueProfileImage, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList b2 = jsonRevueProfileImage.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "image_variants", b2);
            while (a.hasNext()) {
                final dwm dwm = a.next();
                if (dwm != null) {
                    LoganSquare.typeConverterFor((Class)dwm.class).serialize((Object)dwm, "lslocalimage_variantsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonRevueProfileImage.a != null) {
            LoganSquare.typeConverterFor((Class)dwm.class).serialize((Object)jsonRevueProfileImage.a, "original_image", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileImage jsonRevueProfileImage, final String s, final tge tge) throws IOException {
        if ("image_variants".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final dwm dwm = (dwm)LoganSquare.typeConverterFor((Class)dwm.class).parse(tge);
                    if (dwm != null) {
                        b.add(dwm);
                    }
                }
                jsonRevueProfileImage.b = b;
            }
            else {
                jsonRevueProfileImage.b = null;
            }
        }
        else if ("original_image".equals(s)) {
            jsonRevueProfileImage.a = (dwm)LoganSquare.typeConverterFor((Class)dwm.class).parse(tge);
        }
    }
    
    public JsonRevueProfileImage parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueProfileImage jsonRevueProfileImage, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileImage, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileImage)o, afe, b);
    }
}
