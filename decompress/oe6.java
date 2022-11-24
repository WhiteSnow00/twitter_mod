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

public final class oe6 implements rbq<fds, btm<ids, zbv>>
{
    public final rbq<ofi, btm<ids, zbv>> F0;
    public final rbq<ofi, btm<ids, zbv>> G0;
    public final rbq<lki, btm<ids, zbv>> H0;
    
    public oe6(final rbq<ofi, btm<ids, zbv>> f0, final rbq<ofi, btm<ids, zbv>> g0, final rbq<lki, btm<ids, zbv>> h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public final bbq S(Object o) {
        final fds fds = (fds)o;
        final JsonGetTaskRequestQuery jsonGetTaskRequestQuery = new JsonGetTaskRequestQuery();
        final tx6 c = qtr.c;
        final kkg t = kkg.t();
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
        jsonGetTaskRequestQuery.b = (Map)((z4j)t).e();
        jsonGetTaskRequestQuery.a = fds.b;
        final aef aef = new aef(13);
        xrd i;
        if (!flr.g((CharSequence)fds.g) && !flr.g((CharSequence)fds.f)) {
            i = fds.i;
        }
        else {
            final xrd$a xrd$a = new xrd$a(fds.i);
            String g = fds.g;
            if (g != null) {
                if (!flr.g((CharSequence)g)) {
                    g = null;
                }
                if (g != null) {
                    xrd$a.a = g;
                }
            }
            String f = fds.f;
            if (f != null) {
                if (!flr.g((CharSequence)f)) {
                    f = null;
                }
                if (f != null) {
                    final zvj e = ((a)aef.F0).e();
                    final Object a = ((z2j)e).a;
                    vmw.g(a);
                    e0e.e(a, "referrer.first()");
                    final String s = (String)a;
                    final Object b2 = ((z2j)e).b;
                    vmw.g(b2);
                    e0e.e(b2, "referrer.second()");
                    final String s2 = (String)b2;
                    final z9b z9b = new z9b(f);
                    final Map h = fds.h;
                    if (!flr.g((CharSequence)s) && !flr.g((CharSequence)s2)) {
                        o = null;
                    }
                    else {
                        o = new s8m(s, s2);
                    }
                    xrd$a.b = new g8b(z9b, h, (s8m)o);
                }
            }
            i = (xrd)((z4j)xrd$a).e();
        }
        jsonGetTaskRequestQuery.d = JsonInputFlowData.t(i);
        final String e2 = fds.e;
        bbq<btm<ids, zbv>> bbq;
        if (e2 != null) {
            o = new ofi(fds.a, e2, jsonGetTaskRequestQuery);
            final boolean k = fds.k;
            int n = 0;
            if (!k) {
                n = (b ? 1 : 0);
                if (!fds.j) {
                    n = (b ? 1 : 0);
                    if (!"signup".equals(fds.e)) {
                        n = (b ? 1 : 0);
                        if (!"debug/splash_screen/sign_up/legacy_redirect".equals(fds.e)) {
                            n = (b ? 1 : 0);
                            if (!"debug/splash_screen/sign_up/fastest_flow".equals(fds.e)) {
                                n = (b ? 1 : 0);
                                if (!"debug/account_switcher/sign_up/legacy_redirect".equals(fds.e)) {
                                    n = (b ? 1 : 0);
                                    if (!"debug/account_switcher/sign_up/fastest_flow".equals(fds.e)) {
                                        n = (b ? 1 : 0);
                                        if (!"nux_so_fast_flow".equals(fds.e)) {
                                            if ("welcome".equals(fds.e)) {
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
                bbq = this.G0.S((ofi)o);
            }
            else {
                bbq = this.F0.S((ofi)o);
            }
        }
        else if (fds.b != null && fds.c == null) {
            bbq = this.H0.S(new lki(fds.a, jsonGetTaskRequestQuery));
        }
        else {
            vmw.g((Object)fds.c);
            vmw.g((Object)fds.d);
            final ncs c2 = fds.c;
            final Map d = fds.d;
            final ojf h2 = ojf.H();
            for (final Map.Entry<String, V> entry : d.entrySet()) {
                final qtr b3 = c2.b((String)entry.getKey());
                vmw.g((Object)b3);
                final rrd rrd = (rrd)entry.getValue();
                final JsonSubtaskInput jsonSubtaskInput = new JsonSubtaskInput();
                jsonSubtaskInput.a = b3.a;
                if (b3 instanceof sw) {
                    jsonSubtaskInput.b = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof c2g) {
                    jsonSubtaskInput.c = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof d5h) {
                    jsonSubtaskInput.d = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof x17) {
                    jsonSubtaskInput.e = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof zmj) {
                    jsonSubtaskInput.f = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof cnj) {
                    jsonSubtaskInput.g = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof vck) {
                    final JsonPhoneVerificationSubtaskInput h3 = new JsonPhoneVerificationSubtaskInput();
                    final usw usw = (usw)rrd.b;
                    ((JsonDefaultSubtaskInput)h3).a = rrd.a.b;
                    if (usw != null) {
                        h3.b = usw.b;
                        h3.c = usw.c;
                        h3.d = usw.d;
                    }
                    jsonSubtaskInput.h = h3;
                }
                else if (b3 instanceof b1a) {
                    final JsonEmailVerificationSubtaskInput j = new JsonEmailVerificationSubtaskInput();
                    final usw usw2 = (usw)rrd.b;
                    ((JsonDefaultSubtaskInput)j).a = rrd.a.b;
                    if (usw2 != null) {
                        j.c = usw2.b;
                        j.b = usw2.c;
                    }
                    jsonSubtaskInput.i = j;
                }
                else if (b3 instanceof y7q) {
                    final JsonSignUpSubtaskInput l = new JsonSignUpSubtaskInput();
                    ((JsonDefaultSubtaskInput)l).a = rrd.a.b;
                    final vrd b4 = rrd.b;
                    if (b4 != null) {
                        final z7q z7q = (z7q)b4;
                        l.b = z7q.b;
                        l.c = z7q.d;
                        l.d = z7q.c;
                        final sa8 f2 = z7q.f;
                        if (f2 != null) {
                            final JsonDate e3 = new JsonDate();
                            e3.c = f2.a;
                            e3.b = f2.b;
                            e3.a = f2.c;
                            l.e = e3;
                        }
                        final String g2 = z7q.g;
                        final JsonSignUpSubtaskInput.JsonJsInstrumentationResult f3 = new JsonSignUpSubtaskInput.JsonJsInstrumentationResult();
                        f3.a = g2;
                        l.f = f3;
                    }
                    jsonSubtaskInput.j = l;
                }
                else if (b3 instanceof m7q) {
                    jsonSubtaskInput.k = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof w0l) {
                    final JsonPrivacyOptionsSubtaskInput m = new JsonPrivacyOptionsSubtaskInput();
                    ((JsonDefaultSubtaskInput)m).a = rrd.a.b;
                    final vrd b5 = rrd.b;
                    if (b5 != null) {
                        final int a2 = o5j.a;
                        final x0l x0l = (x0l)b5;
                        m.b = x0l.b;
                        m.c = x0l.c;
                    }
                    jsonSubtaskInput.l = m;
                }
                else if (b3 instanceof jzj) {
                    final JsonPasswordEntrySubtaskInput m2 = new JsonPasswordEntrySubtaskInput();
                    ((JsonDefaultSubtaskInput)m2).a = rrd.a.b;
                    final vrd b6 = rrd.b;
                    if (b6 != null) {
                        final int a3 = o5j.a;
                        m2.b = ((ukr)b6).b;
                    }
                    jsonSubtaskInput.m = m2;
                }
                else if (b3 instanceof ohw) {
                    jsonSubtaskInput.n = JsonUserRecommendationsSubtaskInput.t(rrd);
                }
                else if (b3 instanceof l4j) {
                    jsonSubtaskInput.o = JsonUserRecommendationsSubtaskInput.t(rrd);
                }
                else if (b3 instanceof iwd) {
                    final JsonInterestPickerSubtaskInput p = new JsonInterestPickerSubtaskInput();
                    ((JsonDefaultSubtaskInput)p).a = rrd.a.b;
                    final vrd b7 = rrd.b;
                    if (b7 != null) {
                        final int a4 = o5j.a;
                        final jwd jwd = (jwd)b7;
                        final List<bb7> c3 = jwd.c;
                        final ojf h4 = ojf.H();
                        for (final bb7 bb7 : c3) {
                            final JsonInterestPickerSubtaskInput$JsonCustomInterest jsonInterestPickerSubtaskInput$JsonCustomInterest = new JsonInterestPickerSubtaskInput$JsonCustomInterest();
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.a = bb7.a;
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.b = bb7.b;
                            jsonInterestPickerSubtaskInput$JsonCustomInterest.c = bb7.c;
                            h4.p((Object)jsonInterestPickerSubtaskInput$JsonCustomInterest);
                        }
                        p.c = (List)((z4j)h4).e();
                        p.b = jwd.b;
                    }
                    jsonSubtaskInput.p = p;
                }
                else if (b3 instanceof xwa) {
                    final JsonFetchTemporaryPasswordSubtaskInput q = new JsonFetchTemporaryPasswordSubtaskInput();
                    ((JsonDefaultSubtaskInput)q).a = rrd.a.b;
                    final vrd b8 = rrd.b;
                    if (b8 != null) {
                        final int a5 = o5j.a;
                        q.b = ((bxa)b8).b;
                    }
                    jsonSubtaskInput.q = q;
                }
                else if (b3 instanceof k7a) {
                    final JsonEnterUsernameSubtaskInput r = new JsonEnterUsernameSubtaskInput();
                    ((JsonDefaultSubtaskInput)r).a = rrd.a.b;
                    final vrd b9 = rrd.b;
                    if (b9 != null) {
                        r.b = ((l7a)b9).b;
                    }
                    jsonSubtaskInput.r = r;
                }
                else if (b3 instanceof mpp) {
                    final JsonSettingsListSubtaskInput s3 = new JsonSettingsListSubtaskInput();
                    ((JsonDefaultSubtaskInput)s3).a = rrd.a.b;
                    final vrd b10 = rrd.b;
                    if (b10 != null) {
                        final Map<String, fpp> b11 = ((wd)b10).b;
                        if (b11 != null) {
                            s3.b = JsonSettingResponseWithKey.s(b11);
                        }
                        else {
                            s3.b = null;
                        }
                    }
                    jsonSubtaskInput.s = s3;
                }
                else if (b3 instanceof k87) {
                    jsonSubtaskInput.t = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof s94) {
                    final JsonChoiceSelectionInput x = new JsonChoiceSelectionInput();
                    final vrd b12 = rrd.b;
                    if (b12 != null) {
                        final int a6 = o5j.a;
                        final o94 o2 = (o94)b12;
                        x.t(o2.b);
                        x.c = o2.c;
                        ((JsonDefaultSubtaskInput)x).a = rrd.a.b;
                    }
                    jsonSubtaskInput.x = x;
                }
                else if (b3 instanceof d7a) {
                    final JsonEnterTextSubtaskInput u = new JsonEnterTextSubtaskInput();
                    final e7a e7a = (e7a)rrd.b;
                    ((JsonDefaultSubtaskInput)u).a = rrd.a.b;
                    if (e7a != null) {
                        u.b = e7a.b;
                        u.c = e7a.c;
                    }
                    jsonSubtaskInput.u = u;
                }
                else if (b3 instanceof odp) {
                    jsonSubtaskInput.v = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof vdp) {
                    jsonSubtaskInput.w = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof x6a) {
                    final JsonEnterPhoneSubtaskInput y = new JsonEnterPhoneSubtaskInput();
                    final vrd b13 = rrd.b;
                    if (b13 != null) {
                        final int a7 = o5j.a;
                        final y6a y6a = y6a.class.cast(b13);
                        y.b = y6a.c;
                        y.c = y6a.d;
                        y.d = y6a.e;
                        final Map<String, fpp> b14 = ((wd)y6a).b;
                        if (b14 != null) {
                            y.e = JsonSettingResponseWithKey.s(b14);
                        }
                        else {
                            y.e = null;
                        }
                    }
                    ((JsonDefaultSubtaskInput)y).a = rrd.a.b;
                    jsonSubtaskInput.y = y;
                }
                else if (b3 instanceof p4w) {
                    jsonSubtaskInput.z = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof s5a) {
                    final JsonEnterEmailSubtaskInput a8 = new JsonEnterEmailSubtaskInput();
                    final vrd b15 = rrd.b;
                    if (b15 != null) {
                        final int a9 = o5j.a;
                        final t5a t5a = t5a.class.cast(b15);
                        a8.b = t5a.c;
                        a8.c = t5a.d;
                        final Map<String, fpp> b16 = ((wd)t5a).b;
                        if (b16 != null) {
                            a8.d = JsonSettingResponseWithKey.s(b16);
                        }
                        else {
                            a8.d = null;
                        }
                    }
                    ((JsonDefaultSubtaskInput)a8).a = rrd.a.b;
                    jsonSubtaskInput.A = a8;
                }
                else if (b3 instanceof dut) {
                    final JsonTopicsSelectorSubtaskInput b17 = new JsonTopicsSelectorSubtaskInput();
                    ((JsonDefaultSubtaskInput)b17).a = rrd.a.b;
                    final vrd b18 = rrd.b;
                    if (b18 != null) {
                        final int a10 = o5j.a;
                        final eut eut = eut.class.cast(b18);
                        b17.b = eut.b;
                        b17.c = eut.c;
                    }
                    jsonSubtaskInput.B = b17;
                }
                else if (b3 instanceof v6g) {
                    jsonSubtaskInput.C = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof zxi) {
                    jsonSubtaskInput.D = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof h74) {
                    jsonSubtaskInput.E = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof n1c) {
                    jsonSubtaskInput.F = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof w4w) {
                    jsonSubtaskInput.G = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof vgd) {
                    jsonSubtaskInput.H = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof qmx) {
                    final JsonWebModalSubtaskInput i2 = new JsonWebModalSubtaskInput();
                    ((JsonDefaultSubtaskInput)i2).a = rrd.a.b;
                    final vrd b19 = rrd.b;
                    final int a11 = o5j.a;
                    final nmx nmx = nmx.class.cast(b19);
                    if (nmx != null) {
                        i2.b = nmx.b;
                    }
                    jsonSubtaskInput.I = i2;
                }
                else if (b3 instanceof k6r) {
                    final JsonSsoSubtaskInput j2 = new JsonSsoSubtaskInput();
                    ((JsonDefaultSubtaskInput)j2).a = rrd.a.b;
                    final vrd b20 = rrd.b;
                    final int a12 = o5j.a;
                    final h6r h6r = h6r.class.cast(b20);
                    if (h6r != null) {
                        j2.b = h6r.b;
                        j2.c = h6r.c;
                        j2.d = h6r.d;
                        j2.e = h6r.e;
                        j2.f = h6r.f;
                    }
                    jsonSubtaskInput.J = j2;
                }
                else if (b3 instanceof n5a) {
                    final JsonEnterDateSubtaskInput k2 = new JsonEnterDateSubtaskInput();
                    ((JsonDefaultSubtaskInput)k2).a = rrd.a.b;
                    final vrd b21 = rrd.b;
                    final int a13 = o5j.a;
                    final m5a m5a = m5a.class.cast(b21);
                    if (m5a != null) {
                        final sa8 b22 = m5a.b;
                        final JsonDate b23 = new JsonDate();
                        b23.c = b22.a;
                        b23.b = b22.b;
                        b23.a = b22.c;
                        k2.b = b23;
                    }
                    jsonSubtaskInput.K = k2;
                }
                else if (b3 instanceof wce) {
                    final JsonJsInstrumentationSubtaskInput l2 = new JsonJsInstrumentationSubtaskInput();
                    ((JsonDefaultSubtaskInput)l2).a = rrd.a.b;
                    final vrd b24 = rrd.b;
                    final int a14 = o5j.a;
                    final ade ade = ade.class.cast(b24);
                    if (ade != null) {
                        l2.b = ade.b;
                    }
                    jsonSubtaskInput.L = l2;
                }
                else if (b3 instanceof dn0) {
                    jsonSubtaskInput.M = JsonDefaultSubtaskInput.s(rrd);
                }
                else if (b3 instanceof amj) {
                    final JsonGoogleOneTapSubtaskInput n2 = new JsonGoogleOneTapSubtaskInput();
                    ((JsonDefaultSubtaskInput)n2).a = rrd.a.b;
                    final vrd b25 = rrd.b;
                    final int a15 = o5j.a;
                    final c6c c6c = c6c.class.cast(b25);
                    if (c6c != null) {
                        n2.b = c6c.b;
                        n2.c = c6c.c;
                        n2.d = c6c.d;
                    }
                    jsonSubtaskInput.N = n2;
                }
                else if (b3 instanceof ybp) {
                    final JsonSecurityKeyEnrollmentSubtaskInput o3 = new JsonSecurityKeyEnrollmentSubtaskInput();
                    ((JsonDefaultSubtaskInput)o3).a = rrd.a.b;
                    final vrd b26 = rrd.b;
                    final int a16 = o5j.a;
                    final xbp xbp = xbp.class.cast(b26);
                    if (xbp != null) {
                        o3.b = xbp.b;
                    }
                    jsonSubtaskInput.O = o3;
                }
                else if (b3 instanceof osu) {
                    final JsonTweetSelectionUrtSubtaskInput p2 = new JsonTweetSelectionUrtSubtaskInput();
                    ((JsonDefaultSubtaskInput)p2).a = rrd.a.b;
                    final vrd b27 = rrd.b;
                    if (b27 != null) {
                        final int a17 = o5j.a;
                        p2.b = ((psu)b27).b;
                    }
                    jsonSubtaskInput.P = p2;
                }
                else if (b3 instanceof owa) {
                    Objects.requireNonNull(JsonFetchPersistedDataSubtaskInput.Companion);
                    e0e.f((Object)rrd, "inputAction");
                    final JsonFetchPersistedDataSubtaskInput q2 = new JsonFetchPersistedDataSubtaskInput();
                    ((JsonDefaultSubtaskInput)q2).a = rrd.a.b;
                    final vrd b28 = rrd.b;
                    if (b28 instanceof pwa) {
                        final pwa pwa = (pwa)b28;
                        final int ordinal = pwa.b.ordinal();
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                q2.c = pwa.c;
                            }
                        }
                        else {
                            q2.b = pwa.c;
                        }
                    }
                    jsonSubtaskInput.Q = q2;
                }
                h2.p((Object)jsonSubtaskInput);
            }
            jsonGetTaskRequestQuery.c = (List)((z4j)h2).e();
            bbq = this.H0.S(new lki(fds.a, jsonGetTaskRequestQuery));
        }
        return bbq;
    }
    
    public final void close() {
        j2e.a((Closeable)this.F0);
        j2e.a((Closeable)this.H0);
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
