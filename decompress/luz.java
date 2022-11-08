import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.b$a;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a$d;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class luz extends b<a$d.c> implements go0
{
    public static final a.a<nsy, a$d.c> m;
    public static final a<a$d.c> n;
    public final Context k;
    public final o5c l;
    
    static {
        n = new a("AppSet.API", (a.a)(luz.m = new jrz()), new a.g());
    }
    
    public luz(final Context k, final o5c l) {
        super(k, (com.google.android.gms.common.api.a<a$d>)luz.n, (a$d)a$d.n0, b$a.c);
        this.k = k;
        this.l = l;
    }
    
    public final zas<ho0> d() {
        if (this.l.c(this.k, 212800000) == 0) {
            final dbs$a a = dbs.a();
            a.c = new bta[] { cxy.a };
            a.a = new spe(this, 2);
            a.b = false;
            a.d = 27601;
            return this.k(0, (dbs<a$b, ho0>)a.a());
        }
        return (zas<ho0>)zbs.d((Exception)new ApiException(new Status(17, null)));
    }
}
