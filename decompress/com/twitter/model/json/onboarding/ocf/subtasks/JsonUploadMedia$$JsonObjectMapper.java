// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUploadMedia$$JsonObjectMapper extends JsonMapper<JsonUploadMedia>
{
    public static JsonUploadMedia _parse(final khe khe) throws IOException {
        final JsonUploadMedia jsonUploadMedia = new JsonUploadMedia();
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
            parseField(jsonUploadMedia, d, khe);
            khe.m0();
        }
        return jsonUploadMedia;
    }
    
    public static void _serialize(final JsonUploadMedia jsonUploadMedia, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUploadMedia.c != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonUploadMedia.c, tfe, true);
        }
        if (jsonUploadMedia.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonUploadMedia.b, "next_link", true, tfe);
        }
        final ArrayList a = jsonUploadMedia.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "sources", a);
            while (g.hasNext()) {
                final vzg vzg = g.next();
                if (vzg != null) {
                    LoganSquare.typeConverterFor((Class)vzg.class).serialize((Object)vzg, "lslocalsourcesElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUploadMedia jsonUploadMedia, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonUploadMedia.c = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonUploadMedia.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("sources".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final vzg vzg = (vzg)LoganSquare.typeConverterFor((Class)vzg.class).parse(khe);
                    if (vzg != null) {
                        a.add(vzg);
                    }
                }
                jsonUploadMedia.a = a;
            }
            else {
                jsonUploadMedia.a = null;
            }
        }
    }
    
    public JsonUploadMedia parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUploadMedia jsonUploadMedia, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUploadMedia, tfe, b);
    }
}
