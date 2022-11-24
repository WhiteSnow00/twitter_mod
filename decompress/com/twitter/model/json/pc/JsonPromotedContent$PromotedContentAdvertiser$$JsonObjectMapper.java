// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$PromotedContentAdvertiser$$JsonObjectMapper extends JsonMapper<JsonPromotedContent.PromotedContentAdvertiser>
{
    public static JsonPromotedContent.PromotedContentAdvertiser _parse(final qhe qhe) throws IOException {
        final JsonPromotedContent.PromotedContentAdvertiser promotedContentAdvertiser = new JsonPromotedContent.PromotedContentAdvertiser();
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
            parseField(promotedContentAdvertiser, d, qhe);
            qhe.m0();
        }
        return promotedContentAdvertiser;
    }
    
    public static void _serialize(final JsonPromotedContent.PromotedContentAdvertiser promotedContentAdvertiser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("id_str", promotedContentAdvertiser.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPromotedContent.PromotedContentAdvertiser promotedContentAdvertiser, final String s, final qhe qhe) throws IOException {
        if ("id_str".equals(s) || "id".equals(s)) {
            promotedContentAdvertiser.a = qhe.L();
        }
    }
    
    public JsonPromotedContent.PromotedContentAdvertiser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPromotedContent.PromotedContentAdvertiser promotedContentAdvertiser, final yfe yfe, final boolean b) throws IOException {
        _serialize(promotedContentAdvertiser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPromotedContent.PromotedContentAdvertiser)o, yfe, b);
    }
}
