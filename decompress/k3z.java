import android.content.SharedPreferences$Editor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k3z
{
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ f4z e;
    
    public k3z(final f4z e, final String a, final boolean b) {
        this.e = e;
        xd.q(a);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final boolean d) {
        final SharedPreferences$Editor edit = this.e.n().edit();
        edit.putBoolean(this.a, d);
        edit.apply();
        this.d = d;
    }
    
    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
