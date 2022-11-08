// 
// Decompiled by Procyon v0.6.0
// 

public final class yo0 implements wr8
{
    public final qo0 b;
    public final xaa c;
    
    public yo0(final qo0 b) {
        this.b = b;
        this.c = xaa.F0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof yo0 && zzd.a((Object)this.b, (Object)((yo0)o).b));
    }
    
    public final xaa getName() {
        return this.c;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final qo0 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreDestination(storeData=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b extends h4j<yo0>
    {
        public qo0 a;
        
        public final Object i() {
            final qo0 a = this.a;
            zzd.c((Object)a);
            return new yo0(a);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
