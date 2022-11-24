import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fo
{
    public final int a;
    public final int b;
    public final Intent c;
    
    public fo(final int a, final int b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fo)) {
            return false;
        }
        final fo fo = (fo)o;
        return this.a == fo.a && this.b == fo.b && e0e.a((Object)this.c, (Object)fo.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final Intent c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return (a * 31 + b) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final Intent c = this.c;
        final StringBuilder g = xnf.g("ActivityResult(requestCode=", a, ", resultCode=", b, ", data=");
        g.append(c);
        g.append(")");
        return g.toString();
    }
}
