import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class cjq<T> implements ear, bjq<T>
{
    public final djq<T> F0;
    public cjq.cjq$a<T> G0;
    
    public cjq(final T t, final djq<T> f0) {
        e0e.f((Object)f0, "policy");
        this.F0 = f0;
        this.G0 = (cjq.cjq$a<T>)new cjq.cjq$a((Object)t);
    }
    
    public final djq<T> a() {
        return this.F0;
    }
    
    public final stb<T, vzv> d() {
        return (stb<T, vzv>)new stb<T, vzv>(this) {
            public final cjq<T> F0;
            
            public final Object invoke(final Object value) {
                this.F0.setValue((T)value);
                return vzv.a;
            }
        };
    }
    
    public final void g(final gar gar) {
        this.G0 = (cjq.cjq$a<T>)gar;
    }
    
    public final T getValue() {
        return (T)((cjq.cjq$a)uiq.r((gar)this.G0, (ear)this)).c;
    }
    
    public final T h() {
        return this.getValue();
    }
    
    public final gar k() {
        return (gar)this.G0;
    }
    
    public final gar n(final gar gar, gar gar2, final gar gar3) {
        final cjq.cjq$a cjq$a = (cjq.cjq$a)gar;
        if (!this.F0.b(((cjq.cjq$a)gar2).c, ((cjq.cjq$a)gar3).c)) {
            this.F0.a();
            gar2 = null;
        }
        return gar2;
    }
    
    public final void setValue(final T c) {
        final cjq.cjq$a cjq$a = (cjq.cjq$a)uiq.h((gar)this.G0);
        if (!this.F0.b(cjq$a.c, (Object)c)) {
            final cjq.cjq$a<T> g0 = this.G0;
            final uiq$a a = uiq.a;
            synchronized (uiq.c) {
                Objects.requireNonNull(piq.Companion);
                final piq j = uiq.j();
                ((cjq.cjq$a)uiq.o((gar)g0, (ear)this, j, (gar)cjq$a)).c = c;
                monitorexit(uiq.c);
                uiq.n(j, (ear)this);
            }
        }
    }
    
    @Override
    public final String toString() {
        final cjq.cjq$a cjq$a = (cjq.cjq$a)uiq.h((gar)this.G0);
        final StringBuilder f = ehk.f("MutableState(value=");
        f.append(cjq$a.c);
        f.append(")@");
        f.append(this.hashCode());
        return f.toString();
    }
}
