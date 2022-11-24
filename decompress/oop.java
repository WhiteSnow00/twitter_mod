import java.util.concurrent.Executor;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oop<V> extends yb<V>
{
    public final boolean o(final V v) {
        Object l0 = v;
        if (v == null) {
            l0 = yb.L0;
        }
        boolean b;
        if (yb.K0.b((yb)this, (Object)null, l0)) {
            yb.c((yb)this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean p(final Throwable t) {
        Objects.requireNonNull(t);
        boolean b;
        if (yb.K0.b((yb)this, (Object)null, (Object)new yb$c(t))) {
            yb.c((yb)this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean q(final pnf<? extends V> pnf) {
        Objects.requireNonNull(pnf);
        final Object f0 = super.F0;
        final boolean b = false;
        Object f2 = f0;
        Label_0137: {
            if (f0 == null) {
                if (pnf.isDone()) {
                    final Object k = yb.k((pnf)pnf);
                    final boolean b2 = b;
                    if (!yb.K0.b((yb)this, (Object)null, k)) {
                        return b2;
                    }
                    yb.c((yb)this);
                }
                else {
                    final yb$f yb$f = new yb$f((yb)this, (pnf)pnf);
                    if (!yb.K0.b((yb)this, (Object)null, (Object)yb$f)) {
                        f2 = super.F0;
                        break Label_0137;
                    }
                    try {
                        pnf.e((Runnable)yb$f, (Executor)ay8.F0);
                    }
                    finally {
                        yb$c b3 = null;
                        try {
                            final Throwable t;
                            final yb$c yb$c = new yb$c(t);
                        }
                        finally {
                            b3 = yb$c.b;
                        }
                        yb.K0.b((yb)this, (Object)yb$f, (Object)b3);
                    }
                }
                return true;
            }
        }
        boolean b2 = b;
        if (f2 instanceof yb$b) {
            pnf.cancel(((yb$b)f2).a);
            b2 = b;
        }
        return b2;
    }
}
