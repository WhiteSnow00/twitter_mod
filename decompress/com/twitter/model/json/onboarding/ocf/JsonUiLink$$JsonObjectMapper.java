// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUiLink$$JsonObjectMapper extends JsonMapper<JsonUiLink>
{
    public static final bbi NAVIGATION_LINK_TYPE_TYPE_CONVERTER;
    
    static {
        NAVIGATION_LINK_TYPE_TYPE_CONVERTER = new bbi();
    }
    
    public static JsonUiLink _parse(final khe khe) throws IOException {
        final JsonUiLink jsonUiLink = new JsonUiLink();
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
            parseField(jsonUiLink, d, khe);
            khe.m0();
        }
        return jsonUiLink;
    }
    
    public static void _serialize(final JsonUiLink jsonUiLink, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList i = jsonUiLink.i;
        if (i != null) {
            final Iterator g = q1a.g(tfe, "callbacks", i);
            while (g.hasNext()) {
                final wyo wyo = g.next();
                if (wyo != null) {
                    LoganSquare.typeConverterFor((Class)wyo.class).serialize((Object)wyo, "lslocalcallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.e("is_destructive", jsonUiLink.f);
        tfe.u0("label", jsonUiLink.d);
        tfe.u0("link_id", jsonUiLink.e);
        ((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).serialize((Object)jsonUiLink.a, "link_type", true, tfe);
        tfe.u0("subtask_id", jsonUiLink.c);
        if (jsonUiLink.h != null) {
            LoganSquare.typeConverterFor((Class)fsr.class).serialize((Object)jsonUiLink.h, "subtask_navigation_context", true, tfe);
        }
        tfe.e("suppress_client_events", jsonUiLink.g);
        tfe.u0("url", jsonUiLink.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUiLink jsonUiLink, final String s, final khe khe) throws IOException {
        if ("callbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList i = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final wyo wyo = (wyo)LoganSquare.typeConverterFor((Class)wyo.class).parse(khe);
                    if (wyo != null) {
                        i.add(wyo);
                    }
                }
                jsonUiLink.i = i;
            }
            else {
                jsonUiLink.i = null;
            }
        }
        else if ("is_destructive".equals(s)) {
            jsonUiLink.f = khe.k();
        }
        else if ("label".equals(s)) {
            jsonUiLink.d = khe.T((String)null);
        }
        else if ("link_id".equals(s)) {
            jsonUiLink.e = khe.T((String)null);
        }
        else if ("link_type".equals(s)) {
            jsonUiLink.a = (int)((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).parse(khe);
        }
        else if ("subtask_id".equals(s)) {
            jsonUiLink.c = khe.T((String)null);
        }
        else if ("subtask_navigation_context".equals(s)) {
            jsonUiLink.h = (fsr)LoganSquare.typeConverterFor((Class)fsr.class).parse(khe);
        }
        else if ("suppress_client_events".equals(s)) {
            jsonUiLink.g = khe.k();
        }
        else if ("url".equals(s)) {
            jsonUiLink.b = khe.T((String)null);
        }
    }
    
    public JsonUiLink parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUiLink jsonUiLink, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUiLink, tfe, b);
    }
}
