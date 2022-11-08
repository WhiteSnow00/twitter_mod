// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfTextField$$JsonObjectMapper extends JsonMapper<JsonOcfTextField>
{
    public static final lej OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER;
    
    static {
        OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER = new lej();
    }
    
    public static JsonOcfTextField _parse(final khe khe) throws IOException {
        final JsonOcfTextField jsonOcfTextField = new JsonOcfTextField();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonOcfTextField, d, khe);
            khe.m0();
        }
        return jsonOcfTextField;
    }
    
    public static void _serialize(final JsonOcfTextField jsonOcfTextField, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final kej a = jsonOcfTextField.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfTextField$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).serialize((Object)a, "content_type", true, tfe);
        }
        if (jsonOcfTextField.c != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfTextField.c, tfe, true);
        }
        tfe.u0("hint_text", jsonOcfTextField.b);
        final ArrayList d = jsonOcfTextField.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "validation_messages", d);
            while (g.hasNext()) {
                final lnw lnw = g.next();
                if (lnw != null) {
                    LoganSquare.typeConverterFor((Class)lnw.class).serialize((Object)lnw, "lslocalvalidation_messagesElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOcfTextField jsonOcfTextField, final String s, final khe khe) throws IOException {
        if ("content_type".equals(s)) {
            jsonOcfTextField.a = (kej)((StringBasedTypeConverter)JsonOcfTextField$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonOcfTextField.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonOcfTextField.b = khe.T((String)null);
        }
        else if ("validation_messages".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final lnw lnw = (lnw)LoganSquare.typeConverterFor((Class)lnw.class).parse(khe);
                    if (lnw != null) {
                        d.add(lnw);
                    }
                }
                jsonOcfTextField.d = d;
            }
            else {
                jsonOcfTextField.d = null;
            }
        }
    }
    
    public JsonOcfTextField parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOcfTextField jsonOcfTextField, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOcfTextField, tfe, b);
    }
}
