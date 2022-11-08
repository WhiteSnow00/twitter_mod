// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTHalfCover$$JsonObjectMapper extends JsonMapper<JsonURTHalfCover>
{
    public static final unv U_R_T_COVER_DISPLAY_TYPE_CONVERTER;
    
    static {
        U_R_T_COVER_DISPLAY_TYPE_CONVERTER = new unv();
    }
    
    public static JsonURTHalfCover _parse(final khe khe) throws IOException {
        final JsonURTHalfCover jsonURTHalfCover = new JsonURTHalfCover();
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
            parseField(jsonURTHalfCover, d, khe);
            khe.m0();
        }
        return jsonURTHalfCover;
    }
    
    public static void _serialize(final JsonURTHalfCover jsonURTHalfCover, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTHalfCover.h != null) {
            LoganSquare.typeConverterFor((Class)vnv.class).serialize((Object)jsonURTHalfCover.h, "coverImage", true, tfe);
        }
        if (jsonURTHalfCover.g != null) {
            LoganSquare.typeConverterFor((Class)eov.class).serialize((Object)jsonURTHalfCover.g, "dismissInfo", true, tfe);
        }
        tfe.e("dismissible", jsonURTHalfCover.i);
        ((StringBasedTypeConverter)JsonURTHalfCover$$JsonObjectMapper.U_R_T_COVER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonURTHalfCover.a, "displayType", true, tfe);
        final ArrayList f = jsonURTHalfCover.f;
        if (f != null) {
            final Iterator g = q1a.g(tfe, "impressionCallbacks", f);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalimpressionCallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonURTHalfCover.c != null) {
            LoganSquare.typeConverterFor((Class)snv.class).serialize((Object)jsonURTHalfCover.c, "primaryCoverCta", true, tfe);
        }
        if (jsonURTHalfCover.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTHalfCover.b, "primaryText", true, tfe);
        }
        if (jsonURTHalfCover.e != null) {
            LoganSquare.typeConverterFor((Class)snv.class).serialize((Object)jsonURTHalfCover.e, "secondaryCoverCta", true, tfe);
        }
        if (jsonURTHalfCover.d != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTHalfCover.d, "secondaryText", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTHalfCover jsonURTHalfCover, final String s, final khe khe) throws IOException {
        if ("coverImage".equals(s)) {
            jsonURTHalfCover.h = (vnv)LoganSquare.typeConverterFor((Class)vnv.class).parse(khe);
        }
        else if ("dismissInfo".equals(s)) {
            jsonURTHalfCover.g = (eov)LoganSquare.typeConverterFor((Class)eov.class).parse(khe);
        }
        else if ("dismissible".equals(s)) {
            jsonURTHalfCover.i = khe.k();
        }
        else if (!"displayType".equals(s) && !"halfCoverDisplayType".equals(s)) {
            if ("impressionCallbacks".equals(s)) {
                if (khe.e() == lje.M0) {
                    final ArrayList f = new ArrayList();
                    while (khe.i0() != lje.N0) {
                        final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                        if (lnv != null) {
                            f.add(lnv);
                        }
                    }
                    jsonURTHalfCover.f = f;
                }
                else {
                    jsonURTHalfCover.f = null;
                }
            }
            else if ("primaryCoverCta".equals(s)) {
                jsonURTHalfCover.c = (snv)LoganSquare.typeConverterFor((Class)snv.class).parse(khe);
            }
            else if ("primaryText".equals(s)) {
                jsonURTHalfCover.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
            }
            else if ("secondaryCoverCta".equals(s)) {
                jsonURTHalfCover.e = (snv)LoganSquare.typeConverterFor((Class)snv.class).parse(khe);
            }
            else if ("secondaryText".equals(s)) {
                jsonURTHalfCover.d = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
            }
        }
        else {
            jsonURTHalfCover.a = (int)((StringBasedTypeConverter)JsonURTHalfCover$$JsonObjectMapper.U_R_T_COVER_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonURTHalfCover parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTHalfCover jsonURTHalfCover, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTHalfCover, tfe, b);
    }
}
