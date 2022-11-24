// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicPageHeaderFacepile$$JsonObjectMapper extends JsonMapper<JsonTopicPageHeaderFacepile>
{
    public static JsonTopicPageHeaderFacepile _parse(final qhe qhe) throws IOException {
        final JsonTopicPageHeaderFacepile jsonTopicPageHeaderFacepile = new JsonTopicPageHeaderFacepile();
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
            parseField(jsonTopicPageHeaderFacepile, d, qhe);
            qhe.m0();
        }
        return jsonTopicPageHeaderFacepile;
    }
    
    public static void _serialize(final JsonTopicPageHeaderFacepile jsonTopicPageHeaderFacepile, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicPageHeaderFacepile.b != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonTopicPageHeaderFacepile.b, "facepile_url", true, yfe);
        }
        final ArrayList a = jsonTopicPageHeaderFacepile.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "users_results", a);
            while (e.hasNext()) {
                final ziw ziw = e.next();
                if (ziw != null) {
                    LoganSquare.typeConverterFor((Class)ziw.class).serialize((Object)ziw, "lslocalusers_resultsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicPageHeaderFacepile jsonTopicPageHeaderFacepile, final String s, final qhe qhe) throws IOException {
        if ("facepile_url".equals(s)) {
            jsonTopicPageHeaderFacepile.b = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
        else if ("users_results".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ziw ziw = (ziw)LoganSquare.typeConverterFor((Class)ziw.class).parse(qhe);
                    if (ziw != null) {
                        a.add(ziw);
                    }
                }
                jsonTopicPageHeaderFacepile.a = a;
            }
            else {
                jsonTopicPageHeaderFacepile.a = null;
            }
        }
    }
    
    public JsonTopicPageHeaderFacepile parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicPageHeaderFacepile jsonTopicPageHeaderFacepile, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicPageHeaderFacepile, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicPageHeaderFacepile)o, yfe, b);
    }
}
