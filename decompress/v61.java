// 
// Decompiled by Procyon v0.6.0
// 

public final class v61 implements n9v
{
    public final int b;
    
    public v61(final int b) {
        this.b = b;
    }
    
    public final Class<? extends n9v> annotationType() {
        return n9v.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n9v) {
            if (this.b != ((v61)o).b) {
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
        return y70.y(dia.t("@com.twitter.android.av.di.app.TwitterChromeViewFactorySubgraph_SSM.MapKey_buildViewFactoryMap(", "value0="), this.b, ')');
    }
}
