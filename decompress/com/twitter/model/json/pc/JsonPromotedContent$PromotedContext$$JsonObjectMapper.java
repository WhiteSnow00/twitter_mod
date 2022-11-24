// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPromotedContent$PromotedContext$$JsonObjectMapper extends JsonMapper<JsonPromotedContent.PromotedContext>
{
    public static JsonPromotedContent.PromotedContext _parse(final qhe qhe) throws IOException {
        final JsonPromotedContent.PromotedContext promotedContext = new JsonPromotedContent.PromotedContext();
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
            parseField(promotedContext, d, qhe);
            qhe.m0();
        }
        return promotedContext;
    }
    
    public static void _serialize(final JsonPromotedContent.PromotedContext promotedContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("impressionId", promotedContext.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPromotedContent.PromotedContext promotedContext, final String s, final qhe qhe) throws IOException {
        if ("impressionId".equals(s)) {
            promotedContext.a = qhe.T((String)null);
        }
    }
    
    public JsonPromotedContent.PromotedContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPromotedContent.PromotedContext promotedContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(promotedContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPromotedContent.PromotedContext)o, yfe, b);
    }
}
