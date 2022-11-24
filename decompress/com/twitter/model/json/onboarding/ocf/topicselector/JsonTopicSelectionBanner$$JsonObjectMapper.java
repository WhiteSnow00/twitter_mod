// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicSelectionBanner$$JsonObjectMapper extends JsonMapper<JsonTopicSelectionBanner>
{
    public static JsonTopicSelectionBanner _parse(final qhe qhe) throws IOException {
        final JsonTopicSelectionBanner jsonTopicSelectionBanner = new JsonTopicSelectionBanner();
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
            parseField(jsonTopicSelectionBanner, d, qhe);
            qhe.m0();
        }
        return jsonTopicSelectionBanner;
    }
    
    public static void _serialize(final JsonTopicSelectionBanner jsonTopicSelectionBanner, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonTopicSelectionBanner.c != null) {
            yfe.i("dismiss_label");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicSelectionBanner.c, yfe, true);
        }
        if (jsonTopicSelectionBanner.b != null) {
            yfe.i("subtitle");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicSelectionBanner.b, yfe, true);
        }
        if (jsonTopicSelectionBanner.a != null) {
            yfe.i("title");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonTopicSelectionBanner.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicSelectionBanner jsonTopicSelectionBanner, final String s, final qhe qhe) throws IOException {
        if ("dismiss_label".equals(s)) {
            jsonTopicSelectionBanner.c = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("subtitle".equals(s)) {
            jsonTopicSelectionBanner.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("title".equals(s)) {
            jsonTopicSelectionBanner.a = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonTopicSelectionBanner parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicSelectionBanner jsonTopicSelectionBanner, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicSelectionBanner, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicSelectionBanner)o, yfe, b);
    }
}
