// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = { 63 }, m = "invokeSuspend")
public final class e5c extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public r3m F0;
    public qq3 G0;
    public int H0;
    public final xp3<vzv> I0;
    
    public e5c(final xp3<vzv> i0, final mp6<? super e5c> mp6) {
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new e5c(this.I0, (mp6<? super e5c>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((e5c)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(Object o) {
        Object f0 = jz6.F0;
        final int h0 = this.H0;
        Label_0065: {
            if (h0 == 0) {
                break Label_0065;
            }
            Label_0055: {
                if (h0 != 1) {
                    break Label_0055;
                }
                final qq3 g0 = this.G0;
                Object o2;
                final r3m r3m = (r3m)(o2 = this.F0);
                try {
                    jb2.M0(o);
                    o2 = r3m;
                    e5c e5c = this;
                    Object iterator = f0;
                    f0 = g0;
                    while (true) {
                        while (true) {
                            try {
                                if (o) {
                                    final vzv vzv = (vzv)((qq3)f0).next();
                                    piq.Companion.e();
                                    final qq3 qq3 = (qq3)f0;
                                    o = o2;
                                    f0 = iterator;
                                    iterator = qq3;
                                }
                                lp7.k((r3m)o2, (Throwable)null);
                                return vzv.a;
                            }
                            finally {}
                            final xp3<vzv> f2;
                            o2 = f2;
                            e5c.F0 = (r3m)f2;
                            o2 = f2;
                            e5c.G0 = (qq3)iterator;
                            o2 = f2;
                            e5c.H0 = 1;
                            o2 = f2;
                            final Object a = ((qq3)iterator).a((mp6)e5c);
                            if (a == f0) {
                                break;
                            }
                            o2 = f2;
                            final qq3 qq4 = (qq3)iterator;
                            iterator = f0;
                            o = a;
                            f0 = qq4;
                        }
                        return f0;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        jb2.M0(o);
                        final xp3<vzv> f2 = (xp3<vzv>)(o2 = this.I0);
                        iterator = ((r3m)f2).iterator();
                        e5c = this;
                        continue;
                    }
                }
                finally {
                    try {}
                    finally {
                        lp7.k((r3m)o2, (Throwable)o);
                    }
                }
            }
        }
    }
}
