// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import com.twitter.model.json.core.JsonColor$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor$$JsonObjectMapper extends JsonMapper<JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor>
{
    public static JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor _parse(final qhe qhe) throws IOException {
        final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor = new JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor();
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
            parseField(jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, d, qhe);
            qhe.m0();
        }
        return jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor;
    }
    
    public static void _serialize(final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.P("percentage", jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor.a);
        if (jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor.b != null) {
            yfe.i("rgb");
            JsonColor$$JsonObjectMapper._serialize(jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, final String s, final qhe qhe) throws IOException {
        if ("percentage".equals(s)) {
            jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor.a = (float)qhe.q();
        }
        else if ("rgb".equals(s)) {
            jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor.b = JsonColor$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor)o, yfe, b);
    }
}
