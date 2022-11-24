// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEmailNotificationSettingsInput$$JsonObjectMapper extends JsonMapper<JsonEmailNotificationSettingsInput>
{
    public static final kfe JSON_EMAIL_NOTIFICATION_NETWORK_DIGEST_FREQUENCY_CONVERTER;
    public static final lfe JSON_EMAIL_NOTIFICATION_PERFORMANCE_DIGEST_FREQUENCY_CONVERTER;
    
    static {
        JSON_EMAIL_NOTIFICATION_PERFORMANCE_DIGEST_FREQUENCY_CONVERTER = new lfe();
        JSON_EMAIL_NOTIFICATION_NETWORK_DIGEST_FREQUENCY_CONVERTER = new kfe();
    }
    
    public static JsonEmailNotificationSettingsInput _parse(final qhe qhe) throws IOException {
        final JsonEmailNotificationSettingsInput jsonEmailNotificationSettingsInput = new JsonEmailNotificationSettingsInput();
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
            parseField(jsonEmailNotificationSettingsInput, d, qhe);
            qhe.m0();
        }
        return jsonEmailNotificationSettingsInput;
    }
    
    public static void _serialize(final JsonEmailNotificationSettingsInput jsonEmailNotificationSettingsInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("send_account_updates_email", (boolean)jsonEmailNotificationSettingsInput.a);
        yfe.e("send_activation_email", (boolean)jsonEmailNotificationSettingsInput.b);
        yfe.e("send_address_book_notification_email", (boolean)jsonEmailNotificationSettingsInput.c);
        yfe.e("send_email_newsletter", (boolean)jsonEmailNotificationSettingsInput.d);
        yfe.e("send_email_vit_weekly", (boolean)jsonEmailNotificationSettingsInput.e);
        yfe.e("send_follow_recs_email", (boolean)jsonEmailNotificationSettingsInput.f);
        yfe.e("send_login_notification_email", (boolean)jsonEmailNotificationSettingsInput.g);
        yfe.e("send_network_activity_email", (boolean)jsonEmailNotificationSettingsInput.h);
        final j0a q = jsonEmailNotificationSettingsInput.q;
        if (q != null) {
            ((StringBasedTypeConverter)JsonEmailNotificationSettingsInput$$JsonObjectMapper.JSON_EMAIL_NOTIFICATION_NETWORK_DIGEST_FREQUENCY_CONVERTER).serialize((Object)q, "send_network_digest", true, yfe);
        }
        yfe.e("send_new_direct_text_email", (boolean)jsonEmailNotificationSettingsInput.i);
        yfe.e("send_partner_email", (boolean)jsonEmailNotificationSettingsInput.j);
        final k0a r = jsonEmailNotificationSettingsInput.r;
        if (r != null) {
            ((StringBasedTypeConverter)JsonEmailNotificationSettingsInput$$JsonObjectMapper.JSON_EMAIL_NOTIFICATION_PERFORMANCE_DIGEST_FREQUENCY_CONVERTER).serialize((Object)r, "send_performance_digest", true, yfe);
        }
        yfe.e("send_resurrection_email", (boolean)jsonEmailNotificationSettingsInput.k);
        yfe.e("send_shared_tweet_email", (boolean)jsonEmailNotificationSettingsInput.l);
        yfe.e("send_similar_people_email", (boolean)jsonEmailNotificationSettingsInput.m);
        yfe.e("send_smb_sales_marketing_email", (boolean)jsonEmailNotificationSettingsInput.n);
        yfe.e("send_survey_email", (boolean)jsonEmailNotificationSettingsInput.o);
        yfe.e("send_twitter_emails", (boolean)jsonEmailNotificationSettingsInput.p);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEmailNotificationSettingsInput jsonEmailNotificationSettingsInput, final String s, final qhe qhe) throws IOException {
        final boolean equals = "send_account_updates_email".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        final Boolean b3 = null;
        final Boolean b4 = null;
        final Boolean b5 = null;
        final Boolean b6 = null;
        final Boolean b7 = null;
        final Boolean b8 = null;
        final Boolean b9 = null;
        final Boolean b10 = null;
        final Boolean b11 = null;
        final Boolean b12 = null;
        final Boolean b13 = null;
        final Boolean b14 = null;
        final Boolean b15 = null;
        final Boolean b16 = null;
        if (equals) {
            Boolean value;
            if (qhe.e() == rje.X0) {
                value = b16;
            }
            else {
                value = qhe.l();
            }
            jsonEmailNotificationSettingsInput.a = value;
        }
        else if ("send_activation_email".equals(s)) {
            Boolean value2;
            if (qhe.e() == rje.X0) {
                value2 = b;
            }
            else {
                value2 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.b = value2;
        }
        else if ("send_address_book_notification_email".equals(s)) {
            Boolean value3;
            if (qhe.e() == rje.X0) {
                value3 = b2;
            }
            else {
                value3 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.c = value3;
        }
        else if ("send_email_newsletter".equals(s)) {
            Boolean value4;
            if (qhe.e() == rje.X0) {
                value4 = b3;
            }
            else {
                value4 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.d = value4;
        }
        else if ("send_email_vit_weekly".equals(s)) {
            Boolean value5;
            if (qhe.e() == rje.X0) {
                value5 = b4;
            }
            else {
                value5 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.e = value5;
        }
        else if ("send_follow_recs_email".equals(s)) {
            Boolean value6;
            if (qhe.e() == rje.X0) {
                value6 = b5;
            }
            else {
                value6 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.f = value6;
        }
        else if ("send_login_notification_email".equals(s)) {
            Boolean value7;
            if (qhe.e() == rje.X0) {
                value7 = b6;
            }
            else {
                value7 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.g = value7;
        }
        else if ("send_network_activity_email".equals(s)) {
            Boolean value8;
            if (qhe.e() == rje.X0) {
                value8 = b7;
            }
            else {
                value8 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.h = value8;
        }
        else if ("send_network_digest".equals(s)) {
            jsonEmailNotificationSettingsInput.q = (j0a)((StringBasedTypeConverter)JsonEmailNotificationSettingsInput$$JsonObjectMapper.JSON_EMAIL_NOTIFICATION_NETWORK_DIGEST_FREQUENCY_CONVERTER).parse(qhe);
        }
        else if ("send_new_direct_text_email".equals(s)) {
            Boolean value9;
            if (qhe.e() == rje.X0) {
                value9 = b8;
            }
            else {
                value9 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.i = value9;
        }
        else if ("send_partner_email".equals(s)) {
            Boolean value10;
            if (qhe.e() == rje.X0) {
                value10 = b9;
            }
            else {
                value10 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.j = value10;
        }
        else if ("send_performance_digest".equals(s)) {
            jsonEmailNotificationSettingsInput.r = (k0a)((StringBasedTypeConverter)JsonEmailNotificationSettingsInput$$JsonObjectMapper.JSON_EMAIL_NOTIFICATION_PERFORMANCE_DIGEST_FREQUENCY_CONVERTER).parse(qhe);
        }
        else if ("send_resurrection_email".equals(s)) {
            Boolean value11;
            if (qhe.e() == rje.X0) {
                value11 = b10;
            }
            else {
                value11 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.k = value11;
        }
        else if ("send_shared_tweet_email".equals(s)) {
            Boolean value12;
            if (qhe.e() == rje.X0) {
                value12 = b11;
            }
            else {
                value12 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.l = value12;
        }
        else if ("send_similar_people_email".equals(s)) {
            Boolean value13;
            if (qhe.e() == rje.X0) {
                value13 = b12;
            }
            else {
                value13 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.m = value13;
        }
        else if ("send_smb_sales_marketing_email".equals(s)) {
            Boolean value14;
            if (qhe.e() == rje.X0) {
                value14 = b13;
            }
            else {
                value14 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.n = value14;
        }
        else if ("send_survey_email".equals(s)) {
            Boolean value15;
            if (qhe.e() == rje.X0) {
                value15 = b14;
            }
            else {
                value15 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.o = value15;
        }
        else if ("send_twitter_emails".equals(s)) {
            Boolean value16;
            if (qhe.e() == rje.X0) {
                value16 = b15;
            }
            else {
                value16 = qhe.l();
            }
            jsonEmailNotificationSettingsInput.p = value16;
        }
    }
    
    public JsonEmailNotificationSettingsInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEmailNotificationSettingsInput jsonEmailNotificationSettingsInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEmailNotificationSettingsInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEmailNotificationSettingsInput)o, yfe, b);
    }
}
