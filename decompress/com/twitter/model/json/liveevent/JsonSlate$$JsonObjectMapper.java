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
    public static JsonSlate _parse(final tge tge) throws IOException {
        final JsonSlate jsonSlate = new JsonSlate();
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
            parseField(jsonSlate, d, tge);
            tge.l0();
        }
        return jsonSlate;
    }
    
    public static void _serialize(final JsonSlate jsonSlate, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSlate.h != null) {
            afe.i("attribution");
            JsonLiveEventAttribution$$JsonObjectMapper._serialize(jsonSlate.h, afe, true);
        }
        afe.t0("display_name", jsonSlate.d);
        final ArrayList g = jsonSlate.g;
        if (g != null) {
            final Iterator a = br.A(afe, "focus_rects", g);
            while (a.hasNext()) {
                final JsonFocusRects jsonFocusRects = a.next();
                if (jsonFocusRects != null) {
                    JsonFocusRects$$JsonObjectMapper._serialize(jsonFocusRects, afe, true);
                }
            }
            afe.f();
        }
        afe.t0("id", jsonSlate.a);
        afe.t0("label", jsonSlate.b);
        afe.t0("title", jsonSlate.c);
        afe.t0("tweet_id", jsonSlate.f);
        final ArrayList e = jsonSlate.e;
        if (e != null) {
            final Iterator a2 = br.A(afe, "variants", e);
            while (a2.hasNext()) {
                final JsonImageModel jsonImageModel = a2.next();
                if (jsonImageModel != null) {
                    JsonImageModel$$JsonObjectMapper._serialize(jsonImageModel, afe, true);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSlate jsonSlate, final String s, final tge tge) throws IOException {
        if ("attribution".equals(s)) {
            jsonSlate.h = JsonLiveEventAttribution$$JsonObjectMapper._parse(tge);
        }
        else if ("display_name".equals(s)) {
            jsonSlate.d = tge.T((String)null);
        }
        else if ("focus_rects".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList g = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonFocusRects parse = JsonFocusRects$$JsonObjectMapper._parse(tge);
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
            jsonSlate.a = tge.T((String)null);
        }
        else if ("label".equals(s)) {
            jsonSlate.b = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonSlate.c = tge.T((String)null);
        }
        else if ("tweet_id".equals(s)) {
            jsonSlate.f = tge.T((String)null);
        }
        else if ("variants".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonImageModel parse2 = JsonImageModel$$JsonObjectMapper._parse(tge);
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
    
    public JsonSlate parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSlate jsonSlate, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSlate, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSlate)o, afe, b);
    }
}
