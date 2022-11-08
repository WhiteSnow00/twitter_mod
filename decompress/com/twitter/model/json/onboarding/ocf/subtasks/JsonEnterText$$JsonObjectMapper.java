// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterText$$JsonObjectMapper extends JsonMapper<JsonEnterText>
{
    public static final b71 AUTO_CAPITALIZATION_TYPE_CONVERTER;
    public static final u6a ENTER_TEXT_SUGGESTION_TYPE_CONVERTER;
    public static final trd INPUT_KEYBOARD_TYPE_CONVERTER;
    public static final ooj OS_TEXT_CONTENT_TYPE_CONVERTER;
    
    static {
        OS_TEXT_CONTENT_TYPE_CONVERTER = new ooj();
        INPUT_KEYBOARD_TYPE_CONVERTER = new trd();
        AUTO_CAPITALIZATION_TYPE_CONVERTER = new b71();
        ENTER_TEXT_SUGGESTION_TYPE_CONVERTER = new u6a();
    }
    
    public static JsonEnterText _parse(final khe khe) throws IOException {
        final JsonEnterText jsonEnterText = new JsonEnterText();
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
            parseField(jsonEnterText, d, khe);
            khe.m0();
        }
        return jsonEnterText;
    }
    
    public static void _serialize(final JsonEnterText jsonEnterText, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final a71 i = jsonEnterText.i;
        if (i != null) {
            ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.AUTO_CAPITALIZATION_TYPE_CONVERTER).serialize((Object)i, "auto_capitalization_type", true, tfe);
        }
        tfe.e("auto_correction_enabled", jsonEnterText.j);
        if (jsonEnterText.q != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterText.q, tfe, true);
        }
        tfe.u0("default_suggestion_id", jsonEnterText.n);
        tfe.u0("default_text", jsonEnterText.d);
        if (jsonEnterText.e != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.e, tfe, true);
        }
        if (jsonEnterText.f != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonEnterText.f, "header", true, tfe);
        }
        tfe.u0("hint_text", jsonEnterText.c);
        ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.INPUT_KEYBOARD_TYPE_CONVERTER).serialize((Object)jsonEnterText.l, "keyboard_type", true, tfe);
        tfe.T("max_length", jsonEnterText.g);
        tfe.e("multiline", jsonEnterText.h);
        if (jsonEnterText.o != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterText.o, "next_link", true, tfe);
        }
        final noj k = jsonEnterText.k;
        if (k != null) {
            ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.OS_TEXT_CONTENT_TYPE_CONVERTER).serialize((Object)k, "os_content_type", true, tfe);
        }
        if (jsonEnterText.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.a, tfe, true);
        }
        if (jsonEnterText.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.b, tfe, true);
        }
        if (jsonEnterText.p != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterText.p, "skip_link", true, tfe);
        }
        ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.ENTER_TEXT_SUGGESTION_TYPE_CONVERTER).serialize((Object)jsonEnterText.m, "suggestion_type", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterText jsonEnterText, final String s, final khe khe) throws IOException {
        if ("auto_capitalization_type".equals(s)) {
            jsonEnterText.i = (a71)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.AUTO_CAPITALIZATION_TYPE_CONVERTER).parse(khe);
        }
        else if ("auto_correction_enabled".equals(s)) {
            jsonEnterText.j = khe.k();
        }
        else if ("component_collection".equals(s)) {
            jsonEnterText.q = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("default_suggestion_id".equals(s)) {
            jsonEnterText.n = khe.T((String)null);
        }
        else if ("default_text".equals(s)) {
            jsonEnterText.d = khe.T((String)null);
        }
        else if ("detail_text".equals(s)) {
            jsonEnterText.e = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonEnterText.f = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterText.c = khe.T((String)null);
        }
        else if ("keyboard_type".equals(s)) {
            jsonEnterText.l = (int)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.INPUT_KEYBOARD_TYPE_CONVERTER).parse(khe);
        }
        else if ("max_length".equals(s)) {
            jsonEnterText.g = khe.z();
        }
        else if ("multiline".equals(s)) {
            jsonEnterText.h = khe.k();
        }
        else if ("next_link".equals(s)) {
            jsonEnterText.o = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("os_content_type".equals(s)) {
            jsonEnterText.k = (noj)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.OS_TEXT_CONTENT_TYPE_CONVERTER).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterText.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterText.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterText.p = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("suggestion_type".equals(s)) {
            jsonEnterText.m = (int)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.ENTER_TEXT_SUGGESTION_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonEnterText parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterText jsonEnterText, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterText, tfe, b);
    }
}
