import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vyp
{
    public final AtomicBoolean a;
    public final ldn b;
    public volatile m0s c;
    
    public vyp(final ldn b) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    public final m0s a() {
        this.b.a();
        m0s m0s;
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.b();
            }
            m0s = this.c;
        }
        else {
            m0s = this.b();
        }
        return m0s;
    }
    
    public final m0s b() {
        final String c = this.c();
        final ldn b = this.b;
        b.a();
        b.b();
        return b.d.H2().e2(c);
    }
    
    public abstract String c();
    
    public final void d(final m0s m0s) {
        if (m0s == this.c) {
            this.a.set(false);
        }
    }
}
