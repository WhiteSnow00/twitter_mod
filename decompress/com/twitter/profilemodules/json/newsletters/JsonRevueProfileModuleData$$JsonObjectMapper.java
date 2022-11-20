// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileModuleData$$JsonObjectMapper extends JsonMapper<JsonRevueProfileModuleData>
{
    public static JsonRevueProfileModuleData _parse(final tge tge) throws IOException {
        final JsonRevueProfileModuleData jsonRevueProfileModuleData = new JsonRevueProfileModuleData();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonRevueProfileModuleData, d, tge);
            tge.l0();
        }
        return jsonRevueProfileModuleData;
    }
    
    public static void _serialize(final JsonRevueProfileModuleData jsonRevueProfileModuleData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonRevueProfileModuleData.c != null) {
            LoganSquare.typeConverterFor((Class)ch.class).serialize((Object)jsonRevueProfileModuleData.c, "account_analytics", true, afe);
        }
        if (jsonRevueProfileModuleData.a != null) {
            afe.i("revue_account");
            JsonRevueAccount$$JsonObjectMapper._serialize(jsonRevueProfileModuleData.a, afe, true);
        }
        if (jsonRevueProfileModuleData.b != null) {
            afe.i("sample_issue");
            JsonSampleIssue$$JsonObjectMapper._serialize(jsonRevueProfileModuleData.b, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileModuleData jsonRevueProfileModuleData, final String s, final tge tge) throws IOException {
        if ("account_analytics".equals(s)) {
            jsonRevueProfileModuleData.c = (ch)LoganSquare.typeConverterFor((Class)ch.class).parse(tge);
        }
        else if ("revue_account".equals(s)) {
            jsonRevueProfileModuleData.a = JsonRevueAccount$$JsonObjectMapper._parse(tge);
        }
        else if ("sample_issue".equals(s)) {
            jsonRevueProfileModuleData.b = JsonSampleIssue$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonRevueProfileModuleData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueProfileModuleData jsonRevueProfileModuleData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileModuleData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileModuleData)o, afe, b);
    }
}
