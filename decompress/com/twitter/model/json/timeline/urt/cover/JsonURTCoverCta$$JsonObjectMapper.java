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

public final class JsonURTCoverCta$$JsonObjectMapper extends JsonMapper<JsonURTCoverCta>
{
    public static final q53 BUTTON_STYLE_TYPE_CONVERTER;
    public static final wke JSON_U_R_T_ICON_TYPE_CONVERTER;
    
    static {
        JSON_U_R_T_ICON_TYPE_CONVERTER = new wke();
        BUTTON_STYLE_TYPE_CONVERTER = new q53();
    }
    
    public static JsonURTCoverCta _parse(final khe khe) throws IOException {
        final JsonURTCoverCta jsonURTCoverCta = new JsonURTCoverCta();
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
            parseField(jsonURTCoverCta, d, khe);
            khe.m0();
        }
        return jsonURTCoverCta;
    }
    
    public static void _serialize(final JsonURTCoverCta jsonURTCoverCta, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonURTCoverCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).serialize((Object)jsonURTCoverCta.e, "buttonStyle", true, tfe);
        final ArrayList c = jsonURTCoverCta.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "callbacks", c);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalcallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonURTCoverCta.d != null) {
            LoganSquare.typeConverterFor((Class)qzo.class).serialize((Object)jsonURTCoverCta.d, "clientEventInfo", true, tfe);
        }
        if (jsonURTCoverCta.b != null) {
            LoganSquare.typeConverterFor((Class)snv$a.class).serialize((Object)jsonURTCoverCta.b, "ctaBehavior", true, tfe);
        }
        final uov f = jsonURTCoverCta.f;
        if (f != null) {
            ((StringBasedTypeConverter)JsonURTCoverCta$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER).serialize((Object)f, "icon", true, tfe);
        }
        tfe.u0("text", jsonURTCoverCta.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTCoverCta jsonURTCoverCta, final String s, final khe khe) throws IOException {
        if ("buttonStyle".equals(s)) {
            jsonURTCoverCta.e = (int)((StringBasedTypeConverter)JsonURTCoverCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("callbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                    if (lnv != null) {
                        c.add(lnv);
                    }
                }
                jsonURTCoverCta.c = c;
            }
            else {
                jsonURTCoverCta.c = null;
            }
        }
        else if ("clientEventInfo".equals(s)) {
            jsonURTCoverCta.d = (qzo)LoganSquare.typeConverterFor((Class)qzo.class).parse(khe);
        }
        else if ("ctaBehavior".equals(s)) {
            jsonURTCoverCta.b = (snv$a)LoganSquare.typeConverterFor((Class)snv$a.class).parse(khe);
        }
        else if ("icon".equals(s)) {
            jsonURTCoverCta.f = (uov)((StringBasedTypeConverter)JsonURTCoverCta$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonURTCoverCta.a = khe.T((String)null);
        }
    }
    
    public JsonURTCoverCta parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTCoverCta jsonURTCoverCta, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTCoverCta, tfe, b);
    }
}
