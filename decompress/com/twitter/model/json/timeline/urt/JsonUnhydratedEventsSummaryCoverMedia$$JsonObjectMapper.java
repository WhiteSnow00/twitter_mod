// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnhydratedEventsSummaryCoverMedia$$JsonObjectMapper extends JsonMapper<JsonUnhydratedEventsSummaryCoverMedia>
{
    public static JsonUnhydratedEventsSummaryCoverMedia _parse(final khe khe) throws IOException {
        final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia = new JsonUnhydratedEventsSummaryCoverMedia();
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
            parseField(jsonUnhydratedEventsSummaryCoverMedia, d, khe);
            khe.m0();
        }
        return jsonUnhydratedEventsSummaryCoverMedia;
    }
    
    public static void _serialize(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUnhydratedEventsSummaryCoverMedia.a != null) {
            tfe.i("mediaEntity");
            JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper._serialize(jsonUnhydratedEventsSummaryCoverMedia.a, tfe, true);
        }
        final ArrayList c = jsonUnhydratedEventsSummaryCoverMedia.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "imagePossibleCropping", c);
            while (g.hasNext()) {
                final r6d r6d = g.next();
                if (r6d != null) {
                    LoganSquare.typeConverterFor((Class)r6d.class).serialize((Object)r6d, "lslocalimagePossibleCroppingElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonUnhydratedEventsSummaryCoverMedia.b != null) {
            LoganSquare.typeConverterFor((Class)fwg.class).serialize((Object)jsonUnhydratedEventsSummaryCoverMedia.b, "mediaKey", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final String s, final khe khe) throws IOException {
        if ("mediaEntity".equals(s)) {
            jsonUnhydratedEventsSummaryCoverMedia.a = JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper._parse(khe);
        }
        else if ("imagePossibleCropping".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final r6d r6d = (r6d)LoganSquare.typeConverterFor((Class)r6d.class).parse(khe);
                    if (r6d != null) {
                        c.add(r6d);
                    }
                }
                jsonUnhydratedEventsSummaryCoverMedia.c = c;
            }
            else {
                jsonUnhydratedEventsSummaryCoverMedia.c = null;
            }
        }
        else if ("mediaKey".equals(s)) {
            jsonUnhydratedEventsSummaryCoverMedia.b = (fwg)LoganSquare.typeConverterFor((Class)fwg.class).parse(khe);
        }
    }
    
    public JsonUnhydratedEventsSummaryCoverMedia parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUnhydratedEventsSummaryCoverMedia, tfe, b);
    }
}
