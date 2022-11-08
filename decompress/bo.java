import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bo
{
    public final int a;
    public final int b;
    public final Intent c;
    
    public bo(final int a, final int b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bo)) {
            return false;
        }
        final bo bo = (bo)o;
        return this.a == bo.a && this.b == bo.b && zzd.a((Object)this.c, (Object)bo.c);
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
        final StringBuilder j = sbl.j("ActivityResult(requestCode=", a, ", resultCode=", b, ", data=");
        j.append(c);
        j.append(")");
        return j.toString();
    }
}
