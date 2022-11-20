// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtask$$JsonObjectMapper extends JsonMapper<JsonSubtask>
{
    public static final atr SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER;
    
    static {
        SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER = new atr();
    }
    
    public static JsonSubtask _parse(final tge tge) throws IOException {
        final JsonSubtask jsonSubtask = new JsonSubtask();
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
            parseField(jsonSubtask, d, tge);
            tge.l0();
        }
        return jsonSubtask;
    }
    
    public static void _serialize(final JsonSubtask jsonSubtask, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSubtask.S != null) {
            LoganSquare.typeConverterFor((Class)nk$a.class).serialize((Object)jsonSubtask.S, "action_list", true, afe);
        }
        if (jsonSubtask.g != null) {
            LoganSquare.typeConverterFor((Class)uw$b.class).serialize((Object)jsonSubtask.g, "alert_dialog", true, afe);
        }
        if (jsonSubtask.h != null) {
            LoganSquare.typeConverterFor((Class)uw$b.class).serialize((Object)jsonSubtask.h, "alert_dialog_suppress_client_events", true, afe);
        }
        if (jsonSubtask.V != null) {
            LoganSquare.typeConverterFor((Class)ln0$a.class).serialize((Object)jsonSubtask.V, "app_locale_update", true, afe);
        }
        final ArrayList d = jsonSubtask.d;
        if (d != null) {
            final Iterator a = br.A(afe, "callbacks", d);
            while (a.hasNext()) {
                final mzo mzo = a.next();
                if (mzo != null) {
                    LoganSquare.typeConverterFor((Class)mzo.class).serialize((Object)mzo, "lslocalcallbacksElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonSubtask.N != null) {
            LoganSquare.typeConverterFor((Class)e64$a.class).serialize((Object)jsonSubtask.N, "check_logged_in_account", true, afe);
        }
        if (jsonSubtask.F != null) {
            LoganSquare.typeConverterFor((Class)o84$a.class).serialize((Object)jsonSubtask.F, "choice_selection", true, afe);
        }
        if (jsonSubtask.f != null) {
            LoganSquare.typeConverterFor((Class)f1g$a.class).serialize((Object)jsonSubtask.f, "contacts_live_sync_permission_prompt", true, afe);
        }
        if (jsonSubtask.x != null) {
            LoganSquare.typeConverterFor((Class)g77.a.class).serialize((Object)jsonSubtask.x, "cta", true, afe);
        }
        if (jsonSubtask.e != null) {
            LoganSquare.typeConverterFor((Class)d77$a.class).serialize((Object)jsonSubtask.e, "cta_inline", true, afe);
        }
        if (jsonSubtask.m != null) {
            LoganSquare.typeConverterFor((Class)a0a.a.class).serialize((Object)jsonSubtask.m, "email_verification", true, afe);
        }
        if (jsonSubtask.A != null) {
            LoganSquare.typeConverterFor((Class)y3a$a.class).serialize((Object)jsonSubtask.A, "end_flow", true, afe);
        }
        if (jsonSubtask.R != null) {
            LoganSquare.typeConverterFor((Class)n4a$a.class).serialize((Object)jsonSubtask.R, "enter_date", true, afe);
        }
        if (jsonSubtask.J != null) {
            LoganSquare.typeConverterFor((Class)s4a$a.class).serialize((Object)jsonSubtask.J, "enter_email", true, afe);
        }
        if (jsonSubtask.r != null) {
            LoganSquare.typeConverterFor((Class)uyj$a.class).serialize((Object)jsonSubtask.r, "enter_password", true, afe);
        }
        if (jsonSubtask.G != null) {
            LoganSquare.typeConverterFor((Class)v5a$a.class).serialize((Object)jsonSubtask.G, "enter_phone", true, afe);
        }
        if (jsonSubtask.B != null) {
            LoganSquare.typeConverterFor((Class)b6a$a.class).serialize((Object)jsonSubtask.B, "enter_text", true, afe);
        }
        if (jsonSubtask.w != null) {
            LoganSquare.typeConverterFor((Class)i6a.a.class).serialize((Object)jsonSubtask.w, "enter_username", true, afe);
        }
        if (jsonSubtask.a0 != null) {
            LoganSquare.typeConverterFor((Class)mva$a.class).serialize((Object)jsonSubtask.a0, "fetch_persisted_data", true, afe);
        }
        if (jsonSubtask.v != null) {
            LoganSquare.typeConverterFor((Class)yva$a.class).serialize((Object)jsonSubtask.v, "fetch_temporary_password", true, afe);
        }
        if (jsonSubtask.O != null) {
            LoganSquare.typeConverterFor((Class)o0c$a.class).serialize((Object)jsonSubtask.O, "generic_urt", true, afe);
        }
        if (jsonSubtask.K != null) {
            LoganSquare.typeConverterFor((Class)xfd$a.class).serialize((Object)jsonSubtask.K, "in_app_notification", true, afe);
        }
        if (jsonSubtask.u != null) {
            LoganSquare.typeConverterFor((Class)ivd$a.class).serialize((Object)jsonSubtask.u, "interest_picker", true, afe);
        }
        if (jsonSubtask.T != null) {
            LoganSquare.typeConverterFor((Class)bce$a.class).serialize((Object)jsonSubtask.T, "js_instrumentation", true, afe);
        }
        if (jsonSubtask.L != null) {
            LoganSquare.typeConverterFor((Class)b6g$a.class).serialize((Object)jsonSubtask.L, "location_permission_prompt", true, afe);
        }
        if (jsonSubtask.i != null) {
            LoganSquare.typeConverterFor((Class)p4h.a.class).serialize((Object)jsonSubtask.i, "menu_dialog", true, afe);
        }
        if (jsonSubtask.M != null) {
            LoganSquare.typeConverterFor((Class)mxi$a.class).serialize((Object)jsonSubtask.M, "notifications_permission_prompt", true, afe);
        }
        if (jsonSubtask.t != null) {
            LoganSquare.typeConverterFor((Class)nhw$a.class).serialize((Object)jsonSubtask.t, "user_recommendations_urt", true, afe);
        }
        if (jsonSubtask.U != null) {
            LoganSquare.typeConverterFor((Class)nlj$a.class).serialize((Object)jsonSubtask.U, "one_tap", true, afe);
        }
        if (jsonSubtask.o != null) {
            LoganSquare.typeConverterFor((Class)t07$a.class).serialize((Object)jsonSubtask.o, "open_account", true, afe);
        }
        if (jsonSubtask.W != null) {
            LoganSquare.typeConverterFor((Class)hmj.a.class).serialize((Object)jsonSubtask.W, "open_external_link", true, afe);
        }
        if (jsonSubtask.p != null) {
            LoganSquare.typeConverterFor((Class)lmj$a.class).serialize((Object)jsonSubtask.p, "open_home_timeline", true, afe);
        }
        if (jsonSubtask.n != null) {
            LoganSquare.typeConverterFor((Class)omj$a.class).serialize((Object)jsonSubtask.n, "open_link", true, afe);
        }
        if (jsonSubtask.l != null) {
            LoganSquare.typeConverterFor((Class)hck$a.class).serialize((Object)jsonSubtask.l, "phone_verification", true, afe);
        }
        if (jsonSubtask.q != null) {
            LoganSquare.typeConverterFor((Class)k0l$a.class).serialize((Object)jsonSubtask.q, "privacy_options", true, afe);
        }
        if (jsonSubtask.Y != null) {
            LoganSquare.typeConverterFor((Class)obp$a.class).serialize((Object)jsonSubtask.Y, "security_key", true, afe);
        }
        if (jsonSubtask.C != null) {
            LoganSquare.typeConverterFor((Class)wcp$a.class).serialize((Object)jsonSubtask.C, "select_avatar", true, afe);
        }
        if (jsonSubtask.E != null) {
            LoganSquare.typeConverterFor((Class)bdp$a.class).serialize((Object)jsonSubtask.E, "select_banner", true, afe);
        }
        if (jsonSubtask.y != null) {
            LoganSquare.typeConverterFor((Class)sop$a.class).serialize((Object)jsonSubtask.y, "settings_list", true, afe);
        }
        if (jsonSubtask.X != null) {
            LoganSquare.typeConverterFor((Class)a4q$a.class).serialize((Object)jsonSubtask.X, "show_code", true, afe);
        }
        if (jsonSubtask.j != null) {
            LoganSquare.typeConverterFor((Class)e7q$a.class).serialize((Object)jsonSubtask.j, "sign_up", true, afe);
        }
        if (jsonSubtask.k != null) {
            LoganSquare.typeConverterFor((Class)r6q$a.class).serialize((Object)jsonSubtask.k, "sign_up_review", true, afe);
        }
        if (jsonSubtask.Q != null) {
            LoganSquare.typeConverterFor((Class)p5r.a.class).serialize((Object)jsonSubtask.Q, "single_sign_on", true, afe);
        }
        ((StringBasedTypeConverter)JsonSubtask$$JsonObjectMapper.SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER).serialize((Object)jsonSubtask.b, "subtask_back_navigation", true, afe);
        if (jsonSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSubtask.c, "subtask_back_navigation_link", true, afe);
        }
        afe.t0("subtask_id", jsonSubtask.a);
        if (jsonSubtask.I != null) {
            LoganSquare.typeConverterFor((Class)ptt.a.class).serialize((Object)jsonSubtask.I, "topics_selector", true, afe);
        }
        if (jsonSubtask.Z != null) {
            LoganSquare.typeConverterFor((Class)dsu.a.class).serialize((Object)jsonSubtask.Z, "tweet_selection_urt", true, afe);
        }
        if (jsonSubtask.H != null) {
            LoganSquare.typeConverterFor((Class)c4w$a.class).serialize((Object)jsonSubtask.H, "update_users", true, afe);
        }
        if (jsonSubtask.D != null) {
            LoganSquare.typeConverterFor((Class)j4w$a.class).serialize((Object)jsonSubtask.D, "upload_media", true, afe);
        }
        if (jsonSubtask.s != null) {
            LoganSquare.typeConverterFor((Class)ahw$a.class).serialize((Object)jsonSubtask.s, "user_recommendations_list", true, afe);
        }
        if (jsonSubtask.z != null) {
            LoganSquare.typeConverterFor((Class)whx$a.class).serialize((Object)jsonSubtask.z, "wait_spinner", true, afe);
        }
        if (jsonSubtask.P != null) {
            LoganSquare.typeConverterFor((Class)cmx$a.class).serialize((Object)jsonSubtask.P, "web", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSubtask jsonSubtask, final String s, final tge tge) throws IOException {
        if ("action_list".equals(s)) {
            jsonSubtask.S = (nk$a)LoganSquare.typeConverterFor((Class)nk$a.class).parse(tge);
        }
        else if ("alert_dialog".equals(s)) {
            jsonSubtask.g = (uw$b)LoganSquare.typeConverterFor((Class)uw$b.class).parse(tge);
        }
        else if ("alert_dialog_suppress_client_events".equals(s)) {
            jsonSubtask.h = (uw$b)LoganSquare.typeConverterFor((Class)uw$b.class).parse(tge);
        }
        else if ("app_locale_update".equals(s)) {
            jsonSubtask.V = (ln0$a)LoganSquare.typeConverterFor((Class)ln0$a.class).parse(tge);
        }
        else if ("callbacks".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final mzo mzo = (mzo)LoganSquare.typeConverterFor((Class)mzo.class).parse(tge);
                    if (mzo != null) {
                        d.add(mzo);
                    }
                }
                jsonSubtask.d = d;
            }
            else {
                jsonSubtask.d = null;
            }
        }
        else if ("check_logged_in_account".equals(s)) {
            jsonSubtask.N = (e64$a)LoganSquare.typeConverterFor((Class)e64$a.class).parse(tge);
        }
        else if ("choice_selection".equals(s)) {
            jsonSubtask.F = (o84$a)LoganSquare.typeConverterFor((Class)o84$a.class).parse(tge);
        }
        else if ("contacts_live_sync_permission_prompt".equals(s)) {
            jsonSubtask.f = (f1g$a)LoganSquare.typeConverterFor((Class)f1g$a.class).parse(tge);
        }
        else if ("cta".equals(s)) {
            jsonSubtask.x = (g77.a)LoganSquare.typeConverterFor((Class)g77.a.class).parse(tge);
        }
        else if ("cta_inline".equals(s)) {
            jsonSubtask.e = (d77$a)LoganSquare.typeConverterFor((Class)d77$a.class).parse(tge);
        }
        else if ("email_verification".equals(s)) {
            jsonSubtask.m = (a0a.a)LoganSquare.typeConverterFor((Class)a0a.a.class).parse(tge);
        }
        else if ("end_flow".equals(s)) {
            jsonSubtask.A = (y3a$a)LoganSquare.typeConverterFor((Class)y3a$a.class).parse(tge);
        }
        else if ("enter_date".equals(s)) {
            jsonSubtask.R = (n4a$a)LoganSquare.typeConverterFor((Class)n4a$a.class).parse(tge);
        }
        else if ("enter_email".equals(s)) {
            jsonSubtask.J = (s4a$a)LoganSquare.typeConverterFor((Class)s4a$a.class).parse(tge);
        }
        else if ("enter_password".equals(s)) {
            jsonSubtask.r = (uyj$a)LoganSquare.typeConverterFor((Class)uyj$a.class).parse(tge);
        }
        else if ("enter_phone".equals(s)) {
            jsonSubtask.G = (v5a$a)LoganSquare.typeConverterFor((Class)v5a$a.class).parse(tge);
        }
        else if ("enter_text".equals(s)) {
            jsonSubtask.B = (b6a$a)LoganSquare.typeConverterFor((Class)b6a$a.class).parse(tge);
        }
        else if ("enter_username".equals(s)) {
            jsonSubtask.w = (i6a.a)LoganSquare.typeConverterFor((Class)i6a.a.class).parse(tge);
        }
        else if ("fetch_persisted_data".equals(s)) {
            jsonSubtask.a0 = (mva$a)LoganSquare.typeConverterFor((Class)mva$a.class).parse(tge);
        }
        else if ("fetch_temporary_password".equals(s)) {
            jsonSubtask.v = (yva$a)LoganSquare.typeConverterFor((Class)yva$a.class).parse(tge);
        }
        else if ("generic_urt".equals(s)) {
            jsonSubtask.O = (o0c$a)LoganSquare.typeConverterFor((Class)o0c$a.class).parse(tge);
        }
        else if ("in_app_notification".equals(s)) {
            jsonSubtask.K = (xfd$a)LoganSquare.typeConverterFor((Class)xfd$a.class).parse(tge);
        }
        else if ("interest_picker".equals(s)) {
            jsonSubtask.u = (ivd$a)LoganSquare.typeConverterFor((Class)ivd$a.class).parse(tge);
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSubtask.T = (bce$a)LoganSquare.typeConverterFor((Class)bce$a.class).parse(tge);
        }
        else if ("location_permission_prompt".equals(s)) {
            jsonSubtask.L = (b6g$a)LoganSquare.typeConverterFor((Class)b6g$a.class).parse(tge);
        }
        else if ("menu_dialog".equals(s)) {
            jsonSubtask.i = (p4h.a)LoganSquare.typeConverterFor((Class)p4h.a.class).parse(tge);
        }
        else if ("notifications_permission_prompt".equals(s)) {
            jsonSubtask.M = (mxi$a)LoganSquare.typeConverterFor((Class)mxi$a.class).parse(tge);
        }
        else if ("user_recommendations_urt".equals(s)) {
            jsonSubtask.t = (nhw$a)LoganSquare.typeConverterFor((Class)nhw$a.class).parse(tge);
        }
        else if ("one_tap".equals(s)) {
            jsonSubtask.U = (nlj$a)LoganSquare.typeConverterFor((Class)nlj$a.class).parse(tge);
        }
        else if ("open_account".equals(s)) {
            jsonSubtask.o = (t07$a)LoganSquare.typeConverterFor((Class)t07$a.class).parse(tge);
        }
        else if ("open_external_link".equals(s)) {
            jsonSubtask.W = (hmj.a)LoganSquare.typeConverterFor((Class)hmj.a.class).parse(tge);
        }
        else if ("open_home_timeline".equals(s)) {
            jsonSubtask.p = (lmj$a)LoganSquare.typeConverterFor((Class)lmj$a.class).parse(tge);
        }
        else if ("open_link".equals(s)) {
            jsonSubtask.n = (omj$a)LoganSquare.typeConverterFor((Class)omj$a.class).parse(tge);
        }
        else if ("phone_verification".equals(s)) {
            jsonSubtask.l = (hck$a)LoganSquare.typeConverterFor((Class)hck$a.class).parse(tge);
        }
        else if ("privacy_options".equals(s)) {
            jsonSubtask.q = (k0l$a)LoganSquare.typeConverterFor((Class)k0l$a.class).parse(tge);
        }
        else if ("security_key".equals(s)) {
            jsonSubtask.Y = (obp$a)LoganSquare.typeConverterFor((Class)obp$a.class).parse(tge);
        }
        else if ("select_avatar".equals(s)) {
            jsonSubtask.C = (wcp$a)LoganSquare.typeConverterFor((Class)wcp$a.class).parse(tge);
        }
        else if ("select_banner".equals(s)) {
            jsonSubtask.E = (bdp$a)LoganSquare.typeConverterFor((Class)bdp$a.class).parse(tge);
        }
        else if ("settings_list".equals(s)) {
            jsonSubtask.y = (sop$a)LoganSquare.typeConverterFor((Class)sop$a.class).parse(tge);
        }
        else if ("show_code".equals(s)) {
            jsonSubtask.X = (a4q$a)LoganSquare.typeConverterFor((Class)a4q$a.class).parse(tge);
        }
        else if ("sign_up".equals(s)) {
            jsonSubtask.j = (e7q$a)LoganSquare.typeConverterFor((Class)e7q$a.class).parse(tge);
        }
        else if ("sign_up_review".equals(s)) {
            jsonSubtask.k = (r6q$a)LoganSquare.typeConverterFor((Class)r6q$a.class).parse(tge);
        }
        else if ("single_sign_on".equals(s)) {
            jsonSubtask.Q = (p5r.a)LoganSquare.typeConverterFor((Class)p5r.a.class).parse(tge);
        }
        else if ("subtask_back_navigation".equals(s)) {
            jsonSubtask.b = (int)((StringBasedTypeConverter)JsonSubtask$$JsonObjectMapper.SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER).parse(tge);
        }
        else if ("subtask_back_navigation_link".equals(s)) {
            jsonSubtask.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtask.a = tge.T((String)null);
        }
        else if ("topics_selector".equals(s)) {
            jsonSubtask.I = (ptt.a)LoganSquare.typeConverterFor((Class)ptt.a.class).parse(tge);
        }
        else if ("tweet_selection_urt".equals(s)) {
            jsonSubtask.Z = (dsu.a)LoganSquare.typeConverterFor((Class)dsu.a.class).parse(tge);
        }
        else if ("update_users".equals(s)) {
            jsonSubtask.H = (c4w$a)LoganSquare.typeConverterFor((Class)c4w$a.class).parse(tge);
        }
        else if ("upload_media".equals(s)) {
            jsonSubtask.D = (j4w$a)LoganSquare.typeConverterFor((Class)j4w$a.class).parse(tge);
        }
        else if ("user_recommendations_list".equals(s)) {
            jsonSubtask.s = (ahw$a)LoganSquare.typeConverterFor((Class)ahw$a.class).parse(tge);
        }
        else if ("wait_spinner".equals(s)) {
            jsonSubtask.z = (whx$a)LoganSquare.typeConverterFor((Class)whx$a.class).parse(tge);
        }
        else if ("web".equals(s) || "web_modal".equals(s)) {
            jsonSubtask.P = (cmx$a)LoganSquare.typeConverterFor((Class)cmx$a.class).parse(tge);
        }
    }
    
    public JsonSubtask parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSubtask jsonSubtask, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSubtask, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSubtask)o, afe, b);
    }
}
