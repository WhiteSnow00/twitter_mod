import android.view.View$OnClickListener;
import com.twitter.safety.leaveconversation.LeaveConversationDialogFragmentArgs;
import java.util.Objects;
import com.twitter.safety.leaveconversation.LeaveConversationPromptViewResult;
import com.twitter.safety.leaveconversation.LeaveConversationPromptArgs;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d4f
{
    public static final b Companion;
    public final qw8 a;
    public final psa b;
    public final egd c;
    public final kzv d;
    public final qvo e;
    public final qvo f;
    public final izv g;
    public final hn6 h;
    public final UserIdentifier i;
    public final xn6<LeaveConversationPromptArgs, LeaveConversationPromptViewResult> j;
    
    static {
        Companion = new b();
    }
    
    public d4f(final mbi<?> mbi, final qw8 a, final sso sso, final psa b, final egd c, final kzv d, final qvo e, final qvo f, final izv g, final hn6 h, final UserIdentifier i) {
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)a, "dialogOpener");
        zzd.f((Object)sso, "savedStateHandler");
        zzd.f((Object)b, "promptFatigue");
        zzd.f((Object)c, "inAppMessageManager");
        zzd.f((Object)d, "unmentionUserRepository");
        zzd.f((Object)e, "ioScheduler");
        zzd.f((Object)f, "mainScheduler");
        zzd.f((Object)h, "notifier");
        zzd.f((Object)i, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        final xn6<LeaveConversationPromptArgs, LeaveConversationPromptViewResult> a2 = mbi.a(LeaveConversationPromptViewResult.class);
        final m29 m29;
        m29.c(a2.a().doOnComplete((rj)new rj() {
            public final /* synthetic */ m29 C0 = m29 = new m29();
            
            public final void run() {
                this.C0.a();
            }
        }).subscribe((fk6)new f$r1((rtb)new d4f$f(this))));
        this.j = a2;
        sso.a((vro)new d4f$a(this));
    }
    
    public static final void a(final d4f d4f, final yw8 yw8) {
        Objects.requireNonNull(d4f);
        if (yw8 instanceof yw8$b) {
            final yw8$b yw8$b = (yw8$b)yw8;
            final Object b = yw8$b.b;
            LeaveConversationDialogFragmentArgs leaveConversationDialogFragmentArgs;
            if (b instanceof LeaveConversationDialogFragmentArgs) {
                leaveConversationDialogFragmentArgs = (LeaveConversationDialogFragmentArgs)b;
            }
            else {
                leaveConversationDialogFragmentArgs = null;
            }
            if (leaveConversationDialogFragmentArgs == null) {
                d4f.d();
            }
            else {
                final int ordinal = ((Enum)yw8$b.a).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        d4f.c("secondary_cta", leaveConversationDialogFragmentArgs);
                    }
                }
                else {
                    d4f.c("primary_cta", leaveConversationDialogFragmentArgs);
                    d4f.b(leaveConversationDialogFragmentArgs.getTweetId());
                }
            }
        }
    }
    
    public final void b(final Long n) {
        if (n != null) {
            xw0.c((rj)new b4f(this, (long)n, ezv.D0));
            this.d.a(n.toString()).I(this.e).y(this.f).G((fk6)new zgw((rtb)new d4f$c(this, n), 20), (fk6)new hlx((rtb)new d4f$d(this, n), 22));
        }
        else {
            this.d();
        }
    }
    
    public final void c(final String s, final LeaveConversationDialogFragmentArgs leaveConversationDialogFragmentArgs) {
        final saw a = saw.a();
        final zf4 zf4 = new zf4(this.i);
        zf4.T = new nca(leaveConversationDialogFragmentArgs.getScribePage(), leaveConversationDialogFragmentArgs.getScribeSection(), "alert", "leave_this_conversation_confirmation_sheet", s).toString();
        final int a2 = w4j.a;
        a.c((okm)zf4);
    }
    
    public final void d() {
        this.c.a((zfd)new d5s(2131954589, (nfd$c)nfd$c$a.b, "", Integer.valueOf(22), (Integer)null, (View$OnClickListener)null, 112));
    }
    
    public static final class b
    {
    }
}
