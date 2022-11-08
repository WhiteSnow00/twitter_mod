import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.a$d;
import com.google.android.gms.common.api.b$a;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n4y extends b<wcs>
{
    public static final a.a<q4y, wcs> k;
    public static final a<wcs> l;
    
    static {
        l = new a("ClientTelemetry.API", (a.a)(n4y.k = new l4y()), new a.g());
    }
    
    public n4y(final Context context, final wcs wcs) {
        super(context, (com.google.android.gms.common.api.a<a$d>)n4y.l, (a$d)wcs, b$a.c);
    }
    
    public final zas<Void> l(final vcs vcs) {
        final dbs$a dbs$a = new dbs$a();
        dbs$a.c = new bta[] { b3y.a };
        dbs$a.b = false;
        dbs$a.a = (jcm)new rdf((Object)vcs);
        return this.k(2, (dbs<a$b, Void>)dbs$a.a());
    }
}
