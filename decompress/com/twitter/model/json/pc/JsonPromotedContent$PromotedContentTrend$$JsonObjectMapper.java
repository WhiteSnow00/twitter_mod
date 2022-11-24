// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$PromotedContentTrend$$JsonObjectMapper extends JsonMapper<JsonPromotedContent.PromotedContentTrend>
{
    public static JsonPromotedContent.PromotedContentTrend _parse(final qhe qhe) throws IOException {
        final JsonPromotedContent.PromotedContentTrend promotedContentTrend = new JsonPromotedContent.PromotedContentTrend();
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
            parseField(promotedContentTrend, d, qhe);
            qhe.m0();
        }
        return promotedContentTrend;
    }
    
    public static void _serialize(final JsonPromotedContent.PromotedContentTrend promotedContentTrend, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("id_str", promotedContentTrend.a);
        yfe.u0("name", promotedContentTrend.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPromotedContent.PromotedContentTrend promotedContentTrend, final String s, final qhe qhe) throws IOException {
        if (!"id_str".equals(s) && !"id".equals(s)) {
            if ("name".equals(s)) {
                promotedContentTrend.b = qhe.T((String)null);
            }
        }
        else {
            promotedContentTrend.a = qhe.L();
        }
    }
    
    public JsonPromotedContent.PromotedContentTrend parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPromotedContent.PromotedContentTrend promotedContentTrend, final yfe yfe, final boolean b) throws IOException {
        _serialize(promotedContentTrend, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPromotedContent.PromotedContentTrend)o, yfe, b);
    }
}
