// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = { 63 }, m = "invokeSuspend")
public final class a5c extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public r2m C0;
    public jq3 D0;
    public int E0;
    public final /* synthetic */ pp3<oyv> F0;
    
    public a5c(final pp3<oyv> f0, final ap6<? super a5c> ap6) {
        this.F0 = f0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new a5c(this.F0, (ap6<? super a5c>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a5c)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(Object o) {
        Object c0 = zy6.C0;
        final int e0 = this.E0;
        Label_0064: {
            if (e0 == 0) {
                break Label_0064;
            }
            Label_0054: {
                if (e0 != 1) {
                    break Label_0054;
                }
                final jq3 d0 = this.D0;
                Object o2;
                final r2m r2m = (r2m)(o2 = this.C0);
                try {
                    kq9.b1(o);
                    o2 = r2m;
                    a5c a5c = this;
                    Object iterator = c0;
                    c0 = d0;
                    while (true) {
                        while (true) {
                            try {
                                if (o) {
                                    final oyv oyv = (oyv)((jq3)c0).next();
                                    ahq.Companion.e();
                                    final Object o3 = iterator;
                                    iterator = c0;
                                    o = o2;
                                    c0 = o3;
                                }
                                rp2.r((r2m)o2, (Throwable)null);
                                return oyv.a;
                            }
                            finally {}
                            final pp3<oyv> c2;
                            o2 = c2;
                            a5c.C0 = (r2m)c2;
                            o2 = c2;
                            a5c.D0 = (jq3)iterator;
                            o2 = c2;
                            a5c.E0 = 1;
                            o2 = c2;
                            final Object a = ((jq3)iterator).a((ap6)a5c);
                            if (a == c0) {
                                break;
                            }
                            o2 = c2;
                            final jq3 jq3 = (jq3)c0;
                            o = a;
                            c0 = iterator;
                            iterator = jq3;
                        }
                        return c0;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        kq9.b1(o);
                        final pp3<oyv> c2 = (pp3<oyv>)(o2 = this.F0);
                        iterator = ((r2m)c2).iterator();
                        a5c = this;
                        continue;
                    }
                }
                finally {
                    try {}
                    finally {
                        rp2.r((r2m)o2, (Throwable)o);
                    }
                }
            }
        }
    }
}
