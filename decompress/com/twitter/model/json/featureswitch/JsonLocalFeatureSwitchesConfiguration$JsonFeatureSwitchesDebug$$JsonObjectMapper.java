// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug$$JsonObjectMapper extends JsonMapper<JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug>
{
    public static JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug _parse(final khe khe) throws IOException {
        final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug = new JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug();
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
            parseField(jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug, d, khe);
            khe.m0();
        }
        return jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug;
    }
    
    public static void _serialize(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "facets", a);
            while (g.hasNext()) {
                final rua rua = g.next();
                if (rua != null) {
                    LoganSquare.typeConverterFor((Class)rua.class).serialize((Object)rua, "lslocalfacetsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug, final String s, final khe khe) throws IOException {
        if ("facets".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final rua rua = (rua)LoganSquare.typeConverterFor((Class)rua.class).parse(khe);
                    if (rua != null) {
                        a.add(rua);
                    }
                }
                jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug.a = a;
            }
            else {
                jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug.a = null;
            }
        }
    }
    
    public JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLocalFeatureSwitchesConfiguration$JsonFeatureSwitchesDebug, tfe, b);
    }
}
