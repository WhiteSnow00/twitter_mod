import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0a extends cl1
{
    public static final b0a.b0a$b Companion;
    public final String c;
    public final String d;
    public final qgv e;
    public final String f;
    public final jji g;
    public final sfv h;
    
    static {
        Companion = new b0a.b0a$b();
    }
    
    public b0a(final Bundle bundle) {
        super(bundle);
        final String string = ((BaseBundle)((am1)this).a).getString("title");
        e0e.c((Object)string);
        this.c = string;
        final String string2 = ((BaseBundle)((am1)this).a).getString("revue_url");
        e0e.c((Object)string2);
        this.d = string2;
        final Object a = gmp.a(((am1)this).a.getByteArray("current_profile_user"), (nmp)qgv.P1);
        e0e.c(a);
        this.e = (qgv)a;
        final String string3 = ((BaseBundle)((am1)this).a).getString("account_id");
        e0e.c((Object)string3);
        this.f = string3;
        final Object a2 = gmp.a(((am1)this).a.getByteArray("newsletter_source"), (nmp)new sx6((Class)jji.class));
        e0e.c(a2);
        this.g = (jji)a2;
        this.h = (sfv)gmp.a(((am1)this).a.getByteArray("twitter_scribe_association"), (nmp)sfv.i);
    }
    
    public static final class a extends cl1$a<b0a, a>
    {
        public a() {
            super(800);
        }
        
        public final bl1 x() {
            return (bl1)new e0a();
        }
        
        public final a z(final jji jji) {
            e0e.f((Object)jji, "newsletterSource");
            final Bundle a = ((am1.a)this).a;
            final rx6$h a2 = rx6.a;
            a.putByteArray("newsletter_source", gmp.e((Object)jji, (nmp)new sx6((Class)jji.class)));
            return this;
        }
    }
}
