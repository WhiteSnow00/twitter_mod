// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelectionInput$$JsonObjectMapper extends JsonMapper<JsonChoiceSelectionInput>
{
    public static JsonChoiceSelectionInput _parse(final khe khe) throws IOException {
        final JsonChoiceSelectionInput jsonChoiceSelectionInput = new JsonChoiceSelectionInput();
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
            parseField(jsonChoiceSelectionInput, d, khe);
            khe.m0();
        }
        return jsonChoiceSelectionInput;
    }
    
    public static void _serialize(final JsonChoiceSelectionInput jsonChoiceSelectionInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("primary_choice", jsonChoiceSelectionInput.c);
        final rth$a b2 = jsonChoiceSelectionInput.b;
        if (b2 != null) {
            tfe.i("selected_choices");
            tfe.q0();
            final Iterator iterator = ((List)b2).iterator();
            while (iterator.hasNext()) {
                tfe.s0((String)iterator.next());
            }
            tfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonChoiceSelectionInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelectionInput jsonChoiceSelectionInput, final String s, final khe khe) throws IOException {
        if ("primary_choice".equals(s)) {
            jsonChoiceSelectionInput.c = khe.T((String)null);
        }
        else if ("selected_choices".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        list.add(t);
                    }
                }
                jsonChoiceSelectionInput.t((List)list);
            }
            else {
                jsonChoiceSelectionInput.t((List)null);
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonChoiceSelectionInput, s, khe);
        }
    }
    
    public JsonChoiceSelectionInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonChoiceSelectionInput jsonChoiceSelectionInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelectionInput, tfe, b);
    }
}
