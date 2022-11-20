import android.database.ContentObserver;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4f<ARGS, RESULTS> implements k7b<ARGS, RESULTS>
{
    public final l6j<ARGS, RESULTS> D0;
    public final ContentResolver E0;
    public final qsb<ARGS, Uri> F0;
    
    public g4f(final l6j<ARGS, RESULTS> d0, final ContentResolver e0, final qsb<? super ARGS, ? extends Uri> f0) {
        czd.f((Object)f0, "legacyNotificationUri");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (qsb<ARGS, Uri>)f0;
    }
    
    public static final t19 a(final g4f g4f, final Object o, final nuh nuh) {
        return g4f.D0.v(o).subscribe((lj6)new gwi((qsb)new h4f(nuh), 8));
    }
    
    public final void close() {
    }
    
    public final d7b<RESULTS> w(final ARGS args) {
        final nuh m = chw.m(0, 1, (vq2)null, 5);
        final xkp xkp = new xkp();
        final Uri uri = (Uri)this.F0.invoke((Object)args);
        final dig dig = new dig((nsb<fzv>)new nsb<fzv>(xkp, this, args, m) {
            public final xkp D0;
            public final g4f<ARGS, RESULTS> E0;
            public final ARGS F0;
            public final nuh<RESULTS> G0;
            
            public final Object invoke() {
                this.D0.b(g4f.a(this.E0, this.F0, this.G0));
                return fzv.a;
            }
        });
        return (d7b<RESULTS>)new w7b((d7b)new vmr((zwp)m, (ftb)new ftb<e7b<? super RESULTS>, go6<? super fzv>, Object>(xkp, this, args, m, uri, dig, null) {
            public final xkp D0;
            public final g4f<ARGS, RESULTS> E0;
            public final ARGS F0;
            public final nuh<RESULTS> G0;
            public final Uri H0;
            public final dig I0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<e7b<? super RESULTS>, go6<? super fzv>, Object>(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, go6) {
                    public final xkp D0;
                    public final g4f<ARGS, RESULTS> E0;
                    public final ARGS F0;
                    public final nuh<RESULTS> G0;
                    public final Uri H0;
                    public final dig I0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<e7b<? super RESULTS>, go6<? super fzv>, Object> ftb = (ftb<e7b<? super RESULTS>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                this.D0.b(g4f.a(this.E0, this.F0, this.G0));
                this.E0.E0.registerContentObserver(this.H0, true, (ContentObserver)this.I0);
                return fzv.a;
            }
        }), (itb)new itb<e7b<? super RESULTS>, Throwable, go6<? super fzv>, Object>(xkp, this, dig, null) {
            public final xkp D0;
            public final g4f<ARGS, RESULTS> E0;
            public final dig F0;
            
            public final Object h0(final Object o, final Object o2, final Object o3) {
                final e7b e7b = (e7b)o;
                final Throwable t = (Throwable)o2;
                final itb<e7b<? super RESULTS>, Throwable, go6<? super fzv>, Object> itb = (itb<e7b<? super RESULTS>, Throwable, go6<? super fzv>, Object>)new itb<e7b<? super RESULTS>, Throwable, go6<? super fzv>, Object>(this.D0, this.E0, this.F0, (go6)o3) {
                    public final xkp D0;
                    public final g4f<ARGS, RESULTS> E0;
                    public final dig F0;
                };
                final fzv a = fzv.a;
                itb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final t19 a = this.D0.a();
                if (a != null) {
                    a.dispose();
                }
                this.D0.b((t19)null);
                this.E0.E0.unregisterContentObserver((ContentObserver)this.F0);
                return fzv.a;
            }
        });
    }
}
