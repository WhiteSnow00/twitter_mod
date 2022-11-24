import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2p
{
    public final Context a;
    public final e39 b;
    public boolean c;
    public boolean d;
    
    public e2p(final Context a, final gcu gcu) {
        this.b = new e39();
        this.a = a;
        final boolean e = gcu.e("debug_scribe_overlay", false);
        this.c = e;
        if (e) {
            this.b();
        }
        final b39 subscribe = gcu.a().subscribe((rk6)new d2p((Object)this, (Object)gcu, (Object)a, 0));
        Objects.requireNonNull(subscribe, "disposable is null");
        try {
            new ymj(16, 0.75f).a((Object)subscribe);
        }
        finally {}
    }
    
    public final boolean a() {
        synchronized (this) {
            po.b().t();
            return false;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (!this.d) {
                this.b.c(rh.a().b().i().subscribe((rk6)new bes((Object)this, 1)));
                this.d = true;
                this.c = true;
            }
        }
    }
}
