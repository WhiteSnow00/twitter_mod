import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4f
{
    public final View a;
    public final View b;
    public final float c;
    
    public a4f(final View a, final View b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a4f)) {
            return false;
        }
        final a4f a4f = (a4f)o;
        return czd.a((Object)this.a, (Object)a4f.a) && czd.a((Object)this.b, (Object)a4f.b) && Float.compare(this.c, a4f.c) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final View a = this.a;
        final View b = this.b;
        final float c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("LeftRightRatio(left=");
        sb.append(a);
        sb.append(", right=");
        sb.append(b);
        sb.append(", ratio=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
