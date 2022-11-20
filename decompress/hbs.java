// 
// Decompiled by Procyon v0.6.0
// 

public final class hbs
{
    public static final hbs d;
    public static final hbs e;
    public static final hbs f;
    public static final hbs g;
    public static final hbs h;
    public static final hbs i;
    public final float[] a;
    public final float[] b;
    public final float[] c;
    
    static {
        final hbs hbs = d = new hbs();
        final float[] b = hbs.b;
        b[0] = 0.55f;
        b[1] = 0.74f;
        b(hbs);
        final hbs hbs2 = e = new hbs();
        final float[] b2 = hbs2.b;
        b2[0] = 0.3f;
        b2[1] = 0.5f;
        b2[2] = 0.7f;
        b(hbs2);
        final hbs hbs3 = f = new hbs();
        final float[] b3 = hbs3.b;
        b3[1] = 0.26f;
        b3[2] = 0.45f;
        b(hbs3);
        final hbs hbs4 = g = new hbs();
        final float[] b4 = hbs4.b;
        b4[0] = 0.55f;
        b4[1] = 0.74f;
        a(hbs4);
        final hbs hbs5 = h = new hbs();
        final float[] b5 = hbs5.b;
        b5[0] = 0.3f;
        b5[1] = 0.5f;
        b5[2] = 0.7f;
        a(hbs5);
        final hbs hbs6 = i = new hbs();
        final float[] b6 = hbs6.b;
        b6[1] = 0.26f;
        b6[2] = 0.45f;
        a(hbs6);
    }
    
    public hbs() {
        final float[] a = new float[3];
        this.a = a;
        final float[] b = new float[3];
        this.b = b;
        final float[] c = new float[3];
        this.c = c;
        a[0] = 0.0f;
        a[1] = 0.5f;
        a[2] = 1.0f;
        b[0] = 0.0f;
        b[1] = 0.5f;
        b[2] = 1.0f;
        c[0] = 0.24f;
        c[1] = 0.52f;
        c[2] = 0.24f;
    }
    
    public static void a(final hbs hbs) {
        final float[] a = hbs.a;
        a[1] = 0.3f;
        a[2] = 0.4f;
    }
    
    public static void b(final hbs hbs) {
        final float[] a = hbs.a;
        a[0] = 0.35f;
        a[1] = 1.0f;
    }
}
