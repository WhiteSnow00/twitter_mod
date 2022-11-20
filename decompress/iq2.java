import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public class iq2<V>
{
    public final int a;
    public final int b;
    public final LinkedList c;
    public final boolean d;
    public int e;
    
    public iq2(final int a, final int b, final int e) {
        final boolean b2 = true;
        fli.u(a > 0);
        fli.u(b >= 0);
        fli.u(e >= 0 && b2);
        this.a = a;
        this.b = b;
        this.c = new LinkedList();
        this.e = e;
        this.d = false;
    }
    
    public void a(final V v) {
        this.c.add(v);
    }
    
    public final int b() {
        return this.c.size();
    }
    
    public V c() {
        return this.c.poll();
    }
    
    public final void d(final V v) {
        Objects.requireNonNull(v);
        final boolean d = this.d;
        boolean b = false;
        if (d) {
            if (this.e > 0) {
                b = true;
            }
            fli.u(b);
            --this.e;
            this.a(v);
        }
        else {
            final int e = this.e;
            if (e > 0) {
                this.e = e - 1;
                this.a(v);
            }
            else {
                final int h0 = xli.H0;
                Log.println(6, "unknown:BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", v));
            }
        }
    }
}
