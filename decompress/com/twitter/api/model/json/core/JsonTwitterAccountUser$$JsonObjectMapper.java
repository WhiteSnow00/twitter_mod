// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterAccountUser$$JsonObjectMapper extends JsonMapper<JsonTwitterAccountUser>
{
    public static final dge JSON_LIST_ADVERTISER_ACCOUNT_SERVICE_LEVEL_CONVERTER;
    public static final oje JSON_TRANSLATOR_TYPE_CONVERTER;
    
    static {
        JSON_LIST_ADVERTISER_ACCOUNT_SERVICE_LEVEL_CONVERTER = new dge();
        JSON_TRANSLATOR_TYPE_CONVERTER = new oje();
    }
    
    public static JsonTwitterAccountUser _parse(final khe khe) throws IOException {
        final JsonTwitterAccountUser jsonTwitterAccountUser = new JsonTwitterAccountUser();
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
            parseField(jsonTwitterAccountUser, d, khe);
            khe.m0();
        }
        return jsonTwitterAccountUser;
    }
    
    public static void _serialize(final JsonTwitterAccountUser jsonTwitterAccountUser, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List<wv> w = jsonTwitterAccountUser.w;
        if (w != null) {
            ((pmf)JsonTwitterAccountUser$$JsonObjectMapper.JSON_LIST_ADVERTISER_ACCOUNT_SERVICE_LEVEL_CONVERTER).b((List)w, "advertiser_account_service_levels", tfe);
        }
        tfe.u0("created_at", jsonTwitterAccountUser.i);
        tfe.u0("description", jsonTwitterAccountUser.f);
        tfe.T("fast_followers_count", jsonTwitterAccountUser.k);
        tfe.T("followers_count", jsonTwitterAccountUser.j);
        tfe.T("friends_count", jsonTwitterAccountUser.l);
        tfe.e("geo_enabled", jsonTwitterAccountUser.p);
        tfe.e("has_extended_profile", jsonTwitterAccountUser.u);
        tfe.W("id", jsonTwitterAccountUser.a);
        tfe.e("protected", jsonTwitterAccountUser.o);
        tfe.e("is_translator", jsonTwitterAccountUser.r);
        tfe.u0("location", jsonTwitterAccountUser.h);
        tfe.T("media_count", jsonTwitterAccountUser.n);
        tfe.u0("name", jsonTwitterAccountUser.b);
        tfe.e("needs_phone_verification", jsonTwitterAccountUser.t);
        tfe.u0("profile_banner_url", jsonTwitterAccountUser.e);
        tfe.u0("profile_image_url_https", jsonTwitterAccountUser.d);
        tfe.u0("screen_name", jsonTwitterAccountUser.c);
        tfe.T("statuses_count", jsonTwitterAccountUser.m);
        tfe.e("suspended", jsonTwitterAccountUser.s);
        final k0u v = jsonTwitterAccountUser.v;
        if (v != null) {
            JsonTwitterAccountUser$$JsonObjectMapper.JSON_TRANSLATOR_TYPE_CONVERTER.serialize((Object)v, "translator_type", true, tfe);
        }
        tfe.u0("url_https", jsonTwitterAccountUser.g);
        tfe.e("verified", jsonTwitterAccountUser.q);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterAccountUser jsonTwitterAccountUser, final String s, final khe khe) throws IOException {
        if ("advertiser_account_service_levels".equals(s)) {
            jsonTwitterAccountUser.w = ((pmf)JsonTwitterAccountUser$$JsonObjectMapper.JSON_LIST_ADVERTISER_ACCOUNT_SERVICE_LEVEL_CONVERTER).a(khe);
        }
        else if ("created_at".equals(s)) {
            jsonTwitterAccountUser.i = khe.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonTwitterAccountUser.f = khe.T((String)null);
        }
        else if ("fast_followers_count".equals(s)) {
            jsonTwitterAccountUser.k = khe.z();
        }
        else if ("followers_count".equals(s)) {
            jsonTwitterAccountUser.j = khe.z();
        }
        else if ("friends_count".equals(s)) {
            jsonTwitterAccountUser.l = khe.z();
        }
        else if ("geo_enabled".equals(s)) {
            jsonTwitterAccountUser.p = khe.k();
        }
        else if ("has_extended_profile".equals(s)) {
            jsonTwitterAccountUser.u = khe.k();
        }
        else if ("id".equals(s)) {
            jsonTwitterAccountUser.a = khe.L();
        }
        else if ("protected".equals(s)) {
            jsonTwitterAccountUser.o = khe.k();
        }
        else if ("is_translator".equals(s)) {
            jsonTwitterAccountUser.r = khe.k();
        }
        else if ("location".equals(s)) {
            jsonTwitterAccountUser.h = khe.T((String)null);
        }
        else if ("media_count".equals(s)) {
            jsonTwitterAccountUser.n = khe.z();
        }
        else if ("name".equals(s)) {
            jsonTwitterAccountUser.b = khe.T((String)null);
        }
        else if ("needs_phone_verification".equals(s)) {
            jsonTwitterAccountUser.t = khe.k();
        }
        else if ("profile_banner_url".equals(s)) {
            jsonTwitterAccountUser.e = khe.T((String)null);
        }
        else if ("profile_image_url_https".equals(s)) {
            jsonTwitterAccountUser.d = khe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonTwitterAccountUser.c = khe.T((String)null);
        }
        else if ("statuses_count".equals(s)) {
            jsonTwitterAccountUser.m = khe.z();
        }
        else if ("suspended".equals(s)) {
            jsonTwitterAccountUser.s = khe.k();
        }
        else if ("translator_type".equals(s)) {
            jsonTwitterAccountUser.v = (k0u)((StringBasedTypeConverter)JsonTwitterAccountUser$$JsonObjectMapper.JSON_TRANSLATOR_TYPE_CONVERTER).parse(khe);
        }
        else if ("url_https".equals(s)) {
            jsonTwitterAccountUser.g = khe.T((String)null);
        }
        else if ("verified".equals(s)) {
            jsonTwitterAccountUser.q = khe.k();
        }
    }
    
    public JsonTwitterAccountUser parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterAccountUser jsonTwitterAccountUser, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTwitterAccountUser, tfe, b);
    }
}
