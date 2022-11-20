// 
// Decompiled by Procyon v0.6.0
// 

public final class fas
{
    public final String a;
    
    public fas(final String a) {
        this.a = a;
    }
    
    public static String a(final String s) {
        return da8.j("Tag(tag=", s, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final String a = this.a;
        final boolean b = o instanceof fas;
        boolean b2 = false;
        if (b) {
            if (czd.a((Object)a, (Object)((fas)o).a)) {
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
