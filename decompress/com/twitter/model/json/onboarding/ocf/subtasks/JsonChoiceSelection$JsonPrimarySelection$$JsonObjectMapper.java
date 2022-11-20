// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelection$JsonPrimarySelection$$JsonObjectMapper extends JsonMapper<JsonChoiceSelection$JsonPrimarySelection>
{
    public static JsonChoiceSelection$JsonPrimarySelection _parse(final tge tge) throws IOException {
        final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection = new JsonChoiceSelection$JsonPrimarySelection();
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
            parseField(jsonChoiceSelection$JsonPrimarySelection, d, tge);
            tge.l0();
        }
        return jsonChoiceSelection$JsonPrimarySelection;
    }
    
    public static void _serialize(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonChoiceSelection$JsonPrimarySelection.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonChoiceSelection$JsonPrimarySelection.a, "header", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final String s, final tge tge) throws IOException {
        if ("header".equals(s)) {
            jsonChoiceSelection$JsonPrimarySelection.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
    }
    
    public JsonChoiceSelection$JsonPrimarySelection parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final afe afe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelection$JsonPrimarySelection, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonChoiceSelection$JsonPrimarySelection)o, afe, b);
    }
}
