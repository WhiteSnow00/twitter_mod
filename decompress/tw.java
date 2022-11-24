import android.content.DialogInterface;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tw implements qx8
{
    public final uw a;
    public final NavigationHandler b;
    public final rej c;
    
    public tw(final uw a, final NavigationHandler b, final rej c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final DialogInterface dialogInterface) {
        if (this.a.j != null) {
            final NavigationHandler b = this.b;
            vmw.g((Object)b);
            b.e(this.a.j);
        }
    }
    
    @Override
    public final void b(final DialogInterface dialogInterface, final int n) {
        if (n != -2) {
            if (n == -1) {
                final NavigationHandler b = this.b;
                vmw.g((Object)b);
                final dtv a = ((bur)this.a).a;
                vmw.g((Object)a);
                b.e(a);
            }
        }
        else {
            final NavigationHandler b2 = this.b;
            vmw.g((Object)b2);
            final dtv c = ((bur)this.a).c;
            vmw.g((Object)c);
            b2.e(c);
        }
    }
    
    @Override
    public final wjl$b c(final int n) {
        final wjl$b wjl$b = new wjl$b(n);
        final rej c = this.c;
        final pej a = ((bur)this.a).f.a;
        pej n2 = pej.N0;
        pej pej = a;
        if (a == null) {
            pej = n2;
        }
        ((wjl$a)wjl$b).I(c.a((fym)pej));
        final rej c2 = this.c;
        final pej b = ((bur)this.a).f.b;
        if (b != null) {
            n2 = b;
        }
        ((wjl$a)wjl$b).B((CharSequence)c2.a((fym)n2));
        final dtv a2 = ((bur)this.a).a;
        vmw.g((Object)a2);
        ((wjl$a)wjl$b).G(a2.c);
        final dtv c3 = ((bur)this.a).c;
        if (c3 != null) {
            ((wjl$a)wjl$b).D(c3.c);
        }
        return wjl$b;
    }
    
    @Override
    public final xbc$a d(final int n) {
        return null;
    }
}
