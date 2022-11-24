import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b5z implements dsy
{
    public Object F0;
    public Object G0;
    public Object H0;
    public Object I0;
    public Object J0;
    public Object K0;
    public Object L0;
    
    public b5z() {
    }
    
    public b5z(final dsy f0, final dsy g0, final dsy h0, final dsy i0, final dsy j0, final dsy k0, final dsy l0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public b5z(final mbz mbz) {
        this.F0 = this;
        final zhz g0 = new zhz(mbz);
        this.G0 = g0;
        final dsy<Object> c = wry.c(new sog(g0));
        this.H0 = c;
        this.I0 = wry.c(new a4c((Object)this.G0, (Object)c, 4));
        final dsy<Object> c2 = wry.c(new bqe(this.G0, 5));
        this.J0 = c2;
        final dsy<Object> c3 = wry.c(new j7z((dsy)this.I0, (dsy)c2, (dsy)this.G0, 0));
        this.K0 = c3;
        this.L0 = wry.c(new nfz(c3, 0));
    }
    
    public final /* bridge */ Object a() {
        final String s = (String)((dsy)this.F0).a();
        final Object a = ((dsy)this.G0).a();
        final Object a2 = ((dsy)this.H0).a();
        final Context b = ((xzz)this.I0).b();
        final Object a3 = ((dsy)this.J0).a();
        final nry<Object> b2 = wry.b(this.K0);
        final Object a4 = ((dsy)this.L0).a();
        final bky bky = (bky)a;
        final mry mry = (mry)a2;
        final ezy ezy = (ezy)a3;
        final wyy wyy = (wyy)a4;
        File externalFilesDir;
        if (s != null) {
            externalFilesDir = new File(b.getExternalFilesDir((String)null), s);
        }
        else {
            externalFilesDir = b.getExternalFilesDir((String)null);
        }
        return new ewy(externalFilesDir, bky, b, ezy, (nry)b2);
    }
}
