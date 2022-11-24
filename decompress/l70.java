import java.util.Objects;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l70 implements wqh
{
    public final Choreographer F0;
    
    public l70(final Choreographer f0) {
        this.F0 = f0;
    }
    
    public final <E extends yy6$a> E b(final yy6$b<E> yy6$b) {
        e0e.f((Object)yy6$b, "key");
        return (E)yy6$a$a.a((yy6$a)this, (yy6$b)yy6$b);
    }
    
    public final <R> Object e(final stb<? super Long, ? extends R> stb, final mp6<? super R> mp6) {
        final yy6 context = mp6.getContext();
        final int y = pp6.y;
        final yy6$a b = context.b((yy6$b)pp6$a.F0);
        k70 k70;
        if (b instanceof k70) {
            k70 = (k70)b;
        }
        else {
            k70 = null;
        }
        final qg3 qg3 = new qg3(d4j.Y((mp6)mp6), 1);
        qg3.r();
        final l70$c l70$c = new l70$c((pg3)qg3, this, (stb)stb);
        if (k70 != null && e0e.a((Object)k70.H0, (Object)this.F0)) {
            synchronized (k70.J0) {
                k70.L0.add(l70$c);
                if (!k70.O0) {
                    k70.O0 = true;
                    k70.H0.postFrameCallback((Choreographer$FrameCallback)k70.P0);
                }
                monitorexit(k70.J0);
                ((pg3)qg3).w((stb)new stb<Throwable, vzv>(k70, l70$c) {
                    public final k70 F0;
                    public final Choreographer$FrameCallback G0;
                    
                    public final Object invoke(final Object o) {
                        final Throwable t = (Throwable)o;
                        final k70 f0 = this.F0;
                        final Choreographer$FrameCallback g0 = this.G0;
                        Objects.requireNonNull(f0);
                        e0e.f((Object)g0, "callback");
                        synchronized (f0.J0) {
                            f0.L0.remove(g0);
                            return vzv.a;
                        }
                    }
                });
                return qg3.q();
            }
        }
        this.F0.postFrameCallback((Choreographer$FrameCallback)l70$c);
        ((pg3)qg3).w((stb)new stb<Throwable, vzv>(this, l70$c) {
            public final l70 F0;
            public final Choreographer$FrameCallback G0;
            
            public final Object invoke(final Object o) {
                final Throwable t = (Throwable)o;
                this.F0.F0.removeFrameCallback(this.G0);
                return vzv.a;
            }
        });
        return qg3.q();
    }
    
    public final yy6$b getKey() {
        return (yy6$b)wqh.a.F0;
    }
    
    public final <R> R m(final R r, final hub<? super R, ? super yy6$a, ? extends R> hub) {
        e0e.f((Object)hub, "operation");
        return (R)hub.invoke((Object)r, (Object)this);
    }
    
    public final yy6 q(final yy6$b<?> yy6$b) {
        e0e.f((Object)yy6$b, "key");
        return yy6$a$a.b((yy6$a)this, (yy6$b)yy6$b);
    }
    
    public final yy6 u0(final yy6 yy6) {
        e0e.f((Object)yy6, "context");
        return yy6$a$a.c((yy6$a)this, yy6);
    }
}
