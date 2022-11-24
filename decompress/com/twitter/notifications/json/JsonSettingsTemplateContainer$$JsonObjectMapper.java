// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsTemplateContainer$$JsonObjectMapper extends JsonMapper<JsonSettingsTemplateContainer>
{
    public static JsonSettingsTemplateContainer _parse(final qhe qhe) throws IOException {
        final JsonSettingsTemplateContainer jsonSettingsTemplateContainer = new JsonSettingsTemplateContainer();
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
            parseField(jsonSettingsTemplateContainer, d, qhe);
            qhe.m0();
        }
        return jsonSettingsTemplateContainer;
    }
    
    public static void _serialize(final JsonSettingsTemplateContainer jsonSettingsTemplateContainer, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("checksum", jsonSettingsTemplateContainer.b);
        if (jsonSettingsTemplateContainer.a != null) {
            LoganSquare.typeConverterFor((Class)irp.class).serialize((Object)jsonSettingsTemplateContainer.a, "template", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsTemplateContainer jsonSettingsTemplateContainer, final String s, final qhe qhe) throws IOException {
        if ("checksum".equals(s)) {
            jsonSettingsTemplateContainer.b = qhe.T((String)null);
        }
        else if ("template".equals(s)) {
            jsonSettingsTemplateContainer.a = (irp)LoganSquare.typeConverterFor((Class)irp.class).parse(qhe);
        }
    }
    
    public JsonSettingsTemplateContainer parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsTemplateContainer jsonSettingsTemplateContainer, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingsTemplateContainer, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsTemplateContainer)o, yfe, b);
    }
}
