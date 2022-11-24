import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class oi6
{
    public static final a Companion;
    public final es4 a;
    public final es4 b;
    public final float[] c;
    
    static {
        Companion = new a();
    }
    
    public oi6(final es4 a, final es4 b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public oi6(es4 es4, final es4 es5, int n) {
        final long b = es4.b;
        Objects.requireNonNull(yr4.Companion);
        final yr4$a companion = yr4.Companion;
        final long a = yr4.a;
        es4 r;
        if (yr4.a(b, a)) {
            r = eg8.r(es4);
        }
        else {
            r = es4;
        }
        es4 r2;
        if (yr4.a(es5.b, a)) {
            r2 = eg8.r(es5);
        }
        else {
            r2 = es5;
        }
        Objects.requireNonNull(oi6.Companion);
        Objects.requireNonNull(ufm.Companion);
        if (n == 3) {
            n = 1;
        }
        else {
            n = 0;
        }
        float[] c = null;
        Label_0244: {
            if (n != 0) {
                final boolean a2 = yr4.a(es4.b, a);
                final boolean a3 = yr4.a(es5.b, a);
                if (!a2 || !a3) {
                    if (a2 || a3) {
                        if (!a2) {
                            es4 = es5;
                        }
                        final rxm rxm = (rxm)es4;
                        float[] array;
                        if (a2) {
                            array = rxm.d.a();
                        }
                        else {
                            array = eg8.M0;
                        }
                        float[] array2;
                        if (a3) {
                            array2 = rxm.d.a();
                        }
                        else {
                            array2 = eg8.M0;
                        }
                        c = new float[] { array[0] / array2[0], array[1] / array2[1], array[2] / array2[2] };
                        break Label_0244;
                    }
                }
            }
            c = null;
        }
        this.a = r;
        this.b = r2;
        this.c = c;
    }
    
    public float[] a(float[] e) {
        e = this.a.e(e);
        final float[] c = this.c;
        if (c != null) {
            e[0] *= c[0];
            e[1] *= c[1];
            e[2] *= c[2];
        }
        return this.b.a(e);
    }
    
    public static final class a
    {
    }
}
