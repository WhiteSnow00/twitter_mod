// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yb implements vqc
{
    public bhc D0;
    public boolean E0;
    
    @Override
    public final bhc d() {
        return this.D0;
    }
    
    public final void e(final String s) {
        this.D0 = (bhc)new ur1(s);
    }
    
    @Override
    public final String toString() {
        final StringBuilder a = ta0.A('[');
        if (this.D0 != null) {
            a.append("Content-Type: ");
            a.append(this.D0.getValue());
            a.append(',');
        }
        final long a2 = this.a();
        if (a2 >= 0L) {
            a.append("Content-Length: ");
            a.append(a2);
            a.append(',');
        }
        a.append("Chunked: ");
        return zc.H(a, this.E0, ']');
    }
}
