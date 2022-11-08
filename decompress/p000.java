import android.os.RemoteException;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p000 extends p9y
{
    public final /* synthetic */ f6g q;
    
    public p000(final c c, final f6g q) {
        this.q = q;
        super(c);
    }
    
    public final void m(final a$b a$b) throws RemoteException {
        final ugy ugy = (ugy)a$b;
        final f6g q = this.q;
        final String simpleName = f6g.class.getSimpleName();
        xd.u((Object)q, (Object)"Listener must not be null");
        xd.r(simpleName, (Object)"Listener type must not be empty");
        final inf$a inf$a = new inf$a((Object)q, simpleName);
        final x9y x9y = new x9y((nm1)this);
        final cfy k1 = ugy.k1;
        k1.a.a();
        synchronized (k1.d) {
            final ogy ogy = k1.d.remove(inf$a);
            if (ogy != null) {
                synchronized (ogy) {
                    final inf b = ogy.b;
                    b.b = null;
                    b.c = null;
                    monitorexit(ogy);
                    ((zdy)k1.a.b()).N1(jjy.r((a000)ogy, (jcy)x9y));
                }
            }
        }
    }
}
