// 
// Decompiled by Procyon v0.6.0
// 

public final class r7z implements UncaughtExceptionHandler
{
    public final String a;
    public final d8z b;
    
    public r7z(final d8z b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        synchronized (this) {
            ((pbz)this.b).D0.b().I0.b(this.a, (Object)t);
        }
    }
}
