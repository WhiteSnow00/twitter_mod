// 
// Decompiled by Procyon v0.6.0
// 

public final class c2j<T> implements xq<T>
{
    public final xq<T> a;
    
    public c2j(final xq<T> a) {
        zzd.f((Object)a, "wrappedAdapter");
        this.a = a;
        if (a instanceof c2j ^ true) {
            return;
        }
        throw new IllegalStateException("The adapter is already nullable".toString());
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final T t) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        if (t == null) {
            qle.u3();
        }
        else {
            this.a.a(qle, bb7, t);
        }
    }
    
    @Override
    public final T b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        T b;
        if (eie.V2() == 10) {
            eie.h0();
            b = null;
        }
        else {
            b = this.a.b(eie, bb7);
        }
        return b;
    }
}
