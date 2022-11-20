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
    public static final dbi NAVIGATION_LINK_TYPE_TYPE_CONVERTER;
    
    static {
        NAVIGATION_LINK_TYPE_TYPE_CONVERTER = new dbi();
    }
    
    public static JsonUiLink _parse(final tge tge) throws IOException {
        final JsonUiLink jsonUiLink = new JsonUiLink();
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
            parseField(jsonUiLink, d, tge);
            tge.l0();
        }
        return jsonUiLink;
    }
    
    public static void _serialize(final JsonUiLink jsonUiLink, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList i = jsonUiLink.i;
        if (i != null) {
            final Iterator a = br.A(afe, "callbacks", i);
            while (a.hasNext()) {
                final mzo mzo = a.next();
                if (mzo != null) {
                    LoganSquare.typeConverterFor((Class)mzo.class).serialize((Object)mzo, "lslocalcallbacksElement", false, afe);
                }
            }
            afe.f();
        }
        afe.e("is_destructive", jsonUiLink.f);
        afe.t0("label", jsonUiLink.d);
        afe.t0("link_id", jsonUiLink.e);
        ((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).serialize((Object)jsonUiLink.a, "link_type", true, afe);
        afe.t0("subtask_id", jsonUiLink.c);
        if (jsonUiLink.h != null) {
            LoganSquare.typeConverterFor((Class)xsr.class).serialize((Object)jsonUiLink.h, "subtask_navigation_context", true, afe);
        }
        afe.e("suppress_client_events", jsonUiLink.g);
        afe.t0("url", jsonUiLink.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUiLink jsonUiLink, final String s, final tge tge) throws IOException {
        if ("callbacks".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList i = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mzo mzo = (mzo)LoganSquare.typeConverterFor((Class)mzo.class).parse(tge);
                    if (mzo != null) {
                        i.add(mzo);
                    }
                }
                jsonUiLink.i = i;
            }
            else {
                jsonUiLink.i = null;
            }
        }
        else if ("is_destructive".equals(s)) {
            jsonUiLink.f = tge.k();
        }
        else if ("label".equals(s)) {
            jsonUiLink.d = tge.T((String)null);
        }
        else if ("link_id".equals(s)) {
            jsonUiLink.e = tge.T((String)null);
        }
        else if ("link_type".equals(s)) {
            jsonUiLink.a = (int)((StringBasedTypeConverter)JsonUiLink$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).parse(tge);
        }
        else if ("subtask_id".equals(s)) {
            jsonUiLink.c = tge.T((String)null);
        }
        else if ("subtask_navigation_context".equals(s)) {
            jsonUiLink.h = (xsr)LoganSquare.typeConverterFor((Class)xsr.class).parse(tge);
        }
        else if ("suppress_client_events".equals(s)) {
            jsonUiLink.g = tge.k();
        }
        else if ("url".equals(s)) {
            jsonUiLink.b = tge.T((String)null);
        }
    }
    
    public JsonUiLink parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUiLink jsonUiLink, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUiLink, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUiLink)o, afe, b);
    }
}
