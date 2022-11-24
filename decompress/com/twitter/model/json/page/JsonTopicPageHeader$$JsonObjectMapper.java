// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicPageHeader$$JsonObjectMapper extends JsonMapper<JsonTopicPageHeader>
{
    public static final npt TOPIC_PAGE_HEADER_DISPLAY_TYPE_CONVERTER;
    
    static {
        TOPIC_PAGE_HEADER_DISPLAY_TYPE_CONVERTER = new npt();
    }
    
    public static JsonTopicPageHeader _parse(final qhe qhe) throws IOException {
        final JsonTopicPageHeader jsonTopicPageHeader = new JsonTopicPageHeader();
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
            parseField(jsonTopicPageHeader, d, qhe);
            qhe.m0();
        }
        return jsonTopicPageHeader;
    }
    
    public static void _serialize(final JsonTopicPageHeader jsonTopicPageHeader, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicPageHeader.b != null) {
            LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)jsonTopicPageHeader.b, "clientEventInfo", true, yfe);
        }
        ((StringBasedTypeConverter)JsonTopicPageHeader$$JsonObjectMapper.TOPIC_PAGE_HEADER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonTopicPageHeader.e, "display_type", true, yfe);
        if (jsonTopicPageHeader.c != null) {
            LoganSquare.typeConverterFor((Class)opt.class).serialize((Object)jsonTopicPageHeader.c, "facepile", true, yfe);
        }
        yfe.u0("landing_context", jsonTopicPageHeader.d);
        if (jsonTopicPageHeader.a != null) {
            LoganSquare.typeConverterFor((Class)lxd.class).serialize((Object)jsonTopicPageHeader.a, "topic", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicPageHeader jsonTopicPageHeader, final String s, final qhe qhe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonTopicPageHeader.b = (b1p)LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe);
        }
        else if ("display_type".equals(s)) {
            jsonTopicPageHeader.e = (int)((StringBasedTypeConverter)JsonTopicPageHeader$$JsonObjectMapper.TOPIC_PAGE_HEADER_DISPLAY_TYPE_CONVERTER).parse(qhe);
        }
        else if ("facepile".equals(s)) {
            jsonTopicPageHeader.c = (opt)LoganSquare.typeConverterFor((Class)opt.class).parse(qhe);
        }
        else if ("landing_context".equals(s)) {
            jsonTopicPageHeader.d = qhe.T((String)null);
        }
        else if ("topic".equals(s)) {
            jsonTopicPageHeader.a = (lxd)LoganSquare.typeConverterFor((Class)lxd.class).parse(qhe);
        }
    }
    
    public JsonTopicPageHeader parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicPageHeader jsonTopicPageHeader, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicPageHeader, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicPageHeader)o, yfe, b);
    }
}
