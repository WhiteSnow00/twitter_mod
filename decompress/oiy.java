import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class oiy implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public oiy(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
