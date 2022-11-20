import android.os.RemoteException;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ybs<A extends com.google.android.gms.common.api.a.b, ResultT>
{
    public final yra[] a;
    public final boolean b;
    public final int c;
    
    @Deprecated
    public ybs() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }
    
    public ybs(final yra[] a, final boolean b, final int c) {
        this.a = a;
        boolean b2 = false;
        if (a != null) {
            b2 = b2;
            if (b) {
                b2 = true;
            }
        }
        this.b = b2;
        this.c = c;
    }
    
    public static <A extends com.google.android.gms.common.api.a.b, ResultT> a<A, ResultT> a() {
        return new a<A, ResultT>();
    }
    
    public abstract void b(final A p0, final zbs<ResultT> p1) throws RemoteException;
    
    public static final class a<A extends com.google.android.gms.common.api.a.b, ResultT>
    {
        public ycm<A, zbs<ResultT>> a;
        public boolean b;
        public yra[] c;
        public int d;
        
        public a() {
            this.b = true;
            this.d = 0;
        }
        
        public final ybs<A, ResultT> a() {
            eli.i(this.a != null, "execute parameter required");
            return (ybs<A, ResultT>)new p3y(this, this.c, this.b, this.d);
        }
    }
}
