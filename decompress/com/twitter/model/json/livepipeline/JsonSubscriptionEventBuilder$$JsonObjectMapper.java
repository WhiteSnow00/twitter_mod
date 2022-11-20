// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubscriptionEventBuilder$$JsonObjectMapper extends JsonMapper<JsonSubscriptionEventBuilder>
{
    public static JsonSubscriptionEventBuilder _parse(final tge tge) throws IOException {
        final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder = new JsonSubscriptionEventBuilder();
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
            parseField(jsonSubscriptionEventBuilder, d, tge);
            tge.l0();
        }
        return jsonSubscriptionEventBuilder;
    }
    
    public static void _serialize(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final mnr[] a = jsonSubscriptionEventBuilder.a;
        if (a != null) {
            afe.i("errors");
            afe.p0();
            for (final mnr mnr : a) {
                if (mnr != null) {
                    LoganSquare.typeConverterFor((Class)mnr.class).serialize((Object)mnr, "lslocalerrorsElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final String s, final tge tge) throws IOException {
        if ("errors".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mnr mnr = (mnr)LoganSquare.typeConverterFor((Class)mnr.class).parse(tge);
                    if (mnr != null) {
                        list.add(mnr);
                    }
                }
                jsonSubscriptionEventBuilder.a = list.toArray(new mnr[list.size()]);
            }
            else {
                jsonSubscriptionEventBuilder.a = null;
            }
        }
    }
    
    public JsonSubscriptionEventBuilder parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionEventBuilder, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSubscriptionEventBuilder)o, afe, b);
    }
}
