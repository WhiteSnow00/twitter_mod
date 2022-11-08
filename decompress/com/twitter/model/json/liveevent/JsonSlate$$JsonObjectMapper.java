// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.card.JsonImageModel$$JsonObjectMapper;
import com.twitter.model.json.card.JsonImageModel;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSlate$$JsonObjectMapper extends JsonMapper<JsonSlate>
{
    public static JsonSlate _parse(final khe khe) throws IOException {
        final JsonSlate jsonSlate = new JsonSlate();
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
            parseField(jsonSlate, d, khe);
            khe.m0();
        }
        return jsonSlate;
    }
    
    public static void _serialize(final JsonSlate jsonSlate, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonSlate.h != null) {
            tfe.i("attribution");
            JsonLiveEventAttribution$$JsonObjectMapper._serialize(jsonSlate.h, tfe, true);
        }
        tfe.u0("display_name", jsonSlate.d);
        final ArrayList g = jsonSlate.g;
        if (g != null) {
            final Iterator g2 = q1a.g(tfe, "focus_rects", g);
            while (g2.hasNext()) {
                final JsonFocusRects jsonFocusRects = g2.next();
                if (jsonFocusRects != null) {
                    JsonFocusRects$$JsonObjectMapper._serialize(jsonFocusRects, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.u0("id", jsonSlate.a);
        tfe.u0("label", jsonSlate.b);
        tfe.u0("title", jsonSlate.c);
        tfe.u0("tweet_id", jsonSlate.f);
        final ArrayList e = jsonSlate.e;
        if (e != null) {
            final Iterator g3 = q1a.g(tfe, "variants", e);
            while (g3.hasNext()) {
                final JsonImageModel jsonImageModel = g3.next();
                if (jsonImageModel != null) {
                    JsonImageModel$$JsonObjectMapper._serialize(jsonImageModel, tfe, true);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSlate jsonSlate, final String s, final khe khe) throws IOException {
        if ("attribution".equals(s)) {
            jsonSlate.h = JsonLiveEventAttribution$$JsonObjectMapper._parse(khe);
        }
        else if ("display_name".equals(s)) {
            jsonSlate.d = khe.T((String)null);
        }
        else if ("focus_rects".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList g = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonFocusRects parse = JsonFocusRects$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        g.add(parse);
                    }
                }
                jsonSlate.g = g;
            }
            else {
                jsonSlate.g = null;
            }
        }
        else if ("id".equals(s)) {
            jsonSlate.a = khe.T((String)null);
        }
        else if ("label".equals(s)) {
            jsonSlate.b = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonSlate.c = khe.T((String)null);
        }
        else if ("tweet_id".equals(s)) {
            jsonSlate.f = khe.T((String)null);
        }
        else if ("variants".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonImageModel parse2 = JsonImageModel$$JsonObjectMapper._parse(khe);
                    if (parse2 != null) {
                        e.add(parse2);
                    }
                }
                jsonSlate.e = e;
            }
            else {
                jsonSlate.e = null;
            }
        }
    }
    
    public JsonSlate parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSlate jsonSlate, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSlate, tfe, b);
    }
}
