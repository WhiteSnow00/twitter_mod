import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hxp
{
    public final AtomicBoolean a;
    public final gcn b;
    public volatile yyr c;
    
    public hxp(final gcn b) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    public final yyr a() {
        this.b.a();
        yyr yyr;
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.b();
            }
            yyr = this.c;
        }
        else {
            yyr = this.b();
        }
        return yyr;
    }
    
    public final yyr b() {
        final String c = this.c();
        final gcn b = this.b;
        b.a();
        b.b();
        return b.d.H2().e2(c);
    }
    
    public abstract String c();
    
    public final void d(final yyr yyr) {
        if (yyr == this.c) {
            this.a.set(false);
        }
    }
}
