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
    public static JsonSubscriptionEventBuilder _parse(final khe khe) throws IOException {
        final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder = new JsonSubscriptionEventBuilder();
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
            parseField(jsonSubscriptionEventBuilder, d, khe);
            khe.m0();
        }
        return jsonSubscriptionEventBuilder;
    }
    
    public static void _serialize(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final tmr[] a = jsonSubscriptionEventBuilder.a;
        if (a != null) {
            tfe.i("errors");
            tfe.q0();
            for (final tmr tmr : a) {
                if (tmr != null) {
                    LoganSquare.typeConverterFor((Class)tmr.class).serialize((Object)tmr, "lslocalerrorsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final String s, final khe khe) throws IOException {
        if ("errors".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final tmr tmr = (tmr)LoganSquare.typeConverterFor((Class)tmr.class).parse(khe);
                    if (tmr != null) {
                        list.add(tmr);
                    }
                }
                jsonSubscriptionEventBuilder.a = list.toArray(new tmr[list.size()]);
            }
            else {
                jsonSubscriptionEventBuilder.a = null;
            }
        }
    }
    
    public JsonSubscriptionEventBuilder parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubscriptionEventBuilder jsonSubscriptionEventBuilder, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubscriptionEventBuilder, tfe, b);
    }
}
