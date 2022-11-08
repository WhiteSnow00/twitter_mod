import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class z6c extends dj1
{
    public final f8c a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final String e;
    public final w2a f;
    public final z3t g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    
    public z6c(final Intent intent) {
        super(intent);
        final f8c a = (f8c)tkp.a(intent.getByteArrayExtra("arg_graphql_timeline_info"), (alp)f8c.e);
        pf8.r(a);
        this.a = a;
        final CharSequence charSequenceExtra = intent.getCharSequenceExtra("arg_title");
        this.b = charSequenceExtra;
        final String stringExtra = intent.getStringExtra("arg_subtitle");
        this.c = stringExtra;
        this.d = intent.getStringExtra("arg_user_id");
        final String stringExtra2 = intent.getStringExtra("arg_cache_id");
        final t3s a2 = mq1.a;
        final int i = w4j.i((Object)a, (Object)charSequenceExtra, (Object)stringExtra, (Object)System.currentTimeMillis());
        String value = stringExtra2;
        if (stringExtra2 == null) {
            value = String.valueOf(i);
        }
        this.e = value;
        this.h = intent.getBooleanExtra("arg_bottom_refreshable", false);
        this.i = intent.getBooleanExtra("arg_pull_to_refresh", false);
        this.j = intent.getBooleanExtra("arg_composer_enabled", true);
        final z3t z3t = (z3t)tkp.a(intent.getByteArrayExtra("arg_scribe_config"), (alp)z3t.c);
        final z3t.a a3 = new z3t.a();
        String a4;
        if (a.a.equals("edit_history_timeline")) {
            a4 = "edit_history";
        }
        else {
            a4 = "generic_timeline";
        }
        a3.a = a4;
        a3.b = "";
        final z3t z3t2 = (z3t)a3.e();
        z3t g = z3t;
        if (z3t == null) {
            g = z3t2;
        }
        this.g = g;
        this.f = (w2a)tkp.a(intent.getByteArrayExtra("arg_empty_list_config"), (alp)w2a.i);
    }
    
    public static final class a extends dj1.a<z6c, a>
    {
        public final Object i() {
            return new z6c(super.a);
        }
        
        public final boolean l() {
            return super.a.hasExtra("arg_graphql_timeline_info");
        }
        
        public final a q(final String s) {
            super.a.putExtra("arg_cache_id", s);
            return this;
        }
        
        public final a r() {
            super.a.putExtra("arg_composer_enabled", false);
            return this;
        }
        
        public final a s(final w2a w2a) {
            yvj.c(super.a, "arg_empty_list_config", (Object)w2a, (alp)w2a.i);
            return this;
        }
        
        public final a t(final f8c f8c) {
            yvj.c(super.a, "arg_graphql_timeline_info", (Object)f8c, (alp)f8c.e);
            return this;
        }
        
        public final a u() {
            super.a.putExtra("arg_bottom_refreshable", true);
            return this;
        }
        
        public final a v() {
            super.a.putExtra("arg_pull_to_refresh", true);
            return this;
        }
        
        public final a w(final z3t z3t) {
            yvj.c(super.a, "arg_scribe_config", (Object)z3t, (alp)z3t.c);
            return this;
        }
        
        public final a x(final CharSequence charSequence) {
            super.a.putExtra("arg_title", charSequence);
            return this;
        }
        
        public final a y(final String s) {
            super.a.putExtra("arg_user_id", s);
            return this;
        }
    }
}
