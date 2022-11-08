// 
// Decompiled by Procyon v0.6.0
// 

public final class k9s
{
    public final String a = a;
    
    public static String a(final String s) {
        return zi.y("Tag(tag=", s, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final String a = this.a;
        final boolean b = o instanceof k9s;
        boolean b2 = false;
        if (b) {
            if (zzd.a((Object)a, (Object)((k9s)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
