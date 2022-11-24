// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchSettings$$JsonObjectMapper extends JsonMapper<JsonSearchSettings>
{
    public static JsonSearchSettings _parse(final qhe qhe) throws IOException {
        final JsonSearchSettings jsonSearchSettings = new JsonSearchSettings();
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
            parseField(jsonSearchSettings, d, qhe);
            qhe.m0();
        }
        return jsonSearchSettings;
    }
    
    public static void _serialize(final JsonSearchSettings jsonSearchSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("optInBlocking", jsonSearchSettings.b);
        yfe.e("optInFiltering", jsonSearchSettings.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSearchSettings jsonSearchSettings, final String s, final qhe qhe) throws IOException {
        if ("optInBlocking".equals(s)) {
            jsonSearchSettings.b = qhe.l();
        }
        else if ("optInFiltering".equals(s)) {
            jsonSearchSettings.a = qhe.l();
        }
    }
    
    public JsonSearchSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSearchSettings jsonSearchSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSearchSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSearchSettings)o, yfe, b);
    }
}
