import android.support.annotation.NonNull;
import android.os.RemoteException;
import android.support.annotation.UiThread;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atd
{
    @UiThread
    public abstract void a();
    
    @UiThread
    public abstract zng b() throws RemoteException;
    
    @UiThread
    public abstract void c(@NonNull final ctd p0);
}
