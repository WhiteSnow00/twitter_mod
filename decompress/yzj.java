// 
// Decompiled by Procyon v0.6.0
// 

public final class yzj implements bqh
{
    public final bqh C0;
    public final yue D0;
    
    public yzj(final bqh c0) {
        this.C0 = c0;
        this.D0 = new yue();
    }
    
    public final <E extends oy6$a> E c(final oy6$b<E> oy6$b) {
        zzd.f((Object)oy6$b, "key");
        return (E)oy6$a$a.a((oy6$a)this, (oy6$b)oy6$b);
    }
    
    public final <R> Object e(rtb<? super Long, ? extends R> d0, final ap6<? super R> ap6) {
        cp6 cp6 = null;
        Label_0048: {
            if (ap6 instanceof yzj$a) {
                cp6 = (yzj$a<?>)ap6;
                final int g0 = cp6.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    cp6.G0 = g0 + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            cp6 = new cp6<Object>(ap6) {
                public yzj C0;
                public rtb D0;
                public /* synthetic */ Object E0;
                public final /* synthetic */ yzj F0;
                public int G0;
                
                public final Object invokeSuspend(final Object e0) {
                    this.E0 = e0;
                    this.G0 |= Integer.MIN_VALUE;
                    return this.F0.e((rtb<? super Long, ?>)null, (ap6<? super Object>)this);
                }
            };
        }
        final Object e0 = cp6.E0;
        final zy6 c0 = zy6.C0;
        final int g2 = cp6.G0;
        Label_0263: {
            if (g2 != 0) {
                if (g2 == 1) {
                    d0 = cp6.D0;
                    final Object o = cp6.C0;
                    kq9.b1(e0);
                    final Object o2 = o;
                    break Label_0263;
                }
                if (g2 == 2) {
                    kq9.b1(e0);
                    return e0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(e0);
            final yue d2 = this.D0;
            cp6.C0 = this;
            cp6.D0 = d0;
            cp6.G0 = 1;
            synchronized (d2.a) {
                final boolean d3 = d2.d;
                monitorexit(d2.a);
                Label_0252: {
                    if (d3) {
                        final Object o3 = oyv.a;
                        break Label_0252;
                    }
                    final hg3 hg3 = new hg3(asy.Z((ap6)cp6), 1);
                    hg3.r();
                    final Object o = d2.a;
                    synchronized (d2.a) {
                        d2.b.add(hg3);
                        monitorexit(d2.a);
                        hg3.w((rtb)new xue(d2, (gg3)hg3));
                        Object o3 = hg3.q();
                        if (o3 != c0) {
                            o3 = oyv.a;
                        }
                        if (o3 == c0) {
                            return c0;
                        }
                        final Object o2 = this;
                        final bqh c2 = ((yzj)o2).C0;
                        cp6.C0 = null;
                        cp6.D0 = null;
                        cp6.G0 = 2;
                        final Object e2;
                        if ((e2 = c2.e(d0, (ap6)cp6)) == c0) {
                            return c0;
                        }
                        return e2;
                    }
                }
            }
        }
    }
    
    public final oy6$b getKey() {
        return (oy6$b)bqh.a.C0;
    }
    
    public final <R> R p(final R r, final gub<? super R, ? super oy6$a, ? extends R> gub) {
        zzd.f((Object)gub, "operation");
        return (R)gub.invoke((Object)r, (Object)this);
    }
    
    public final oy6 q(final oy6$b<?> oy6$b) {
        zzd.f((Object)oy6$b, "key");
        return oy6$a$a.b((oy6$a)this, (oy6$b)oy6$b);
    }
    
    public final oy6 w0(final oy6 oy6) {
        zzd.f((Object)oy6, "context");
        return oy6$a$a.c((oy6$a)this, oy6);
    }
}
