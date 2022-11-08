// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEmailVerificationRequestInput$$JsonObjectMapper extends JsonMapper<JsonEmailVerificationRequestInput>
{
    public static JsonEmailVerificationRequestInput _parse(final khe khe) throws IOException {
        final JsonEmailVerificationRequestInput jsonEmailVerificationRequestInput = new JsonEmailVerificationRequestInput();
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
            parseField(jsonEmailVerificationRequestInput, d, khe);
            khe.m0();
        }
        return jsonEmailVerificationRequestInput;
    }
    
    public static void _serialize(final JsonEmailVerificationRequestInput jsonEmailVerificationRequestInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_name", jsonEmailVerificationRequestInput.b);
        tfe.u0("email", jsonEmailVerificationRequestInput.c);
        tfe.u0("flow_token", jsonEmailVerificationRequestInput.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEmailVerificationRequestInput jsonEmailVerificationRequestInput, final String s, final khe khe) throws IOException {
        if ("display_name".equals(s)) {
            jsonEmailVerificationRequestInput.b = khe.T((String)null);
        }
        else if ("email".equals(s)) {
            jsonEmailVerificationRequestInput.c = khe.T((String)null);
        }
        else if ("flow_token".equals(s)) {
            jsonEmailVerificationRequestInput.a = khe.T((String)null);
        }
    }
    
    public JsonEmailVerificationRequestInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEmailVerificationRequestInput jsonEmailVerificationRequestInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEmailVerificationRequestInput, tfe, b);
    }
}
