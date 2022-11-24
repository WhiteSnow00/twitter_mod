import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class whc implements vhc
{
    public final e39 a;
    public final uv1<List<phc>> b;
    public final thc c;
    
    public whc(final kcm kcm, final thc c) {
        this.c = c;
        this.b = (uv1<List<phc>>)new uv1();
        final e39 a = new e39();
        Objects.requireNonNull(this.a = a);
        kcm.i((sj)new vo0(a, 1));
    }
    
    public final void a() {
        final e39 a = this.a;
        final bbq a2 = this.c.a();
        final uv1<List<phc>> b = this.b;
        Objects.requireNonNull(b);
        a.c(a2.G((rk6)new u1p((Object)b, 24), (rk6)tf2.J0));
    }
    
    public final t5j<List<phc>> b() {
        return (t5j<List<phc>>)this.b;
    }
    
    public final List<phc> d() {
        final List list = (List)this.b.f();
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        Object o = list;
        if (list == null) {
            o = g0;
        }
        return (List<phc>)o;
    }
}
