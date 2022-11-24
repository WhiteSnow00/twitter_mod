import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a$g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m4y
{
    public static final a$a<e7q, h7q> a;
    public static final a$a<e7q, v3y> b;
    public static final a<h7q> c;
    
    static {
        final a$g a$g = new a$g();
        final t1y t1y = m4y.a = new t1y();
        m4y.b = new s2y();
        new Scope("profile");
        new Scope("email");
        c = new a<h7q>("SignIn.API", (a.a$a<C, a.d>)t1y, (a.a$g<C>)a$g);
    }
}
