// 
// Decompiled by Procyon v0.6.0
// 

public final class hu8
{
    public static final hu8 c;
    public final jck a;
    public final int b;
    
    static {
        c = new hu8(null, -1);
    }
    
    public hu8(final jck a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hu8.class == o.getClass()) {
            final hu8 hu8 = (hu8)o;
            if (this.b != hu8.b || !w4j.a((Object)this.a, (Object)hu8.a)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.b, (Object)this.a);
    }
}
