import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyo
{
    public final kyo a;
    public final e3r b;
    public final gwo c;
    public final gwo d;
    public final w19 e;
    
    public fyo(final kyo a, final e3r b) {
        final gwo c = owo.c();
        final gwo h = gmw.H();
        this.e = new w19();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = h;
    }
    
    public static fyo b(final View view, final e3r e3r) {
        return new fyo(new kyo(new jyo((zkd)new ald(view, 2131431227, view.getResources().getConfiguration()), (zkd)null)), e3r);
    }
    
    public final void a(final w2r w2r) {
        Object w1;
        if ((w1 = this.b.w1(w2r.getId())) == null) {
            w1 = w2r;
        }
        this.c();
        this.a.a((w2r)w1);
        final w19 e = this.e;
        final h5j observeOn = this.b.b1(w2r.getId()).subscribeOn(this.c).observeOn(this.d);
        final kyo a = this.a;
        Objects.requireNonNull(a);
        e.c(observeOn.subscribe((lj6)new d7f((Object)a, 8)));
    }
    
    public final void c() {
        this.e.a();
        this.a.a.a(0);
    }
}
