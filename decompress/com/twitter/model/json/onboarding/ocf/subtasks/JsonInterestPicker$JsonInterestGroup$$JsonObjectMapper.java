// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestPicker$JsonInterestGroup$$JsonObjectMapper extends JsonMapper<JsonInterestPicker$JsonInterestGroup>
{
    public static JsonInterestPicker$JsonInterestGroup _parse(final khe khe) throws IOException {
        final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup = new JsonInterestPicker$JsonInterestGroup();
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
            parseField(jsonInterestPicker$JsonInterestGroup, d, khe);
            khe.m0();
        }
        return jsonInterestPicker$JsonInterestGroup;
    }
    
    public static void _serialize(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("header", jsonInterestPicker$JsonInterestGroup.a);
        final ArrayList b2 = jsonInterestPicker$JsonInterestGroup.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "items", b2);
            while (g.hasNext()) {
                final pvd pvd = g.next();
                if (pvd != null) {
                    LoganSquare.typeConverterFor((Class)pvd.class).serialize((Object)pvd, "lslocalitemsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonInterestPicker$JsonInterestGroup.c != null) {
            LoganSquare.typeConverterFor((Class)ioh.class).serialize((Object)jsonInterestPicker$JsonInterestGroup.c, "show_more", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final String s, final khe khe) throws IOException {
        if ("header".equals(s)) {
            jsonInterestPicker$JsonInterestGroup.a = khe.T((String)null);
        }
        else if ("items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final pvd pvd = (pvd)LoganSquare.typeConverterFor((Class)pvd.class).parse(khe);
                    if (pvd != null) {
                        b.add(pvd);
                    }
                }
                jsonInterestPicker$JsonInterestGroup.b = b;
            }
            else {
                jsonInterestPicker$JsonInterestGroup.b = null;
            }
        }
        else if ("show_more".equals(s)) {
            jsonInterestPicker$JsonInterestGroup.c = (ioh)LoganSquare.typeConverterFor((Class)ioh.class).parse(khe);
        }
    }
    
    public JsonInterestPicker$JsonInterestGroup parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker$JsonInterestGroup, tfe, b);
    }
}
