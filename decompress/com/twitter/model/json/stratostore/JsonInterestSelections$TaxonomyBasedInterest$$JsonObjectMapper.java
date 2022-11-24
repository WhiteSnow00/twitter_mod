// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestSelections$TaxonomyBasedInterest$$JsonObjectMapper extends JsonMapper<JsonInterestSelections.TaxonomyBasedInterest>
{
    public static JsonInterestSelections.TaxonomyBasedInterest _parse(final qhe qhe) throws IOException {
        final JsonInterestSelections.TaxonomyBasedInterest taxonomyBasedInterest = new JsonInterestSelections.TaxonomyBasedInterest();
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
            parseField(taxonomyBasedInterest, d, qhe);
            qhe.m0();
        }
        return taxonomyBasedInterest;
    }
    
    public static void _serialize(final JsonInterestSelections.TaxonomyBasedInterest taxonomyBasedInterest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("interestId", taxonomyBasedInterest.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestSelections.TaxonomyBasedInterest taxonomyBasedInterest, final String s, final qhe qhe) throws IOException {
        if ("interestId".equals(s)) {
            taxonomyBasedInterest.a = qhe.T((String)null);
        }
    }
    
    public JsonInterestSelections.TaxonomyBasedInterest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestSelections.TaxonomyBasedInterest taxonomyBasedInterest, final yfe yfe, final boolean b) throws IOException {
        _serialize(taxonomyBasedInterest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestSelections.TaxonomyBasedInterest)o, yfe, b);
    }
}
