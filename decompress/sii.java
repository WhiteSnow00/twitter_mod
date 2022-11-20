import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sii extends xk1
{
    public static final sii.sii$b Companion;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final cgv j;
    public final rii k;
    public final efv l;
    
    static {
        Companion = new sii.sii$b();
    }
    
    public sii(final Bundle bundle) {
        super(bundle);
        final String string = ((BaseBundle)((vl1)this).a).getString("title");
        czd.c((Object)string);
        this.c = string;
        final String string2 = ((BaseBundle)((vl1)this).a).getString("tos_url");
        czd.c((Object)string2);
        this.d = string2;
        final String string3 = ((BaseBundle)((vl1)this).a).getString("privacy_url");
        czd.c((Object)string3);
        this.e = string3;
        this.f = ((BaseBundle)((vl1)this).a).getString("sample_url");
        final String string4 = ((BaseBundle)((vl1)this).a).getString("email");
        czd.c((Object)string4);
        this.g = string4;
        final String string5 = ((BaseBundle)((vl1)this).a).getString("profile_url");
        czd.c((Object)string5);
        this.h = string5;
        final String string6 = ((BaseBundle)((vl1)this).a).getString("account_id");
        czd.c((Object)string6);
        this.i = string6;
        final Object a = klp.a(((vl1)this).a.getByteArray("current_profile_owner"), (rlp)cgv.N1);
        czd.c(a);
        this.j = (cgv)a;
        final Object a2 = klp.a(((vl1)this).a.getByteArray("newsletter_source"), (rlp)new mw6((Class)rii.class));
        czd.c(a2);
        this.k = (rii)a2;
        this.l = (efv)klp.a(((vl1)this).a.getByteArray("twitter_scribe_association"), (rlp)efv.i);
    }
    
    public static final class a extends xk1$a<sii, a>
    {
        public a() {
            super(500);
        }
        
        public final wk1 x() {
            return (wk1)new vii();
        }
        
        public final a z(final rii rii) {
            czd.f((Object)rii, "newsletterSource");
            final Bundle a = ((vl1$a)this).a;
            final lw6$h a2 = lw6.a;
            a.putByteArray("newsletter_source", klp.e((Object)rii, (rlp)new mw6((Class)rii.class)));
            return this;
        }
    }
}
