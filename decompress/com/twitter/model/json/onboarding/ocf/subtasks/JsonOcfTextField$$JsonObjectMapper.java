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
    public static final rej OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER;
    
    static {
        OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER = new rej();
    }
    
    public static JsonOcfTextField _parse(final tge tge) throws IOException {
        final JsonOcfTextField jsonOcfTextField = new JsonOcfTextField();
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
            parseField(jsonOcfTextField, d, tge);
            tge.l0();
        }
        return jsonOcfTextField;
    }
    
    public static void _serialize(final JsonOcfTextField jsonOcfTextField, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final qej a = jsonOcfTextField.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfTextField$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).serialize((Object)a, "content_type", true, afe);
        }
        if (jsonOcfTextField.c != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfTextField.c, afe, true);
        }
        afe.t0("hint_text", jsonOcfTextField.b);
        final ArrayList d = jsonOcfTextField.d;
        if (d != null) {
            final Iterator a2 = br.A(afe, "validation_messages", d);
            while (a2.hasNext()) {
                final gow gow = a2.next();
                if (gow != null) {
                    LoganSquare.typeConverterFor((Class)gow.class).serialize((Object)gow, "lslocalvalidation_messagesElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfTextField jsonOcfTextField, final String s, final tge tge) throws IOException {
        if ("content_type".equals(s)) {
            jsonOcfTextField.a = (qej)((StringBasedTypeConverter)JsonOcfTextField$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonOcfTextField.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonOcfTextField.b = tge.T((String)null);
        }
        else if ("validation_messages".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final gow gow = (gow)LoganSquare.typeConverterFor((Class)gow.class).parse(tge);
                    if (gow != null) {
                        d.add(gow);
                    }
                }
                jsonOcfTextField.d = d;
            }
            else {
                jsonOcfTextField.d = null;
            }
        }
    }
    
    public JsonOcfTextField parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfTextField jsonOcfTextField, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfTextField, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfTextField)o, afe, b);
    }
}
