// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPrivacyOptions$$JsonObjectMapper extends JsonMapper<JsonPrivacyOptions>
{
    public static JsonPrivacyOptions _parse(final khe khe) throws IOException {
        final JsonPrivacyOptions jsonPrivacyOptions = new JsonPrivacyOptions();
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
            parseField(jsonPrivacyOptions, d, khe);
            khe.m0();
        }
        return jsonPrivacyOptions;
    }
    
    public static void _serialize(final JsonPrivacyOptions jsonPrivacyOptions, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonPrivacyOptions.j != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPrivacyOptions.j, tfe, true);
        }
        tfe.e("discoverable_by_email", jsonPrivacyOptions.c);
        if (jsonPrivacyOptions.e != null) {
            tfe.i("discoverable_by_email_detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPrivacyOptions.e, tfe, true);
        }
        tfe.u0("discoverable_by_email_label", jsonPrivacyOptions.d);
        tfe.e("discoverable_by_phone", jsonPrivacyOptions.f);
        if (jsonPrivacyOptions.h != null) {
            tfe.i("discoverable_by_phone_detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPrivacyOptions.h, tfe, true);
        }
        tfe.u0("discoverable_by_phone_label", jsonPrivacyOptions.g);
        if (jsonPrivacyOptions.i != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPrivacyOptions.i, "next_link", true, tfe);
        }
        tfe.u0("primary_text", jsonPrivacyOptions.a);
        tfe.u0("secondary_text", jsonPrivacyOptions.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonPrivacyOptions jsonPrivacyOptions, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonPrivacyOptions.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else {
            final boolean equals = "discoverable_by_email".equals(s);
            final Boolean b = null;
            final Boolean b2 = null;
            if (equals) {
                Boolean value;
                if (khe.e() == lje.U0) {
                    value = b2;
                }
                else {
                    value = khe.k();
                }
                jsonPrivacyOptions.c = value;
            }
            else if ("discoverable_by_email_detail_text".equals(s)) {
                jsonPrivacyOptions.e = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            }
            else if ("discoverable_by_email_label".equals(s)) {
                jsonPrivacyOptions.d = khe.T((String)null);
            }
            else if ("discoverable_by_phone".equals(s)) {
                Boolean value2;
                if (khe.e() == lje.U0) {
                    value2 = b;
                }
                else {
                    value2 = khe.k();
                }
                jsonPrivacyOptions.f = value2;
            }
            else if ("discoverable_by_phone_detail_text".equals(s)) {
                jsonPrivacyOptions.h = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            }
            else if ("discoverable_by_phone_label".equals(s)) {
                jsonPrivacyOptions.g = khe.T((String)null);
            }
            else if ("next_link".equals(s)) {
                jsonPrivacyOptions.i = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
            }
            else if ("primary_text".equals(s)) {
                jsonPrivacyOptions.a = khe.T((String)null);
            }
            else if ("secondary_text".equals(s)) {
                jsonPrivacyOptions.b = khe.T((String)null);
            }
        }
    }
    
    public JsonPrivacyOptions parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonPrivacyOptions jsonPrivacyOptions, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPrivacyOptions, tfe, b);
    }
}
