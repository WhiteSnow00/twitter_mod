// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntityColorPalette$$JsonObjectMapper extends JsonMapper<JsonMediaEntityColorPalette>
{
    public static JsonMediaEntityColorPalette _parse(final qhe qhe) throws IOException {
        final JsonMediaEntityColorPalette jsonMediaEntityColorPalette = new JsonMediaEntityColorPalette();
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
            parseField(jsonMediaEntityColorPalette, d, qhe);
            qhe.m0();
        }
        return jsonMediaEntityColorPalette;
    }
    
    public static void _serialize(final JsonMediaEntityColorPalette jsonMediaEntityColorPalette, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor[] a = jsonMediaEntityColorPalette.a;
        if (a != null) {
            yfe.i("palette");
            yfe.q0();
            for (final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor : a) {
                if (jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor != null) {
                    JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor$$JsonObjectMapper._serialize(jsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaEntityColorPalette jsonMediaEntityColorPalette, final String s, final qhe qhe) throws IOException {
        if ("palette".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList list = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor parse = JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        list.add(parse);
                    }
                }
                jsonMediaEntityColorPalette.a = list.toArray(new JsonMediaEntityColorPalette$JsonMediaEntityColorDescriptor[list.size()]);
            }
            else {
                jsonMediaEntityColorPalette.a = null;
            }
        }
    }
    
    public JsonMediaEntityColorPalette parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaEntityColorPalette jsonMediaEntityColorPalette, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaEntityColorPalette, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaEntityColorPalette)o, yfe, b);
    }
}
