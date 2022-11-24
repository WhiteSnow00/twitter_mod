// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.DateTypeConverter;
import java.util.Date;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonArticleSummary$JsonArticleSummaryMetadata$$JsonObjectMapper extends JsonMapper<JsonArticleSummary.JsonArticleSummaryMetadata>
{
    public static final JsonArticleSummary$a ARTICLE_SUMMARY_DATE_CONVERTER;
    
    static {
        ARTICLE_SUMMARY_DATE_CONVERTER = new JsonArticleSummary$a();
    }
    
    public static JsonArticleSummary.JsonArticleSummaryMetadata _parse(final qhe qhe) throws IOException {
        final JsonArticleSummary.JsonArticleSummaryMetadata jsonArticleSummaryMetadata = new JsonArticleSummary.JsonArticleSummaryMetadata();
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
            parseField(jsonArticleSummaryMetadata, d, qhe);
            qhe.m0();
        }
        return jsonArticleSummaryMetadata;
    }
    
    public static void _serialize(final JsonArticleSummary.JsonArticleSummaryMetadata jsonArticleSummaryMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonArticleSummaryMetadata.e);
        yfe.u0("domain", jsonArticleSummaryMetadata.c);
        yfe.u0("domain_url", jsonArticleSummaryMetadata.d);
        yfe.u0("image_url", jsonArticleSummaryMetadata.f);
        final Date g = jsonArticleSummaryMetadata.g;
        if (g != null) {
            ((DateTypeConverter)JsonArticleSummary$JsonArticleSummaryMetadata$$JsonObjectMapper.ARTICLE_SUMMARY_DATE_CONVERTER).serialize(g, "publish_date", true, yfe);
        }
        yfe.u0("title", jsonArticleSummaryMetadata.a);
        yfe.u0("raw_url", jsonArticleSummaryMetadata.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonArticleSummary.JsonArticleSummaryMetadata jsonArticleSummaryMetadata, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonArticleSummaryMetadata.e = qhe.T((String)null);
        }
        else if ("domain".equals(s)) {
            jsonArticleSummaryMetadata.c = qhe.T((String)null);
        }
        else if ("domain_url".equals(s)) {
            jsonArticleSummaryMetadata.d = qhe.T((String)null);
        }
        else if ("image_url".equals(s)) {
            jsonArticleSummaryMetadata.f = qhe.T((String)null);
        }
        else if ("publish_date".equals(s)) {
            jsonArticleSummaryMetadata.g = ((DateTypeConverter)JsonArticleSummary$JsonArticleSummaryMetadata$$JsonObjectMapper.ARTICLE_SUMMARY_DATE_CONVERTER).parse(qhe);
        }
        else if ("title".equals(s)) {
            jsonArticleSummaryMetadata.a = qhe.T((String)null);
        }
        else if ("raw_url".equals(s)) {
            jsonArticleSummaryMetadata.b = qhe.T((String)null);
        }
    }
    
    public JsonArticleSummary.JsonArticleSummaryMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonArticleSummary.JsonArticleSummaryMetadata jsonArticleSummaryMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonArticleSummaryMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonArticleSummary.JsonArticleSummaryMetadata)o, yfe, b);
    }
}
