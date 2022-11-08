import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.a$d;
import com.google.android.gms.common.api.b$a;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5y extends b<a6y> implements z67
{
    public static final a.a<t7y, a6y> l;
    public static final a<a6y> m;
    public final String k;
    
    static {
        m = new a("Auth.Api.Identity.CredentialSaving.API", (a.a)(m5y.l = new k5y()), new a.g());
    }
    
    public m5y(final Activity activity, final a6y a6y) {
        super(activity, (com.google.android.gms.common.api.a<a$d>)m5y.m, (a$d)a6y, b$a.c);
        this.k = t5y.a();
    }
    
    @Override
    public final zas<tro> c(final sro sro) {
        final sro sro2 = new sro(sro.C0, this.k);
        final dbs$a dbs$a = new dbs$a();
        dbs$a.c = new bta[] { s5y.c };
        dbs$a.a = (jcm)new aiq((Object)this, (Object)sro2, 4);
        dbs$a.b = false;
        dbs$a.d = 1536;
        return this.k(0, (dbs<a$b, tro>)dbs$a.a());
    }
}
