import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibl extends zm1
{
    public final WeakReference<Context> b;
    public final sfv c;
    public final fci<?> d;
    
    public ibl(final Context context, final sfv c, final fci<?> d) {
        this.b = new WeakReference<Context>(context);
        this.c = c;
        this.d = d;
    }
    
    public final void c(final w6w w6w) {
        final Context context = this.b.get();
        final UserIdentifier current = UserIdentifier.getCurrent();
        final fg4 fg4 = new fg4(current);
        ((o1p)fg4).q(new String[] { "profile:::bio:open_link" });
        ((o1p)fg4).e((f0p)this.c);
        ((o1p)fg4).n(w6w.L0, w6w.K0);
        sbw.b((tlm)fg4);
        if (context != null) {
            k7f.a().b(context, null, w6w, current, null, null, this.c, null);
        }
    }
    
    public final void e(final z4h z4h) {
        final Context context = this.b.get();
        if (context != null) {
            final b8l$a b8l$a = new b8l$a();
            b8l$a.c = z4h.L0;
            context.startActivity(b8l$a.o(context));
        }
    }
    
    public final void f(final on3 on3) {
        this.d.d((cn)t7a.a(on3));
    }
    
    public final void g(final v1c v1c) {
        final Context context = this.b.get();
        if (context != null) {
            context.startActivity(sgk.a(context, v1c));
        }
    }
    
    public final void h(final sgc sgc) {
        this.d.d((cn)t7a.b(sgc));
    }
}
