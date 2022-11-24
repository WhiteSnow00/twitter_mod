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
    public static final ubi NAVIGATION_LINK_TYPE_TYPE_CONVERTER;
    
    static {
        NAVIGATION_LINK_TYPE_TYPE_CONVERTER = new ubi();
    }
    
    public static JsonUiLink _parse(final qhe qhe) throws IOException {
        final JsonUiLink jsonUiLink = new JsonUiLink();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonUiLink, d, qhe);
            qhe.m0();
        }
        return jsonUiLink;
    }
    
    public static void _serialize(final JsonUiLink jsonUiLink, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList i = jsonUiLink.i;
        if (i != null) {
            final Iterator e = d10.E(yfe, "callbacks", i);
            while (e.hasNext()) {
                final g0p g0p = e.next();
                if (g0p != null) {
                    LoganSquare.typeConverterFor((Class)g0p.class).serialize((Object)g0p, "lslocalcallbacksElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.e("is_destructive", jsonUiLink.f);
        yfe.u0("label", jsonUiLink.d);
        yfe.u0("link_id", jsonUiLink.e);
        ((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).serialize((Object)jsonUiLink.a, "link_type", true, yfe);
        yfe.u0("subtask_id", jsonUiLink.c);
        if (jsonUiLink.h != null) {
            LoganSquare.typeConverterFor((Class)vtr.class).serialize((Object)jsonUiLink.h, "subtask_navigation_context", true, yfe);
        }
        yfe.e("suppress_client_events", jsonUiLink.g);
        yfe.u0("url", jsonUiLink.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUiLink jsonUiLink, final String s, final qhe qhe) throws IOException {
        if ("callbacks".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList i = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final g0p g0p = (g0p)LoganSquare.typeConverterFor((Class)g0p.class).parse(qhe);
                    if (g0p != null) {
                        i.add(g0p);
                    }
                }
                jsonUiLink.i = i;
            }
            else {
                jsonUiLink.i = null;
            }
        }
        else if ("is_destructive".equals(s)) {
            jsonUiLink.f = qhe.l();
        }
        else if ("label".equals(s)) {
            jsonUiLink.d = qhe.T((String)null);
        }
        else if ("link_id".equals(s)) {
            jsonUiLink.e = qhe.T((String)null);
        }
        else if ("link_type".equals(s)) {
            jsonUiLink.a = (int)((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("subtask_id".equals(s)) {
            jsonUiLink.c = qhe.T((String)null);
        }
        else if ("subtask_navigation_context".equals(s)) {
            jsonUiLink.h = (vtr)LoganSquare.typeConverterFor((Class)vtr.class).parse(qhe);
        }
        else if ("suppress_client_events".equals(s)) {
            jsonUiLink.g = qhe.l();
        }
        else if ("url".equals(s)) {
            jsonUiLink.b = qhe.T((String)null);
        }
    }
    
    public JsonUiLink parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUiLink jsonUiLink, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUiLink, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUiLink)o, yfe, b);
    }
}
