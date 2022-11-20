// 
// Decompiled by Procyon v0.6.0
// 

public final class wki implements jbx
{
    public final boolean a;
    public final boolean b;
    
    public wki() {
        this.a = true;
        this.b = false;
    }
    
    public wki(final boolean b) {
        this.a = false;
        this.b = b;
    }
    
    public wki(final boolean b, final boolean b2, final int n, final rf8 rf8) {
        this.a = true;
        this.b = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wki)) {
            return false;
        }
        final wki wki = (wki)o;
        return this.a == wki.a && this.b == wki.b;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int b = this.b ? 1 : 0;
        if (b == 0) {
            n = b;
        }
        return n2 * 31 + n;
    }
    
    @Override
    public final String toString() {
        return da8.k("NoModuleViewState(isLoading=", this.a, ", isVisible=", this.b, ")");
    }
}
