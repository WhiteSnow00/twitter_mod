import android.media.NotProvisionedException;
import android.media.DeniedByServerException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rj9
{
    public static boolean a(final Throwable t) {
        return t instanceof DeniedByServerException;
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof NotProvisionedException;
    }
}
