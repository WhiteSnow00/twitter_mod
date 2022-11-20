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
    public static JsonInterestPicker$JsonInterestGroup _parse(final tge tge) throws IOException {
        final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup = new JsonInterestPicker$JsonInterestGroup();
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
            parseField(jsonInterestPicker$JsonInterestGroup, d, tge);
            tge.l0();
        }
        return jsonInterestPicker$JsonInterestGroup;
    }
    
    public static void _serialize(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("header", jsonInterestPicker$JsonInterestGroup.a);
        final ArrayList b2 = jsonInterestPicker$JsonInterestGroup.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "items", b2);
            while (a.hasNext()) {
                final sud sud = a.next();
                if (sud != null) {
                    LoganSquare.typeConverterFor((Class)sud.class).serialize((Object)sud, "lslocalitemsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonInterestPicker$JsonInterestGroup.c != null) {
            LoganSquare.typeConverterFor((Class)noh.class).serialize((Object)jsonInterestPicker$JsonInterestGroup.c, "show_more", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final String s, final tge tge) throws IOException {
        if ("header".equals(s)) {
            jsonInterestPicker$JsonInterestGroup.a = tge.T((String)null);
        }
        else if ("items".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final sud sud = (sud)LoganSquare.typeConverterFor((Class)sud.class).parse(tge);
                    if (sud != null) {
                        b.add(sud);
                    }
                }
                jsonInterestPicker$JsonInterestGroup.b = b;
            }
            else {
                jsonInterestPicker$JsonInterestGroup.b = null;
            }
        }
        else if ("show_more".equals(s)) {
            jsonInterestPicker$JsonInterestGroup.c = (noh)LoganSquare.typeConverterFor((Class)noh.class).parse(tge);
        }
    }
    
    public JsonInterestPicker$JsonInterestGroup parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonInterestPicker$JsonInterestGroup jsonInterestPicker$JsonInterestGroup, final afe afe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker$JsonInterestGroup, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonInterestPicker$JsonInterestGroup)o, afe, b);
    }
}
