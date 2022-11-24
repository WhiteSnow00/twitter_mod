// 
// Decompiled by Procyon v0.6.0
// 

public final class bc0<T, V extends lc0> implements l9r<T>
{
    public final liv<T, V> F0;
    public final wwj G0;
    public V H0;
    public long I0;
    public long J0;
    public boolean K0;
    
    public bc0(final liv liv, final Object o, lc0 lc0, final int n) {
        if ((n & 0x4) != 0x0) {
            lc0 = null;
        }
        long n2;
        if ((n & 0x8) != 0x0) {
            n2 = Long.MIN_VALUE;
        }
        else {
            n2 = 0L;
        }
        long n3;
        if ((n & 0x10) != 0x0) {
            n3 = Long.MIN_VALUE;
        }
        else {
            n3 = 0L;
        }
        this(liv, o, lc0, n2, n3, false);
    }
    
    public bc0(final liv<T, V> f0, final T t, final V v, final long i0, final long j0, final boolean k0) {
        e0e.f((Object)f0, "typeConverter");
        this.F0 = f0;
        this.G0 = (wwj)zzz.W((Object)t);
        lc0 h0;
        if (v != null) {
            h0 = kqe.E(v);
        }
        else {
            h0 = jty.w(f0, t);
        }
        this.H0 = (V)h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final T e() {
        return (T)this.F0.b().invoke((Object)this.H0);
    }
    
    public final void g(final T value) {
        ((cjq<T>)this.G0).setValue(value);
    }
    
    public final T getValue() {
        return ((cjq<T>)this.G0).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("AnimationState(value=");
        f.append(this.getValue());
        f.append(", velocity=");
        f.append(this.e());
        f.append(", isRunning=");
        f.append(this.K0);
        f.append(", lastFrameTimeNanos=");
        f.append(this.I0);
        f.append(", finishedTimeNanos=");
        f.append(this.J0);
        f.append(')');
        return f.toString();
    }
}
