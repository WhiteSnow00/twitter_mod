// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonSubtaskInput>
{
    public static JsonSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonSubtaskInput jsonSubtaskInput = new JsonSubtaskInput();
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
            parseField(jsonSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonSubtaskInput;
    }
    
    public static void _serialize(final JsonSubtaskInput jsonSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSubtaskInput.b != null) {
            yfe.i("alert_dialog");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.b, yfe, true);
        }
        if (jsonSubtaskInput.M != null) {
            yfe.i("app_locale_update");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.M, yfe, true);
        }
        if (jsonSubtaskInput.E != null) {
            yfe.i("check_logged_in_account");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.E, yfe, true);
        }
        if (jsonSubtaskInput.x != null) {
            yfe.i("choice_selection");
            JsonChoiceSelectionInput$$JsonObjectMapper._serialize(jsonSubtaskInput.x, yfe, true);
        }
        if (jsonSubtaskInput.c != null) {
            yfe.i("contacts_live_sync_permission_prompt");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.c, yfe, true);
        }
        if (jsonSubtaskInput.t != null) {
            yfe.i("cta");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.t, yfe, true);
        }
        if (jsonSubtaskInput.i != null) {
            yfe.i("email_verification");
            JsonEmailVerificationSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.i, yfe, true);
        }
        if (jsonSubtaskInput.K != null) {
            yfe.i("enter_date");
            JsonEnterDateSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.K, yfe, true);
        }
        if (jsonSubtaskInput.A != null) {
            yfe.i("enter_email");
            JsonEnterEmailSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.A, yfe, true);
        }
        if (jsonSubtaskInput.m != null) {
            yfe.i("enter_password");
            JsonPasswordEntrySubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.m, yfe, true);
        }
        if (jsonSubtaskInput.y != null) {
            yfe.i("enter_phone");
            JsonEnterPhoneSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.y, yfe, true);
        }
        if (jsonSubtaskInput.u != null) {
            yfe.i("enter_text");
            JsonEnterTextSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.u, yfe, true);
        }
        if (jsonSubtaskInput.r != null) {
            yfe.i("enter_username");
            JsonEnterUsernameSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.r, yfe, true);
        }
        if (jsonSubtaskInput.Q != null) {
            yfe.i("fetch_persisted_data");
            JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.Q, yfe, true);
        }
        if (jsonSubtaskInput.q != null) {
            yfe.i("fetch_temporary_password");
            JsonFetchTemporaryPasswordSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.q, yfe, true);
        }
        if (jsonSubtaskInput.F != null) {
            yfe.i("generic_urt");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.F, yfe, true);
        }
        if (jsonSubtaskInput.H != null) {
            yfe.i("in_app_notification");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.H, yfe, true);
        }
        if (jsonSubtaskInput.p != null) {
            yfe.i("interest_picker");
            JsonInterestPickerSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.p, yfe, true);
        }
        if (jsonSubtaskInput.L != null) {
            yfe.i("js_instrumentation");
            JsonJsInstrumentationSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.L, yfe, true);
        }
        if (jsonSubtaskInput.C != null) {
            yfe.i("location_permission_prompt");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.C, yfe, true);
        }
        if (jsonSubtaskInput.d != null) {
            yfe.i("menu_dialog");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.d, yfe, true);
        }
        if (jsonSubtaskInput.D != null) {
            yfe.i("notifications_permission_prompt");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.D, yfe, true);
        }
        if (jsonSubtaskInput.N != null) {
            yfe.i("one_tap");
            JsonGoogleOneTapSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.N, yfe, true);
        }
        if (jsonSubtaskInput.e != null) {
            yfe.i("open_account");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.e, yfe, true);
        }
        if (jsonSubtaskInput.f != null) {
            yfe.i("open_home_timeline");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.f, yfe, true);
        }
        if (jsonSubtaskInput.g != null) {
            yfe.i("open_link");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.g, yfe, true);
        }
        if (jsonSubtaskInput.h != null) {
            yfe.i("phone_verification");
            JsonPhoneVerificationSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.h, yfe, true);
        }
        if (jsonSubtaskInput.l != null) {
            yfe.i("privacy_options");
            JsonPrivacyOptionsSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.l, yfe, true);
        }
        if (jsonSubtaskInput.O != null) {
            yfe.i("security_key");
            JsonSecurityKeyEnrollmentSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.O, yfe, true);
        }
        if (jsonSubtaskInput.v != null) {
            yfe.i("select_avatar");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.v, yfe, true);
        }
        if (jsonSubtaskInput.w != null) {
            yfe.i("select_banner");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.w, yfe, true);
        }
        if (jsonSubtaskInput.s != null) {
            yfe.i("settings_list");
            JsonSettingsListSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.s, yfe, true);
        }
        if (jsonSubtaskInput.j != null) {
            yfe.i("sign_up");
            JsonSignUpSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.j, yfe, true);
        }
        if (jsonSubtaskInput.k != null) {
            yfe.i("sign_up_review");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.k, yfe, true);
        }
        if (jsonSubtaskInput.J != null) {
            yfe.i("single_sign_on");
            JsonSsoSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.J, yfe, true);
        }
        yfe.u0("subtask_id", jsonSubtaskInput.a);
        if (jsonSubtaskInput.B != null) {
            yfe.i("topics_selector");
            JsonTopicsSelectorSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.B, yfe, true);
        }
        if (jsonSubtaskInput.P != null) {
            yfe.i("tweet_selection_urt");
            JsonTweetSelectionUrtSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.P, yfe, true);
        }
        if (jsonSubtaskInput.z != null) {
            yfe.i("update_users");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.z, yfe, true);
        }
        if (jsonSubtaskInput.G != null) {
            yfe.i("upload_media");
            JsonDefaultSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.G, yfe, true);
        }
        if (jsonSubtaskInput.n != null) {
            yfe.i("user_recommendations_list");
            JsonUserRecommendationsSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.n, yfe, true);
        }
        if (jsonSubtaskInput.o != null) {
            yfe.i("user_recommendations_urt");
            JsonUserRecommendationsSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.o, yfe, true);
        }
        if (jsonSubtaskInput.I != null) {
            yfe.i("web_modal");
            JsonWebModalSubtaskInput$$JsonObjectMapper._serialize(jsonSubtaskInput.I, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskInput jsonSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("alert_dialog".equals(s)) {
            jsonSubtaskInput.b = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("app_locale_update".equals(s)) {
            jsonSubtaskInput.M = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("check_logged_in_account".equals(s)) {
            jsonSubtaskInput.E = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("choice_selection".equals(s)) {
            jsonSubtaskInput.x = JsonChoiceSelectionInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("contacts_live_sync_permission_prompt".equals(s)) {
            jsonSubtaskInput.c = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("cta".equals(s)) {
            jsonSubtaskInput.t = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("email_verification".equals(s)) {
            jsonSubtaskInput.i = JsonEmailVerificationSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_date".equals(s)) {
            jsonSubtaskInput.K = JsonEnterDateSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_email".equals(s)) {
            jsonSubtaskInput.A = JsonEnterEmailSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_password".equals(s)) {
            jsonSubtaskInput.m = JsonPasswordEntrySubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_phone".equals(s)) {
            jsonSubtaskInput.y = JsonEnterPhoneSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_text".equals(s)) {
            jsonSubtaskInput.u = JsonEnterTextSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("enter_username".equals(s)) {
            jsonSubtaskInput.r = JsonEnterUsernameSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("fetch_persisted_data".equals(s)) {
            jsonSubtaskInput.Q = JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("fetch_temporary_password".equals(s)) {
            jsonSubtaskInput.q = JsonFetchTemporaryPasswordSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("generic_urt".equals(s)) {
            jsonSubtaskInput.F = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("in_app_notification".equals(s)) {
            jsonSubtaskInput.H = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("interest_picker".equals(s)) {
            jsonSubtaskInput.p = JsonInterestPickerSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSubtaskInput.L = JsonJsInstrumentationSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("location_permission_prompt".equals(s)) {
            jsonSubtaskInput.C = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("menu_dialog".equals(s)) {
            jsonSubtaskInput.d = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("notifications_permission_prompt".equals(s)) {
            jsonSubtaskInput.D = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("one_tap".equals(s)) {
            jsonSubtaskInput.N = JsonGoogleOneTapSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("open_account".equals(s)) {
            jsonSubtaskInput.e = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("open_home_timeline".equals(s)) {
            jsonSubtaskInput.f = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("open_link".equals(s)) {
            jsonSubtaskInput.g = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("phone_verification".equals(s)) {
            jsonSubtaskInput.h = JsonPhoneVerificationSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("privacy_options".equals(s)) {
            jsonSubtaskInput.l = JsonPrivacyOptionsSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("security_key".equals(s)) {
            jsonSubtaskInput.O = JsonSecurityKeyEnrollmentSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("select_avatar".equals(s)) {
            jsonSubtaskInput.v = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("select_banner".equals(s)) {
            jsonSubtaskInput.w = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("settings_list".equals(s)) {
            jsonSubtaskInput.s = JsonSettingsListSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("sign_up".equals(s)) {
            jsonSubtaskInput.j = JsonSignUpSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("sign_up_review".equals(s)) {
            jsonSubtaskInput.k = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("single_sign_on".equals(s)) {
            jsonSubtaskInput.J = JsonSsoSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtaskInput.a = qhe.T((String)null);
        }
        else if ("topics_selector".equals(s)) {
            jsonSubtaskInput.B = JsonTopicsSelectorSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("tweet_selection_urt".equals(s)) {
            jsonSubtaskInput.P = JsonTweetSelectionUrtSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("update_users".equals(s)) {
            jsonSubtaskInput.z = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("upload_media".equals(s)) {
            jsonSubtaskInput.G = JsonDefaultSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("user_recommendations_list".equals(s)) {
            jsonSubtaskInput.n = JsonUserRecommendationsSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("user_recommendations_urt".equals(s)) {
            jsonSubtaskInput.o = JsonUserRecommendationsSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
        else if ("web_modal".equals(s)) {
            jsonSubtaskInput.I = JsonWebModalSubtaskInput$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSubtaskInput jsonSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSubtaskInput)o, yfe, b);
    }
}
