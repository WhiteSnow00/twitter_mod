import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyw implements xx0$a
{
    public final g59 a;
    public final cyw b;
    public final Set<e2> c;
    public final List<e2> d;
    public u4 e;
    
    public dyw(final g59 a, final cyw b, final Set<e2> c) {
        zzd.f((Object)a, "closedCaptionsController");
        zzd.f((Object)b, "initializationState");
        zzd.f((Object)c, "extraListeners");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new ArrayList();
    }
    
    public final void a() {
        final u4 e = this.e;
        if (e != null) {
            this.a.b(e.b.l1);
            if (this.b.a.b) {
                e.i();
            }
            else {
                e.o(o4x.F0);
                e.p(e.d());
            }
        }
    }
    
    public final void b() {
        this.a.a();
    }
}
