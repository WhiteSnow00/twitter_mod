import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.ui.user.VideoAttributionUserView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.commerce.json.shops.JsonShopIdInput;
import com.twitter.ml.models.json.di.app.signals.JsonScreenUnlockedSignal;
import java.util.Objects;
import com.twitter.notifications.openback.json.JsonOpenbackMessage;
import com.twitter.professional.json.business.JsonBusinessContactPhoneInput;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFlowContext;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhd implements ypa
{
    public static final bhd b;
    public static final bhd c;
    public static final bhd d;
    public static final bhd e;
    public static final bhd f;
    public static final bhd g;
    public static final bhd h;
    public static final bhd i;
    public static final bhd j;
    public static final bhd k;
    public static final bhd l;
    public static final bhd m;
    public static final bhd n;
    public final int a;
    
    static {
        b = new bhd(0);
        c = new bhd(1);
        d = new bhd(2);
        e = new bhd(3);
        f = new bhd(4);
        g = new bhd(5);
        h = new bhd(6);
        i = new bhd(7);
        j = new bhd(8);
        k = new bhd(9);
        l = new bhd(10);
        m = new bhd(11);
        n = new bhd(12);
    }
    
    public bhd(final int a) {
        this.a = a;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                return new vpc((View)o);
            }
            case 11: {
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                return new af4();
            }
            case 10: {
                return new af4((UserIdentifier)o);
            }
            case 9: {
                return JsonFlowContext.t((f7b)o);
            }
            case 8: {
                final qu2 qu2 = (qu2)o;
                final JsonBusinessContactPhoneInput jsonBusinessContactPhoneInput = new JsonBusinessContactPhoneInput();
                jsonBusinessContactPhoneInput.b = qu2.b;
                final CountryIso c = qu2.c;
                if (c == null) {
                    jsonBusinessContactPhoneInput.a = qu2.a;
                }
                else {
                    jsonBusinessContactPhoneInput.c = c.getIsoString();
                }
                return jsonBusinessContactPhoneInput;
            }
            case 7: {
                final enj enj = (enj)o;
                Objects.requireNonNull(JsonOpenbackMessage.Companion);
                czd.f((Object)enj, "message");
                final JsonOpenbackMessage jsonOpenbackMessage = new JsonOpenbackMessage();
                final String a = enj.a;
                czd.f((Object)a, "<set-?>");
                jsonOpenbackMessage.a = a;
                jsonOpenbackMessage.b = enj.b;
                jsonOpenbackMessage.c = enj.c;
                final inj d = enj.d;
                czd.f((Object)d, "<set-?>");
                jsonOpenbackMessage.d = d;
                final bnj e = enj.e;
                czd.f((Object)e, "<set-?>");
                jsonOpenbackMessage.e = e;
                final dnj f = enj.f;
                czd.f((Object)f, "<set-?>");
                jsonOpenbackMessage.f = f;
                return jsonOpenbackMessage;
            }
            case 6: {
                final bh4$g bh4$g = (bh4$g)o;
                Objects.requireNonNull(JsonScreenUnlockedSignal.Companion);
                czd.f((Object)bh4$g, "screenUnlockedSignal");
                final JsonScreenUnlockedSignal jsonScreenUnlockedSignal = new JsonScreenUnlockedSignal();
                jsonScreenUnlockedSignal.a = bh4$g.a;
                return jsonScreenUnlockedSignal;
            }
            case 5: {
                final q0q q0q = (q0q)o;
                Objects.requireNonNull(JsonShopIdInput.Companion);
                czd.f((Object)q0q, "shopIdInput");
                final JsonShopIdInput jsonShopIdInput = new JsonShopIdInput();
                final String a2 = q0q.a;
                czd.f((Object)a2, "<set-?>");
                jsonShopIdInput.a = a2;
                final String b = q0q.b;
                czd.f((Object)b, "<set-?>");
                jsonShopIdInput.b = b;
                return jsonShopIdInput;
            }
            case 4: {
                final vtu vtu = (vtu)o;
                return ovb.D0;
            }
            case 3: {
                final Context context = (Context)o;
                czd.f((Object)context, "context");
                final View inflate = LayoutInflater.from(context).inflate(2131624124, (ViewGroup)null, false);
                czd.d((Object)inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return inflate;
            }
            case 2: {
                return new kxw.g((VideoAttributionUserView)((View)o).findViewById(2131431473));
            }
            case 1: {
                return g63.e0("ChromeType.FULLSCREEN_VIDEO_WITH_CAPTIONS_AND_LOADER#provideClosedCaptionsWithLoaderView", (nsb)new t1x((Object)o, 0));
            }
            case 0: {
                return new suo((View)o);
            }
        }
    }
}
