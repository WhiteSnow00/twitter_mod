// 
// Decompiled by Procyon v0.6.0
// 

public final class k6s extends Throwable
{
    public final String C0;
    
    public k6s(final String c0) {
        super(c0);
        this.C0 = c0;
    }
    
    @Override
    public final String getMessage() {
        return this.C0;
    }
}
