// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWaitSpinner$$JsonObjectMapper extends JsonMapper<JsonWaitSpinner>
{
    public static final bhx WAIT_SPINNER_STYLE_TYPE_CONVERTER;
    
    static {
        WAIT_SPINNER_STYLE_TYPE_CONVERTER = new bhx();
    }
    
    public static JsonWaitSpinner _parse(final khe khe) throws IOException {
        final JsonWaitSpinner jsonWaitSpinner = new JsonWaitSpinner();
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
            parseField(jsonWaitSpinner, d, khe);
            khe.m0();
        }
        return jsonWaitSpinner;
    }
    
    public static void _serialize(final JsonWaitSpinner jsonWaitSpinner, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonWaitSpinner.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWaitSpinner.j, "cancel_link", true, tfe);
        }
        if (jsonWaitSpinner.g != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonWaitSpinner.g, tfe, true);
        }
        if (jsonWaitSpinner.d != null) {
            LoganSquare.typeConverterFor((Class)dsr.class).serialize((Object)jsonWaitSpinner.d, "extension_condition", true, tfe);
        }
        tfe.u0("extension_endpoint", jsonWaitSpinner.i);
        tfe.T("extension_polling_interval_ms", jsonWaitSpinner.k);
        if (jsonWaitSpinner.l != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWaitSpinner.l, "extension_timeout_link", true, tfe);
        }
        if (jsonWaitSpinner.f != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonWaitSpinner.f, "header", true, tfe);
        }
        tfe.T("max_extension_time_ms", jsonWaitSpinner.c);
        if (jsonWaitSpinner.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWaitSpinner.e, "next_link", true, tfe);
        }
        if (jsonWaitSpinner.b != null) {
            tfe.i("spinner_message");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonWaitSpinner.b, tfe, true);
        }
        final ahx$b h = jsonWaitSpinner.h;
        if (h != null) {
            ((wnw)JsonWaitSpinner$$JsonObjectMapper.WAIT_SPINNER_STYLE_TYPE_CONVERTER).serialize((Object)h, "style", true, tfe);
        }
        tfe.T("wait_time_ms", jsonWaitSpinner.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonWaitSpinner jsonWaitSpinner, final String s, final khe khe) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonWaitSpinner.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonWaitSpinner.g = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("extension_condition".equals(s)) {
            jsonWaitSpinner.d = (dsr)LoganSquare.typeConverterFor((Class)dsr.class).parse(khe);
        }
        else if ("extension_endpoint".equals(s)) {
            jsonWaitSpinner.i = khe.T((String)null);
        }
        else if ("extension_polling_interval_ms".equals(s)) {
            jsonWaitSpinner.k = khe.z();
        }
        else if ("extension_timeout_link".equals(s)) {
            jsonWaitSpinner.l = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("header".equals(s)) {
            jsonWaitSpinner.f = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("max_extension_time_ms".equals(s)) {
            jsonWaitSpinner.c = khe.z();
        }
        else if ("next_link".equals(s)) {
            jsonWaitSpinner.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("spinner_message".equals(s)) {
            jsonWaitSpinner.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("style".equals(s)) {
            jsonWaitSpinner.h = (ahx$b)((StringBasedTypeConverter)JsonWaitSpinner$$JsonObjectMapper.WAIT_SPINNER_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("wait_time_ms".equals(s)) {
            jsonWaitSpinner.a = khe.z();
        }
    }
    
    public JsonWaitSpinner parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonWaitSpinner jsonWaitSpinner, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonWaitSpinner, tfe, b);
    }
}
