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

public final class JsonURTFullCover$$JsonObjectMapper extends JsonMapper<JsonURTFullCover>
{
    public static final unv U_R_T_COVER_DISPLAY_TYPE_CONVERTER;
    public static final wov U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER;
    
    static {
        U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER = new wov();
        U_R_T_COVER_DISPLAY_TYPE_CONVERTER = new unv();
    }
    
    public static JsonURTFullCover _parse(final khe khe) throws IOException {
        final JsonURTFullCover jsonURTFullCover = new JsonURTFullCover();
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
            parseField(jsonURTFullCover, d, khe);
            khe.m0();
        }
        return jsonURTFullCover;
    }
    
    public static void _serialize(final JsonURTFullCover jsonURTFullCover, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTFullCover.f != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTFullCover.f, "detailText", true, tfe);
        }
        if (jsonURTFullCover.g != null) {
            LoganSquare.typeConverterFor((Class)eov.class).serialize((Object)jsonURTFullCover.g, "dismissInfo", true, tfe);
        }
        ((StringBasedTypeConverter)JsonURTFullCover$$JsonObjectMapper.U_R_T_COVER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonURTFullCover.a, "displayType", true, tfe);
        if (jsonURTFullCover.h != null) {
            LoganSquare.typeConverterFor((Class)szg.class).serialize((Object)jsonURTFullCover.h, "image", true, tfe);
        }
        ((StringBasedTypeConverter)JsonURTFullCover$$JsonObjectMapper.U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonURTFullCover.j, "imageDisplayType", true, tfe);
        final ArrayList i = jsonURTFullCover.i;
        if (i != null) {
            final Iterator g = q1a.g(tfe, "impressionCallbacks", i);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalimpressionCallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonURTFullCover.c != null) {
            LoganSquare.typeConverterFor((Class)snv.class).serialize((Object)jsonURTFullCover.c, "primaryCoverCta", true, tfe);
        }
        if (jsonURTFullCover.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTFullCover.b, "primaryText", true, tfe);
        }
        if (jsonURTFullCover.e != null) {
            LoganSquare.typeConverterFor((Class)snv.class).serialize((Object)jsonURTFullCover.e, "secondaryCoverCta", true, tfe);
        }
        if (jsonURTFullCover.d != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTFullCover.d, "secondaryText", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTFullCover jsonURTFullCover, final String s, final khe khe) throws IOException {
        if ("detailText".equals(s)) {
            jsonURTFullCover.f = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("dismissInfo".equals(s)) {
            jsonURTFullCover.g = (eov)LoganSquare.typeConverterFor((Class)eov.class).parse(khe);
        }
        else if (!"displayType".equals(s) && !"fullCoverDisplayType".equals(s)) {
            if ("image".equals(s)) {
                jsonURTFullCover.h = (szg)LoganSquare.typeConverterFor((Class)szg.class).parse(khe);
            }
            else if ("imageDisplayType".equals(s)) {
                jsonURTFullCover.j = (int)((StringBasedTypeConverter)JsonURTFullCover$$JsonObjectMapper.U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER).parse(khe);
            }
            else if ("impressionCallbacks".equals(s)) {
                if (khe.e() == lje.M0) {
                    final ArrayList i = new ArrayList();
                    while (khe.i0() != lje.N0) {
                        final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                        if (lnv != null) {
                            i.add(lnv);
                        }
                    }
                    jsonURTFullCover.i = i;
                }
                else {
                    jsonURTFullCover.i = null;
                }
            }
            else if ("primaryCoverCta".equals(s)) {
                jsonURTFullCover.c = (snv)LoganSquare.typeConverterFor((Class)snv.class).parse(khe);
            }
            else if ("primaryText".equals(s)) {
                jsonURTFullCover.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
            }
            else if ("secondaryCoverCta".equals(s)) {
                jsonURTFullCover.e = (snv)LoganSquare.typeConverterFor((Class)snv.class).parse(khe);
            }
            else if ("secondaryText".equals(s)) {
                jsonURTFullCover.d = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
            }
        }
        else {
            jsonURTFullCover.a = (int)((StringBasedTypeConverter)JsonURTFullCover$$JsonObjectMapper.U_R_T_COVER_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonURTFullCover parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTFullCover jsonURTFullCover, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTFullCover, tfe, b);
    }
}
