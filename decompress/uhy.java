import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class uhy implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public uhy(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
