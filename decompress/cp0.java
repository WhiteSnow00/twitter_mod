// 
// Decompiled by Procyon v0.6.0
// 

public final class cp0 implements ls8
{
    public final ko0 b;
    public final wtg c;
    public final nba d;
    
    public cp0(final ko0 b, final wtg c) {
        this.b = b;
        this.c = c;
        this.d = nba.J0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cp0)) {
            return false;
        }
        final cp0 cp0 = (cp0)o;
        return e0e.a((Object)this.b, (Object)cp0.b) && e0e.a((Object)this.c, (Object)cp0.c);
    }
    
    public final nba getName() {
        return this.d;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final ko0 b = this.b;
        final wtg c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreWithDockedMediaDestination(storeData=");
        sb.append(b);
        sb.append(", mediaEntity=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b extends z4j<cp0>
    {
        public ko0 a;
        public wtg b;
        
        public final Object i() {
            final ko0 a = this.a;
            e0e.c((Object)a);
            final wtg b = this.b;
            e0e.c((Object)b);
            return new cp0(a, b);
        }
        
        public final boolean k() {
            return this.a != null && this.b != null;
        }
    }
}
