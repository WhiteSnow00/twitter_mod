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
    public static JsonUnhydratedEventsSummaryCoverMedia _parse(final tge tge) throws IOException {
        final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia = new JsonUnhydratedEventsSummaryCoverMedia();
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
            parseField(jsonUnhydratedEventsSummaryCoverMedia, d, tge);
            tge.l0();
        }
        return jsonUnhydratedEventsSummaryCoverMedia;
    }
    
    public static void _serialize(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonUnhydratedEventsSummaryCoverMedia.a != null) {
            afe.i("mediaEntity");
            JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper._serialize(jsonUnhydratedEventsSummaryCoverMedia.a, afe, true);
        }
        final ArrayList c = jsonUnhydratedEventsSummaryCoverMedia.c;
        if (c != null) {
            final Iterator a = br.A(afe, "imagePossibleCropping", c);
            while (a.hasNext()) {
                final v5d v5d = a.next();
                if (v5d != null) {
                    LoganSquare.typeConverterFor((Class)v5d.class).serialize((Object)v5d, "lslocalimagePossibleCroppingElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonUnhydratedEventsSummaryCoverMedia.b != null) {
            LoganSquare.typeConverterFor((Class)fwg.class).serialize((Object)jsonUnhydratedEventsSummaryCoverMedia.b, "mediaKey", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final String s, final tge tge) throws IOException {
        if ("mediaEntity".equals(s)) {
            jsonUnhydratedEventsSummaryCoverMedia.a = JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper._parse(tge);
        }
        else if ("imagePossibleCropping".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final v5d v5d = (v5d)LoganSquare.typeConverterFor((Class)v5d.class).parse(tge);
                    if (v5d != null) {
                        c.add(v5d);
                    }
                }
                jsonUnhydratedEventsSummaryCoverMedia.c = c;
            }
            else {
                jsonUnhydratedEventsSummaryCoverMedia.c = null;
            }
        }
        else if ("mediaKey".equals(s)) {
            jsonUnhydratedEventsSummaryCoverMedia.b = (fwg)LoganSquare.typeConverterFor((Class)fwg.class).parse(tge);
        }
    }
    
    public JsonUnhydratedEventsSummaryCoverMedia parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUnhydratedEventsSummaryCoverMedia jsonUnhydratedEventsSummaryCoverMedia, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUnhydratedEventsSummaryCoverMedia, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUnhydratedEventsSummaryCoverMedia)o, afe, b);
    }
}
