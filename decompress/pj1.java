// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pj1 implements jj4
{
    public kj4 a;
    public final tlp b;
    public final uv1<Boolean> c;
    
    public pj1() {
        this.b = new tlp();
        this.c = (uv1<Boolean>)uv1.e((Object)Boolean.FALSE);
    }
    
    public final t5j<Boolean> a() {
        final t5j hide = ((t5j)this.c).hide();
        e0e.e((Object)hide, "isEnabledSubject.hide()");
        return (t5j<Boolean>)hide;
    }
    
    public final kj4 b() {
        final kj4 a = this.a;
        if (a != null) {
            return a;
        }
        e0e.m("config");
        throw null;
    }
    
    public final boolean c() {
        return this.b().a == 6;
    }
    
    public final boolean d() {
        return this.b().a == 5;
    }
    
    public final boolean e() {
        return this.b().a == 7;
    }
    
    public final void g() {
        this.b.dispose();
    }
}
