import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rea
{
    public static final nmp<rea> d;
    public final q77 a;
    public final wtg b;
    public final gj2 c;
    
    static {
        rea.d = new rea.rea$b();
    }
    
    public rea(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    public final Rect a(final float n) {
        final q77 a = this.a;
        if (a != null) {
            final o77 a2 = q77.a(a, n);
            if (a2 != null) {
                return a2.a();
            }
        }
        return null;
    }
    
    public static final class a extends z4j<rea>
    {
        public q77 a;
        public wtg b;
        public gj2 c;
        
        public final Object i() {
            return new rea(this);
        }
    }
}
