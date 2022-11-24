import android.os.BaseBundle;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umf extends bts
{
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    
    public umf(final Bundle bundle) {
        super(bundle);
        this.d = ((am1)this).a.getBoolean("list_timeline_arg_should_auto_refresh", false);
        this.e = ((BaseBundle)((am1)this).a).getString("list_timeline_arg_scribe_page", "list");
        this.f = ((BaseBundle)((am1)this).a).getString("list_timeline_arg_scribe_section", "tweets");
        this.g = ((am1)this).a.getBoolean("list_timeline_arg_pinned_to_home", false);
        this.h = ((BaseBundle)((am1)this).a).getString("list_timeline_arg_tab_id");
    }
    
    public final String j() {
        return this.e;
    }
    
    public final String l() {
        return this.f;
    }
    
    public final int n() {
        return 10;
    }
    
    public final arv o() {
        final kkg$a kkg$a = new kkg$a(1);
        String s;
        if (this.g) {
            s = "true";
        }
        else {
            s = "false";
        }
        ((kkg)kkg$a).w((Object)"pinned", (Object)s);
        return new arv((Map)((z4j)kkg$a).e());
    }
    
    public final boolean q() {
        return this.d;
    }
    
    public static final class a extends bts$a<umf, a>
    {
        public a() {
            super((Bundle)null);
        }
        
        public final Object i() {
            return new umf(((am1.a)this).a);
        }
    }
}
