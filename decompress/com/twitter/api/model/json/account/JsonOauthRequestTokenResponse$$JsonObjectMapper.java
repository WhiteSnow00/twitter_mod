// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOauthRequestTokenResponse$$JsonObjectMapper extends JsonMapper<JsonOauthRequestTokenResponse>
{
    public static JsonOauthRequestTokenResponse _parse(final khe khe) throws IOException {
        final JsonOauthRequestTokenResponse jsonOauthRequestTokenResponse = new JsonOauthRequestTokenResponse();
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
            parseField(jsonOauthRequestTokenResponse, d, khe);
            khe.m0();
        }
        return jsonOauthRequestTokenResponse;
    }
    
    public static void _serialize(final JsonOauthRequestTokenResponse jsonOauthRequestTokenResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("oauth_allow_ads_analytics", jsonOauthRequestTokenResponse.d);
        tfe.u0("oauth_allow_ads_campaign_management", jsonOauthRequestTokenResponse.n);
        tfe.u0("oauth_allow_dm_read", jsonOauthRequestTokenResponse.t);
        tfe.u0("oauth_allow_email", jsonOauthRequestTokenResponse.a);
        tfe.u0("oauth_allow_read", jsonOauthRequestTokenResponse.s);
        tfe.u0("oauth_allow_write", jsonOauthRequestTokenResponse.g);
        tfe.u0("oauth_app_description", jsonOauthRequestTokenResponse.l);
        tfe.u0("oauth_app_name", jsonOauthRequestTokenResponse.m);
        tfe.u0("oauth_app_url", jsonOauthRequestTokenResponse.h);
        tfe.u0("oauth_consumer_key", jsonOauthRequestTokenResponse.f);
        tfe.u0("oauth_image_url", jsonOauthRequestTokenResponse.o);
        tfe.u0("oauth_nonce", jsonOauthRequestTokenResponse.r);
        tfe.u0("oauth_organization_name", jsonOauthRequestTokenResponse.k);
        if (jsonOauthRequestTokenResponse.v != null) {
            LoganSquare.typeConverterFor((Class)e3j.class).serialize((Object)jsonOauthRequestTokenResponse.v, "oauth_permission_policy", true, tfe);
        }
        tfe.u0("oauth_privacy_policy_url", jsonOauthRequestTokenResponse.c);
        tfe.u0("oauth_signature", jsonOauthRequestTokenResponse.e);
        tfe.u0("oauth_signature_method", jsonOauthRequestTokenResponse.b);
        tfe.u0("oauth_terms_and_conditions_url", jsonOauthRequestTokenResponse.q);
        tfe.u0("oauth_timestamp", jsonOauthRequestTokenResponse.p);
        tfe.u0("oauth_token", jsonOauthRequestTokenResponse.j);
        tfe.u0("oauth_version", jsonOauthRequestTokenResponse.i);
        tfe.u0("reverse_auth_oauth_params", jsonOauthRequestTokenResponse.u);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOauthRequestTokenResponse jsonOauthRequestTokenResponse, final String s, final khe khe) throws IOException {
        if ("oauth_allow_ads_analytics".equals(s)) {
            jsonOauthRequestTokenResponse.d = khe.T((String)null);
        }
        else if ("oauth_allow_ads_campaign_management".equals(s)) {
            jsonOauthRequestTokenResponse.n = khe.T((String)null);
        }
        else if ("oauth_allow_dm_read".equals(s)) {
            jsonOauthRequestTokenResponse.t = khe.T((String)null);
        }
        else if ("oauth_allow_email".equals(s)) {
            jsonOauthRequestTokenResponse.a = khe.T((String)null);
        }
        else if ("oauth_allow_read".equals(s)) {
            jsonOauthRequestTokenResponse.s = khe.T((String)null);
        }
        else if ("oauth_allow_write".equals(s)) {
            jsonOauthRequestTokenResponse.g = khe.T((String)null);
        }
        else if ("oauth_app_description".equals(s)) {
            jsonOauthRequestTokenResponse.l = khe.T((String)null);
        }
        else if ("oauth_app_name".equals(s)) {
            jsonOauthRequestTokenResponse.m = khe.T((String)null);
        }
        else if ("oauth_app_url".equals(s)) {
            jsonOauthRequestTokenResponse.h = khe.T((String)null);
        }
        else if ("oauth_consumer_key".equals(s)) {
            jsonOauthRequestTokenResponse.f = khe.T((String)null);
        }
        else if ("oauth_image_url".equals(s)) {
            jsonOauthRequestTokenResponse.o = khe.T((String)null);
        }
        else if ("oauth_nonce".equals(s)) {
            jsonOauthRequestTokenResponse.r = khe.T((String)null);
        }
        else if ("oauth_organization_name".equals(s)) {
            jsonOauthRequestTokenResponse.k = khe.T((String)null);
        }
        else if ("oauth_permission_policy".equals(s)) {
            jsonOauthRequestTokenResponse.v = (e3j)LoganSquare.typeConverterFor((Class)e3j.class).parse(khe);
        }
        else if ("oauth_privacy_policy_url".equals(s)) {
            jsonOauthRequestTokenResponse.c = khe.T((String)null);
        }
        else if ("oauth_signature".equals(s)) {
            jsonOauthRequestTokenResponse.e = khe.T((String)null);
        }
        else if ("oauth_signature_method".equals(s)) {
            jsonOauthRequestTokenResponse.b = khe.T((String)null);
        }
        else if ("oauth_terms_and_conditions_url".equals(s)) {
            jsonOauthRequestTokenResponse.q = khe.T((String)null);
        }
        else if ("oauth_timestamp".equals(s)) {
            jsonOauthRequestTokenResponse.p = khe.T((String)null);
        }
        else if ("oauth_token".equals(s)) {
            jsonOauthRequestTokenResponse.j = khe.T((String)null);
        }
        else if ("oauth_version".equals(s)) {
            jsonOauthRequestTokenResponse.i = khe.T((String)null);
        }
        else if ("reverse_auth_oauth_params".equals(s)) {
            jsonOauthRequestTokenResponse.u = khe.T((String)null);
        }
    }
    
    public JsonOauthRequestTokenResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOauthRequestTokenResponse jsonOauthRequestTokenResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOauthRequestTokenResponse, tfe, b);
    }
}
