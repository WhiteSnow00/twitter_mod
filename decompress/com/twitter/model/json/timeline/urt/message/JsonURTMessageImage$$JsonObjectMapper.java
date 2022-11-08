// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.core.JsonMediaSizeVariant$$JsonObjectMapper;
import com.twitter.model.json.core.JsonMediaSizeVariant;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTMessageImage$$JsonObjectMapper extends JsonMapper<JsonURTMessageImage>
{
    public static JsonURTMessageImage _parse(final khe khe) throws IOException {
        final JsonURTMessageImage jsonURTMessageImage = new JsonURTMessageImage();
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
            parseField(jsonURTMessageImage, d, khe);
            khe.m0();
        }
        return jsonURTMessageImage;
    }
    
    public static void _serialize(final JsonURTMessageImage jsonURTMessageImage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("backgroundColor", jsonURTMessageImage.b);
        final ArrayList a = jsonURTMessageImage.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "imageVariants", a);
            while (g.hasNext()) {
                final JsonMediaSizeVariant jsonMediaSizeVariant = g.next();
                if (jsonMediaSizeVariant != null) {
                    JsonMediaSizeVariant$$JsonObjectMapper._serialize(jsonMediaSizeVariant, tfe, true);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTMessageImage jsonURTMessageImage, final String s, final khe khe) throws IOException {
        if ("backgroundColor".equals(s)) {
            jsonURTMessageImage.b = khe.T((String)null);
        }
        else if ("imageVariants".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonMediaSizeVariant parse = JsonMediaSizeVariant$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        a.add(parse);
                    }
                }
                jsonURTMessageImage.a = a;
            }
            else {
                jsonURTMessageImage.a = null;
            }
        }
    }
    
    public JsonURTMessageImage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTMessageImage jsonURTMessageImage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTMessageImage, tfe, b);
    }
}
