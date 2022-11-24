// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubtask extends tih<qtr>
{
    @JsonField(name = { "end_flow" })
    public a5a$a A;
    @JsonField(name = { "enter_text" })
    public f7a.a B;
    @JsonField(name = { "select_avatar" })
    public sdp$a C;
    @JsonField(name = { "upload_media" })
    public y4w$a D;
    @JsonField(name = { "select_banner" })
    public xdp$a E;
    @JsonField(name = { "choice_selection" })
    public t94.a F;
    @JsonField(name = { "enter_phone" })
    public z6a$a G;
    @JsonField(name = { "update_users" })
    public r4w$a H;
    @JsonField(name = { "topics_selector" })
    public fut.a I;
    @JsonField(name = { "enter_email" })
    public u5a$a J;
    @JsonField(name = { "in_app_notification" })
    public xgd$a K;
    @JsonField(name = { "location_permission_prompt" })
    public w6g$a L;
    @JsonField(name = { "notifications_permission_prompt" })
    public ayi$a M;
    @JsonField(name = { "check_logged_in_account" })
    public j74$a N;
    @JsonField(name = { "generic_urt" })
    public o1c$a O;
    @JsonField(name = { "web", "web_modal" })
    public smx.a P;
    @JsonField(name = { "single_sign_on" })
    public o6r.a Q;
    @JsonField(name = { "enter_date" })
    public p5a.a R;
    @JsonField(name = { "action_list" })
    public rk$a S;
    @JsonField(name = { "js_instrumentation" })
    public zce$a T;
    @JsonField(name = { "one_tap" })
    public dmj$a U;
    @JsonField(name = { "app_locale_update" })
    public ln0.a V;
    @JsonField(name = { "open_external_link" })
    public xmj$a W;
    @JsonField(name = { "show_code" })
    public x4q$a X;
    @JsonField(name = { "security_key" })
    public jcp$a Y;
    @JsonField(name = { "tweet_selection_urt" })
    public qsu$a Z;
    @JsonField
    public String a;
    @JsonField(name = { "fetch_persisted_data" })
    public qwa$a a0;
    @JsonField(typeConverter = ytr.class)
    public int b;
    @JsonField
    public dtv c;
    @JsonField
    public List<g0p> d;
    @JsonField(name = { "cta_inline" })
    public i87$a e;
    @JsonField(name = { "contacts_live_sync_permission_prompt" })
    public d2g$a f;
    @JsonField(name = { "alert_dialog" })
    public uw$b g;
    @JsonField(name = { "alert_dialog_suppress_client_events" })
    public uw$b h;
    @JsonField(name = { "menu_dialog" })
    public g5h.a i;
    @JsonField(name = { "sign_up" })
    public a8q$a j;
    @JsonField(name = { "sign_up_review" })
    public n7q$a k;
    @JsonField(name = { "phone_verification" })
    public wck$a l;
    @JsonField(name = { "email_verification" })
    public c1a$a m;
    @JsonField(name = { "open_link" })
    public enj.a n;
    @JsonField(name = { "open_account" })
    public z17$a o;
    @JsonField(name = { "open_home_timeline" })
    public bnj$a p;
    @JsonField(name = { "privacy_options" })
    public y0l$a q;
    @JsonField(name = { "enter_password" })
    public kzj.a r;
    @JsonField(name = { "user_recommendations_list" })
    public qhw$a s;
    @JsonField(name = { "user_recommendations_urt" })
    public diw$a t;
    @JsonField(name = { "interest_picker" })
    public kwd.a u;
    @JsonField(name = { "fetch_temporary_password" })
    public cxa$a v;
    @JsonField(name = { "enter_username" })
    public m7a$a w;
    @JsonField(name = { "cta" })
    public l87.a x;
    @JsonField(name = { "settings_list" })
    public ppp$a y;
    @JsonField(name = { "wait_spinner" })
    public mix$a z;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final qtr t() {
        if (this.a == null) {
            return null;
        }
        final uw$b h = this.h;
        if (h != null) {
            h.l = true;
        }
        final bur$a bur$a = (bur$a)o5j.b((Object[])new bur$a[] { (bur$a)this.g, (bur$a)h, (bur$a)this.e, (bur$a)this.f, this.i, (bur$a)this.j, (bur$a)this.k, (bur$a)this.l, (bur$a)this.m, this.n, (bur$a)this.o, (bur$a)this.p, (bur$a)this.q, this.r, (bur$a)this.s, (bur$a)this.t, this.u, (bur$a)this.v, (bur$a)this.w, this.x, (bur$a)this.y, (bur$a)this.z, (bur$a)this.A, this.B, (bur$a)this.C, (bur$a)this.D, (bur$a)this.E, this.F, (bur$a)this.G, (bur$a)this.H, this.I, (bur$a)this.J, (bur$a)this.K, (bur$a)this.L, (bur$a)this.M, (bur$a)this.N, (bur$a)this.O, this.P, this.Q, this.R, (bur$a)this.S, (bur$a)this.T, (bur$a)this.U, this.V, (bur$a)this.W, (bur$a)this.X, (bur$a)this.Y, (bur$a)this.Z, (bur$a)this.a0 });
        if (bur$a != null) {
            bur$a.d = this.b;
            final int a = o5j.a;
            bur$a.e = this.c;
            bur$a.i = this.d;
            return ((bur)((z4j)bur$a).e()).b(this.a);
        }
        return null;
    }
}
