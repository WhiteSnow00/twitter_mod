// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocalFeatureSwitchesConfiguration$$JsonObjectMapper extends JsonMapper<JsonLocalFeatureSwitchesConfiguration>
{
    public static JsonLocalFeatureSwitchesConfiguration _parse(final tge tge) throws IOException {
        final JsonLocalFeatureSwitchesConfiguration jsonLocalFeatureSwitchesConfiguration = new JsonLocalFeatureSwitchesConfiguration();
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
            parseField(jsonLocalFeatureSwitchesConfiguration, d, tge);
            tge.l0();
        }
        return jsonLocalFeatureSwitchesConfiguration;
    }
    
    public static void _serialize(final JsonLocalFeatureSwitchesConfiguration jsonLocalFeatureSwitchesConfiguration, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final HashSet c = jsonLocalFeatureSwitchesConfiguration.c;
        if (c != null) {
            afe.i("experiment_names");
            afe.p0();
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                afe.r0((String)iterator.next());
            }
            afe.f();
        }
        if (jsonLocalFeatureSwitchesConfiguration.d != null) {
            LoganSquare.typeConverterFor((Class)jta.class).serialize((Object)jsonLocalFeatureSwitchesConfiguration.d, "debug", true, afe);
        }
        if (jsonLocalFeatureSwitchesConfiguration.a != null) {
            LoganSquare.typeConverterFor((Class)lta.class).serialize((Object)jsonLocalFeatureSwitchesConfiguration.a, "default", true, afe);
        }
        final ArrayList e = jsonLocalFeatureSwitchesConfiguration.e;
        if (e != null) {
            final Iterator a = br.A(afe, "embedded_experiments", e);
            while (a.hasNext()) {
                final mta mta = a.next();
                if (mta != null) {
                    LoganSquare.typeConverterFor((Class)mta.class).serialize((Object)mta, "lslocalembedded_experimentsElement", false, afe);
                }
            }
            afe.f();
        }
        final HashSet b2 = jsonLocalFeatureSwitchesConfiguration.b;
        if (b2 != null) {
            afe.i("requires_restart");
            afe.p0();
            final Iterator iterator2 = b2.iterator();
            while (iterator2.hasNext()) {
                afe.r0((String)iterator2.next());
            }
            afe.f();
        }
        if (jsonLocalFeatureSwitchesConfiguration.f != null) {
            LoganSquare.typeConverterFor((Class)vnp.class).serialize((Object)jsonLocalFeatureSwitchesConfiguration.f, "versions", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLocalFeatureSwitchesConfiguration jsonLocalFeatureSwitchesConfiguration, String t, final tge tge) throws IOException {
        if ("experiment_names".equals(t)) {
            if (tge.e() == vie.N0) {
                final HashSet c = new HashSet();
                while (tge.h0() != vie.O0) {
                    final String t2 = tge.T((String)null);
                    if (t2 != null) {
                        c.add(t2);
                    }
                }
                jsonLocalFeatureSwitchesConfiguration.c = c;
            }
            else {
                jsonLocalFeatureSwitchesConfiguration.c = null;
            }
        }
        else if ("debug".equals(t)) {
            jsonLocalFeatureSwitchesConfiguration.d = (jta)LoganSquare.typeConverterFor((Class)jta.class).parse(tge);
        }
        else if ("default".equals(t)) {
            jsonLocalFeatureSwitchesConfiguration.a = (lta)LoganSquare.typeConverterFor((Class)lta.class).parse(tge);
        }
        else if ("embedded_experiments".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mta mta = (mta)LoganSquare.typeConverterFor((Class)mta.class).parse(tge);
                    if (mta != null) {
                        e.add(mta);
                    }
                }
                jsonLocalFeatureSwitchesConfiguration.e = e;
            }
            else {
                jsonLocalFeatureSwitchesConfiguration.e = null;
            }
        }
        else if ("requires_restart".equals(t)) {
            if (tge.e() == vie.N0) {
                final HashSet b = new HashSet();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonLocalFeatureSwitchesConfiguration.b = b;
            }
            else {
                jsonLocalFeatureSwitchesConfiguration.b = null;
            }
        }
        else if ("versions".equals(t)) {
            jsonLocalFeatureSwitchesConfiguration.f = (vnp)LoganSquare.typeConverterFor((Class)vnp.class).parse(tge);
        }
    }
    
    public JsonLocalFeatureSwitchesConfiguration parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLocalFeatureSwitchesConfiguration jsonLocalFeatureSwitchesConfiguration, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLocalFeatureSwitchesConfiguration, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLocalFeatureSwitchesConfiguration)o, afe, b);
    }
}
