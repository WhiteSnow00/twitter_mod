// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonArticleSummary$JsonArticle$$JsonObjectMapper extends JsonMapper<JsonArticleSummary.JsonArticle>
{
    public static JsonArticleSummary.JsonArticle _parse(final qhe qhe) throws IOException {
        final JsonArticleSummary.JsonArticle jsonArticle = new JsonArticleSummary.JsonArticle();
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
            parseField(jsonArticle, d, qhe);
            qhe.m0();
        }
        return jsonArticle;
    }
    
    public static void _serialize(final JsonArticleSummary.JsonArticle jsonArticle, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("id", (int)jsonArticle.a);
        if (jsonArticle.b != null) {
            yfe.i("metadata");
            JsonArticleSummary$JsonArticleSummaryMetadata$$JsonObjectMapper._serialize(jsonArticle.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonArticleSummary.JsonArticle jsonArticle, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            Integer value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.z();
            }
            jsonArticle.a = value;
        }
        else if ("metadata".equals(s)) {
            jsonArticle.b = JsonArticleSummary$JsonArticleSummaryMetadata$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonArticleSummary.JsonArticle parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonArticleSummary.JsonArticle jsonArticle, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonArticle, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonArticleSummary.JsonArticle)o, yfe, b);
    }
}
