// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSampleIssue$$JsonObjectMapper extends JsonMapper<JsonSampleIssue>
{
    public static JsonSampleIssue _parse(final qhe qhe) throws IOException {
        final JsonSampleIssue jsonSampleIssue = new JsonSampleIssue();
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
            parseField(jsonSampleIssue, d, qhe);
            qhe.m0();
        }
        return jsonSampleIssue;
    }
    
    public static void _serialize(final JsonSampleIssue jsonSampleIssue, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("sample_issue_url", jsonSampleIssue.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSampleIssue jsonSampleIssue, final String s, final qhe qhe) throws IOException {
        if ("sample_issue_url".equals(s)) {
            jsonSampleIssue.a = qhe.T((String)null);
        }
    }
    
    public JsonSampleIssue parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSampleIssue jsonSampleIssue, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSampleIssue, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSampleIssue)o, yfe, b);
    }
}
