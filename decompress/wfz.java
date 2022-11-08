import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfz extends bgz
{
    public int D0;
    public final int E0;
    public final /* synthetic */ bhz F0;
    
    public wfz(final bhz f0) {
        this.F0 = f0;
        super(0);
        this.D0 = 0;
        this.E0 = f0.i();
    }
    
    public final byte b() {
        final int d0 = this.D0;
        if (d0 < this.E0) {
            this.D0 = d0 + 1;
            return this.F0.g(d0);
        }
        throw new NoSuchElementException();
    }
    
    public final boolean hasNext() {
        return this.D0 < this.E0;
    }
}
