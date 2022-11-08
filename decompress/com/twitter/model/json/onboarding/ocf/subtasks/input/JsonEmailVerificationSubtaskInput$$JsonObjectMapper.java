// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEmailVerificationSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEmailVerificationSubtaskInput>
{
    public static JsonEmailVerificationSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEmailVerificationSubtaskInput jsonEmailVerificationSubtaskInput = new JsonEmailVerificationSubtaskInput();
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
            parseField(jsonEmailVerificationSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEmailVerificationSubtaskInput;
    }
    
    public static void _serialize(final JsonEmailVerificationSubtaskInput jsonEmailVerificationSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("code", jsonEmailVerificationSubtaskInput.c);
        tfe.u0("email", jsonEmailVerificationSubtaskInput.b);
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEmailVerificationSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEmailVerificationSubtaskInput jsonEmailVerificationSubtaskInput, final String s, final khe khe) throws IOException {
        if ("code".equals(s)) {
            jsonEmailVerificationSubtaskInput.c = khe.T((String)null);
        }
        else if ("email".equals(s)) {
            jsonEmailVerificationSubtaskInput.b = khe.T((String)null);
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEmailVerificationSubtaskInput, s, khe);
        }
    }
    
    public JsonEmailVerificationSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEmailVerificationSubtaskInput jsonEmailVerificationSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEmailVerificationSubtaskInput, tfe, b);
    }
}
