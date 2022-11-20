// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesEmbeddedExperiment$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesEmbeddedExperiment>
{
    public static JsonFeatureSwitchesEmbeddedExperiment _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesEmbeddedExperiment jsonFeatureSwitchesEmbeddedExperiment = new JsonFeatureSwitchesEmbeddedExperiment();
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
            parseField(jsonFeatureSwitchesEmbeddedExperiment, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesEmbeddedExperiment;
    }
    
    public static void _serialize(final JsonFeatureSwitchesEmbeddedExperiment jsonFeatureSwitchesEmbeddedExperiment, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList c = jsonFeatureSwitchesEmbeddedExperiment.c;
        if (c != null) {
            final Iterator a = br.A(afe, "buckets", c);
            while (a.hasNext()) {
                final mta$b mta$b = a.next();
                if (mta$b != null) {
                    LoganSquare.typeConverterFor((Class)mta$b.class).serialize((Object)mta$b, "lslocalbucketsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("end_time", jsonFeatureSwitchesEmbeddedExperiment.e);
        afe.t0("name", jsonFeatureSwitchesEmbeddedExperiment.a);
        afe.t0("start_time", jsonFeatureSwitchesEmbeddedExperiment.d);
        afe.T("version", jsonFeatureSwitchesEmbeddedExperiment.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesEmbeddedExperiment jsonFeatureSwitchesEmbeddedExperiment, final String s, final tge tge) throws IOException {
        if ("buckets".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mta$b mta$b = (mta$b)LoganSquare.typeConverterFor((Class)mta$b.class).parse(tge);
                    if (mta$b != null) {
                        c.add(mta$b);
                    }
                }
                jsonFeatureSwitchesEmbeddedExperiment.c = c;
            }
            else {
                jsonFeatureSwitchesEmbeddedExperiment.c = null;
            }
        }
        else if ("end_time".equals(s)) {
            jsonFeatureSwitchesEmbeddedExperiment.e = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonFeatureSwitchesEmbeddedExperiment.a = tge.T((String)null);
        }
        else if ("start_time".equals(s)) {
            jsonFeatureSwitchesEmbeddedExperiment.d = tge.T((String)null);
        }
        else if ("version".equals(s)) {
            jsonFeatureSwitchesEmbeddedExperiment.b = tge.y();
        }
    }
    
    public JsonFeatureSwitchesEmbeddedExperiment parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesEmbeddedExperiment jsonFeatureSwitchesEmbeddedExperiment, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesEmbeddedExperiment, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesEmbeddedExperiment)o, afe, b);
    }
}
