// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelection$JsonPrimarySelection$$JsonObjectMapper extends JsonMapper<JsonChoiceSelection$JsonPrimarySelection>
{
    public static JsonChoiceSelection$JsonPrimarySelection _parse(final khe khe) throws IOException {
        final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection = new JsonChoiceSelection$JsonPrimarySelection();
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
            parseField(jsonChoiceSelection$JsonPrimarySelection, d, khe);
            khe.m0();
        }
        return jsonChoiceSelection$JsonPrimarySelection;
    }
    
    public static void _serialize(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonChoiceSelection$JsonPrimarySelection.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonChoiceSelection$JsonPrimarySelection.a, "header", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final String s, final khe khe) throws IOException {
        if ("header".equals(s)) {
            jsonChoiceSelection$JsonPrimarySelection.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
    }
    
    public JsonChoiceSelection$JsonPrimarySelection parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonChoiceSelection$JsonPrimarySelection jsonChoiceSelection$JsonPrimarySelection, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelection$JsonPrimarySelection, tfe, b);
    }
}
