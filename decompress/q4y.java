import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class q4y
{
    public final int a;
    
    public q4y(final int a) {
        this.a = a;
    }
    
    public static /* bridge */ Status e(final RemoteException ex) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ex.getClass().getSimpleName());
        sb.append(": ");
        sb.append(((Throwable)ex).getLocalizedMessage());
        return new Status(19, sb.toString());
    }
    
    public abstract void a(final Status p0);
    
    public abstract void b(final Exception p0);
    
    public abstract void c(final p2y<?> p0) throws DeadObjectException;
    
    public abstract void d(final f1y p0, final boolean p1);
}
