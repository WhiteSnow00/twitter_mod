// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestSelections$JsonInterestSelection$$JsonObjectMapper extends JsonMapper<JsonInterestSelections.JsonInterestSelection>
{
    public static JsonInterestSelections.JsonInterestSelection _parse(final qhe qhe) throws IOException {
        final JsonInterestSelections.JsonInterestSelection jsonInterestSelection = new JsonInterestSelections.JsonInterestSelection();
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
            parseField(jsonInterestSelection, d, qhe);
            qhe.m0();
        }
        return jsonInterestSelection;
    }
    
    public static void _serialize(final JsonInterestSelections.JsonInterestSelection jsonInterestSelection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("country", jsonInterestSelection.c);
        if (jsonInterestSelection.a != null) {
            yfe.i("interest");
            JsonInterestSelections$JsonInterest$$JsonObjectMapper._serialize(jsonInterestSelection.a, yfe, true);
        }
        yfe.u0("interestContextToken", jsonInterestSelection.e);
        yfe.u0("language", jsonInterestSelection.d);
        if (jsonInterestSelection.b != null) {
            LoganSquare.typeConverterFor((Class)vmq.class).serialize((Object)jsonInterestSelection.b, "sourceLocation", true, yfe);
        }
        yfe.u0("timestampMs", jsonInterestSelection.f);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonInterestSelections.JsonInterestSelection jsonInterestSelection, final String s, final qhe qhe) throws IOException {
        if ("country".equals(s)) {
            jsonInterestSelection.c = qhe.T((String)null);
        }
        else if ("interest".equals(s)) {
            jsonInterestSelection.a = JsonInterestSelections$JsonInterest$$JsonObjectMapper._parse(qhe);
        }
        else if ("interestContextToken".equals(s)) {
            jsonInterestSelection.e = qhe.T((String)null);
        }
        else if ("language".equals(s)) {
            jsonInterestSelection.d = qhe.T((String)null);
        }
        else if ("sourceLocation".equals(s)) {
            jsonInterestSelection.b = (vmq)LoganSquare.typeConverterFor((Class)vmq.class).parse(qhe);
        }
        else if ("timestampMs".equals(s)) {
            jsonInterestSelection.f = qhe.T((String)null);
        }
    }
    
    public JsonInterestSelections.JsonInterestSelection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonInterestSelections.JsonInterestSelection jsonInterestSelection, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInterestSelection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonInterestSelections.JsonInterestSelection)o, yfe, b);
    }
}
