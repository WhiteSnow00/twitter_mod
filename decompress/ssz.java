import android.content.Intent;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ssz implements l1z
{
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ dsa f;
    
    public ssz(final dsa f, final List a, final List b, final long c, final boolean d, final List e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        this.f.l(this.a, this.b, this.c);
    }
    
    public final void d() {
        if (!this.d) {
            this.f.k(this.e, this.a, this.b, this.c, true);
        }
    }
    
    public final void e(final int n) {
        this.f.m(6, n, null, null, null, null, null);
    }
}
