import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ks3 extends aj1
{
    public static final b Companion;
    public final h5s a;
    public final h5s b;
    
    static {
        Companion = new b();
    }
    
    public ks3(final Intent intent) {
        e0e.f((Object)intent, "intent");
        super(intent);
        this.a = (h5s)jty.N((ptb)new ks3$d(this));
        this.b = (h5s)jty.N((ptb)new ks3$c(this));
    }
    
    public static final class a extends aj1.a<ks3, a>
    {
        public final Object i() {
            final Intent a = super.a;
            e0e.e((Object)a, "mIntent");
            return new ks3(a);
        }
        
        public final boolean k() {
            return super.a.hasExtra("arg_timeline_tag");
        }
        
        public final a q(final String s) {
            e0e.f((Object)s, "tag");
            super.a.putExtra("arg_timeline_tag", s);
            return this;
        }
    }
    
    public static final class b
    {
    }
}
