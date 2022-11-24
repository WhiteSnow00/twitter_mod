// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPageTabs$$JsonObjectMapper extends JsonMapper<JsonPageTabs>
{
    public static JsonPageTabs _parse(final qhe qhe) throws IOException {
        final JsonPageTabs jsonPageTabs = new JsonPageTabs();
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
            parseField(jsonPageTabs, d, qhe);
            qhe.m0();
        }
        return jsonPageTabs;
    }
    
    public static void _serialize(final JsonPageTabs jsonPageTabs, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("initialTabId", jsonPageTabs.b);
        if (jsonPageTabs.c != null) {
            LoganSquare.typeConverterFor((Class)qtj.class).serialize((Object)jsonPageTabs.c, "initialTimeline", true, yfe);
        }
        final ArrayList a = jsonPageTabs.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "tabs", a);
            while (e.hasNext()) {
                final qtj qtj = e.next();
                if (qtj != null) {
                    LoganSquare.typeConverterFor((Class)qtj.class).serialize((Object)qtj, "lslocaltabsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPageTabs jsonPageTabs, final String s, final qhe qhe) throws IOException {
        if ("initialTabId".equals(s)) {
            jsonPageTabs.b = qhe.T((String)null);
        }
        else if ("initialTimeline".equals(s)) {
            jsonPageTabs.c = (qtj)LoganSquare.typeConverterFor((Class)qtj.class).parse(qhe);
        }
        else if ("tabs".equals(s) || "timelines".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final qtj qtj = (qtj)LoganSquare.typeConverterFor((Class)qtj.class).parse(qhe);
                    if (qtj != null) {
                        a.add(qtj);
                    }
                }
                jsonPageTabs.a = a;
            }
            else {
                jsonPageTabs.a = null;
            }
        }
    }
    
    public JsonPageTabs parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPageTabs jsonPageTabs, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPageTabs, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPageTabs)o, yfe, b);
    }
}
