import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class ih6
{
    public static final a Companion;
    public final yq4 a;
    public final yq4 b;
    public final float[] c;
    
    static {
        Companion = new a();
    }
    
    public ih6(final yq4 a, final yq4 b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public ih6(yq4 yq4, final yq4 yq5, int n) {
        final long b = yq4.b;
        Objects.requireNonNull(tq4.Companion);
        final tq4$a companion = tq4.Companion;
        final long a = tq4.a;
        yq4 f;
        if (tq4.a(b, a)) {
            f = uoz.f(yq4);
        }
        else {
            f = yq4;
        }
        yq4 f2;
        if (tq4.a(yq5.b, a)) {
            f2 = uoz.f(yq5);
        }
        else {
            f2 = yq5;
        }
        Objects.requireNonNull(ih6.Companion);
        Objects.requireNonNull(ffm.Companion);
        if (n == 3) {
            n = 1;
        }
        else {
            n = 0;
        }
        float[] c = null;
        Label_0244: {
            if (n != 0) {
                final boolean a2 = tq4.a(yq4.b, a);
                final boolean a3 = tq4.a(yq5.b, a);
                if (!a2 || !a3) {
                    if (a2 || a3) {
                        if (!a2) {
                            yq4 = yq5;
                        }
                        final bxm bxm = (bxm)yq4;
                        float[] array;
                        if (a2) {
                            array = bxm.d.a();
                        }
                        else {
                            array = xli.M0;
                        }
                        float[] array2;
                        if (a3) {
                            array2 = bxm.d.a();
                        }
                        else {
                            array2 = xli.M0;
                        }
                        c = new float[] { array[0] / array2[0], array[1] / array2[1], array[2] / array2[2] };
                        break Label_0244;
                    }
                }
            }
            c = null;
        }
        this.a = f;
        this.b = f2;
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
