// 
// Decompiled by Procyon v0.6.0
// 

public final class che extends afe
{
    public final oif<String, afe> a;
    
    public che() {
        this.a = (oif<String, afe>)new oif();
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof che && ((che)o).a.equals(this.a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
}
