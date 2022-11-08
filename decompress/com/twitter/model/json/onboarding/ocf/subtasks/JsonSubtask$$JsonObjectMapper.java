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
    public static final isr SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER;
    
    static {
        SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER = new isr();
    }
    
    public static JsonSubtask _parse(final khe khe) throws IOException {
        final JsonSubtask jsonSubtask = new JsonSubtask();
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
            parseField(jsonSubtask, d, khe);
            khe.m0();
        }
        return jsonSubtask;
    }
    
    public static void _serialize(final JsonSubtask jsonSubtask, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonSubtask.S != null) {
            LoganSquare.typeConverterFor((Class)qk$a.class).serialize((Object)jsonSubtask.S, "action_list", true, tfe);
        }
        if (jsonSubtask.g != null) {
            LoganSquare.typeConverterFor((Class)tw.b.class).serialize((Object)jsonSubtask.g, "alert_dialog", true, tfe);
        }
        if (jsonSubtask.h != null) {
            LoganSquare.typeConverterFor((Class)tw.b.class).serialize((Object)jsonSubtask.h, "alert_dialog_suppress_client_events", true, tfe);
        }
        if (jsonSubtask.V != null) {
            LoganSquare.typeConverterFor((Class)qn0$a.class).serialize((Object)jsonSubtask.V, "app_locale_update", true, tfe);
        }
        final ArrayList d = jsonSubtask.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "callbacks", d);
            while (g.hasNext()) {
                final wyo wyo = g.next();
                if (wyo != null) {
                    LoganSquare.typeConverterFor((Class)wyo.class).serialize((Object)wyo, "lslocalcallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonSubtask.N != null) {
            LoganSquare.typeConverterFor((Class)b74$a.class).serialize((Object)jsonSubtask.N, "check_logged_in_account", true, tfe);
        }
        if (jsonSubtask.F != null) {
            LoganSquare.typeConverterFor((Class)l94.a.class).serialize((Object)jsonSubtask.F, "choice_selection", true, tfe);
        }
        if (jsonSubtask.f != null) {
            LoganSquare.typeConverterFor((Class)u1g.a.class).serialize((Object)jsonSubtask.f, "contacts_live_sync_permission_prompt", true, tfe);
        }
        if (jsonSubtask.x != null) {
            LoganSquare.typeConverterFor((Class)c87$a.class).serialize((Object)jsonSubtask.x, "cta", true, tfe);
        }
        if (jsonSubtask.e != null) {
            LoganSquare.typeConverterFor((Class)z77.a.class).serialize((Object)jsonSubtask.e, "cta_inline", true, tfe);
        }
        if (jsonSubtask.m != null) {
            LoganSquare.typeConverterFor((Class)p0a$a.class).serialize((Object)jsonSubtask.m, "email_verification", true, tfe);
        }
        if (jsonSubtask.A != null) {
            LoganSquare.typeConverterFor((Class)o4a$a.class).serialize((Object)jsonSubtask.A, "end_flow", true, tfe);
        }
        if (jsonSubtask.R != null) {
            LoganSquare.typeConverterFor((Class)e5a$a.class).serialize((Object)jsonSubtask.R, "enter_date", true, tfe);
        }
        if (jsonSubtask.J != null) {
            LoganSquare.typeConverterFor((Class)j5a$a.class).serialize((Object)jsonSubtask.J, "enter_email", true, tfe);
        }
        if (jsonSubtask.r != null) {
            LoganSquare.typeConverterFor((Class)qyj$a.class).serialize((Object)jsonSubtask.r, "enter_password", true, tfe);
        }
        if (jsonSubtask.G != null) {
            LoganSquare.typeConverterFor((Class)n6a$a.class).serialize((Object)jsonSubtask.G, "enter_phone", true, tfe);
        }
        if (jsonSubtask.B != null) {
            LoganSquare.typeConverterFor((Class)s6a$a.class).serialize((Object)jsonSubtask.B, "enter_text", true, tfe);
        }
        if (jsonSubtask.w != null) {
            LoganSquare.typeConverterFor((Class)z6a.a.class).serialize((Object)jsonSubtask.w, "enter_username", true, tfe);
        }
        if (jsonSubtask.a0 != null) {
            LoganSquare.typeConverterFor((Class)qwa$a.class).serialize((Object)jsonSubtask.a0, "fetch_persisted_data", true, tfe);
        }
        if (jsonSubtask.v != null) {
            LoganSquare.typeConverterFor((Class)cxa$a.class).serialize((Object)jsonSubtask.v, "fetch_temporary_password", true, tfe);
        }
        if (jsonSubtask.O != null) {
            LoganSquare.typeConverterFor((Class)l1c.a.class).serialize((Object)jsonSubtask.O, "generic_urt", true, tfe);
        }
        if (jsonSubtask.K != null) {
            LoganSquare.typeConverterFor((Class)tgd$a.class).serialize((Object)jsonSubtask.K, "in_app_notification", true, tfe);
        }
        if (jsonSubtask.u != null) {
            LoganSquare.typeConverterFor((Class)fwd$a.class).serialize((Object)jsonSubtask.u, "interest_picker", true, tfe);
        }
        if (jsonSubtask.T != null) {
            LoganSquare.typeConverterFor((Class)wce$a.class).serialize((Object)jsonSubtask.T, "js_instrumentation", true, tfe);
        }
        if (jsonSubtask.L != null) {
            LoganSquare.typeConverterFor((Class)m6g.a.class).serialize((Object)jsonSubtask.L, "location_permission_prompt", true, tfe);
        }
        if (jsonSubtask.i != null) {
            LoganSquare.typeConverterFor((Class)o4h$a.class).serialize((Object)jsonSubtask.i, "menu_dialog", true, tfe);
        }
        if (jsonSubtask.M != null) {
            LoganSquare.typeConverterFor((Class)jxi$a.class).serialize((Object)jsonSubtask.M, "notifications_permission_prompt", true, tfe);
        }
        if (jsonSubtask.t != null) {
            LoganSquare.typeConverterFor((Class)tgw$a.class).serialize((Object)jsonSubtask.t, "user_recommendations_urt", true, tfe);
        }
        if (jsonSubtask.U != null) {
            LoganSquare.typeConverterFor((Class)ilj$a.class).serialize((Object)jsonSubtask.U, "one_tap", true, tfe);
        }
        if (jsonSubtask.o != null) {
            LoganSquare.typeConverterFor((Class)o17$a.class).serialize((Object)jsonSubtask.o, "open_account", true, tfe);
        }
        if (jsonSubtask.W != null) {
            LoganSquare.typeConverterFor((Class)cmj$a.class).serialize((Object)jsonSubtask.W, "open_external_link", true, tfe);
        }
        if (jsonSubtask.p != null) {
            LoganSquare.typeConverterFor((Class)gmj$a.class).serialize((Object)jsonSubtask.p, "open_home_timeline", true, tfe);
        }
        if (jsonSubtask.n != null) {
            LoganSquare.typeConverterFor((Class)jmj$a.class).serialize((Object)jsonSubtask.n, "open_link", true, tfe);
        }
        if (jsonSubtask.l != null) {
            LoganSquare.typeConverterFor((Class)cck$a.class).serialize((Object)jsonSubtask.l, "phone_verification", true, tfe);
        }
        if (jsonSubtask.q != null) {
            LoganSquare.typeConverterFor((Class)b0l$a.class).serialize((Object)jsonSubtask.q, "privacy_options", true, tfe);
        }
        if (jsonSubtask.Y != null) {
            LoganSquare.typeConverterFor((Class)xap$a.class).serialize((Object)jsonSubtask.Y, "security_key", true, tfe);
        }
        if (jsonSubtask.C != null) {
            LoganSquare.typeConverterFor((Class)fcp$a.class).serialize((Object)jsonSubtask.C, "select_avatar", true, tfe);
        }
        if (jsonSubtask.E != null) {
            LoganSquare.typeConverterFor((Class)kcp$a.class).serialize((Object)jsonSubtask.E, "select_banner", true, tfe);
        }
        if (jsonSubtask.y != null) {
            LoganSquare.typeConverterFor((Class)cop$a.class).serialize((Object)jsonSubtask.y, "settings_list", true, tfe);
        }
        if (jsonSubtask.X != null) {
            LoganSquare.typeConverterFor((Class)j3q$a.class).serialize((Object)jsonSubtask.X, "show_code", true, tfe);
        }
        if (jsonSubtask.j != null) {
            LoganSquare.typeConverterFor((Class)m6q.a.class).serialize((Object)jsonSubtask.j, "sign_up", true, tfe);
        }
        if (jsonSubtask.k != null) {
            LoganSquare.typeConverterFor((Class)z5q.a.class).serialize((Object)jsonSubtask.k, "sign_up_review", true, tfe);
        }
        if (jsonSubtask.Q != null) {
            LoganSquare.typeConverterFor((Class)w4r$a.class).serialize((Object)jsonSubtask.Q, "single_sign_on", true, tfe);
        }
        ((StringBasedTypeConverter)JsonSubtask$$JsonObjectMapper.SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER).serialize((Object)jsonSubtask.b, "subtask_back_navigation", true, tfe);
        if (jsonSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSubtask.c, "subtask_back_navigation_link", true, tfe);
        }
        tfe.u0("subtask_id", jsonSubtask.a);
        if (jsonSubtask.I != null) {
            LoganSquare.typeConverterFor((Class)zst.a.class).serialize((Object)jsonSubtask.I, "topics_selector", true, tfe);
        }
        if (jsonSubtask.Z != null) {
            LoganSquare.typeConverterFor((Class)iru$a.class).serialize((Object)jsonSubtask.Z, "tweet_selection_urt", true, tfe);
        }
        if (jsonSubtask.H != null) {
            LoganSquare.typeConverterFor((Class)p3w$a.class).serialize((Object)jsonSubtask.H, "update_users", true, tfe);
        }
        if (jsonSubtask.D != null) {
            LoganSquare.typeConverterFor((Class)w3w$a.class).serialize((Object)jsonSubtask.D, "upload_media", true, tfe);
        }
        if (jsonSubtask.s != null) {
            LoganSquare.typeConverterFor((Class)hgw$a.class).serialize((Object)jsonSubtask.s, "user_recommendations_list", true, tfe);
        }
        if (jsonSubtask.z != null) {
            LoganSquare.typeConverterFor((Class)ahx$a.class).serialize((Object)jsonSubtask.z, "wait_spinner", true, tfe);
        }
        if (jsonSubtask.P != null) {
            LoganSquare.typeConverterFor((Class)jlx$a.class).serialize((Object)jsonSubtask.P, "web", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubtask jsonSubtask, final String s, final khe khe) throws IOException {
        if ("action_list".equals(s)) {
            jsonSubtask.S = (qk$a)LoganSquare.typeConverterFor((Class)qk$a.class).parse(khe);
        }
        else if ("alert_dialog".equals(s)) {
            jsonSubtask.g = (tw.b)LoganSquare.typeConverterFor((Class)tw.b.class).parse(khe);
        }
        else if ("alert_dialog_suppress_client_events".equals(s)) {
            jsonSubtask.h = (tw.b)LoganSquare.typeConverterFor((Class)tw.b.class).parse(khe);
        }
        else if ("app_locale_update".equals(s)) {
            jsonSubtask.V = (qn0$a)LoganSquare.typeConverterFor((Class)qn0$a.class).parse(khe);
        }
        else if ("callbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final wyo wyo = (wyo)LoganSquare.typeConverterFor((Class)wyo.class).parse(khe);
                    if (wyo != null) {
                        d.add(wyo);
                    }
                }
                jsonSubtask.d = d;
            }
            else {
                jsonSubtask.d = null;
            }
        }
        else if ("check_logged_in_account".equals(s)) {
            jsonSubtask.N = (b74$a)LoganSquare.typeConverterFor((Class)b74$a.class).parse(khe);
        }
        else if ("choice_selection".equals(s)) {
            jsonSubtask.F = (l94.a)LoganSquare.typeConverterFor((Class)l94.a.class).parse(khe);
        }
        else if ("contacts_live_sync_permission_prompt".equals(s)) {
            jsonSubtask.f = (u1g.a)LoganSquare.typeConverterFor((Class)u1g.a.class).parse(khe);
        }
        else if ("cta".equals(s)) {
            jsonSubtask.x = (c87$a)LoganSquare.typeConverterFor((Class)c87$a.class).parse(khe);
        }
        else if ("cta_inline".equals(s)) {
            jsonSubtask.e = (z77.a)LoganSquare.typeConverterFor((Class)z77.a.class).parse(khe);
        }
        else if ("email_verification".equals(s)) {
            jsonSubtask.m = (p0a$a)LoganSquare.typeConverterFor((Class)p0a$a.class).parse(khe);
        }
        else if ("end_flow".equals(s)) {
            jsonSubtask.A = (o4a$a)LoganSquare.typeConverterFor((Class)o4a$a.class).parse(khe);
        }
        else if ("enter_date".equals(s)) {
            jsonSubtask.R = (e5a$a)LoganSquare.typeConverterFor((Class)e5a$a.class).parse(khe);
        }
        else if ("enter_email".equals(s)) {
            jsonSubtask.J = (j5a$a)LoganSquare.typeConverterFor((Class)j5a$a.class).parse(khe);
        }
        else if ("enter_password".equals(s)) {
            jsonSubtask.r = (qyj$a)LoganSquare.typeConverterFor((Class)qyj$a.class).parse(khe);
        }
        else if ("enter_phone".equals(s)) {
            jsonSubtask.G = (n6a$a)LoganSquare.typeConverterFor((Class)n6a$a.class).parse(khe);
        }
        else if ("enter_text".equals(s)) {
            jsonSubtask.B = (s6a$a)LoganSquare.typeConverterFor((Class)s6a$a.class).parse(khe);
        }
        else if ("enter_username".equals(s)) {
            jsonSubtask.w = (z6a.a)LoganSquare.typeConverterFor((Class)z6a.a.class).parse(khe);
        }
        else if ("fetch_persisted_data".equals(s)) {
            jsonSubtask.a0 = (qwa$a)LoganSquare.typeConverterFor((Class)qwa$a.class).parse(khe);
        }
        else if ("fetch_temporary_password".equals(s)) {
            jsonSubtask.v = (cxa$a)LoganSquare.typeConverterFor((Class)cxa$a.class).parse(khe);
        }
        else if ("generic_urt".equals(s)) {
            jsonSubtask.O = (l1c.a)LoganSquare.typeConverterFor((Class)l1c.a.class).parse(khe);
        }
        else if ("in_app_notification".equals(s)) {
            jsonSubtask.K = (tgd$a)LoganSquare.typeConverterFor((Class)tgd$a.class).parse(khe);
        }
        else if ("interest_picker".equals(s)) {
            jsonSubtask.u = (fwd$a)LoganSquare.typeConverterFor((Class)fwd$a.class).parse(khe);
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSubtask.T = (wce$a)LoganSquare.typeConverterFor((Class)wce$a.class).parse(khe);
        }
        else if ("location_permission_prompt".equals(s)) {
            jsonSubtask.L = (m6g.a)LoganSquare.typeConverterFor((Class)m6g.a.class).parse(khe);
        }
        else if ("menu_dialog".equals(s)) {
            jsonSubtask.i = (o4h$a)LoganSquare.typeConverterFor((Class)o4h$a.class).parse(khe);
        }
        else if ("notifications_permission_prompt".equals(s)) {
            jsonSubtask.M = (jxi$a)LoganSquare.typeConverterFor((Class)jxi$a.class).parse(khe);
        }
        else if ("user_recommendations_urt".equals(s)) {
            jsonSubtask.t = (tgw$a)LoganSquare.typeConverterFor((Class)tgw$a.class).parse(khe);
        }
        else if ("one_tap".equals(s)) {
            jsonSubtask.U = (ilj$a)LoganSquare.typeConverterFor((Class)ilj$a.class).parse(khe);
        }
        else if ("open_account".equals(s)) {
            jsonSubtask.o = (o17$a)LoganSquare.typeConverterFor((Class)o17$a.class).parse(khe);
        }
        else if ("open_external_link".equals(s)) {
            jsonSubtask.W = (cmj$a)LoganSquare.typeConverterFor((Class)cmj$a.class).parse(khe);
        }
        else if ("open_home_timeline".equals(s)) {
            jsonSubtask.p = (gmj$a)LoganSquare.typeConverterFor((Class)gmj$a.class).parse(khe);
        }
        else if ("open_link".equals(s)) {
            jsonSubtask.n = (jmj$a)LoganSquare.typeConverterFor((Class)jmj$a.class).parse(khe);
        }
        else if ("phone_verification".equals(s)) {
            jsonSubtask.l = (cck$a)LoganSquare.typeConverterFor((Class)cck$a.class).parse(khe);
        }
        else if ("privacy_options".equals(s)) {
            jsonSubtask.q = (b0l$a)LoganSquare.typeConverterFor((Class)b0l$a.class).parse(khe);
        }
        else if ("security_key".equals(s)) {
            jsonSubtask.Y = (xap$a)LoganSquare.typeConverterFor((Class)xap$a.class).parse(khe);
        }
        else if ("select_avatar".equals(s)) {
            jsonSubtask.C = (fcp$a)LoganSquare.typeConverterFor((Class)fcp$a.class).parse(khe);
        }
        else if ("select_banner".equals(s)) {
            jsonSubtask.E = (kcp$a)LoganSquare.typeConverterFor((Class)kcp$a.class).parse(khe);
        }
        else if ("settings_list".equals(s)) {
            jsonSubtask.y = (cop$a)LoganSquare.typeConverterFor((Class)cop$a.class).parse(khe);
        }
        else if ("show_code".equals(s)) {
            jsonSubtask.X = (j3q$a)LoganSquare.typeConverterFor((Class)j3q$a.class).parse(khe);
        }
        else if ("sign_up".equals(s)) {
            jsonSubtask.j = (m6q.a)LoganSquare.typeConverterFor((Class)m6q.a.class).parse(khe);
        }
        else if ("sign_up_review".equals(s)) {
            jsonSubtask.k = (z5q.a)LoganSquare.typeConverterFor((Class)z5q.a.class).parse(khe);
        }
        else if ("single_sign_on".equals(s)) {
            jsonSubtask.Q = (w4r$a)LoganSquare.typeConverterFor((Class)w4r$a.class).parse(khe);
        }
        else if ("subtask_back_navigation".equals(s)) {
            jsonSubtask.b = (int)((StringBasedTypeConverter)JsonSubtask$$JsonObjectMapper.SUBTASK_NAVIGATION_SHOW_TYPE_CONVERTER).parse(khe);
        }
        else if ("subtask_back_navigation_link".equals(s)) {
            jsonSubtask.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtask.a = khe.T((String)null);
        }
        else if ("topics_selector".equals(s)) {
            jsonSubtask.I = (zst.a)LoganSquare.typeConverterFor((Class)zst.a.class).parse(khe);
        }
        else if ("tweet_selection_urt".equals(s)) {
            jsonSubtask.Z = (iru$a)LoganSquare.typeConverterFor((Class)iru$a.class).parse(khe);
        }
        else if ("update_users".equals(s)) {
            jsonSubtask.H = (p3w$a)LoganSquare.typeConverterFor((Class)p3w$a.class).parse(khe);
        }
        else if ("upload_media".equals(s)) {
            jsonSubtask.D = (w3w$a)LoganSquare.typeConverterFor((Class)w3w$a.class).parse(khe);
        }
        else if ("user_recommendations_list".equals(s)) {
            jsonSubtask.s = (hgw$a)LoganSquare.typeConverterFor((Class)hgw$a.class).parse(khe);
        }
        else if ("wait_spinner".equals(s)) {
            jsonSubtask.z = (ahx$a)LoganSquare.typeConverterFor((Class)ahx$a.class).parse(khe);
        }
        else if ("web".equals(s) || "web_modal".equals(s)) {
            jsonSubtask.P = (jlx$a)LoganSquare.typeConverterFor((Class)jlx$a.class).parse(khe);
        }
    }
    
    public JsonSubtask parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubtask jsonSubtask, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubtask, tfe, b);
    }
}
