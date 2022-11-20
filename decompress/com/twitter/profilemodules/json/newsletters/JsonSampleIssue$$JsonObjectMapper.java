// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSampleIssue$$JsonObjectMapper extends JsonMapper<JsonSampleIssue>
{
    public static JsonSampleIssue _parse(final tge tge) throws IOException {
        final JsonSampleIssue jsonSampleIssue = new JsonSampleIssue();
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
            parseField(jsonSampleIssue, d, tge);
            tge.l0();
        }
        return jsonSampleIssue;
    }
    
    public static void _serialize(final JsonSampleIssue jsonSampleIssue, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("sample_issue_url", jsonSampleIssue.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSampleIssue jsonSampleIssue, final String s, final tge tge) throws IOException {
        if ("sample_issue_url".equals(s)) {
            jsonSampleIssue.a = tge.T((String)null);
        }
    }
    
    public JsonSampleIssue parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSampleIssue jsonSampleIssue, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSampleIssue, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSampleIssue)o, afe, b);
    }
}
