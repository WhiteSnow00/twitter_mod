import android.os.DeadObjectException;
import android.os.RemoteException;
import android.content.Context;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d7y<R extends xrm> extends a<R, g7y>
{
    public d7y(final c c) {
        super(f51.a, c);
    }
    
    @Override
    public final void m(final a$b a$b) throws RemoteException {
        final g7y g7y = (g7y)a$b;
        final Context j0 = ((fm1)g7y).J0;
        this.p(((fm1<o7y>)g7y).D());
    }
    
    public abstract void p(final o7y p0) throws DeadObjectException, RemoteException;
}
