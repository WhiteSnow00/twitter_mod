import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l51 extends aj1
{
    public l51(final Intent intent, final m51 m51) {
        super(intent);
    }
    
    public final String a() {
        return super.mIntent.getStringExtra("web_view_url");
    }
    
    public static final class a extends aj1.a<l51, a>
    {
        public final Object i() {
            return new l51(super.a, null);
        }
        
        public final a q(final String s) {
            super.a.putExtra("web_view_url", s);
            return this;
        }
    }
}
