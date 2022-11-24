import java.util.HashSet;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h6w extends yrm<Closeable>
{
    public Closeable H0;
    public final ocj I0;
    public final i6w$a J0;
    
    public h6w(final i6w$a j0, final ocj i0) {
        this.J0 = j0;
        this.I0 = i0;
    }
    
    public final void a() {
        this.I0.onSubscribe((b39)this);
        super.G0.a((b39)new rg3((ng3)new rsc(this, 1)));
    }
    
    public final void b(final Closeable h0) {
        synchronized (this.J0.a.I0) {
            final Closeable h2 = this.H0;
            if (h2 != null) {
                j2e.a(h2);
                ((HashSet)this.J0.a.I0).remove(this.H0);
                this.H0 = null;
            }
            if (h0 != null) {
                if (this.J0.a.L0) {
                    j2e.a(h0);
                }
                else {
                    this.H0 = h0;
                }
            }
        }
    }
    
    public final void onComplete() {
        if (!this.isDisposed()) {
            this.I0.onComplete();
        }
    }
    
    public final void onError(final Throwable t) {
        if (!this.isDisposed()) {
            this.I0.onError(t);
        }
    }
    
    public final void onNext(final Object o) {
        final Closeable closeable = (Closeable)o;
        if (!this.J0.a.L0 && !this.isDisposed()) {
            this.I0.onNext((Object)closeable);
        }
        this.b(closeable);
    }
}
