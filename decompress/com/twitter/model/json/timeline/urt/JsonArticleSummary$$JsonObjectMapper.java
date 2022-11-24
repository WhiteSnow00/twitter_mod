// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonArticleSummary$$JsonObjectMapper extends JsonMapper<JsonArticleSummary>
{
    public static final kt0 ARTICLE_LIST_SEED_TYPE_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        ARTICLE_LIST_SEED_TYPE_CONVERTER = new kt0();
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
    }
    
    public static JsonArticleSummary _parse(final qhe qhe) throws IOException {
        final JsonArticleSummary jsonArticleSummary = new JsonArticleSummary();
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
            parseField(jsonArticleSummary, d, qhe);
            qhe.m0();
        }
        return jsonArticleSummary;
    }
    
    public static void _serialize(final JsonArticleSummary jsonArticleSummary, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonArticleSummary.a != null) {
            yfe.i("article");
            JsonArticleSummary$JsonArticle$$JsonObjectMapper._serialize(jsonArticleSummary.a, yfe, true);
        }
        final jt0 b2 = jsonArticleSummary.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonArticleSummary$$JsonObjectMapper.ARTICLE_LIST_SEED_TYPE_CONVERTER).serialize((Object)b2, "article_seed_type", true, yfe);
        }
        final o5t c = jsonArticleSummary.c;
        if (c == null) {
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonArticleSummary$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize((Object)c, "social_context", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonArticleSummary jsonArticleSummary, final String s, final qhe qhe) throws IOException {
        if ("article".equals(s)) {
            jsonArticleSummary.a = JsonArticleSummary$JsonArticle$$JsonObjectMapper._parse(qhe);
        }
        else if ("article_seed_type".equals(s)) {
            jsonArticleSummary.b = (jt0)((StringBasedTypeConverter)JsonArticleSummary$$JsonObjectMapper.ARTICLE_LIST_SEED_TYPE_CONVERTER).parse(qhe);
        }
        else if ("social_context".equals(s)) {
            jsonArticleSummary.c = ((fge<o5t>)JsonArticleSummary$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(qhe);
        }
    }
    
    public JsonArticleSummary parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonArticleSummary jsonArticleSummary, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonArticleSummary, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonArticleSummary)o, yfe, b);
    }
}
