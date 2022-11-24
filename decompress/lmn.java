import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmn implements kmn
{
    public final tsc a;
    
    public lmn(final tsc a) {
        e0e.f((Object)a, "httpRequestController");
        this.a = a;
    }
    
    @Override
    public final void a(final Context context, final long n, final ptb<vzv> ptb) {
        e0e.f((Object)context, "context");
        e0e.f((Object)ptb, "callback");
        ((pnm)this.a.f(new nt8(context, UserIdentifier.Companion.c(), n, (gjl)null))).U((aw0$b)new osc$a<nt8>(ptb) {
            public final ptb<vzv> F0;
            
            public final void a(final aw0 aw0) {
            }
            
            public final void b(final aw0 aw0) {
                if (((osc)aw0).T().b) {
                    this.F0.invoke();
                }
            }
            
            public final void c(final aw0 aw0, final boolean b) {
            }
        });
    }
    
    @Override
    public final void b(final Context context, final long n, final boolean p4, final ptb<vzv> ptb) {
        e0e.f((Object)context, "context");
        e0e.f((Object)ptb, "callback");
        final z47 z47 = new z47(context, UserIdentifier.Companion.c(), n, (gjl)null);
        z47.p1 = p4;
        ((pnm)this.a.f(z47)).U((aw0$b)new osc$a<z47>(ptb) {
            public final ptb<vzv> F0;
            
            public final void a(final aw0 aw0) {
            }
            
            public final void b(final aw0 aw0) {
                if (((osc)aw0).T().b) {
                    this.F0.invoke();
                }
            }
            
            public final void c(final aw0 aw0, final boolean b) {
            }
        });
    }
    
    @Override
    public final void c(final Context context, final long n1, final ptb<vzv> ptb) {
        e0e.f((Object)context, "context");
        e0e.f((Object)ptb, "callback");
        final eg3 eg3 = new eg3(context, UserIdentifier.Companion.c());
        eg3.n1 = n1;
        ((pnm)this.a.f(eg3)).U((aw0$b)new osc$a<eg3>(ptb) {
            public final ptb<vzv> F0;
            
            public final void a(final aw0 aw0) {
            }
            
            public final void b(final aw0 aw0) {
                if (((osc)aw0).T().b) {
                    this.F0.invoke();
                }
            }
            
            public final void c(final aw0 aw0, final boolean b) {
            }
        });
    }
}
