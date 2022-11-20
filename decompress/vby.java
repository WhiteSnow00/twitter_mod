import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vby implements pey
{
    public final pey D0;
    public final String E0;
    
    public vby() {
        throw null;
    }
    
    public vby(final String e0) {
        this.D0 = (pey)pey.v0;
        this.E0 = e0;
    }
    
    public vby(final String e0, final pey d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final pey e() {
        return (pey)new vby(this.E0, this.D0.e());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof vby)) {
            return false;
        }
        final String e0 = this.E0;
        final vby vby = (vby)o;
        return e0.equals(vby.E0) && this.D0.equals(vby.D0);
    }
    
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode() + this.E0.hashCode() * 31;
    }
    
    public final Boolean i() {
        throw new IllegalStateException("Control is not a boolean");
    }
    
    public final String j() {
        throw new IllegalStateException("Control is not a String");
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final pey o(final String s, final z6z z6z, final List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
