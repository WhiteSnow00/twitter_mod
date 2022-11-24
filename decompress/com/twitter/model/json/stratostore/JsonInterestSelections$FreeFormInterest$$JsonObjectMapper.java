// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestSelections$FreeFormInterest$$JsonObjectMapper extends JsonMapper<JsonInterestSelections.FreeFormInterest>
{
    public static JsonInterestSelections.FreeFormInterest _parse(final qhe qhe) throws IOException {
        final JsonInterestSelections.FreeFormInterest freeFormInterest = new JsonInterestSelections.FreeFormInterest();
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
            parseField(freeFormInterest, d, qhe);
            qhe.m0();
        }
        return freeFormInterest;
    }
    
    public static void _serialize(final JsonInterestSelections.FreeFormInterest freeFormInterest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("interest", freeFormInterest.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestSelections.FreeFormInterest freeFormInterest, final String s, final qhe qhe) throws IOException {
        if ("interest".equals(s)) {
            freeFormInterest.a = qhe.T((String)null);
        }
    }
    
    public JsonInterestSelections.FreeFormInterest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestSelections.FreeFormInterest freeFormInterest, final yfe yfe, final boolean b) throws IOException {
        _serialize(freeFormInterest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestSelections.FreeFormInterest)o, yfe, b);
    }
}
