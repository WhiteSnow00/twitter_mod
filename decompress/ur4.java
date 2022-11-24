import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ur4
{
    public static final int c = 0;
    public final float a;
    public final int b;
    
    public ur4(final float a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public ur4(final float n, final int n2, final int n3, final int n4) {
        this(n, Color.argb(255, n2, n3, n4));
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof ur4) {
            final ur4 ur4 = (ur4)o;
            if (this.a != ur4.a || this.b != ur4.b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
}
