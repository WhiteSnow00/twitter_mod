import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Objects;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class spe implements jcm, wqy, vzz, jmb
{
    public int C0 = c0;
    public Object D0 = d0;
    
    public void a() {
        final m000 m000 = (m000)this.D0;
        Objects.requireNonNull(m000);
        m000.a("split-install-errors", (vzz)new r4c((Object)m000));
    }
    
    @Override
    public void accept(final Object o, Object obtain) {
        switch (this.C0) {
            case 2: {
                final nsy nsy = (nsy)o;
                final ebs ebs = (ebs)obtain;
                final g6z g6z = ((fm1<g6z>)nsy).D();
                final h8y h8y = new h8y((String)null, (String)null);
                final ysz ysz = new ysz(ebs);
                obtain = Parcel.obtain();
                ((Parcel)obtain).writeInterfaceToken(g6z.b);
                final int a = nny.a;
                ((Parcel)obtain).writeInt(1);
                h8y.writeToParcel((Parcel)obtain, 0);
                ((Parcel)obtain).writeStrongBinder((IBinder)ysz);
                final Parcel obtain2 = Parcel.obtain();
                try {
                    g6z.a.transact(1, (Parcel)obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                }
                finally {
                    ((Parcel)obtain).recycle();
                    obtain2.recycle();
                }
                break;
            }
        }
        final q5y q5y = (q5y)this.D0;
        final r5y r5y = (r5y)o;
        final ebs ebs2 = (ebs)obtain;
        Objects.requireNonNull(q5y);
        final p5y p5y = new p5y(ebs2);
        final j5y j5y = ((fm1<j5y>)r5y).D();
        final String k = q5y.k;
        final Parcel s = j5y.s();
        d6y.c(s, (IInterface)p5y);
        s.writeString(k);
        j5y.x(2, s);
    }
    
    public float b(final Object o, final String s) {
        if (!((HashMap)this.D0).containsKey(o)) {
            return Float.NaN;
        }
        final HashMap hashMap = ((HashMap)this.D0).get(o);
        if (hashMap != null) {
            if (hashMap.containsKey(s)) {
                final float[] array = (float[])hashMap.get(s);
                if (array == null) {
                    return Float.NaN;
                }
                if (array.length > 0) {
                    return array[0];
                }
            }
        }
        return Float.NaN;
    }
    
    public n6 c() {
        return ((m4)this.D0).a1;
    }
    
    public int d(final String s) {
        if (((xcs)this.D0).i()) {
            return 0;
        }
        return 1;
    }
    
    public tf4 e(final String s) {
        final uf4 b = uf4.b;
        zzd.f((Object)s, "<this>");
        Object o;
        try {
            o = m0n.O(ti1.a(s), (vqa)b);
        }
        catch (final Exception ex) {
            e9a.d((Throwable)ex);
            o = null;
        }
        return (tf4)o;
    }
}
