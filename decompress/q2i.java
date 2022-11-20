import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q2i implements p2i
{
    public final trc a;
    
    public q2i(final trc a) {
        czd.f((Object)a, "httpRequestController");
        this.a = a;
    }
    
    public final void a(final Context context, final long n) {
        czd.f((Object)context, "context");
        final u37 u37 = new u37(context, UserIdentifier.Companion.c(), n, (uil)null);
        u37.n1 = false;
        ((anm<Object, Object>)this.a.f((orc)u37)).U((wv0$b<? extends wv0<xrc<Object, Object>>>)new orc$a<u37>() {
            public final void a(final wv0 wv0) {
            }
            
            public final void b(final wv0 wv0) {
                if (((orc)wv0).T().b) {
                    cbw.b((elm)zzh$f0.a);
                }
            }
            
            public final void c(final wv0 wv0, final boolean b) {
            }
        });
    }
    
    public final void b(final Context context, final long l1) {
        czd.f((Object)context, "context");
        final trc a = this.a;
        final ef3 ef3 = new ef3(context, UserIdentifier.Companion.c());
        ef3.l1 = l1;
        ((anm<Object, Object>)a.f((orc)ef3)).U((wv0$b<? extends wv0<xrc<Object, Object>>>)new orc$a<ef3>() {
            public final void a(final wv0 wv0) {
            }
            
            public final void b(final wv0 wv0) {
                if (((orc)wv0).T().b) {
                    cbw.b((elm)zzh$g0.a);
                }
            }
            
            public final void c(final wv0 wv0, final boolean b) {
            }
        });
    }
    
    public final void c(final Context context, final long n) {
        czd.f((Object)context, "context");
        ((anm<Object, Object>)this.a.f((orc)new hs8(context, UserIdentifier.Companion.c(), n, (uil)null))).U((wv0$b<? extends wv0<xrc<Object, Object>>>)new orc$a<hs8>() {
            public final void a(final wv0 wv0) {
            }
            
            public final void b(final wv0 wv0) {
                if (((orc)wv0).T().b) {
                    cbw.b((elm)zzh$g0.a);
                }
            }
            
            public final void c(final wv0 wv0, final boolean b) {
            }
        });
    }
}
