// 
// Decompiled by Procyon v0.6.0
// 

public final class w61 implements xav
{
    public final int b;
    
    public w61(final int b) {
        this.b = b;
    }
    
    public final Class<? extends xav> annotationType() {
        return xav.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof xav) {
            if (this.b != ((w61)o).b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b ^ 0xCEE59CDF;
    }
    
    @Override
    public final String toString() {
        return gwl.x(j98.j("@com.twitter.android.av.di.app.TwitterChromeViewFactorySubgraph_SSM.MapKey_buildViewFactoryMap(", "value0="), this.b, ')');
    }
}
