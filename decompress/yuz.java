import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$g;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a$a;
import com.google.android.gms.common.api.a$d$c;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yuz extends b<a$d$c> implements bo0
{
    public static final a$a<zsy, a$d$c> m;
    public static final a<a$d$c> n;
    public final Context k;
    public final q4c l;
    
    static {
        n = new a<a$d$c>("AppSet.API", (a.a$a<C, a$d$c>)(yuz.m = new xrz()), (a.a$g<C>)new a$g());
    }
    
    public yuz(final Context k, final q4c l) {
        super(k, (a)yuz.n, (a.d)a.d.o0, b.a.c);
        this.k = k;
        this.l = l;
    }
    
    public final ubs<co0> d() {
        if (this.l.c(this.k, 212800000) == 0) {
            final ybs.a<a.b, Object> a = ybs.a();
            a.c = new yra[] { rxy.a };
            a.a = new epe(this, 3);
            a.b = false;
            a.d = 27601;
            return this.k(0, (ybs)a.a());
        }
        return ucs.d(new ApiException(new Status(17, (String)null)));
    }
}
