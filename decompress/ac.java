// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ac implements src
{
    public cic C0;
    public boolean D0;
    
    public final cic d() {
        return this.C0;
    }
    
    public final void e(final String s) {
        this.C0 = new yr1(s);
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = ffa.l('[');
        if (this.C0 != null) {
            l.append("Content-Type: ");
            l.append(this.C0.getValue());
            l.append(',');
        }
        final long a = ((src)this).a();
        if (a >= 0L) {
            l.append("Content-Length: ");
            l.append(a);
            l.append(',');
        }
        l.append("Chunked: ");
        return wa.z(l, this.D0, ']');
    }
}
