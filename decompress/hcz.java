import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcz extends vez
{
    public final Context a;
    public final dgz b;
    
    public hcz(final Context a, final dgz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Context a() {
        return this.a;
    }
    
    @Override
    public final dgz b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof vez) {
            final vez vez = (vez)o;
            if (this.a.equals(vez.a())) {
                final dgz b = this.b;
                if (b == null) {
                    if (vez.b() != null) {
                        return false;
                    }
                }
                else if (!b.equals(vez.b())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final dgz b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        return dvc.d("FlagsContext{context=", this.a.toString(), ", hermeticFileOverrides=", String.valueOf(this.b), "}");
    }
}
