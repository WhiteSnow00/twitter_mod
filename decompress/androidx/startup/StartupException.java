// 
// Decompiled by Procyon v0.6.0
// 

package androidx.startup;

public final class StartupException extends RuntimeException
{
    public StartupException() {
        super("Context cannot be null");
    }
    
    public StartupException(final Throwable t) {
        super(t);
    }
}
