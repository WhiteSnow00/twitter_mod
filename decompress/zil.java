// 
// Decompiled by Procyon v0.6.0
// 

public final class zil
{
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;
    
    public zil(final a a, final int c) {
        this.a = a;
        this.b = a;
        this.c = c;
        this.d = true;
    }
    
    public zil(final a a, final a b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (a == b);
    }
    
    public static final class a
    {
        public final b[] a;
        
        public a(final b... a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;
        
        public b(final int a, final float[] c, final float[] d, final int b) {
            this.a = a;
            omi.m(c.length * 2L == d.length * 3L);
            this.c = c;
            this.d = d;
            this.b = b;
        }
    }
}
