// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicPageNavBar$$JsonObjectMapper extends JsonMapper<JsonTopicPageNavBar>
{
    public static JsonTopicPageNavBar _parse(final qhe qhe) throws IOException {
        final JsonTopicPageNavBar jsonTopicPageNavBar = new JsonTopicPageNavBar();
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
            parseField(jsonTopicPageNavBar, d, qhe);
            qhe.m0();
        }
        return jsonTopicPageNavBar;
    }
    
    public static void _serialize(final JsonTopicPageNavBar jsonTopicPageNavBar, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicPageNavBar.b != null) {
            LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)jsonTopicPageNavBar.b, "clientEventInfo", true, yfe);
        }
        if (jsonTopicPageNavBar.a != null) {
            LoganSquare.typeConverterFor((Class)lxd.class).serialize((Object)jsonTopicPageNavBar.a, "topic", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicPageNavBar jsonTopicPageNavBar, final String s, final qhe qhe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonTopicPageNavBar.b = (b1p)LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe);
        }
        else if ("topic".equals(s)) {
            jsonTopicPageNavBar.a = (lxd)LoganSquare.typeConverterFor((Class)lxd.class).parse(qhe);
        }
    }
    
    public JsonTopicPageNavBar parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicPageNavBar jsonTopicPageNavBar, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicPageNavBar, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicPageNavBar)o, yfe, b);
    }
}
