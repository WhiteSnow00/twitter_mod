// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestSelections$JsonInterest$$JsonObjectMapper extends JsonMapper<JsonInterestSelections.JsonInterest>
{
    public static JsonInterestSelections.JsonInterest _parse(final qhe qhe) throws IOException {
        final JsonInterestSelections.JsonInterest jsonInterest = new JsonInterestSelections.JsonInterest();
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
            parseField(jsonInterest, d, qhe);
            qhe.m0();
        }
        return jsonInterest;
    }
    
    public static void _serialize(final JsonInterestSelections.JsonInterest jsonInterest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonInterest.b != null) {
            yfe.i("freeFormInterest");
            JsonInterestSelections$FreeFormInterest$$JsonObjectMapper._serialize(jsonInterest.b, yfe, true);
        }
        if (jsonInterest.a != null) {
            yfe.i("tttInterest");
            JsonInterestSelections$TaxonomyBasedInterest$$JsonObjectMapper._serialize(jsonInterest.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestSelections.JsonInterest jsonInterest, final String s, final qhe qhe) throws IOException {
        if ("freeFormInterest".equals(s)) {
            jsonInterest.b = JsonInterestSelections$FreeFormInterest$$JsonObjectMapper._parse(qhe);
        }
        else if ("tttInterest".equals(s)) {
            jsonInterest.a = JsonInterestSelections$TaxonomyBasedInterest$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonInterestSelections.JsonInterest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestSelections.JsonInterest jsonInterest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInterest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestSelections.JsonInterest)o, yfe, b);
    }
}
