import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjy extends sey
{
    @NullableDecl
    public final Object D0;
    public int E0;
    public final ljy F0;
    
    public bjy(final ljy f0, final int e0) {
        this.F0 = f0;
        this.D0 = f0.F0[e0];
        this.E0 = e0;
    }
    
    public final void a() {
        final int e0 = this.E0;
        if (e0 != -1 && e0 < this.F0.size() && ffz.I0(this.D0, this.F0.F0[this.E0])) {
            return;
        }
        final ljy f0 = this.F0;
        final Object d0 = this.D0;
        final Object m0 = ljy.M0;
        this.E0 = f0.g(d0);
    }
    
    @NullableDecl
    public final Object getKey() {
        return this.D0;
    }
    
    @NullableDecl
    public final Object getValue() {
        final Map a = this.F0.a();
        if (a != null) {
            return a.get(this.D0);
        }
        this.a();
        final int e0 = this.E0;
        if (e0 == -1) {
            return null;
        }
        return this.F0.G0[e0];
    }
    
    public final Object setValue(final Object o) {
        final Map a = this.F0.a();
        if (a != null) {
            return a.put(this.D0, o);
        }
        this.a();
        final int e0 = this.E0;
        if (e0 == -1) {
            this.F0.put(this.D0, o);
            return null;
        }
        final Object[] g0 = this.F0.G0;
        final Object o2 = g0[e0];
        g0[e0] = o;
        return o2;
    }
}
