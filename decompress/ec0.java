// 
// Decompiled by Procyon v0.6.0
// 

public final class ec0<T, V extends oc0> implements q7r<T>
{
    public final chv<T, V> C0;
    public final cwj D0;
    public V E0;
    public long F0;
    public long G0;
    public boolean H0;
    
    public ec0(final chv<T, V> c0, final T t, final V v, final long f0, final long g0, final boolean h0) {
        zzd.f((Object)c0, "typeConverter");
        this.C0 = c0;
        this.D0 = (cwj)nkz.r((Object)t);
        oc0 e0;
        if (v != null) {
            e0 = dml.q((oc0)v);
        }
        else {
            e0 = x3j.s((chv)c0, (Object)t);
        }
        this.E0 = (V)e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final T e() {
        return (T)this.C0.b().invoke((Object)this.E0);
    }
    
    public final void g(final T value) {
        ((nhq)this.D0).setValue((Object)value);
    }
    
    public final T getValue() {
        return (T)((nhq)this.D0).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("AnimationState(value=");
        g.append(this.getValue());
        g.append(", velocity=");
        g.append(this.e());
        g.append(", isRunning=");
        g.append(this.H0);
        g.append(", lastFrameTimeNanos=");
        g.append(this.F0);
        g.append(", finishedTimeNanos=");
        g.append(this.G0);
        g.append(')');
        return g.toString();
    }
}
