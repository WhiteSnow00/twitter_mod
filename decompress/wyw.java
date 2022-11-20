import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wyw implements sx0$a
{
    public final o49 a;
    public final vyw b;
    public final Set<f2> c;
    public final List<f2> d;
    public w4 e;
    
    public wyw(final o49 a, final vyw b, final Set<f2> c) {
        czd.f((Object)a, "closedCaptionsController");
        czd.f((Object)b, "initializationState");
        czd.f((Object)c, "extraListeners");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new ArrayList();
    }
    
    public final void a() {
        final w4 e = this.e;
        if (e != null) {
            this.a.b(e.b.m1);
            if (this.b.a.b) {
                e.i();
            }
            else {
                e.o(i5x.G0);
                e.p(e.d());
            }
        }
    }
    
    public final void b() {
        this.a.a();
    }
}
