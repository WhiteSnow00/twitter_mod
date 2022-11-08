import android.os.RemoteException;
import com.google.android.gms.common.api.a$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z2y extends dbs
{
    public final /* synthetic */ dbs$a d;
    
    public z2y(final dbs$a d, final bta[] array, final boolean b, final int n) {
        this.d = d;
        super(array, b, n);
    }
    
    public final void b(final a$b a$b, final ebs ebs) throws RemoteException {
        this.d.a.accept(a$b, ebs);
    }
}
