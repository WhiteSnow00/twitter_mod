import java.io.Closeable;
import java.util.Iterator;
import java.util.Objects;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchPersistedDataSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonTweetSelectionUrtSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSecurityKeyEnrollmentSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonGoogleOneTapSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonJsInstrumentationSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEnterDateSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSsoSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonWebModalSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonTopicsSelectorSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEnterEmailSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEnterPhoneSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEnterTextSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonChoiceSelectionInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSettingResponseWithKey;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSettingsListSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEnterUsernameSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTemporaryPasswordSubtaskInput;
import java.util.List;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonInterestPickerSubtaskInput$JsonCustomInterest;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonInterestPickerSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonUserRecommendationsSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonPasswordEntrySubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonPrivacyOptionsSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSignUpSubtaskInput$JsonJsInstrumentationResult;
import com.twitter.model.json.onboarding.JsonDate;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSignUpSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEmailVerificationSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonPhoneVerificationSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonDefaultSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonSubtaskInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonInputFlowData;
import com.twitter.analytics.tracking.a;
import java.util.Map;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonGetTaskRequestQuery;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hd6 implements uaq<ncs, msm<qcs, kbv>>
{
    public final uaq<wei, msm<qcs, kbv>> D0;
    public final uaq<wei, msm<qcs, kbv>> E0;
    public final uaq<tji, msm<qcs, kbv>> F0;
    
    public hd6(final uaq<wei, msm<qcs, kbv>> d0, final uaq<wei, msm<qcs, kbv>> e0, final uaq<tji, msm<qcs, kbv>> f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final sog E(final qsb qsb) {
        return gw8.c((uaq)this, qsb);
    }
    
    public final eaq R(Object o) {
        final ncs ncs = (ncs)o;
        final JsonGetTaskRequestQuery jsonGetTaskRequestQuery = new JsonGetTaskRequestQuery();
        final nw6 c = ssr.c;
        final qjg t = qjg.t();
        final boolean b = true;
        final Integer value = 1;
        t.w((Object)"alert_dialog", (Object)value);
        t.w((Object)"alert_dialog_suppress_client_events", (Object)value);
        final Integer value2 = 2;
        t.w((Object)"open_account", (Object)value2);
        t.w((Object)"cta_inline", (Object)value);
        t.w((Object)"fetch_temporary_password", (Object)value);
        final Integer value3 = 4;
        t.w((Object)"interest_picker", (Object)value3);
        final Integer value4 = 3;
        t.w((Object)"contacts_live_sync_permission_prompt", (Object)value4);
        t.w((Object)"menu_dialog", (Object)value);
        t.w((Object)"open_home_timeline", (Object)value);
        t.w((Object)"open_link", (Object)value);
        final Integer value5 = 5;
        t.w((Object)"enter_password", (Object)value5);
        t.w((Object)"phone_verification", (Object)value5);
        t.w((Object)"email_verification", (Object)value4);
        t.w((Object)"privacy_options", (Object)value);
        t.w((Object)"sign_up", (Object)value2);
        t.w((Object)"sign_up_review", (Object)value5);
        t.w((Object)"enter_username", (Object)value4);
        t.w((Object)"user_recommendations_list", (Object)value3);
        t.w((Object)"user_recommendations_urt", (Object)value4);
        final Integer value6 = 7;
        t.w((Object)"cta", (Object)value6);
        t.w((Object)"settings_list", (Object)value6);
        t.w((Object)"wait_spinner", (Object)value4);
        t.w((Object)"end_flow", (Object)value);
        t.w((Object)"enter_text", (Object)value5);
        t.w((Object)"select_avatar", (Object)value3);
        t.w((Object)"select_banner", (Object)value2);
        t.w((Object)"choice_selection", (Object)value5);
        t.w((Object)"enter_phone", (Object)value2);
        t.w((Object)"update_users", (Object)value);
        t.w((Object)"topics_selector", (Object)value);
        t.w((Object)"enter_email", (Object)value2);
        t.w((Object)"location_permission_prompt", (Object)value);
        t.w((Object)"notifications_permission_prompt", (Object)value3);
        t.w((Object)"check_logged_in_account", (Object)value);
        t.w((Object)"generic_urt", (Object)value4);
        t.w((Object)"upload_media", (Object)value);
        t.w((Object)"in_app_notification", (Object)value);
        t.w((Object)"web", (Object)value2);
        t.w((Object)"web_modal", (Object)value2);
        t.w((Object)"single_sign_on", (Object)value);
        t.w((Object)"enter_date", (Object)value);
        t.w((Object)"js_instrumentation", (Object)value);
        t.w((Object)"action_list", (Object)value2);
        t.w((Object)"one_tap", (Object)value2);
        t.w((Object)"app_locale_update", (Object)value);
        t.w((Object)"open_external_link", (Object)value);
        t.w((Object)"show_code", (Object)value);
        t.w((Object)"security_key", (Object)value);
        t.w((Object)"tweet_selection_urt", (Object)value);
        t.w((Object)"fetch_persisted_data", (Object)value);
        jsonGetTaskRequestQuery.b = (Map)((n4j)t).e();
        jsonGetTaskRequestQuery.a = ncs.b;
        final v4j v4j = new v4j(9);
        vqd i;
        if (!ikr.g((CharSequence)ncs.g) && !ikr.g((CharSequence)ncs.f)) {
            i = ncs.i;
        }
        else {
            final vqd.a a = new vqd.a(ncs.i);
            String g = ncs.g;
            if (g != null) {
                if (!ikr.g((CharSequence)g)) {
                    g = null;
                }
                if (g != null) {
                    a.a = g;
                }
            }
            String f = ncs.f;
            if (f != null) {
                if (!ikr.g((CharSequence)f)) {
                    f = null;
                }
                if (f != null) {
                    final kvj<String, String> e = ((a)v4j.D0).e();
                    final Object a2 = ((m2j)e).a;
                    jee.l(a2);
                    czd.e(a2, "referrer.first()");
                    final String s = (String)a2;
                    final Object b2 = ((m2j)e).b;
                    jee.l(b2);
                    czd.e(b2, "referrer.second()");
                    final String s2 = (String)b2;
                    final y8b y8b = new y8b(f);
                    final Map h = ncs.h;
                    if (!ikr.g((CharSequence)s) && !ikr.g((CharSequence)s2)) {
                        o = null;
                    }
                    else {
                        o = new f8m(s, s2);
                    }
                    a.b = new f7b(y8b, h, (f8m)o);
                }
            }
            i = (vqd)a.e();
        }
        jsonGetTaskRequestQuery.d = JsonInputFlowData.t(i);
        final String e2 = ncs.e;
        eaq eaq;
        if (e2 != null) {
            o = new wei(ncs.a, e2, jsonGetTaskRequestQuery);
            final boolean k = ncs.k;
            int n = 0;
            if (!k) {
                n = (b ? 1 : 0);
                if (!ncs.j) {
                    n = (b ? 1 : 0);
                    if (!"signup".equals(ncs.e)) {
                        n = (b ? 1 : 0);
                        if (!"debug/splash_screen/sign_up/legacy_redirect".equals(ncs.e)) {
                            n = (b ? 1 : 0);
                            if (!"debug/splash_screen/sign_up/fastest_flow".equals(ncs.e)) {
                                n = (b ? 1 : 0);
                                if (!"debug/account_switcher/sign_up/legacy_redirect".equals(ncs.e)) {
                                    n = (b ? 1 : 0);
                                    if (!"debug/account_switcher/sign_up/fastest_flow".equals(ncs.e)) {
                                        n = (b ? 1 : 0);
                                        if (!"nux_so_fast_flow".equals(ncs.e)) {
                                            if ("welcome".equals(ncs.e)) {
                                                n = (b ? 1 : 0);
                                            }
                                            else {
                                                n = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (n != 0) {
                eaq = this.E0.R(o);
            }
            else {
                eaq = this.D0.R(o);
            }
        }
        else if (ncs.b != null && ncs.c == null) {
            eaq = this.F0.R((Object)new tji(ncs.a, jsonGetTaskRequestQuery));
        }
        else {
            jee.l((Object)ncs.c);
            jee.l((Object)ncs.d);
            final vbs c2 = ncs.c;
            final Map d = ncs.d;
            final rif h2 = rif.H();
            for (final Map.Entry<String, V> entry : d.entrySet()) {
                final ssr b3 = c2.b((String)entry.getKey());
                jee.l((Object)b3);
                final pqd pqd = (pqd)entry.getValue();
                final JsonSubtaskInput jsonSubtaskInput = new JsonSubtaskInput();
                jsonSubtaskInput.a = b3.a;
                if (b3 instanceof sw) {
                    jsonSubtaskInput.b = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof e1g) {
                    jsonSubtaskInput.c = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof m4h) {
                    jsonSubtaskInput.d = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof r07) {
                    jsonSubtaskInput.e = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof jmj) {
                    jsonSubtaskInput.f = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof mmj) {
                    jsonSubtaskInput.g = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof gck) {
                    final JsonPhoneVerificationSubtaskInput h3 = new JsonPhoneVerificationSubtaskInput();
                    final fsw fsw = (fsw)pqd.b;
                    ((JsonDefaultSubtaskInput)h3).a = pqd.a.b;
                    if (fsw != null) {
                        h3.b = fsw.b;
                        h3.c = fsw.c;
                        h3.d = fsw.d;
                    }
                    jsonSubtaskInput.h = h3;
                }
                else if (b3 instanceof zz9) {
                    final JsonEmailVerificationSubtaskInput j = new JsonEmailVerificationSubtaskInput();
                    final fsw fsw2 = (fsw)pqd.b;
                    ((JsonDefaultSubtaskInput)j).a = pqd.a.b;
                    if (fsw2 != null) {
                        j.c = fsw2.b;
                        j.b = fsw2.c;
                    }
                    jsonSubtaskInput.i = j;
                }
                else if (b3 instanceof c7q) {
                    final JsonSignUpSubtaskInput l = new JsonSignUpSubtaskInput();
                    ((JsonDefaultSubtaskInput)l).a = pqd.a.b;
                    final tqd b4 = pqd.b;
                    if (b4 != null) {
                        final d7q d7q = (d7q)b4;
                        l.b = d7q.b;
                        l.c = d7q.d;
                        l.d = d7q.c;
                        final o98 f2 = d7q.f;
                        if (f2 != null) {
                            final JsonDate e3 = new JsonDate();
                            e3.c = f2.a;
                            e3.b = f2.b;
                            e3.a = f2.c;
                            l.e = e3;
                        }
                        final String g2 = d7q.g;
                        final JsonSignUpSubtaskInput$JsonJsInstrumentationResult f3 = new JsonSignUpSubtaskInput$JsonJsInstrumentationResult();
                        f3.a = g2;
                        l.f = f3;
                    }
                    jsonSubtaskInput.j = l;
                }
                else if (b3 instanceof q6q) {
                    jsonSubtaskInput.k = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof i0l) {
                    final JsonPrivacyOptionsSubtaskInput m = new JsonPrivacyOptionsSubtaskInput();
                    ((JsonDefaultSubtaskInput)m).a = pqd.a.b;
                    final tqd b5 = pqd.b;
                    if (b5 != null) {
                        final int a3 = c5j.a;
                        final j0l j0l = (j0l)b5;
                        m.b = j0l.b;
                        m.c = j0l.c;
                    }
                    jsonSubtaskInput.l = m;
                }
                else if (b3 instanceof tyj) {
                    final JsonPasswordEntrySubtaskInput m2 = new JsonPasswordEntrySubtaskInput();
                    ((JsonDefaultSubtaskInput)m2).a = pqd.a.b;
                    final tqd b6 = pqd.b;
                    if (b6 != null) {
                        final int a4 = c5j.a;
                        m2.b = ((yjr)b6).b;
                    }
                    jsonSubtaskInput.m = m2;
                }
                else if (b3 instanceof ygw) {
                    jsonSubtaskInput.n = JsonUserRecommendationsSubtaskInput.t(pqd);
                }
                else if (b3 instanceof z3j) {
                    jsonSubtaskInput.o = JsonUserRecommendationsSubtaskInput.t(pqd);
                }
                else if (b3 instanceof gvd) {
                    final JsonInterestPickerSubtaskInput p = new JsonInterestPickerSubtaskInput();
                    ((JsonDefaultSubtaskInput)p).a = pqd.a.b;
                    final tqd b7 = pqd.b;
                    if (b7 != null) {
                        final int a5 = c5j.a;
                        final hvd hvd = (hvd)b7;
                        final List<v97> c3 = hvd.c;
                        final rif h4 = rif.H();
                        for (final v97 v97 : c3) {
                            final JsonInterestPickerSubtaskInput$JsonCustomInterest jsonInterestPickerSubtaskInput$JsonCustomInterest = new JsonInterestPickerSubtaskInput$JsonCustomInterest();
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.a = v97.a;
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.b = v97.b;
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.c = v97.c;
                            h4.p((Object)jsonInterestPickerSubtaskInput$JsonCustomInterest);
                        }
                        p.c = (List)((n4j)h4).e();
                        p.b = hvd.b;
                    }
                    jsonSubtaskInput.p = p;
                }
                else if (b3 instanceof tva) {
                    final JsonFetchTemporaryPasswordSubtaskInput q = new JsonFetchTemporaryPasswordSubtaskInput();
                    ((JsonDefaultSubtaskInput)q).a = pqd.a.b;
                    final tqd b8 = pqd.b;
                    if (b8 != null) {
                        final int a6 = c5j.a;
                        q.b = ((xva)b8).b;
                    }
                    jsonSubtaskInput.q = q;
                }
                else if (b3 instanceof g6a) {
                    final JsonEnterUsernameSubtaskInput r = new JsonEnterUsernameSubtaskInput();
                    ((JsonDefaultSubtaskInput)r).a = pqd.a.b;
                    final tqd b9 = pqd.b;
                    if (b9 != null) {
                        r.b = ((h6a)b9).b;
                    }
                    jsonSubtaskInput.r = r;
                }
                else if (b3 instanceof pop) {
                    final JsonSettingsListSubtaskInput s3 = new JsonSettingsListSubtaskInput();
                    ((JsonDefaultSubtaskInput)s3).a = pqd.a.b;
                    final tqd b10 = pqd.b;
                    if (b10 != null) {
                        final Map b11 = ((vd)b10).b;
                        if (b11 != null) {
                            s3.b = JsonSettingResponseWithKey.s(b11);
                        }
                        else {
                            s3.b = null;
                        }
                    }
                    jsonSubtaskInput.s = s3;
                }
                else if (b3 instanceof f77) {
                    jsonSubtaskInput.t = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof n84) {
                    final JsonChoiceSelectionInput x = new JsonChoiceSelectionInput();
                    final tqd b12 = pqd.b;
                    if (b12 != null) {
                        final int a7 = c5j.a;
                        final j84 j2 = (j84)b12;
                        x.t(j2.b);
                        x.c = j2.c;
                        ((JsonDefaultSubtaskInput)x).a = pqd.a.b;
                    }
                    jsonSubtaskInput.x = x;
                }
                else if (b3 instanceof z5a) {
                    final JsonEnterTextSubtaskInput u = new JsonEnterTextSubtaskInput();
                    final a6a a6a = (a6a)pqd.b;
                    ((JsonDefaultSubtaskInput)u).a = pqd.a.b;
                    if (a6a != null) {
                        u.b = a6a.b;
                        u.c = a6a.c;
                    }
                    jsonSubtaskInput.u = u;
                }
                else if (b3 instanceof scp) {
                    jsonSubtaskInput.v = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof zcp) {
                    jsonSubtaskInput.w = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof t5a) {
                    final JsonEnterPhoneSubtaskInput y = new JsonEnterPhoneSubtaskInput();
                    final tqd b13 = pqd.b;
                    if (b13 != null) {
                        final int a8 = c5j.a;
                        final u5a u5a = u5a.class.cast(b13);
                        y.b = u5a.c;
                        y.c = u5a.d;
                        y.d = u5a.e;
                        final Map b14 = ((vd)u5a).b;
                        if (b14 != null) {
                            y.e = JsonSettingResponseWithKey.s(b14);
                        }
                        else {
                            y.e = null;
                        }
                    }
                    ((JsonDefaultSubtaskInput)y).a = pqd.a.b;
                    jsonSubtaskInput.y = y;
                }
                else if (b3 instanceof a4w) {
                    jsonSubtaskInput.z = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof q4a) {
                    final JsonEnterEmailSubtaskInput a9 = new JsonEnterEmailSubtaskInput();
                    final tqd b15 = pqd.b;
                    if (b15 != null) {
                        final int a10 = c5j.a;
                        final r4a r4a = r4a.class.cast(b15);
                        a9.b = r4a.c;
                        a9.c = r4a.d;
                        final Map b16 = ((vd)r4a).b;
                        if (b16 != null) {
                            a9.d = JsonSettingResponseWithKey.s(b16);
                        }
                        else {
                            a9.d = null;
                        }
                    }
                    ((JsonDefaultSubtaskInput)a9).a = pqd.a.b;
                    jsonSubtaskInput.A = a9;
                }
                else if (b3 instanceof ntt) {
                    final JsonTopicsSelectorSubtaskInput b17 = new JsonTopicsSelectorSubtaskInput();
                    ((JsonDefaultSubtaskInput)b17).a = pqd.a.b;
                    final tqd b18 = pqd.b;
                    if (b18 != null) {
                        final int a11 = c5j.a;
                        final ott ott = ott.class.cast(b18);
                        b17.b = ott.b;
                        b17.c = ott.c;
                    }
                    jsonSubtaskInput.B = b17;
                }
                else if (b3 instanceof a6g) {
                    jsonSubtaskInput.C = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof lxi) {
                    jsonSubtaskInput.D = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof c64) {
                    jsonSubtaskInput.E = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof n0c) {
                    jsonSubtaskInput.F = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof h4w) {
                    jsonSubtaskInput.G = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof vfd) {
                    jsonSubtaskInput.H = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof amx) {
                    final JsonWebModalSubtaskInput i2 = new JsonWebModalSubtaskInput();
                    ((JsonDefaultSubtaskInput)i2).a = pqd.a.b;
                    final tqd b19 = pqd.b;
                    final int a12 = c5j.a;
                    final xlx xlx = xlx.class.cast(b19);
                    if (xlx != null) {
                        i2.b = xlx.b;
                    }
                    jsonSubtaskInput.I = i2;
                }
                else if (b3 instanceof l5r) {
                    final JsonSsoSubtaskInput j3 = new JsonSsoSubtaskInput();
                    ((JsonDefaultSubtaskInput)j3).a = pqd.a.b;
                    final tqd b20 = pqd.b;
                    final int a13 = c5j.a;
                    final i5r i5r = i5r.class.cast(b20);
                    if (i5r != null) {
                        j3.b = i5r.b;
                        j3.c = i5r.c;
                        j3.d = i5r.d;
                        j3.e = i5r.e;
                        j3.f = i5r.f;
                    }
                    jsonSubtaskInput.J = j3;
                }
                else if (b3 instanceof l4a) {
                    final JsonEnterDateSubtaskInput k2 = new JsonEnterDateSubtaskInput();
                    ((JsonDefaultSubtaskInput)k2).a = pqd.a.b;
                    final tqd b21 = pqd.b;
                    final int a14 = c5j.a;
                    final k4a k4a = k4a.class.cast(b21);
                    if (k4a != null) {
                        final o98 b22 = k4a.b;
                        final JsonDate b23 = new JsonDate();
                        b23.c = b22.a;
                        b23.b = b22.b;
                        b23.a = b22.c;
                        k2.b = b23;
                    }
                    jsonSubtaskInput.K = k2;
                }
                else if (b3 instanceof ybe) {
                    final JsonJsInstrumentationSubtaskInput l2 = new JsonJsInstrumentationSubtaskInput();
                    ((JsonDefaultSubtaskInput)l2).a = pqd.a.b;
                    final tqd b24 = pqd.b;
                    final int a15 = c5j.a;
                    final cce cce = cce.class.cast(b24);
                    if (cce != null) {
                        l2.b = cce.b;
                    }
                    jsonSubtaskInput.L = l2;
                }
                else if (b3 instanceof dn0) {
                    jsonSubtaskInput.M = JsonDefaultSubtaskInput.s(pqd);
                }
                else if (b3 instanceof llj) {
                    final JsonGoogleOneTapSubtaskInput n2 = new JsonGoogleOneTapSubtaskInput();
                    ((JsonDefaultSubtaskInput)n2).a = pqd.a.b;
                    final tqd b25 = pqd.b;
                    final int a16 = c5j.a;
                    final a5c a5c = a5c.class.cast(b25);
                    if (a5c != null) {
                        n2.b = a5c.b;
                        n2.c = a5c.c;
                        n2.d = a5c.d;
                    }
                    jsonSubtaskInput.N = n2;
                }
                else if (b3 instanceof dbp) {
                    final JsonSecurityKeyEnrollmentSubtaskInput o2 = new JsonSecurityKeyEnrollmentSubtaskInput();
                    ((JsonDefaultSubtaskInput)o2).a = pqd.a.b;
                    final tqd b26 = pqd.b;
                    final int a17 = c5j.a;
                    final cbp cbp = cbp.class.cast(b26);
                    if (cbp != null) {
                        o2.b = cbp.b;
                    }
                    jsonSubtaskInput.O = o2;
                }
                else if (b3 instanceof bsu) {
                    final JsonTweetSelectionUrtSubtaskInput p2 = new JsonTweetSelectionUrtSubtaskInput();
                    ((JsonDefaultSubtaskInput)p2).a = pqd.a.b;
                    final tqd b27 = pqd.b;
                    if (b27 != null) {
                        final int a18 = c5j.a;
                        p2.b = ((csu)b27).b;
                    }
                    jsonSubtaskInput.P = p2;
                }
                else if (b3 instanceof kva) {
                    Objects.requireNonNull(JsonFetchPersistedDataSubtaskInput.Companion);
                    czd.f((Object)pqd, "inputAction");
                    final JsonFetchPersistedDataSubtaskInput q2 = new JsonFetchPersistedDataSubtaskInput();
                    ((JsonDefaultSubtaskInput)q2).a = pqd.a.b;
                    final tqd b28 = pqd.b;
                    if (b28 instanceof lva) {
                        final lva lva = (lva)b28;
                        final int ordinal = ((Enum)lva.b).ordinal();
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                q2.c = lva.c;
                            }
                        }
                        else {
                            q2.b = lva.c;
                        }
                    }
                    jsonSubtaskInput.Q = q2;
                }
                h2.p((Object)jsonSubtaskInput);
            }
            jsonGetTaskRequestQuery.c = (List)((n4j)h2).e();
            eaq = this.F0.R((Object)new tji(ncs.a, jsonGetTaskRequestQuery));
        }
        return eaq;
    }
    
    public final void close() {
        h1e.a((Closeable)this.D0);
        h1e.a((Closeable)this.F0);
    }
    
    public final sog m1(final r8x r8x) {
        return gw8.d((uaq)this, r8x);
    }
    
    public final uaq n(final p4s p4s) {
        return gw8.l((uaq)this, p4s);
    }
    
    public final uaq o(final qsb qsb) {
        return gw8.h((uaq)this, qsb);
    }
    
    public final l6j x0(final l6j l6j, final vw0 vw0) {
        return gw8.i((uaq)this, l6j, vw0);
    }
}
