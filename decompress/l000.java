import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l000 extends w000
{
    public final Callable<String> e;
    
    public l000(final Callable e) {
        super(false, null, null);
        this.e = e;
    }
    
    @Override
    public final String a() {
        try {
            return this.e.call();
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
