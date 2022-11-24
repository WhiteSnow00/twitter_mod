// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEventImage$$JsonObjectMapper extends JsonMapper<JsonEventImage>
{
    public static JsonEventImage _parse(final qhe qhe) throws IOException {
        final JsonEventImage jsonEventImage = new JsonEventImage();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonEventImage, d, qhe);
            qhe.m0();
        }
        return jsonEventImage;
    }
    
    public static void _serialize(final JsonEventImage jsonEventImage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("height", jsonEventImage.c);
        final ArrayList d = jsonEventImage.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "palette", d);
            while (e.hasNext()) {
                final ur4 ur4 = e.next();
                if (ur4 != null) {
                    LoganSquare.typeConverterFor((Class)ur4.class).serialize((Object)ur4, "lslocalpaletteElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.u0("url", jsonEventImage.a);
        yfe.T("width", jsonEventImage.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEventImage jsonEventImage, final String s, final qhe qhe) throws IOException {
        if ("height".equals(s)) {
            jsonEventImage.c = qhe.z();
        }
        else if ("palette".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ur4 ur4 = (ur4)LoganSquare.typeConverterFor((Class)ur4.class).parse(qhe);
                    if (ur4 != null) {
                        d.add(ur4);
                    }
                }
                jsonEventImage.d = d;
            }
            else {
                jsonEventImage.d = null;
            }
        }
        else if ("url".equals(s)) {
            jsonEventImage.a = qhe.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonEventImage.b = qhe.z();
        }
    }
    
    public JsonEventImage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEventImage jsonEventImage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEventImage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEventImage)o, yfe, b);
    }
}
