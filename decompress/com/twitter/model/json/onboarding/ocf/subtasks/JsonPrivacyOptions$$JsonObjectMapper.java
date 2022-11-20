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
    public static JsonPrivacyOptions _parse(final tge tge) throws IOException {
        final JsonPrivacyOptions jsonPrivacyOptions = new JsonPrivacyOptions();
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
            parseField(jsonPrivacyOptions, d, tge);
            tge.l0();
        }
        return jsonPrivacyOptions;
    }
    
    public static void _serialize(final JsonPrivacyOptions jsonPrivacyOptions, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonPrivacyOptions.j != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPrivacyOptions.j, afe, true);
        }
        afe.e("discoverable_by_email", (boolean)jsonPrivacyOptions.c);
        if (jsonPrivacyOptions.e != null) {
            afe.i("discoverable_by_email_detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPrivacyOptions.e, afe, true);
        }
        afe.t0("discoverable_by_email_label", jsonPrivacyOptions.d);
        afe.e("discoverable_by_phone", (boolean)jsonPrivacyOptions.f);
        if (jsonPrivacyOptions.h != null) {
            afe.i("discoverable_by_phone_detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPrivacyOptions.h, afe, true);
        }
        afe.t0("discoverable_by_phone_label", jsonPrivacyOptions.g);
        if (jsonPrivacyOptions.i != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPrivacyOptions.i, "next_link", true, afe);
        }
        afe.t0("primary_text", jsonPrivacyOptions.a);
        afe.t0("secondary_text", jsonPrivacyOptions.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonPrivacyOptions jsonPrivacyOptions, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonPrivacyOptions.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else {
            final boolean equals = "discoverable_by_email".equals(s);
            final Boolean b = null;
            final Boolean b2 = null;
            if (equals) {
                Boolean value;
                if (tge.e() == vie.V0) {
                    value = b2;
                }
                else {
                    value = tge.k();
                }
                jsonPrivacyOptions.c = value;
            }
            else if ("discoverable_by_email_detail_text".equals(s)) {
                jsonPrivacyOptions.e = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            }
            else if ("discoverable_by_email_label".equals(s)) {
                jsonPrivacyOptions.d = tge.T((String)null);
            }
            else if ("discoverable_by_phone".equals(s)) {
                Boolean value2;
                if (tge.e() == vie.V0) {
                    value2 = b;
                }
                else {
                    value2 = tge.k();
                }
                jsonPrivacyOptions.f = value2;
            }
            else if ("discoverable_by_phone_detail_text".equals(s)) {
                jsonPrivacyOptions.h = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            }
            else if ("discoverable_by_phone_label".equals(s)) {
                jsonPrivacyOptions.g = tge.T((String)null);
            }
            else if ("next_link".equals(s)) {
                jsonPrivacyOptions.i = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
            }
            else if ("primary_text".equals(s)) {
                jsonPrivacyOptions.a = tge.T((String)null);
            }
            else if ("secondary_text".equals(s)) {
                jsonPrivacyOptions.b = tge.T((String)null);
            }
        }
    }
    
    public JsonPrivacyOptions parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonPrivacyOptions jsonPrivacyOptions, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPrivacyOptions, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonPrivacyOptions)o, afe, b);
    }
}
