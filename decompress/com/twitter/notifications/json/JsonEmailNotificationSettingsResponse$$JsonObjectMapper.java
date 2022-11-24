// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEmailNotificationSettingsResponse$$JsonObjectMapper extends JsonMapper<JsonEmailNotificationSettingsResponse>
{
    public static JsonEmailNotificationSettingsResponse _parse(final qhe qhe) throws IOException {
        final JsonEmailNotificationSettingsResponse jsonEmailNotificationSettingsResponse = new JsonEmailNotificationSettingsResponse();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonEmailNotificationSettingsResponse, d, qhe);
            qhe.m0();
        }
        return jsonEmailNotificationSettingsResponse;
    }
    
    public static void _serialize(final JsonEmailNotificationSettingsResponse jsonEmailNotificationSettingsResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("sendAccountUpdatesEmail", jsonEmailNotificationSettingsResponse.c);
        yfe.e("sendActivationEmail", jsonEmailNotificationSettingsResponse.f);
        yfe.e("sendAddressBookNotificationEmail", jsonEmailNotificationSettingsResponse.l);
        yfe.e("sendEmailNewsletter", jsonEmailNotificationSettingsResponse.b);
        yfe.e("sendEmailVitWeekly", jsonEmailNotificationSettingsResponse.j);
        yfe.e("sendFollowRecsEmail", jsonEmailNotificationSettingsResponse.e);
        yfe.e("sendLoginNotificationEmail", jsonEmailNotificationSettingsResponse.p);
        yfe.e("sendNetworkActivityEmail", jsonEmailNotificationSettingsResponse.h);
        if (jsonEmailNotificationSettingsResponse.q != null) {
            LoganSquare.typeConverterFor((Class)j0a.class).serialize((Object)jsonEmailNotificationSettingsResponse.q, "sendNetworkDigest", true, yfe);
        }
        yfe.e("sendNewDirectTextEmail", jsonEmailNotificationSettingsResponse.a);
        yfe.e("sendPartnerEmail", jsonEmailNotificationSettingsResponse.i);
        if (jsonEmailNotificationSettingsResponse.r != null) {
            LoganSquare.typeConverterFor((Class)k0a.class).serialize((Object)jsonEmailNotificationSettingsResponse.r, "sendPerformanceDigest", true, yfe);
        }
        yfe.e("sendResurrectionEmail", jsonEmailNotificationSettingsResponse.d);
        yfe.e("sendSharedTweetEmail", jsonEmailNotificationSettingsResponse.n);
        yfe.e("sendSimilarPeopleEmail", jsonEmailNotificationSettingsResponse.m);
        yfe.e("sendSmbSalesMarketingEmail", jsonEmailNotificationSettingsResponse.k);
        yfe.e("sendSurveyEmail", jsonEmailNotificationSettingsResponse.g);
        yfe.e("sendTwitterEmails", jsonEmailNotificationSettingsResponse.o);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEmailNotificationSettingsResponse jsonEmailNotificationSettingsResponse, final String s, final qhe qhe) throws IOException {
        if ("sendAccountUpdatesEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.c = qhe.l();
        }
        else if ("sendActivationEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.f = qhe.l();
        }
        else if ("sendAddressBookNotificationEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.l = qhe.l();
        }
        else if ("sendEmailNewsletter".equals(s)) {
            jsonEmailNotificationSettingsResponse.b = qhe.l();
        }
        else if ("sendEmailVitWeekly".equals(s)) {
            jsonEmailNotificationSettingsResponse.j = qhe.l();
        }
        else if ("sendFollowRecsEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.e = qhe.l();
        }
        else if ("sendLoginNotificationEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.p = qhe.l();
        }
        else if ("sendNetworkActivityEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.h = qhe.l();
        }
        else if ("sendNetworkDigest".equals(s)) {
            jsonEmailNotificationSettingsResponse.q = (j0a)LoganSquare.typeConverterFor((Class)j0a.class).parse(qhe);
        }
        else if ("sendNewDirectTextEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.a = qhe.l();
        }
        else if ("sendPartnerEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.i = qhe.l();
        }
        else if ("sendPerformanceDigest".equals(s)) {
            jsonEmailNotificationSettingsResponse.r = (k0a)LoganSquare.typeConverterFor((Class)k0a.class).parse(qhe);
        }
        else if ("sendResurrectionEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.d = qhe.l();
        }
        else if ("sendSharedTweetEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.n = qhe.l();
        }
        else if ("sendSimilarPeopleEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.m = qhe.l();
        }
        else if ("sendSmbSalesMarketingEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.k = qhe.l();
        }
        else if ("sendSurveyEmail".equals(s)) {
            jsonEmailNotificationSettingsResponse.g = qhe.l();
        }
        else if ("sendTwitterEmails".equals(s)) {
            jsonEmailNotificationSettingsResponse.o = qhe.l();
        }
    }
    
    public JsonEmailNotificationSettingsResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEmailNotificationSettingsResponse jsonEmailNotificationSettingsResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEmailNotificationSettingsResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEmailNotificationSettingsResponse)o, yfe, b);
    }
}
