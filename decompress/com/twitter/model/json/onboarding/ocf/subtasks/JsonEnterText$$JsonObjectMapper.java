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
    public static final v61 AUTO_CAPITALIZATION_TYPE_CONVERTER;
    public static final d6a ENTER_TEXT_SUGGESTION_TYPE_CONVERTER;
    public static final xqd INPUT_KEYBOARD_TYPE_CONVERTER;
    public static final uoj OS_TEXT_CONTENT_TYPE_CONVERTER;
    
    static {
        OS_TEXT_CONTENT_TYPE_CONVERTER = new uoj();
        INPUT_KEYBOARD_TYPE_CONVERTER = new xqd();
        AUTO_CAPITALIZATION_TYPE_CONVERTER = new v61();
        ENTER_TEXT_SUGGESTION_TYPE_CONVERTER = new d6a();
    }
    
    public static JsonEnterText _parse(final tge tge) throws IOException {
        final JsonEnterText jsonEnterText = new JsonEnterText();
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
            parseField(jsonEnterText, d, tge);
            tge.l0();
        }
        return jsonEnterText;
    }
    
    public static void _serialize(final JsonEnterText jsonEnterText, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final u61 i = jsonEnterText.i;
        if (i != null) {
            ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.AUTO_CAPITALIZATION_TYPE_CONVERTER).serialize((Object)i, "auto_capitalization_type", true, afe);
        }
        afe.e("auto_correction_enabled", jsonEnterText.j);
        if (jsonEnterText.q != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterText.q, afe, true);
        }
        afe.t0("default_suggestion_id", jsonEnterText.n);
        afe.t0("default_text", jsonEnterText.d);
        if (jsonEnterText.e != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.e, afe, true);
        }
        if (jsonEnterText.f != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonEnterText.f, "header", true, afe);
        }
        afe.t0("hint_text", jsonEnterText.c);
        ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.INPUT_KEYBOARD_TYPE_CONVERTER).serialize((Object)jsonEnterText.l, "keyboard_type", true, afe);
        afe.T("max_length", jsonEnterText.g);
        afe.e("multiline", jsonEnterText.h);
        if (jsonEnterText.o != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterText.o, "next_link", true, afe);
        }
        final toj k = jsonEnterText.k;
        if (k != null) {
            ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.OS_TEXT_CONTENT_TYPE_CONVERTER).serialize((Object)k, "os_content_type", true, afe);
        }
        if (jsonEnterText.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.a, afe, true);
        }
        if (jsonEnterText.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterText.b, afe, true);
        }
        if (jsonEnterText.p != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterText.p, "skip_link", true, afe);
        }
        ((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.ENTER_TEXT_SUGGESTION_TYPE_CONVERTER).serialize((Object)jsonEnterText.m, "suggestion_type", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnterText jsonEnterText, final String s, final tge tge) throws IOException {
        if ("auto_capitalization_type".equals(s)) {
            jsonEnterText.i = (u61)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.AUTO_CAPITALIZATION_TYPE_CONVERTER).parse(tge);
        }
        else if ("auto_correction_enabled".equals(s)) {
            jsonEnterText.j = tge.k();
        }
        else if ("component_collection".equals(s)) {
            jsonEnterText.q = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("default_suggestion_id".equals(s)) {
            jsonEnterText.n = tge.T((String)null);
        }
        else if ("default_text".equals(s)) {
            jsonEnterText.d = tge.T((String)null);
        }
        else if ("detail_text".equals(s)) {
            jsonEnterText.e = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonEnterText.f = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterText.c = tge.T((String)null);
        }
        else if ("keyboard_type".equals(s)) {
            jsonEnterText.l = (int)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.INPUT_KEYBOARD_TYPE_CONVERTER).parse(tge);
        }
        else if ("max_length".equals(s)) {
            jsonEnterText.g = tge.y();
        }
        else if ("multiline".equals(s)) {
            jsonEnterText.h = tge.k();
        }
        else if ("next_link".equals(s)) {
            jsonEnterText.o = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("os_content_type".equals(s)) {
            jsonEnterText.k = (toj)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.OS_TEXT_CONTENT_TYPE_CONVERTER).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterText.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterText.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterText.p = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("suggestion_type".equals(s)) {
            jsonEnterText.m = (int)((StringBasedTypeConverter)JsonEnterText$$JsonObjectMapper.ENTER_TEXT_SUGGESTION_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonEnterText parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnterText jsonEnterText, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnterText, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnterText)o, afe, b);
    }
}
