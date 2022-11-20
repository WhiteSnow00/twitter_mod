import android.opengl.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kye
{
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    
    public kye() {
        this.b = new float[16];
        this.c = new float[16];
        this.d = new urs();
    }
    
    public kye(final int n, final int n2) {
        this.b = blz.Q(new w3e(n));
        this.c = blz.Q(n2);
    }
    
    public static void a(final float[] array, final float[] array2) {
        Matrix.setIdentityM(array, 0);
        final float n = (float)Math.sqrt(array2[8] * array2[8] + array2[10] * array2[10]);
        array[0] = array2[10] / n;
        array[2] = array2[8] / n;
        array[8] = -array2[8] / n;
        array[10] = array2[10] / n;
    }
    
    public final int b() {
        return ((w3e)((m8r)this.b).getValue()).a;
    }
    
    public final int c() {
        return ((Number)((m8r)this.c).getValue()).intValue();
    }
    
    public final void d(final int n, final int n2) {
        final float n3 = (float)n;
        final int n4 = 1;
        if (n3 >= 0.0f) {
            int n5;
            if (n == this.b()) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                ((puh)this.b).setValue((Object)new w3e(n));
            }
            if (n2 != this.c()) {
                ((puh)this.c).setValue((Object)n2);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index should be non-negative (");
        sb.append(n);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
