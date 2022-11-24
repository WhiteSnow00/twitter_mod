import android.view.View$OnClickListener;
import java.util.Objects;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awh implements cqm$a
{
    public final cwh a;
    public final WeakReference b;
    public final boolean c;
    public final hp6 d;
    
    public awh(final cwh a, final WeakReference b, final boolean c, final hp6 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final boolean b) {
        final cwh a = this.a;
        final WeakReference b2 = this.b;
        final boolean c = this.c;
        final hp6 d = this.d;
        Objects.requireNonNull(a);
        final dob dob = (dob)b2.get();
        if (dob != null) {
            if (b) {
                final q6s$a q6s$a = new q6s$a();
                q6s$a.s(2131955235);
                q6s$a.q(42);
                q6s$a.e = (rfd$c)rfd$c$b.b;
                q6s$a.r("conversation_muted");
                if (c) {
                    q6s$a.o(2131955236, (View$OnClickListener)new wpf((Object)a, (Object)dob, (Object)d, 5));
                }
                a.b.a((q6s)((z4j)q6s$a).e());
            }
            else {
                a.b.b(2131955233);
            }
            a.c.onNext((Object)new cwh$a(d.D(), 1));
        }
    }
}
