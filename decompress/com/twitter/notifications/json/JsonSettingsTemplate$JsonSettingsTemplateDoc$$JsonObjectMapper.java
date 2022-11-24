// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsTemplate$JsonSettingsTemplateDoc$$JsonObjectMapper extends JsonMapper<JsonSettingsTemplate.JsonSettingsTemplateDoc>
{
    public static JsonSettingsTemplate.JsonSettingsTemplateDoc _parse(final qhe qhe) throws IOException {
        final JsonSettingsTemplate.JsonSettingsTemplateDoc jsonSettingsTemplateDoc = new JsonSettingsTemplate.JsonSettingsTemplateDoc();
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
            parseField(jsonSettingsTemplateDoc, d, qhe);
            qhe.m0();
        }
        return jsonSettingsTemplateDoc;
    }
    
    public static void _serialize(final JsonSettingsTemplate.JsonSettingsTemplateDoc jsonSettingsTemplateDoc, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonSettingsTemplateDoc.c);
        yfe.u0("language", jsonSettingsTemplateDoc.b);
        yfe.u0("version", jsonSettingsTemplateDoc.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsTemplate.JsonSettingsTemplateDoc jsonSettingsTemplateDoc, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonSettingsTemplateDoc.c = qhe.T((String)null);
        }
        else if ("language".equals(s)) {
            jsonSettingsTemplateDoc.b = qhe.T((String)null);
        }
        else if ("version".equals(s)) {
            jsonSettingsTemplateDoc.a = qhe.T((String)null);
        }
    }
    
    public JsonSettingsTemplate.JsonSettingsTemplateDoc parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsTemplate.JsonSettingsTemplateDoc jsonSettingsTemplateDoc, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingsTemplateDoc, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsTemplate.JsonSettingsTemplateDoc)o, yfe, b);
    }
}
