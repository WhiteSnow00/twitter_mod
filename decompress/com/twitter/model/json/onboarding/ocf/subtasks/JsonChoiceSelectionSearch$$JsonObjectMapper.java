// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelectionSearch$$JsonObjectMapper extends JsonMapper<JsonChoiceSelectionSearch>
{
    public static JsonChoiceSelectionSearch _parse(final tge tge) throws IOException {
        final JsonChoiceSelectionSearch jsonChoiceSelectionSearch = new JsonChoiceSelectionSearch();
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
            parseField(jsonChoiceSelectionSearch, d, tge);
            tge.l0();
        }
        return jsonChoiceSelectionSearch;
    }
    
    public static void _serialize(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("hint_text", jsonChoiceSelectionSearch.b);
        afe.e("is_focused", jsonChoiceSelectionSearch.a);
        if (jsonChoiceSelectionSearch.c != null) {
            afe.i("no_results_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelectionSearch.c, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final String s, final tge tge) throws IOException {
        if ("hint_text".equals(s)) {
            jsonChoiceSelectionSearch.b = tge.T((String)null);
        }
        else if ("is_focused".equals(s)) {
            jsonChoiceSelectionSearch.a = tge.k();
        }
        else if ("no_results_text".equals(s)) {
            jsonChoiceSelectionSearch.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonChoiceSelectionSearch parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonChoiceSelectionSearch jsonChoiceSelectionSearch, final afe afe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelectionSearch, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonChoiceSelectionSearch)o, afe, b);
    }
}
