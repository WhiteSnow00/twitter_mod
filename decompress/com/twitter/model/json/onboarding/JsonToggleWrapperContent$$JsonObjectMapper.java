// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonToggleWrapperContent$$JsonObjectMapper extends JsonMapper<JsonToggleWrapperContent>
{
    public static JsonToggleWrapperContent _parse(final khe khe) throws IOException {
        final JsonToggleWrapperContent jsonToggleWrapperContent = new JsonToggleWrapperContent();
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
            parseField(jsonToggleWrapperContent, d, khe);
            khe.m0();
        }
        return jsonToggleWrapperContent;
    }
    
    public static void _serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        jsonToggleWrapperContent.t();
        tfe.i("action_text");
        JsonOcfRichText$$JsonObjectMapper._serialize(jsonToggleWrapperContent.t(), tfe, true);
        final List b2 = jsonToggleWrapperContent.b;
        if (b2 != null) {
            final Iterator f = x30.F(tfe, "components", b2);
            while (f.hasNext()) {
                final fqp fqp = f.next();
                if (fqp != null) {
                    LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)fqp, "lslocalcomponentsElement", false, tfe);
                }
            }
            tfe.f();
            if (b) {
                tfe.h();
            }
            return;
        }
        zzd.m("components");
        throw null;
    }
    
    public static void parseField(final JsonToggleWrapperContent jsonToggleWrapperContent, final String s, final khe khe) throws IOException {
        if ("action_text".equals(s)) {
            final JsonOcfRichText parse = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            Objects.requireNonNull(jsonToggleWrapperContent);
            zzd.f((Object)parse, "<set-?>");
            jsonToggleWrapperContent.a = parse;
        }
        else if ("components".equals(s)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonToggleWrapperContent);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList b = new ArrayList();
            while (khe.i0() != lje.N0) {
                final fqp fqp = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
                if (fqp != null) {
                    b.add(fqp);
                }
            }
            Objects.requireNonNull(jsonToggleWrapperContent);
            jsonToggleWrapperContent.b = b;
        }
    }
    
    public JsonToggleWrapperContent parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonToggleWrapperContent jsonToggleWrapperContent, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonToggleWrapperContent, tfe, b);
    }
}
