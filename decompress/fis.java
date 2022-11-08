// 
// Decompiled by Procyon v0.6.0
// 

public final class fis implements xes
{
    public static final alp<fis> D0;
    public final String C0;
    
    static {
        fis.D0 = new fis.fis$a();
    }
    
    public fis(final String c0) {
        this.C0 = c0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && fis.class == o.getClass() && w4j.a((Object)this.C0, (Object)((fis)o).C0));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.C0);
    }
}
