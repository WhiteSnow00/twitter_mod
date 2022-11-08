// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelectionSearch$$JsonObjectMapper extends JsonMapper<JsonChoiceSelectionSearch>
{
    public static JsonChoiceSelectionSearch _parse(final khe khe) throws IOException {
        final JsonChoiceSelectionSearch jsonChoiceSelectionSearch = new JsonChoiceSelectionSearch();
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
            parseField(jsonChoiceSelectionSearch, d, khe);
            khe.m0();
        }
        return jsonChoiceSelectionSearch;
    }
    
    public static void _serialize(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("hint_text", jsonChoiceSelectionSearch.b);
        tfe.e("is_focused", jsonChoiceSelectionSearch.a);
        if (jsonChoiceSelectionSearch.c != null) {
            tfe.i("no_results_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelectionSearch.c, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final String s, final khe khe) throws IOException {
        if ("hint_text".equals(s)) {
            jsonChoiceSelectionSearch.b = khe.T((String)null);
        }
        else if ("is_focused".equals(s)) {
            jsonChoiceSelectionSearch.a = khe.k();
        }
        else if ("no_results_text".equals(s)) {
            jsonChoiceSelectionSearch.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonChoiceSelectionSearch parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelectionSearch, tfe, b);
    }
}
