import android.view.View$OnClickListener;
import java.util.Objects;
import com.twitter.safety.leaveconversation.LeaveConversationDialogFragmentArgs;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.safety.leaveconversation.LeaveConversationPromptViewResult;
import com.twitter.safety.leaveconversation.LeaveConversationPromptArgs;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k4f
{
    public static final b Companion;
    public final gx8 a;
    public final usa b;
    public final igd c;
    public final r0w d;
    public final bxo e;
    public final bxo f;
    public final p0w g;
    public final tn6 h;
    public final UserIdentifier i;
    public final jo6<LeaveConversationPromptArgs, LeaveConversationPromptViewResult> j;
    
    static {
        Companion = new b();
    }
    
    public k4f(final fci<?> fci, final gx8 a, final duo duo, final usa b, final igd c, final r0w d, final bxo e, final bxo f, final p0w g, final tn6 h, final UserIdentifier i) {
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)a, "dialogOpener");
        e0e.f((Object)duo, "savedStateHandler");
        e0e.f((Object)b, "promptFatigue");
        e0e.f((Object)c, "inAppMessageManager");
        e0e.f((Object)d, "unmentionUserRepository");
        e0e.f((Object)e, "ioScheduler");
        e0e.f((Object)f, "mainScheduler");
        e0e.f((Object)h, "notifier");
        e0e.f((Object)i, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        final jo6<LeaveConversationPromptArgs, LeaveConversationPromptViewResult> a2 = fci.a(LeaveConversationPromptViewResult.class);
        final e39 e2;
        e2.c(a2.a().doOnComplete((sj)new sj(e2 = new e39()) {
            public final e39 F0;
            
            public final void run() {
                this.F0.a();
            }
        }).subscribe((rk6)new f$r1((stb)new k4f$f(this))));
        this.j = a2;
        duo.a((gto<?>)new tt2(this) {
            public final k4f F0;
            
            public final void a(final Bundle bundle) {
            }
            
            public final void v(final Parcelable parcelable) {
                final Bundle bundle = (Bundle)parcelable;
                final bbq c = this.F0.a.c(new LeaveConversationDialogFragmentArgs((Long)null, (String)null, (String)null, 7, (wg8)null).getTag(), (px8)dfv.I0);
                if (c != null) {
                    final k4f f0 = this.F0;
                    final e39 e39 = new e39();
                    e39.c(c.G((rk6)new f$q1((stb)new j4f(e39, f0)), (rk6)lvb.e));
                }
            }
        });
    }
    
    public static final void a(final k4f k4f, final ox8 ox8) {
        Objects.requireNonNull(k4f);
        if (ox8 instanceof ox8$b) {
            final ox8$b ox8$b = (ox8$b)ox8;
            final Object b = ox8$b.b;
            LeaveConversationDialogFragmentArgs leaveConversationDialogFragmentArgs;
            if (b instanceof LeaveConversationDialogFragmentArgs) {
                leaveConversationDialogFragmentArgs = (LeaveConversationDialogFragmentArgs)b;
            }
            else {
                leaveConversationDialogFragmentArgs = null;
            }
            if (leaveConversationDialogFragmentArgs == null) {
                k4f.d();
            }
            else {
                final int ordinal = ((Enum)ox8$b.a).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        k4f.c("secondary_cta", leaveConversationDialogFragmentArgs);
                    }
                }
                else {
                    k4f.c("primary_cta", leaveConversationDialogFragmentArgs);
                    k4f.b(leaveConversationDialogFragmentArgs.getTweetId());
                }
            }
        }
    }
    
    public final void b(final Long n) {
        if (n != null) {
            xw0.c((sj)new ah6((Object)this, (long)n, (Object)l0w.G0, 2));
            this.d.a(n.toString()).I(this.e).y(this.f).G((rk6)new gpl((stb)new k4f$c(this, n), 24), (rk6)new rm8((stb)new k4f$d(this, n), 27));
        }
        else {
            this.d();
        }
    }
    
    public final void c(final String s, final LeaveConversationDialogFragmentArgs leaveConversationDialogFragmentArgs) {
        final sbw a = sbw.a();
        final fg4 fg4 = new fg4(this.i);
        ((o1p)fg4).T = new dda(leaveConversationDialogFragmentArgs.getScribePage(), leaveConversationDialogFragmentArgs.getScribeSection(), "alert", "leave_this_conversation_confirmation_sheet", s).toString();
        final int a2 = o5j.a;
        a.c((tlm)fg4);
    }
    
    public final void d() {
        this.c.a((dgd)new q6s(2131954589, (rfd$c)rfd$c$a.b, "", Integer.valueOf(22), (Integer)null, (View$OnClickListener)null, 112));
    }
    
    public static final class b
    {
    }
}
