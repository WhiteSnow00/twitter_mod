// 
// Decompiled by Procyon v0.6.0
// 

public final class prw implements ny9<orw>
{
    public final fci<?> F0;
    
    public prw(final fci<?> f0) {
        e0e.f((Object)f0, "navigator");
        this.F0 = f0;
    }
    
    public final void a(final orw orw) {
        e0e.f((Object)orw, "effect");
        if (orw instanceof orw$a) {
            this.F0.k();
        }
        else if (orw instanceof orw$c) {
            this.F0.b(((orw$c)orw).a);
        }
        else if (orw instanceof orw$b) {
            sbw.b((tlm)((orw$b)orw).a);
        }
    }
    
    public final /* bridge */ void r(final Object o) {
        this.a((orw)o);
    }
}
