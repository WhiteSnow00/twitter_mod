import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zf8 implements bqh
{
    public static final zf8 C0;
    public static final Choreographer D0;
    
    static {
        C0 = new zf8();
        final zj8 a = r19.a;
        D0 = (Choreographer)fk7.y0((oy6)rhg.a.K0(), (gub)new gub<yy6, ap6<? super Choreographer>, Object>(null) {
            public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
                return (ap6<oyv>)new gub<yy6, ap6<? super Choreographer>, Object>((ap6<? super zf8$a>)ap6) {};
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final yy6 yy6 = (yy6)o;
                return new gub<yy6, ap6<? super Choreographer>, Object>((ap6<? super zf8$a>)o2) {
                    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
                        return (ap6<oyv>)new gub<yy6, ap6<? super Choreographer>, Object>((ap6<? super zf8$a>)ap6) {};
                    }
                }.invokeSuspend(oyv.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                kq9.b1(o);
                return Choreographer.getInstance();
            }
        });
    }
    
    public final <E extends oy6$a> E c(final oy6$b<E> oy6$b) {
        zzd.f((Object)oy6$b, "key");
        return (E)oy6$a$a.a((oy6$a)this, (oy6$b)oy6$b);
    }
    
    public final <R> Object e(final rtb<? super Long, ? extends R> rtb, final ap6<? super R> ap6) {
        final hg3 hg3 = new hg3(asy.Z((ap6)ap6), 1);
        hg3.r();
        final zf8$c zf8$c = new zf8$c((gg3)hg3, (rtb)rtb);
        zf8.D0.postFrameCallback((Choreographer$FrameCallback)zf8$c);
        ((gg3)hg3).w((rtb)new rtb<Throwable, oyv>() {
            public final Object invoke(final Object o) {
                final Throwable t = (Throwable)o;
                zf8.D0.removeFrameCallback(zf8$c);
                return oyv.a;
            }
        });
        return hg3.q();
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
